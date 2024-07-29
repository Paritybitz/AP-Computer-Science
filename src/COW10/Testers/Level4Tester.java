package COW10.Testers;

import COW10.BinaryFun;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Level4Tester extends JPanel{

    char [] hexOne = {'2'};
    char [] hexTwo = {'B'};
    char [] hexSumOneTwo = {'D', '0'};
    char [] hexThree = {'7','7','E'};
    char [] hexFour =  {'4','8','F'};
    char [] hexSumThreeFour = {'B', 'F', 'D', '1'};
    char [] hexFive = {'C', '9', '7', '5', '3', '1'};
    char [] hexSix =  {'D', 'A', '8', '6', '4', '2'};
    char [] hexSumFiveSix = {'9', '4', '0', 'C', '7', '3', '0'};

    ArrayList<char[]> hexNumbers;
    ArrayList<char[]> hexResults;
    ArrayList<char[]> hexCorrect;
    BinaryFun binarian;

    public Level4Tester() {
        binarian = new BinaryFun();
        hexNumbers = new ArrayList<char[]>();
        hexResults = new ArrayList<char[]>();
        hexCorrect = new ArrayList<char[]>();
        hexNumbers.add(hexOne);
        hexNumbers.add(hexTwo);
        hexNumbers.add(hexThree);
        hexNumbers.add(hexFour);
        hexNumbers.add(hexFive);
        hexNumbers.add(hexSix);
        hexCorrect.add(hexSumOneTwo);
        hexCorrect.add(hexSumThreeFour);
        hexCorrect.add(hexSumFiveSix);
        for(int i = 0; i < hexNumbers.size(); i+=2){
            hexResults.add(binarian.addHexadecimal(hexNumbers.get(i), hexNumbers.get(i+1)));
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
        for(int i = 0; i < hexNumbers.size(); i+= 2){
            int x = xStart;
            /*
            if(userResults[i] == correctAnswers[i]){
                g.drawString("= " + userResults[i] + " == " + correctAnswers[i], x + 30, y);
            }else{
                g.drawString("= " + userResults[i] + " != " + correctAnswers[i], x + 30, y);
            }
            */
            char [] nextNum = hexNumbers.get(i);
            g.drawString("Value1", x+40, y);
            for(int i2 = 0; i2 < nextNum.length; i2++){
                g.drawString(""+nextNum[i2], x, y);
                x -= 30;
            }
            y += 30;
            x = xStart;
            nextNum = hexNumbers.get(i+1);
            g.drawString("Value2", x+40, y);
            g.drawLine(x+25, y, 0, y);
            for(int i2 = 0; i2 < nextNum.length; i2++){
                g.drawString(""+nextNum[i2], x, y);
                x -= 30;
            }
            g.drawString("+", x, y);
            y += 30;
            x = xStart;
            nextNum = hexResults.get(iR);
            g.drawString("Your Sum", x+40, y);
            for(int i2 = 0; i2 < nextNum.length; i2++){
                g.drawString(""+nextNum[i2], x, y);
                x -= 30;
            }
            y += 45;
            x = xStart;
            nextNum = hexCorrect.get(iR);
            g.drawString("Correct Sum", x+40, y);
            for(int i2 = 0; i2 < nextNum.length; i2++){
                g.drawString(""+nextNum[i2], x, y);
                x -= 30;
            }
            y += 60;
            iR++;
        }


    }

    public static void main(String [] arg){
        Level4Tester game = new Level4Tester();
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