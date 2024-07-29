package COW10.Testers;

import COW10.BinaryFun;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Level5Tester extends JPanel{

    boolean [] binOne = {true, true, true, true};
    boolean [] binTwo = {true, false, false, true, true};
    boolean [] binThree = {true, true, false, true, false, true, true, true};
    boolean [] binFour =  {true, true, false, false, true, false, true, false, true, true};
    boolean [] binFive = {true, false, true, true, false, false, false, true, true, false, false, true, false, false, false, true};
    boolean [] binSix =  {false, false, true, false, false, false, false, false, true, true, false, false, true, true, false, false, true, true, true};
    char [] charOne = {'F'};
    char [] charTwo = {'9', '1'};
    char [] charThree = {'B', 'E'};
    char [] charFour =  {'3', '5', '3'};
    char [] charFive = {'D', '8', '9', '8'};
    char [] charSix =  {'4', '0', '3', '3', '7'};
    ArrayList<boolean[]> booleanNumbers;
    ArrayList<char[]> userHexNumbers;
    ArrayList<char[]> correctNumbers;
    BinaryFun binarian;

    public Level5Tester() {
        binarian = new BinaryFun();
        booleanNumbers = new ArrayList<boolean[]>();
        userHexNumbers = new ArrayList<char[]>();
        correctNumbers = new ArrayList<char[]>();

        booleanNumbers.add(binOne);
        booleanNumbers.add(binTwo);
        booleanNumbers.add(binThree);
        booleanNumbers.add(binFour);
        booleanNumbers.add(binFive);
        booleanNumbers.add(binSix);

        correctNumbers.add(charOne);
        correctNumbers.add(charTwo);
        correctNumbers.add(charThree);
        correctNumbers.add(charFour);
        correctNumbers.add(charFive);
        correctNumbers.add(charSix);

        for(int i = 0; i < booleanNumbers.size(); i++){
            userHexNumbers.add(binarian.convertBinaryToHex(booleanNumbers.get(i)));
        }

    }


    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 1000, 1000);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Courier New", Font.BOLD, 40));

        int xStart = 470;
        int y = 50;
        int iR = 0;
        for(int i = 0; i < correctNumbers.size(); i+= 1){
            int x = xStart;

            boolean [] nextNum = booleanNumbers.get(i);
            g.drawString(" Boolean Num", x+40, y);
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
            char[] nextNum2 = userHexNumbers.get(i);
            g.drawString(" Hex Output", x+40, y);
            for(int i2 = 0; i2 < nextNum2.length; i2++){
                g.drawString(""+nextNum2[i2], x, y);
                x -= 30;
            }
            y += 30;
            x = xStart;
            nextNum2 = correctNumbers.get(i);
            g.drawString(" Correct Hex", x+40, y);
            for(int i2 = 0; i2 < nextNum2.length; i2++){
                g.drawString(""+nextNum2[i2], x, y);
                x -= 30;
            }
            y += 60;
            iR++;
        }


    }

    public static void main(String [] arg){
        Level5Tester game = new Level5Tester();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(850, 800);
        frame.setLocation(0, 0);
        frame.getContentPane().add(game);
        frame.setLocation(0, 0);
        frame.setVisible(true);
    }
}