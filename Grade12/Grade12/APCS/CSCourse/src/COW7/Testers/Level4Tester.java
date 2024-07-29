package COW7.Testers;

import COW7.Point;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Level4Tester extends JPanel implements KeyListener {

    private COW7.Polygon thePolygon;
    private int version;

    public Level4Tester() {
        version = 1;
        loadPolygon(version);

    }

    /** Handle the key released event from the text field. */
    public void keyReleased(KeyEvent e) {
        char c = e.getKeyChar();
        String letter = "" + c;
        letter = letter.toLowerCase();
        c = letter.charAt(0);
        //finish the if statement so that the WASD keys 
        if(c == 'x'){
            thePolygon.reflectAcrossX(300);
        }else if(c == 'y'){
            thePolygon.reflectAcrossY(400);
        }else if(c == 'r'){
            thePolygon.reflectAcrossYequalX();
        }else if(c == ' '){
            version++;
            if(version > 3){
                version = 1;
            }
            loadPolygon(version);
        }

        repaint();
    }
    
    public void loadPolygon(int version){
        if(version == 1){
            Point[] points = new COW7.Point[5];
            points[0] = new COW7.Point(100, 100, Color.BLUE, 10);
            points[1] = new Point(400, 100, Color.GREEN, 10);
            points[2] = new Point(300, 400, Color.RED, 10);
            points[3] = new COW7.Point(200, 400, Color.ORANGE, 10);
            points[4] = new Point(300, 300, Color.YELLOW, 10);
            thePolygon = new COW7.Polygon(points, Color.BLACK);

        }else if(version == 2){
            COW7.Point[] points = new COW7.Point[12];
            points[0] = new Point(100, 100, Color.BLUE, 10);
            points[1] = new Point(400, 100, Color.BLUE, 10);
            points[2] = new COW7.Point(400, 200, Color.BLUE, 10);
            points[3] = new COW7.Point(300, 200, Color.BLUE, 10);
            points[4] = new COW7.Point(300, 300, Color.ORANGE, 10);
            points[5] = new COW7.Point(400, 300, Color.ORANGE, 10);
            points[6] = new COW7.Point(400, 400, Color.ORANGE, 10);
            points[7] = new Point(100, 400, Color.ORANGE, 10);
            points[8] = new COW7.Point(100, 300, Color.ORANGE, 10);
            points[9] = new COW7.Point(200, 300, Color.ORANGE, 10);
            points[10] = new COW7.Point(200, 200, Color.BLUE, 10);
            points[11] = new COW7.Point(100, 200, Color.BLUE, 10);
            
            thePolygon = new COW7.Polygon(points, Color.BLACK);
        }else if(version == 3){
            Point[] points = new Point[7];
            points[0] = new COW7.Point(100, 100, Color.YELLOW, 10);
            points[1] = new Point(400, 100, Color.GREEN, 10);
            points[2] = new COW7.Point(300, 200, Color.GREEN, 10);
            points[3] = new Point(500, 400, Color.GREEN, 10);
            points[4] = new Point(400, 500, Color.RED, 10);
            points[5] = new COW7.Point(200, 300, Color.RED, 10);
            points[6] = new Point(100, 400, Color.RED, 10);

            
            thePolygon = new COW7.Polygon(points, Color.BLACK);
        }
            
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
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 400, 40);
        g.setColor(Color.BLACK);
        g.drawString("X - Reflect Across x=300, Y - Reflect Across y=400, R - Reflect Across y=x", 0, 20);
        g.drawString("Space - Next COW7.Polygon", 0, 40);
        thePolygon.paint(g);
    }

    public void keyTyped(KeyEvent e) {

        char c = e.getKeyChar();  

    }

    public void keyPressed(KeyEvent e) {
        char c = e.getKeyChar();
    }

    public static void main(String [] arg){
        Level4Tester game = new Level4Tester();
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