package COW15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Graphicstron extends JPanel implements ActionListener{

    private ArrayList<Button> commandButtons;

    private TextField  fileNameField;
    private TextField  xValueTextField;
    private TextField  yValueTextField;
    private TextField  dValueTextField;
    private TextField  wValueTextField;
    private TextField  hValueTextField;

    private TextField  rValueTextField;
    private TextField  gValueTextField;
    private TextField  bValueTextField;
    
    private TextField  charValueTextField;
    private TextField  boldValueTextField;
    private TextField  textValueTextField;
    
    private Board theBoard;

    private int command;
    private int width;
    private int width2;
    private int height;
    private int height2;
    private int x;
    private int y;
    private int space;

    public Graphicstron(){
        setLayout(null);

        theBoard = new Board(this);

        width = 120;
        width2 = (int)(width / 4);
        height = 21;
        height2 = height;
        x = 801;
        y = 0;
        space = 5;

        xValueTextField = new TextField(3);
        xValueTextField.addActionListener(this);
        xValueTextField.setBounds(x + width + space, y + height, width2, height);
        add(xValueTextField);

        yValueTextField = new TextField(3);
        yValueTextField.addActionListener(this);
        yValueTextField.setBounds(x + width + space + width2 + space, y + height, width2, height);
        add(yValueTextField);

        dValueTextField = new TextField(3);
        dValueTextField.addActionListener(this);
        dValueTextField.setBounds(x + width + space + width2 + space + width2 + space, y + height, width2, height);
        add(dValueTextField);

        wValueTextField = new TextField(3);
        wValueTextField.addActionListener(this);
        wValueTextField.setBounds(x + width + space, y + height*3, width2, height);
        add(wValueTextField);

        hValueTextField = new TextField(3);
        hValueTextField.addActionListener(this);
        hValueTextField.setBounds(x + width + space + width2 + space, y + height*3, width2, height);
        add(hValueTextField);
        
        rValueTextField = new TextField(3);
        rValueTextField.addActionListener(this);
        rValueTextField.setBounds(x + width + space, y + height * 5, width2, height);
        add(rValueTextField);

        gValueTextField = new TextField(3);
        gValueTextField.addActionListener(this);
        gValueTextField.setBounds(x + width + space + width2 + space, y + height * 5, width2, height);
        add(gValueTextField);

        bValueTextField = new TextField(3);
        bValueTextField.addActionListener(this);
        bValueTextField.setBounds(x + width + space + width2 + space + width2 + space, y + height * 5, width2, height);
        add(bValueTextField);
        
        charValueTextField = new TextField(3);
        charValueTextField.addActionListener(this);
        charValueTextField.setBounds(x + width + space, y + height * 26, width2, height);
        add(charValueTextField);
        
        boldValueTextField = new TextField(3);
        boldValueTextField.addActionListener(this);
        boldValueTextField.setBounds(x + width + space + width2 + space, y + height * 26, width2, height);
        add(boldValueTextField);

        textValueTextField = new TextField(20);
        textValueTextField.addActionListener(this);
        textValueTextField.setBounds(x + width + space, y + height * 28, width, height*3);
        add(textValueTextField);
        
        fileNameField = new TextField(20);
        fileNameField.addActionListener(this);
        fileNameField.setBounds(x + width + space, y + height*12, width, height);
        add(fileNameField);
        /*
        firstIndexTextField = new TextField(20);
        firstIndexTextField.addActionListener(this);
        firstIndexTextField.setBounds(250, 300, width, height);
        add(firstIndexTextField);

        secondIndexTextField = new TextField(20);
        secondIndexTextField.addActionListener(this);
        secondIndexTextField.setBounds(400, 300, width, height);
        add(secondIndexTextField);
         */
        /////////Buttons

        String [] commands = {"All On", "All Off", "Random", "Horizontal Line", "Vertical Line", "Draw Rect", 
                "Fill Rect", "Rainbow Lines", "Right Diagonal", "Left Diagonal", "Draw Initials", 
                "Load Picture", "Load File",
                "Lighten", "Darken", "Negative", "Shift Right", "Shift Left", "Shift Down", "Shift Up",
                "Flip Horizontally", "Flip Vertically", "Rotate", 
                "Fill Oval", "Draw Landscape", "Set Color",
                "Print Char", "Print Text", "Area Fill", "Load Area Fill Image", "Test Area Fill", "Dynamic Letter", "Dynamic Text"
            };
        int n = 0;
        for(String command: commands){
            Button b = new Button(command);
            b.setBounds(x, y + height2 * n, width, height);
            n += 1;
            b.setActionCommand(command);
            add(b);
            b.addActionListener(this);
        }


    }

    public void actionPerformed (ActionEvent event){

        String action = event.getActionCommand();

        if("Horizontal Line".equals(action)){
            int x = Integer.parseInt(xValueTextField.getText());
            int y = Integer.parseInt(yValueTextField.getText());
            int d = Integer.parseInt(dValueTextField.getText());
            theBoard.drawHorizontalLine(x, y, d);  

        }else if("Vertical Line".equals(action)){
            int x = Integer.parseInt(xValueTextField.getText());
            int y = Integer.parseInt(yValueTextField.getText());
            int d = Integer.parseInt(dValueTextField.getText());
            theBoard.drawVerticalLine(x, y, d);  
            
        }else if("Draw Rect".equals(action)){
            int x = Integer.parseInt(xValueTextField.getText());
            int y = Integer.parseInt(yValueTextField.getText());
            int w = Integer.parseInt(wValueTextField.getText());
            int h = Integer.parseInt(hValueTextField.getText());
            theBoard.drawRect(x, y, w, h);

        }else if("Right Diagonal".equals(action)){
            int x = Integer.parseInt(xValueTextField.getText());
            int y = Integer.parseInt(yValueTextField.getText());
            int d = Integer.parseInt(dValueTextField.getText());
            System.out.println("x: " + x + ", y: " + y + ", d: " + d);
            theBoard.drawRightDiagonal(x, y, d);  

        }else if("Left Diagonal".equals(action)){
            int x = Integer.parseInt(xValueTextField.getText());
            int y = Integer.parseInt(yValueTextField.getText());
            int d = Integer.parseInt(dValueTextField.getText());
            System.out.println("x: " + x + ", y: " + y + ", d: " + d);
            theBoard.drawLeftDiagonal(x, y, d);
            
        }else if("Rainbow Lines".equals(action)){
            theBoard.drawRainbowLines();  
        }else if("Random".equals(action)){
            theBoard.random();  
        }else if("Draw Initials".equals(action)){
            theBoard.drawInitials();  
        }else if("All Off".equals(action)){
            theBoard.allOff();  
        }else if("All On".equals(action)){
            theBoard.allOn();  
        }else if("Flip Horizontally".equals(action)){
            theBoard.flipHorizontally();  
        }else if("Flip Vertically".equals(action)){
            theBoard.flipVertically();  
        }else if("Rotate".equals(action)){
            theBoard.rotate();  
        }else if("Draw Landscape".equals(action)){
            theBoard.drawLandScape();  
        }else if("Load File".equals(action)){
            String filename = fileNameField.getText();
            theBoard.loadImage(filename);  
        }else if("Load Picture".equals(action)){
            theBoard.loadImage("sunday.jpg");    
        }else if("Shift Right".equals(action)){
            theBoard.shiftRight();
        }else if("Shift Left".equals(action)){
            theBoard.shiftLeft();
        }else if("Shift Down".equals(action)){
            theBoard.shiftDown();
        }else if("Shift Up".equals(action)){
            theBoard.shiftUp(); 
        }else if("Lighten".equals(action)){
            theBoard.lighten();
        }else if("Darken".equals(action)){
            theBoard.darken();
        }else if("Negative".equals(action)){
            theBoard.negative();
        }else if("Fill Rect".equals(action)){
            int x = Integer.parseInt(xValueTextField.getText());
            int y = Integer.parseInt(yValueTextField.getText());
            int w = Integer.parseInt(wValueTextField.getText());
            int h = Integer.parseInt(hValueTextField.getText());
            theBoard.fillRect(x, y, w, h); 
        }else if("Fill Oval".equals(action)){
            int x = Integer.parseInt(xValueTextField.getText());
            int y = Integer.parseInt(yValueTextField.getText());
            int w = Integer.parseInt(wValueTextField.getText());
            int h = Integer.parseInt(hValueTextField.getText());
            theBoard.fillOval(x, y, w, h); 
        }else if("Set Color".equals(action)){
            int r = Integer.parseInt(rValueTextField.getText());
            int g = Integer.parseInt(gValueTextField.getText());
            int b = Integer.parseInt(bValueTextField.getText());
            theBoard.setColor(new Color(r, g, b));  
        }else if("Print Char".equals(action)){
            int x = Integer.parseInt(xValueTextField.getText());
            int y = Integer.parseInt(yValueTextField.getText());
            char letter = charValueTextField.getText().toUpperCase().charAt(0);
            theBoard.printChar(letter, x, y); 
        }else if("Print Text".equals(action)){
            String text = textValueTextField.getText().toUpperCase();
            theBoard.printText(text);
        }else if("Area Fill".equals(action)){
            int red = Integer.parseInt(rValueTextField.getText());
            int green = Integer.parseInt(gValueTextField.getText());
            int blue = Integer.parseInt(bValueTextField.getText());
            Color theColor = new Color(red, green, blue);
            int x = Integer.parseInt(xValueTextField.getText());
            int y = Integer.parseInt(yValueTextField.getText());
            theBoard.areaFill(theColor, x, y);
        }else if("Dynamic Letter".equals(action)){
            int red = Integer.parseInt(rValueTextField.getText());
            int green = Integer.parseInt(gValueTextField.getText());
            int blue = Integer.parseInt(bValueTextField.getText());
            Color theColor = new Color(red, green, blue);
            int x = Integer.parseInt(xValueTextField.getText());
            int y = Integer.parseInt(yValueTextField.getText());
            int d = Integer.parseInt(dValueTextField.getText());
            char letter = charValueTextField.getText().toUpperCase().charAt(0);
            char isBold = boldValueTextField.getText().toUpperCase().charAt(0);
            if(isBold == 'Y'){
                theBoard.drawDynamicLetter(letter, x, y, d, theColor, true);
            }else{
                theBoard.drawDynamicLetter(letter, x, y, d, theColor, false);
            }
        }else if("Dynamic Text".equals(action)){
            int red = Integer.parseInt(rValueTextField.getText());
            int green = Integer.parseInt(gValueTextField.getText());
            int blue = Integer.parseInt(bValueTextField.getText());
            Color theColor = new Color(red, green, blue);
            int d = Integer.parseInt(dValueTextField.getText());
            String text = textValueTextField.getText().toUpperCase();
            char isBold = boldValueTextField.getText().toUpperCase().charAt(0);
            if(isBold == 'Y'){
                theBoard.printDynamicText(text, d, theColor, true);
            }else{
                theBoard.printDynamicText(text, d, theColor, false);
            }
        }else if("Load Area Fill Image".equals(action)){
            theBoard.loadImage("fillTest.png");  
        }else if("Test Area Fill".equals(action)){
            theBoard.loadImage("fillTest.png");
            theBoard.areaFill(Color.ORANGE, 20, 20);
            theBoard.areaFill(Color.BLUE, 70, 20);
            theBoard.areaFill(Color.RED, 7, 50);
            theBoard.areaFill(Color.PINK, 1, 1);
        }
        repaint();
    }

    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 10000, 10000);
        g.setColor(Color.WHITE);
        int offset = 5;
        g.drawString("X", x + width + space + offset, height * 1 - offset);
        g.drawString("Y", x + width + space + offset + space + width2, height * 1 - offset);
        g.drawString("D", x + width + space + offset + space + width2 + space + width2, height * 1 - offset);
        g.drawString("W", x + width + space + offset, height * 3 - offset);
        g.drawString("H", x + width + space + offset + space + width2, height * 3 - offset);
        g.drawString("R", x + width + space + offset, height * 5 - offset);
        g.drawString("G", x + width + space + offset + space + width2, height * 5 - offset);
        g.drawString("B", x + width + space + offset + space + width2 + space + width2, height * 5 - offset);
        g.drawString("Char", x + width + space, height * 26 - offset);
        g.drawString("Bold(Y)", x + width + space + space + width2, height * 26 - offset);
        g.drawString("Text", x + width + space + offset, height * 28 - offset);
        g.drawString("File Name", x + width + space +offset, height*12-offset);

        theBoard.draw(g);
    }

    public static void main(String [] arg){
        JFrame frame;

        frame = new JFrame("Graphics Intro Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(1100, 850);
        frame.setLocation(0,0);

        Graphicstron gMan = new Graphicstron();

        frame.getContentPane().add(gMan);
        frame.setVisible(true);
    }
}
