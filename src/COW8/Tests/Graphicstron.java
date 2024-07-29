package COW8.Tests;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import COW8.Painter;

public class Graphicstron extends JPanel implements ActionListener{

    private ArrayList<Button> buttons;
    private String choice;

    private Painter thePainter;
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
                "Box Grid", "Multiplication Table",
                "Brick Wall", "ZigZag",
                "Wall Paper 70s", "Grid And Lines",
                "Tubular Two", "Patchwork Max",
                "Tiled Floor", "Patchwork",
                "Rainbow Fade", "Disco Down",
        };
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

        if(choice.equals("Box Grid")){
            thePainter.paintBoxGrid(g);
        }else if(choice.equals("Multiplication Table")){
            thePainter.paintMultiplicationTable(g);
        }else if(choice.equals("Brick Wall")){
            thePainter.paintBrickWall(g);
        }else if(choice.equals("ZigZag")){
            thePainter.paintZigZag(g);
        }else if(choice.equals("Wall Paper 70s")){
            thePainter.paintWallPaper70s(g);
        }else if(choice.equals("Grid And Lines")){
            thePainter.paintGridAndLines(g);
        }else if(choice.equals("Tubular Two")){
            thePainter.paintTubularTwo(g);
        }else if(choice.equals("Patchwork Max")){
            thePainter.paintPatchworkMax(g);
        }else if(choice.equals("Tiled Floor")){
            thePainter.paintTiledFloor(g);
        }else if(choice.equals("Patchwork")){
            thePainter.paintPatchWork(g);
        }else if(choice.equals("Rainbow Fade")){
            thePainter.paintRainbowFade(g);
        }else if(choice.equals("Disco Down")){
            thePainter.paintDiscoDown(g);
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
