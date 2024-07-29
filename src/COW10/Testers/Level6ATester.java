/*
package COW10.Testers;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class Level6ATester extends JPanel{

    boolean [] binOne = {true};
    boolean [] binTwo = {true, false, false, true};
    boolean [] binThree = {false, true, true, false, true, true, false, true, true};
    boolean [] binFour =  {true, false, false, false, false, true, false, true, false, true};
    boolean [] binFive = {false, false, false, true, false, false, false, false, true, true, true, false, false, false, true};
    boolean [] binSix =  {false, false, true, true, true, true, true, true, true, true, true, false, false, false, false, true};
    int [] decValues = {1, 9, 438, 673, 18184, 34812};
    ArrayList<boolean[]> userNumbers;
    ArrayList<boolean[]> correctNumbers;
    BinaryFun binarian;

    public Level6ATester() {
        binarian = new BinaryFun();
        correctNumbers = new ArrayList<boolean[]>();
        correctNumbers.add(binOne);
        correctNumbers.add(binTwo);
        correctNumbers.add(binThree);
        correctNumbers.add(binFour);
        correctNumbers.add(binFive);
        correctNumbers.add(binSix);
        userNumbers = new ArrayList<boolean[]>();
        for(int i = 0; i < decValues.length; i++){
            userNumbers.add(binarian.convertDecimalToBinary(decValues[i]));
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
        for(int i = 0; i < userNumbers.size(); i+= 1){
            int x = xStart;

            boolean [] nextNum = userNumbers.get(i);
            g.drawString(" <= "+decValues[i], x+40, y);
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
            nextNum = correctNumbers.get(i);
            g.drawString(" Correct Answer", x+40, y);
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
        Level6ATester game = new Level6ATester();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(850, 800);
        frame.setLocation(0, 0);
        frame.getContentPane().add(game);
        frame.setLocation(0, 0);
        frame.setVisible(true);
    }
}*/
