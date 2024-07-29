/*
package COW10.Testers;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class Level6BTester extends JPanel{

    char [] charOne = {'C'};
    char [] charTwo = {'F', '8'};
    char [] charThree = {'8', '2', 'E', '3'};
    char [] charFour =  {'2', '8', '6', '2', '1'};
    char [] charFive = {'1', 'F', 'D', 'F', 'E'};
    char [] charSix =  {'B', '2', 'A', '7', '4', '2'};
    int [] decValues = {12, 143, 15912, 75394, 982513, 2390571};
    ArrayList<char[]> userNumbers;
    ArrayList<char[]> correctNumbers;
    BinaryFun binarian;

    public Level6BTester() {
        binarian = new BinaryFun();
        correctNumbers = new ArrayList<char[]>();
        correctNumbers.add(charOne);
        correctNumbers.add(charTwo);
        correctNumbers.add(charThree);
        correctNumbers.add(charFour);
        correctNumbers.add(charFive);
        correctNumbers.add(charSix);
        userNumbers = new ArrayList<char[]>();
        for(int i = 0; i < decValues.length; i++){
            userNumbers.add(binarian.convertDecimalToHexadecimal(decValues[i]));
        }

    }


    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 1000, 1000);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Courier New", Font.BOLD, 40));

        int xStart = 350;
        int y = 50;
        int iR = 0;
        for(int i = 0; i < userNumbers.size(); i+= 1){
            int x = xStart;
            char [] nextNum = userNumbers.get(i);
            g.drawString(" <= "+decValues[i], x+40, y);
            for(int i2 = 0; i2 < nextNum.length; i2++){
                g.drawString(""+nextNum[i2], x, y);
                x -= 30;
            }
            y += 30;
            x = xStart;
            nextNum = correctNumbers.get(i);
            g.drawString(" Correct Answer", x+40, y);
            for(int i2 = 0; i2 < nextNum.length; i2++){
                g.drawString(""+nextNum[i2], x, y);
                x -= 30;
            }

            y += 60;
            iR++;
        }


    }

    public static void main(String [] arg){
        Level6BTester game = new Level6BTester();
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
