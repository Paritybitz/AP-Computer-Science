package COW16;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;
import java.awt.Graphics; import java.awt.image.BufferedImage; import java.io.File; import java.io.IOException; import java.util.logging.Level; import java.util.logging.Logger; import javax.imageio.ImageIO; import javax.swing.JPanel; 

public class Puzzle extends JPanel implements KeyListener {

    char c;
    private BufferedImage image;
    private int width, height, spacing;
    private int numRows, numCols;
    private PuzzlePiece [][] thePuzzle;
    private Puzzler thePuzzler;
    private static String [] fileNames = {"castle.jpg", "super.jpg", "minion.png", "monaLisa.jpg", "paper.JPG", "Starry.jpg", "Street.jpg", "Wave.jpg"};

    public Puzzle() {
        loadRandomPuzzle();
    }

        
    
    public void loadRandomPuzzle(){
        String fileName = fileNames[(int)(fileNames.length * Math.random())];
        try {
            image = ImageIO.read(new File(fileName));
        } catch (IOException ex) { 
            // handle exception...   
            System.out.println("File not found");
        } 

        thePuzzler = new Puzzler();
        
        width = 10 + (int)(Math.random() * 90);
        height = width;
        spacing = 1;
        numRows = image.getHeight()/height;
        numCols = image.getWidth()/width;
        //System.out.println("Rows: " + numRows + ", Col: " + numCols);
        ArrayList<Integer> sideKeys = new ArrayList<Integer>();
        int numSides = numRows * numCols * 4;
        for(int n = 0; n < numSides; n++){
            sideKeys.add(n);
        }

        ArrayList<Integer> randomized = new ArrayList<Integer>();
        while(sideKeys.size() > 0){
            int i = (int)(Math.random() * sideKeys.size());
            randomized.add(sideKeys.remove(i));
        }

        thePuzzle = new PuzzlePiece[numRows][numCols];

        int [] keys1 = {randomized.remove(0), -2, -2, randomized.remove(0)};
        thePuzzle[0][0] = new PuzzlePiece(image.getSubimage(0 * width, 0 * height, width, height), keys1);

        //top row
        for(int iC = 1; iC < thePuzzle[0].length-1; iC++){
            int [] keys = {randomized.remove(0), -1, thePuzzle[0][iC-1].getEast(), randomized.remove(0)};
            thePuzzle[0][iC] = new PuzzlePiece(image.getSubimage(iC * width, 0 * height, width, height), keys);
        }
        int [] keys2 = {-1, -1, thePuzzle[0][thePuzzle[0].length-2].getEast(), randomized.remove(0)};
        thePuzzle[0][thePuzzle[0].length-1] = new PuzzlePiece(image.getSubimage((thePuzzle[0].length-1) * width, 0 * height, width, height), keys2);

        //left column
        for(int iR = 1; iR < thePuzzle.length-1; iR++){
            int [] keys = {randomized.remove(0), thePuzzle[iR-1][0].getSouth(), -1, randomized.remove(0)};
            thePuzzle[iR][0] = new PuzzlePiece(image.getSubimage(0 * width, iR * height, width, height), keys);
        }
        int [] keys3 = {randomized.remove(0), thePuzzle[thePuzzle.length-2][0].getSouth(), -1, -1};
        thePuzzle[thePuzzle.length-1][0] = new PuzzlePiece(image.getSubimage(0 * width, (thePuzzle.length-1) * height, width, height), keys3);

        for(int iR = 1; iR < thePuzzle.length-1; iR++){
            for(int iC = 1; iC < thePuzzle[0].length-1; iC++){
                int [] keys = {randomized.remove(0), thePuzzle[iR-1][iC].getSouth(), thePuzzle[iR][iC-1].getEast(), randomized.remove(0)};
                thePuzzle[iR][iC] = new PuzzlePiece(image.getSubimage(iC * width, iR * height, width, height), keys);
            }
        }

        //System.out.println("Dimensions: " + image.getWidth() + " by " + image.getHeight());
        //System.out.println("Max Y: " + ((thePuzzle.length-1) * height) + " with an distance of " + height);

        //bottom row
        for(int iC = 1; iC < thePuzzle[0].length-1; iC++){
            int [] keys = {randomized.remove(0), thePuzzle[thePuzzle.length-2][iC].getSouth(), thePuzzle[thePuzzle.length-1][iC-1].getEast(), -1};
            thePuzzle[thePuzzle.length-1][iC] = new PuzzlePiece(image.getSubimage(iC * width, (thePuzzle.length-1) * height, width, height), keys);
        }

        //right column
        for(int iR = 1; iR < thePuzzle.length-1; iR++){
            int [] keys = {-1, thePuzzle[iR-1][thePuzzle[0].length-1].getSouth(), thePuzzle[iR][thePuzzle[0].length-2].getEast(), randomized.remove(0)};
            thePuzzle[iR][thePuzzle[0].length-1] = new PuzzlePiece(image.getSubimage((thePuzzle[0].length-1) * width, iR * height, width, height), keys);
        }

        int [] keys4 = {-1,thePuzzle[thePuzzle.length-2][thePuzzle[0].length-1].getSouth(), thePuzzle[thePuzzle.length-1][thePuzzle[0].length-2].getEast(), -1};
        thePuzzle[thePuzzle.length-1][thePuzzle[0].length-1] = new PuzzlePiece(image.getSubimage((thePuzzle[0].length-1) * width, (thePuzzle.length-1) * height, width, height), keys4);
    }
        
    

    /** Handle the key released event from the text field. */
    public void keyReleased(KeyEvent e) {
        c = e.getKeyChar();
        if(c == 'q'){
            thePuzzler.rotateAll(thePuzzle);
        }else if(c == 'w'){
            thePuzzler.randomlyRotate(thePuzzle);
        }else if(c == 'e'){
            thePuzzler.randomizeOrder(thePuzzle);
        }else if(c == 'r'){
            thePuzzler.randomizeCompletely(thePuzzle);
        }else if(c == 's'){
            thePuzzler.fixRotation(thePuzzle);
        }else if(c == 'd'){
            thePuzzler.fixPlacement(thePuzzle);
        }else if(c == 'f'){
            thePuzzler.solve(thePuzzle);
        }else if(c == 'p'){
            loadRandomPuzzle();
        }

        repaint();
    }

    

    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 3000, 3000);
        g.setColor(Color.GREEN);
        //g.setFont(new Font("Times New Roman", Font.BOLD, 50));

        String instructions = "q - rotateAll, w - randomlyRotate, e - randomizeOrder, r - randomizeCompletely, s - fixRotation, d - fixPlacement, f - solve, p - load new puzzle";
        g.drawString(instructions, 0, 10);
        for(int iR = 0; iR < thePuzzle.length; iR++){
            for(int iC = 0; iC < thePuzzle[0].length; iC++){
                thePuzzle[iR][iC].paint(g, iC * (width + spacing), iR * (height + spacing) + 15);
            }
        }

    }

    public void keyTyped(KeyEvent e) {

        c = e.getKeyChar();     
    }

    public void keyPressed(KeyEvent e) {
        c = e.getKeyChar();
    }

    public static void main(String [] arg){
        Puzzle game = new Puzzle();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(2000, 2000);
        frame.setLocation(0, 0);
        frame.addKeyListener(game);
        frame.getContentPane().add(game);
        frame.setVisible(true);
    }
}