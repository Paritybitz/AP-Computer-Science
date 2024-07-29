package COW13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class BlobGame extends JPanel implements KeyListener
{
    Blob playerBlob;
    ArrayList<Blob> evilBlobs;
    int delay;
    boolean gameOver;

    public BlobGame(){
        gameOver  = false;
        delay = 100;
        evilBlobs = new ArrayList<Blob>();
        playerBlob = new Blob(15, Color.blue, 500, 500, 0, 0);
        for(int i = 0; i < 20; i++) {
            createEvilBlob();
        }
    }

    /** Handle the key pressed event from the text field. */
    public void keyPressed(KeyEvent e) {
        char c;
        c = e.getKeyChar();

        if (c == 'w') {
            playerBlob.moveUp();
        } else if (c == 'a') {
            playerBlob.moveLeft();
        } else if (c == 's') {
            playerBlob.moveDown();
        } else if (c == 'd') {
            playerBlob.moveRight();
        }
    }

    public void checkForCollision(){
        int numEvilBlobsEaten = 0;
        if (playerBlob.getX() < -100 || playerBlob.getX() > 900 || playerBlob.getY() < -100 || playerBlob.getY() > 900) {
            gameOver = true;
        }
        for (int i = 0; i < evilBlobs.size(); i++) {
            Blob currentBlob = evilBlobs.get(i);
            if (currentBlob.getX() < -100 || currentBlob.getX() > 900 || currentBlob.getY() < -100 || currentBlob.getY() > 900) {
                evilBlobs.remove(i);
                createEvilBlob();
            }
        }
        for (int i = 0; i < evilBlobs.size(); i++) {
            Blob currentBlob = evilBlobs.get(i);
            int distance = distance(playerBlob.getX(), playerBlob.getY(), currentBlob.getX(), currentBlob.getY());
            if (distance < playerBlob.getRadius() + currentBlob.getRadius()) {
                if (playerBlob.getRadius() > currentBlob.getRadius()) {
                    evilBlobs.remove(i);
                    createEvilBlob();
                    playerBlob.eat();
                    numEvilBlobsEaten ++;
                } else {
                    gameOver = true;
                }
            }
        }
        if (playerBlob.getRadius() >= 115) {
            gameOver = true;
            System.out.println("Final Blob Size - " + playerBlob.getRadius());
        }
        if (numEvilBlobsEaten >= 35) {
            playerBlob.theColor = (Color.MAGENTA);
        }
    }


    public void createEvilBlob(){
        int side = (int)(Math.random() * 4);
        int x, y, deltaX, deltaY;
        // choose a random side
        if (side == 0) {
            // left side
            x = 0;
            y = (int)(Math.random() * getHeight());
            deltaX = (int)(Math.random() * 5) + 1;
            deltaY = (int)(Math.random() * 5) - 2;
        }
        else if (side == 1) {
            // right side
            x = getWidth();
            y = (int)(Math.random() * getHeight());
            deltaX = (int)(Math.random() * -5) - 1;
            deltaY = (int)(Math.random() * 5) - 2;
        }
        else if (side == 2) {
            // top side
            x = (int)(Math.random() * getWidth());
            y = 0;
            deltaX = (int)(Math.random() * 5) - 2;
            deltaY = (int)(Math.random() * 5) + 1;
        }
        else {
            // bottom side
            x = (int)(Math.random() * getWidth());
            y = getHeight();
            deltaX = (int)(Math.random() * 5) - 2;
            deltaY = (int)(Math.random() * -5) - 1;
        }
        int radius = (int) (Math.random() * 60) + 1;
        Color color = Color.RED;
        evilBlobs.add(new Blob(radius, color, x, y, deltaX, deltaY));
    }

    public static int distance(int x1, int y1, int x2, int y2){
        return (int) Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
    }

    ////////////////////////////////////////////////////////
    //Do not edit code below

    public void paint(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, 800, 800);
        playerBlob.draw(g);
        for(int i = 0; i < evilBlobs.size(); i++){
            evilBlobs.get(i).draw(g);
        }
    }

    /** Handle the key released event from the text field. */
    public void keyReleased(KeyEvent e) {
        char c;
        c = e.getKeyChar();
    }
    /** Handle the key typed event from the text field. */
    public void keyTyped(KeyEvent e) {
        char c;
        c = e.getKeyChar();
    }

    public void run(){

        while(!gameOver){

            try {
                Thread.sleep(delay);
            }catch(InterruptedException e) {}

            playerBlob.move();
            for(int i = 0; i < evilBlobs.size(); i++){
                evilBlobs.get(i).move();
            }

            //check for collision
            checkForCollision();

            paintImmediately(0, 0, 1000, 1000);
        }
        System.out.println("GAME OVER");
        System.out.println("Final Blob Size - " + playerBlob.getRadius());
    }

    public static void main(String [] arg){
        JFrame runner = new JFrame("Game Title");
        runner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        runner.setLocationRelativeTo(null);
        runner.setSize(800, 800);
        runner.setLayout(null);
        runner.setLocation(0, 0);

        BlobGame theGame = new BlobGame();
        theGame.setSize(800, 800);
        theGame.setLocation(0, 0);
        runner.getContentPane().add(theGame);

        runner.setVisible(true);

        runner.addKeyListener(theGame);
        theGame.run();
    }
}
