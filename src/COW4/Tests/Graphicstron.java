
package COW4.Tests;

import COW4.Painter;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Graphicstron extends JPanel implements ActionListener{

    private ArrayList<Button> buttons;
    private String choice;

    private COW4.Painter thePainter;
    int command;

    public Graphicstron(){
        setLayout(null);

        thePainter = new Painter();
        choice = "";

        int width = 120;
        int height = 35;
        int x = 700;
        int y = 0;
        String [] buttonLabels = {
                "Vertical Lines", "Red Range", "Hourglass",
                "Line Grid", "Bulls Eye", "Zoom",
                "Horizontal Lines", "Row Of Boxes", "Paper Stack",
                "Corner Web", "X Box", "Dream Catcher",
                "Bow Tie", "Scale", "Rainbow Road",
                "Criss Cross", "Hole", "Spiral"};
        buttons = new ArrayList<Button>();

        int n=0, yOff=0;
        // if(i < buttonLabels.length/2){
        // n = i;
        // yOff = 0;
        // }else{
        // n = i-buttonLabels.length/2;
        // yOff = 11;
        // }
        //for(char c = 'A'; c <= 'J'; c += 1){
        for(int i = 0; i < buttonLabels.length; i += 1){
            Button next = new Button(buttonLabels[i]);
            next.setBounds(x + (int)(width * n * 1.5), y + height * yOff, width, height);
            next.setActionCommand(buttonLabels[i]);
            add(next);
            next.addActionListener(this);
            buttons.add(next);
            yOff += 1;
        }
        //}

    }

    public void actionPerformed (ActionEvent event){
        choice = event.getActionCommand();
        int x = 0;

        repaint();
    }

    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 2000, 2000);
        g.setColor(Color.WHITE);

        if(choice.equals("Vertical Lines")){
            thePainter.paintVerticalLines(g);
        }else if(choice.equals("Red Range")){
            thePainter.paintRedRange(g);
        }else if(choice.equals("Hourglass")){
            thePainter.paintHourglass(g);
        }else if(choice.equals("Line Grid")){
            thePainter.paintLineGrid(g);
        }else if(choice.equals("Bulls Eye")){
            thePainter.paintBullsEye(g);
        }else if(choice.equals("Zoom")){
            thePainter.paintZoom(g);
        }else if(choice.equals("Horizontal Lines")){
            thePainter.paintHorizontalLines(g);
        }else if(choice.equals("Row Of Boxes")){
            thePainter.paintRowOfBoxes(g);
        }else if(choice.equals("Paper Stack")){
            thePainter.paintPaperStack(g);
        }else if(choice.equals("Corner Web")){
            thePainter.paintCornerWeb(g);
        }else if(choice.equals("X Box")){
            thePainter.paintXBox(g);
        }else if(choice.equals("Dream Catcher")){
            thePainter.paintDreamCatcher(g);
        }else if(choice.equals("Bow Tie")){
            thePainter.paintBowTie(g);
        }else if(choice.equals("Scale")){
            thePainter.paintScale(g);
        }else if(choice.equals("Rainbow Road")){
            thePainter.paintRainbowRoad(g);
        }else if(choice.equals("Criss Cross")){
            thePainter.paintCrissCross(g);
        }else if(choice.equals("Hole")){
            thePainter.paintHole(g);
        }else if(choice.equals("Spiral")){
            thePainter.paintSpiral(g);
        }

    }
    public static void main(String [] arg){
        JFrame frame;

        frame = new JFrame("Graphics Intro Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(1100, 1000);
        frame.setLocation(0, 0);

        Graphicstron gMan = new Graphicstron();

        frame.getContentPane().add(gMan);
        frame.setVisible(true);
    }
}

