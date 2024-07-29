package COW7.Testers;

import COW7.*;
import COW7.Point;
import COW7.Polygon;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class EverythingTester extends JPanel implements KeyListener {

    Polygon thePolygon;

    public EverythingTester() {
        //create your point
        Point[] points = new Point [5];
        points[0] = (new Point(100, 100, Color.BLUE, 10));
        points[1] = (new Point(400, 100, Color.GREEN, 10));
        points[2] = (new Point(300, 400, Color.RED, 10));
        points[3] = (new Point(200, 400, Color.ORANGE, 10));
        points[4] = new Point(300, 300, Color.YELLOW, 10);
        thePolygon = new Polygon(points, Color.BLACK);
    }

    /** Handle the key released event from the text field. */
    public void keyReleased(KeyEvent e) {
        char c = e.getKeyChar();
        String letter = "" + c;
        letter = letter.toLowerCase();
        c = letter.charAt(0);
        //finish the if statement so that the WASD keys 
        if(c == 'd'){
            thePolygon.moveRight(5);
        }else if(c == 'a'){
            thePolygon.moveLeft(5);
        }else if(c == 's'){
            thePolygon.moveDown(5);
        }else if(c == 'w'){
            thePolygon.moveUp(5);
        }else if(c == 'x'){
            thePolygon.reflectAcrossX(300);
        }else if(c == 'y'){
            thePolygon.reflectAcrossY(400);
        }else if(c == 'r'){
            thePolygon.reflectAcrossYequalX();
        }else if(c == 'p'){
            System.out.println(thePolygon.getPerimeter());
        }else if(c == 't'){
            thePolygon.rotate(250, 250, 30);
        }else if(c == 'h'){
            thePolygon.stretchHorizontally(1.2);
        }else if(c == 'v'){
            thePolygon.stretchVertically(1.2);
        }else if(c == 'q'){
            thePolygon.dilate(250, 250, .5);
        }else if(c == 'e'){
            thePolygon.dilate(250, 250, 1.5);
        }

        repaint();
    }


    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 1000, 1000);
        g.setColor(Color.PINK);
        for(int x = 50; x <= 2000; x += 50){
            g.drawLine(x, 0, x, 2000);
        }
        for(int y = 50; y <= 2000; y += 50){
            g.drawLine(0, y, 2000, y);
        }
        g.setColor(Color.BLACK);
        g.drawString("A - Move Left, S - Move Down, D - MoveRight, W - Move Up, P - Get Perimeter", 0, 20);
        g.drawString("X - Reflect Across x=300, Y - Reflect Across y=400, R - Reflect Across y=x", 0, 40);
        g.drawString("H - Stretch Horizontally, V - Stretch Vertically, E - Dilate by 3, Q - Dilate by .5", 0, 60);
        g.drawString("T - Rotate by 30", 0, 80);

        thePolygon.paint(g);
    }

    public void keyTyped(KeyEvent e) {

        char c = e.getKeyChar();

    }

    public void keyPressed(KeyEvent e) {
        char c = e.getKeyChar();
    }

    public static void main(String [] arg){
        EverythingTester game = new EverythingTester();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(800, 800);
        frame.addKeyListener(game);
        frame.getContentPane().add(game);
        frame.setLocation(0, 0);
        frame.setVisible(true);
    }
}