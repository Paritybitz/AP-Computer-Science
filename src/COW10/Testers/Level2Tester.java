package COW10.Testers;

import COW10.BinaryFun;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Level2Tester extends JPanel{

    char [] hexOne = {'2'};
    char [] hexTwo = {'B'};
    char [] hexThree = {'7','7','E'};
    char [] hexFour =  {'4','8','F'};
    char [] hexFive = {'C', '9', '7', '5', '3', '1'};
    char [] hexSix =  {'D', 'A', '8', '6', '4', '2'};
    int [] correctAnswers = {2, 11, 3703, 3972, 1267612, 2386093};
    int [] userResults;
    ArrayList<char[]> hexNumbers;
    BinaryFun binarian;

    public Level2Tester() {
        binarian = new BinaryFun();
        hexNumbers = new ArrayList<char[]>();
        hexNumbers.add(hexOne);
        hexNumbers.add(hexTwo);
        hexNumbers.add(hexThree);
        hexNumbers.add(hexFour);
        hexNumbers.add(hexFive);
        hexNumbers.add(hexSix);
        userResults = new int[6];
        for(int i = 0; i < userResults.length; i++){
            userResults[i] = binarian.convertHexadecimalToDecimal(hexNumbers.get(i));
        }

    }

    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 1000, 1000);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Courier New", Font.BOLD, 40));
        g.drawString("Input = Output = Correct Value", 0, 50);
        int xStart = 220;
        int y = 100;
        for(int i = 0; i < userResults.length; i++){
            int x = xStart;
            if(userResults[i] == correctAnswers[i]){
                g.drawString("= " + userResults[i] + " == " + correctAnswers[i], x + 30, y);
            }else{
                g.drawString("= " + userResults[i] + " != " + correctAnswers[i], x + 30, y);
            }
            char [] nextNum = hexNumbers.get(i);
            for(int i2 = 0; i2 < nextNum.length; i2++){
                g.drawString("" + nextNum[i2], x, y);
                x -= 30;
            }

            y += 30;
        }

    }
    public static void main(String [] arg){
        Level2Tester game = new Level2Tester();
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