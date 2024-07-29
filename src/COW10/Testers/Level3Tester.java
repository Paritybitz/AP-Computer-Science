package COW10.Testers;

import COW10.BinaryFun;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Level3Tester extends JPanel{

    boolean [] binOne = {true, false, true};
    boolean [] binTwo = {false, true, true};
    boolean [] binSumOneTwo = {true, true, false, true};
    boolean [] binThree = {false, true,  true,  true,  false,  false, true, false, true};
    boolean [] binFour =  {false, false, true,  true,  false,  true,  true, false, true};
    boolean [] binSumThreeFour = {false, true, false, true, true, true, false, true, false, true};
    boolean [] binFive = {true, false, true, false, true, false, true, false, true, false, true, false, true,  false, true};
    boolean [] binSix =  {true, true,  true, true,  true, false, true, true, true, false,  true, false, false, true,  true};
    boolean [] binSumFiveSix = {false, false, true, false, true, true, false, false, true, true, false, true, true, true, false, true};

    ArrayList<boolean[]> binaryNumbers;
    ArrayList<boolean[]> binaryResults;
    ArrayList<boolean[]> binaryCorrect;
    BinaryFun binarian;

    public Level3Tester() {
        binarian = new BinaryFun();
        binaryNumbers = new ArrayList<boolean[]>();
        binaryResults = new ArrayList<boolean[]>();
        binaryCorrect = new ArrayList<boolean[]>();
        binaryNumbers.add(binOne);
        binaryNumbers.add(binTwo);
        binaryNumbers.add(binThree);
        binaryNumbers.add(binFour);
        binaryNumbers.add(binFive);
        binaryNumbers.add(binSix);
        binaryCorrect.add(binSumOneTwo);
        binaryCorrect.add(binSumThreeFour);
        binaryCorrect.add(binSumFiveSix);
        for(int i = 0; i < binaryNumbers.size(); i+=2){
            binaryResults.add(binarian.addBinary(binaryNumbers.get(i), binaryNumbers.get(i+1)));
        }

    }


    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 1000, 1000);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Courier New", Font.BOLD, 40));

        int xStart = 420;
        int y = 50;
        int iR = 0;
        for(int i = 0; i < binaryNumbers.size(); i+= 2){
            int x = xStart;

            boolean [] nextNum = binaryNumbers.get(i);
            g.drawString("Value1", x+40, y);
            for(int i2 = 0; i2 < nextNum.length; i2++){
                if(nextNum[i2]){
                    g.drawString("1", x, y);
                }else{
                    g.drawString("0", x, y);
                }
                x -= 25;
            }
            y += 30;
            x = xStart;
            nextNum = binaryNumbers.get(i+1);
            g.drawString("Value2", x+40, y);
            g.drawLine(x+25, y, 0, y);
            for(int i2 = 0; i2 < nextNum.length; i2++){
                if(nextNum[i2]){
                    g.drawString("1", x, y);
                }else{
                    g.drawString("0", x, y);
                }
                x -= 25;
            }
            g.drawString("+", x, y);
            y += 30;
            x = xStart;
            nextNum = binaryResults.get(iR);
            g.drawString("Your Sum", x+40, y);
            for(int i2 = 0; i2 < nextNum.length; i2++){
                if(nextNum[i2]){
                    g.drawString("1", x, y);
                }else{
                    g.drawString("0", x, y);
                }
                x -= 25;
            }
            y += 45;
            x = xStart;
            nextNum = binaryCorrect.get(iR);
            g.drawString("Correct Sum", x+40, y);
            for(int i2 = 0; i2 < nextNum.length; i2++){
                if(nextNum[i2]){
                    g.drawString("1", x, y);
                }else{
                    g.drawString("0", x, y);
                }
                x -= 25;
            }
            y += 60;
            iR++;
        }


    }

    public static void main(String [] arg){
        Level3Tester game = new Level3Tester();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(800, 800);
        frame.setLocation(0, 0);
        frame.getContentPane().add(game);
        frame.setLocation(0, 0);
        frame.setVisible(true);
    }
}