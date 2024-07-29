package COW4.Tests;

import COW4.Myrtle;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class MyrtleTester extends JPanel implements ActionListener, MouseListener, KeyListener
{
    private JFrame theFrame;
    private Button test1Button, test2Button, test3Button, test4Button, test5Button, test6Button, test7Button;
    private Color backgroundColor;
    private String name;
    private boolean gameOver;
    private Block [][] map;
    private int blockSize;
    private boolean mapLoaded;
    private ArrayList<Myrtle> theMyrtles;

    public MyrtleTester(JFrame theFrame){

        setLayout(null);
        blockSize = 30;
        mapLoaded = false;

        test1Button = new Button("Move(steps)");
        test1Button.setBounds(0, 0, 75, blockSize);
        test1Button.setBackground(Color.WHITE);
        test1Button.setActionCommand("Test Move(steps)");
        add(test1Button);
        test1Button.addActionListener(this);

        test2Button = new Button("Move To Wall");
        test2Button.setBounds(75, 0, 75, blockSize);
        test2Button.setBackground(Color.WHITE);
        test2Button.setActionCommand("Test Move To Wall");
        add(test2Button);
        test2Button.addActionListener(this);

        test3Button = new Button("Move To Fruit");
        test3Button.setBounds(150, 0, 75, blockSize);
        test3Button.setBackground(Color.WHITE);
        test3Button.setActionCommand("Test Move To Fruit");
        add(test3Button);
        test3Button.addActionListener(this);

        test4Button = new Button("Pick Fruit");
        test4Button.setBounds(225, 0, 75, blockSize);
        test4Button.setBackground(Color.WHITE);
        test4Button.setActionCommand("Test Pick Fruit");
        add(test4Button);
        test4Button.addActionListener(this);

        test5Button = new Button("Pick All Fruit");
        test5Button.setBounds(300, 0, 75, blockSize);
        test5Button.setBackground(Color.WHITE);
        test5Button.setActionCommand("Test Pick All Fruit");
        add(test5Button);
        test5Button.addActionListener(this);

        test6Button = new Button("Place Row");
        test6Button.setBounds(375, 0, 75, blockSize);
        test6Button.setBackground(Color.WHITE);
        test6Button.setActionCommand("Test Place Row");
        add(test6Button);
        test6Button.addActionListener(this);

        test7Button = new Button("Maze");
        test7Button.setBounds(450, 0, 75, blockSize);
        test7Button.setBackground(Color.WHITE);
        test7Button.setActionCommand("Test Find Fruit In Maze");
        add(test7Button);
        test7Button.addActionListener(this);

        backgroundColor = Color.WHITE;
        name = "";
        gameOver = false;
        this.theFrame = theFrame;

    }

    public void actionPerformed (ActionEvent event)
    {
        String command = event.getActionCommand();
        //System.out.println("Command: " + command);
        if(command.equals("Test Move(steps)")){
            String [] stringMap = {"XXXXXXXXXXXXXX",
                    "X2EOOOOOOOOOOX",
                    "X4EOOOOOOOOOOX",
                    "X8EOOOOOOOOOOX",
                    "X9EOOOOOOOOOOX",
                    "XXXXXXXXXXXXXX",};
            loadMap(stringMap);
            for(int i = 0; i < theMyrtles.size(); i++){
                //System.out.println("Moving next myrtle");
                theMyrtles.get(i).move(map[i+1][1].getFruitCount());
            }
        }else if(command.equals("Test Move To Wall")){
            String [] stringMap = {"XXXXXXXXXXXXXX",
                    "XOEOOOOOOXOOOX",
                    "XOEOXOOOOOOOOX",
                    "XOEOOOOOOOOOOX",
                    "XOEOOOOOOOOOXX",
                    "XXXXXXXXXXXXXX",};
            loadMap(stringMap);
            for(int i = 0; i < theMyrtles.size(); i++){
                //System.out.println("Moving next myrtle");
                theMyrtles.get(i).moveToWall();
            }
        }else if(command.equals("Test Pick Fruit")){
            String [] stringMap = {"XXXXXXXX",
                    "XOE1OOOX",
                    "XOE2OOOX",
                    "XOE4OOOX",
                    "XOE8OOOX",
                    "XXXXXXXX",};
            loadMap(stringMap);
            int [] fruitCount = {1, 2, 4, 8};
            for(int i = 0; i < theMyrtles.size(); i++){
                //System.out.println("Moving next myrtle");
                theMyrtles.get(i).move();
                theMyrtles.get(i).pickFruit(fruitCount[i]);
                theMyrtles.get(i).move();
            }
        }else if(command.equals("Test Move To Fruit")){
            String [] stringMap = {"XXXXXXXXXXXXXX",
                    "XOEOOOOOO4OOOX",
                    "XOEO5OOOOOOOOX",
                    "XOE1OOOOOOOOOX",
                    "XOEOOOOOOOOO6X",
                    "XXXXXXXXXXXXXX",};
            loadMap(stringMap);
            for(int i = 0; i < theMyrtles.size(); i++){
                //System.out.println("Moving next myrtle");
                theMyrtles.get(i).moveToFruit();
            }
        }else if(command.equals("Test Pick All Fruit")){
            String [] stringMap = {"XXXXXXXX",
                    "XOEOOOOX",
                    "XOEOOOOX",
                    "XOEOOOOX",
                    "XOEOOOOX",
                    "XXXXXXXX",};
            loadMap(stringMap);
            int [] fruitCount = new int[4];
            for(int i = 0; i < fruitCount.length; i++){
                int nextAmount = 1 + (int)(Math.random() * 9);
                fruitCount[i] = nextAmount;
                for(int n = 1; n <= nextAmount; n++){
                    map[i+1][3].addFruit();
                }
            }
            for(int i = 0; i < theMyrtles.size(); i++){
                //System.out.println("Moving next myrtle");
                theMyrtles.get(i).move();
                theMyrtles.get(i).pickAllFruit();
                theMyrtles.get(i).move();
            }
        }else if(command.equals("Test Place Row")){
            String [] stringMap = {"XXXXXXXXXXXXXX",
                    "X2EOOOOOOOOOOX",
                    "X4EOOOOOOOOOOX",
                    "X8EOOOOOOOOOOX",
                    "X9EOOOOOOOOOOX",
                    "XXXXXXXXXXXXXX",};
            loadMap(stringMap);
            for(int i = 0; i < theMyrtles.size(); i++){
                //System.out.println("Moving next myrtle");
                theMyrtles.get(i).placeRow(map[i+1][1].getFruitCount());
            }
        }else if(command.equals("Test Find Fruit In Maze")){
            String [] stringMap = {"XXXXXXXXXXXXXX",
                    "XOOX1XOOOOOXOX",
                    "XXOXOXXXOXXXOX",
                    "XOOOOXXOOOOOOX",
                    "XOXXXXXOXXOXXX",
                    "XOXOXOOOXOOXOX",
                    "XOXOXXXOXXOOOX",
                    "XOOOOOOOXOOXOX",
                    "XXXXXXXXXXXXOX",
                    "XXOOOOXXXOOOOX",
                    "XOOXXOOOOOXXXX",
                    "XXOXXXXXXXXOOX",
                    "XOOOXOOOOOXXOX",
                    "XOXOOOXNXOOOOX",
                    "XXXXXXXXXXXXXX",};
            loadMap(stringMap);
            for(int i = 0; i < theMyrtles.size(); i++){
                //System.out.println("Moving next myrtle");
                theMyrtles.get(i).findFruitInMaze();
            }

        }


        repaint();
        paintImmediately(0,0,1000,1000);
        theFrame.requestFocus();

    }

    public void loadMap(String [] stringMap){
        map = new Block[stringMap.length][];
        theMyrtles = new ArrayList<Myrtle>();

        for(int r = 0; r < map.length; r++){
            map[r] = new Block[stringMap[r].length()];
            for(int c = 0; c < map[r].length; c++){
                if(stringMap[r].charAt(c) == 'X'){
                    map[r][c] = new Block(true, null, 0);
                }else if(stringMap[r].charAt(c) == 'O'){
                    map[r][c] = new Block(false, null, 0);
                }else if(stringMap[r].charAt(c) == 'N' || stringMap[r].charAt(c) == 'S' || stringMap[r].charAt(c) == 'E' || stringMap[r].charAt(c) == 'W'){
                    Myrtle next = new Myrtle(this, map, stringMap[r].charAt(c), r, c, 0);
                    map[r][c] = new Block(false, next, 0);
                    theMyrtles.add(next);
                }else if(stringMap[r].charAt(c) >= '0' && stringMap[r].charAt(c) <= '9'){
                    String fruitAmount = "" + stringMap[r].charAt(c);
                    map[r][c] = new Block(false, null, Integer.parseInt(fruitAmount));
                }else{
                    map[r][c] = new Block(false, null, 0);
                }
            }
        }
        mapLoaded = true;
        paintImmediately(0,0,1000,1000);
    }

    public void keyPressed(KeyEvent e) {
        char c = e.getKeyChar();
        System.out.println("pressed: " + c);
        if(c == 'y' || c == 'Y'){
            backgroundColor = Color.YELLOW;
        }
        repaint();
        paintImmediately(0,0,1000,1000);
    }

    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        System.out.println("typed: " + c);

        repaint();
    }

    public void keyReleased(KeyEvent e) {
        char c = e.getKeyChar();
        System.out.println("released: " + c);
        backgroundColor = Color.WHITE;
        repaint();
    }

    public void mouseClicked(MouseEvent e){
    }

    public void mouseEntered(MouseEvent e){
    }

    public void mouseExited(MouseEvent e){
    }

    public void mousePressed(MouseEvent e){
    }

    public void mouseReleased(MouseEvent e){
        int x = e.getX() - 4;
        int y = e.getY() - 30;
        System.out.println("X: " + x + '\t' + "Y: " + y);

    }

    ////////////////////////////////////////////////////
    //Title:    paint
    //Input:    Graphics object
    //Returns:  nothing
    //Does:     Paints the board to the screen
    public void paint(Graphics g){
        ((Graphics2D)g).setStroke(new BasicStroke(2));

        g.setColor(backgroundColor);
        g.fillRect(0, 0, 1000, 1000);

        // String message = "Hello " + name;

        // g.setFont(new Font("Times New Roman", Font.BOLD, 50));
        // g.setColor(Color.BLACK);
        // g.drawString(message, 300, 75);

        if(mapLoaded){
            for(int r = 0; r < map.length; r++){
                for(int c = 0; c < map[r].length; c++){
                    map[r][c].paint(g, c*blockSize, r*blockSize + blockSize, blockSize);
                    g.setColor(Color.BLACK);
                    g.drawRect(c* blockSize, r*blockSize + blockSize, blockSize, blockSize);
                }
            }
        }
    }

    public void run(){
        int delay = 100;
        while(!gameOver){

            System.out.println("Game Running");

            try {
                Thread.sleep(delay);
            }
            catch(InterruptedException e){

            }

            paintImmediately(0,0,1000,1000);
        }
    }

    public static void main(String [] arg){
        JFrame frame = new JFrame("Game");
        MyrtleTester game = new MyrtleTester(frame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(814, 800);
        frame.setLocation(0, 0);
        frame.addKeyListener(game);
        frame.addMouseListener(game);
        frame.getContentPane().add(game);
        frame.setVisible(true);
        frame.requestFocus();
        //game.run();

    }
}