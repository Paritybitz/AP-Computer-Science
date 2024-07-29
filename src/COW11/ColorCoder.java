package COW11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class ColorCoder extends JPanel implements ActionListener
{
    //region Template Code
    private ArrayList<ColorStrip> stripes;
    private ArrayList<Button> buttons;

    private String choice;

    private Painter p;
    private int command;
    private int brightest;
    private boolean brightestSet;
    private ColorStrip average;
    private boolean averageSet;
    private boolean uniform;
    private boolean uniformSet;

    public ColorCoder(){
        generateStripes();
        setLayout(null);

        choice = "";
        brightestSet = false;
        brightest = 0;
        averageSet = false;
        average = null;
        uniformSet = false;
        uniform = false;

        int width = 180;
        int height = 20;
        int x = 500;
        int y = 0;

        buttons = new ArrayList<Button>();

        int yOff = 0;
        String [] commands = {"Find Brightest", "Find Average", "Shift Left", "Generate Random", "Generate Unifrom", "Test areUniform", "Is Uniform"};
        for(int i = 0; i < commands.length; i++){
            Button next = new Button(commands[i]);
            next.setBounds(x + width, y + height * yOff, width, height);
            next.setActionCommand(commands[i]);
            add(next);
            next.addActionListener(this);
            buttons.add(next);
            yOff += 1;
        }


    }

    public void actionPerformed (ActionEvent event){
        choice = event.getActionCommand();
        brightestSet = false;
        averageSet = false;
        uniformSet = false;
        
        if(choice.equals("Find Brightest")){
            brightest = findBrightest();
            brightestSet = true;
        }else if(choice.equals("Find Average")){
            average = findAverage();
            averageSet = true;
        }else if(choice.equals("Shift Left")){
            shiftLeft();
        }else if(choice.equals("Generate Random")){
            generateStripes();
        }else if(choice.equals("Generate Unifrom")){
            generateUniformStripes();
        }else if(choice.equals("Test areUniform")){
            testAreUniform();
        }else if(choice.equals("Is Uniform")){
            uniform = isUniform();
            uniformSet = true;
        }
        
        repaint();
    }

    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 2000, 2000);
        g.setColor(Color.WHITE);
     
        int y = 0;
        int height = 15;
        int x = 0;
        int width = 300;
  
        for(int i = 0; i < stripes.size(); i++){
            g.setColor(Color.WHITE);
            g.drawString(""+i, x, y + height-3);
            String values = stripes.get(i).paint(g, x + 20, y, width, height);
            if(averageSet){
                System.out.println(values);
            }
            y += height;
        }
        if(brightestSet){
            g.setColor(Color.WHITE);
            g.drawRect(x, height * (brightest), width*2, height);
        }
        if(averageSet){
            g.setColor(Color.WHITE);
            g.drawString("AVERAGE", x, height * (stripes.size() + 5));
            String values = average.paint(g, x, height * (stripes.size() + 5), width, height);  
            System.out.println("Average: " + values);
        }
        if(uniformSet){
            if(uniform){
                g.setColor(new Color(0, 100, 0));
                g.fillRect(x, height * (stripes.size() + 4), width*2, height);
                g.setColor(Color.WHITE);
                g.drawString("    UNIFORM", x, height * (stripes.size() + 5));
            }else{
                 g.setColor(new Color(100, 0, 0));
                g.fillRect(x, height * (stripes.size() + 4), width*2, height);
                g.setColor(Color.WHITE);
                g.drawString("    NOT UNIFORM", x, height * (stripes.size() + 5));
            }
        }
    }
    
    public void generateStripes(){
        stripes = new ArrayList<ColorStrip>();
        int numStripes = 10 + (int)(Math.random() * 40);
        for(int n = 1; n <= numStripes; n++){
            int red = 0 + (int)(Math.random() * 256);
            int green = 0 + (int)(Math.random() * 256);
            int blue = 0 + (int)(Math.random() * 256);
            stripes.add(new ColorStrip(red, green, blue));
        }
    }
    
    public void generateUniformStripes(){
        int choice = (int)(Math.random() * 3);
        if(choice == 0){
            generateRedStripes();
        }else if(choice == 1){
            generateGreenStripes();
        }else if(choice == 2){
            generateBlueStripes();
        }
    }
    
    public void generateRedStripes(){
        stripes = new ArrayList<ColorStrip>();
        int numStripes = 10 + (int)(Math.random() * 40);
        for(int n = 1; n <= numStripes; n++){
            int red = 0 + (int)(Math.random() * 256); 
            int green = 0 + (int)(Math.random() * (red-1));
            int blue = 0 + (int)(Math.random() * (red-1));
            stripes.add(new ColorStrip(red, green, blue));
        }
    }
    
    public void generateGreenStripes(){
        stripes = new ArrayList<ColorStrip>();
        int numStripes = 10 + (int)(Math.random() * 40);
        for(int n = 1; n <= numStripes; n++){
            int green = 0 + (int)(Math.random() * 256);
            int red = 0 + (int)(Math.random() * (green-1));  
            int blue = 0 + (int)(Math.random() * (green-1));
            stripes.add(new ColorStrip(red, green, blue));
        }
    }
    
    public void generateBlueStripes(){
        stripes = new ArrayList<ColorStrip>();
        int numStripes = 10 + (int)(Math.random() * 40);
        for(int n = 1; n <= numStripes; n++){
            int blue = 0 + (int)(Math.random() * 256);
            int green = 0 + (int)(Math.random() * (blue-1));
            int red = 0 + (int)(Math.random() * (blue-1));
            stripes.add(new ColorStrip(red, green, blue));
        }
    }
    
    public void testAreUniform(){
        for(int n = 1; n <= 10; n++){
            int i1 = (int)(Math.random() * stripes.size());
            int i2 = (int)(Math.random() * stripes.size());
            System.out.println("Is strip " + i1 + " uniform with " + i2 + " ?");
            System.out.println(areUniform(stripes.get(i1), stripes.get(i2)));
        }
    }

    public static void main(String [] arg){
        JFrame frame;

        frame = new JFrame("Color Coder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(1100, 1000);
        frame.setLocation(0, 0);

        ColorCoder gMan = new ColorCoder();

        frame.getContentPane().add(gMan);
        frame.setVisible(true);
    }

    //endregion

    public int findBrightest(){
        int brightest = 0;
        int maxBrightness = 0;

        for(int i = 0; i < stripes.size(); i++){
            int currentBrightness = stripes.get(i).getRed() + stripes.get(i).getGreen() + stripes.get(i).getBlue();

            if(currentBrightness > maxBrightness){
                maxBrightness = currentBrightness;
                brightest = i;
            }
        }

        return brightest;
    }

    public ColorStrip findAverage(){
        int redSum = 0;
        int greenSum = 0;
        int blueSum = 0;

        for(int i = 0; i < stripes.size(); i++){
            redSum += stripes.get(i).getRed();
            greenSum += stripes.get(i).getGreen();
            blueSum += stripes.get(i).getBlue();
        }

        int averageRed = redSum/stripes.size();
        int averageGreen = greenSum/stripes.size();
        int averageBlue = blueSum/stripes.size();

        return new ColorStrip(averageRed, averageGreen, averageBlue);
    }

    public void shiftLeft(){
        ColorStrip first = stripes.get(0);
        stripes.remove(0);
        stripes.add(first);
    }

    public boolean areUniform(ColorStrip strip1, ColorStrip strip2){
        int max1 = Math.max(Math.max(strip1.getRed(), strip1.getGreen()), strip1.getBlue());
        int max2 = Math.max(Math.max(strip2.getRed(), strip2.getGreen()), strip2.getBlue());

        if(max1 == max2)
            return true;
        else
            return false;
    }

    public boolean isUniform(){
        int max = Math.max(Math.max(stripes.get(0).getRed(), stripes.get(0).getGreen()), stripes.get(0).getBlue());

        for (int i = 1; i < stripes.size(); i++){
            int max2 = Math.max(Math.max(stripes.get(i).getRed(), stripes.get(i).getGreen()), stripes.get(i).getBlue());

            if (max != max2){
                return false;
            }
        }
        return true;
    }
}
