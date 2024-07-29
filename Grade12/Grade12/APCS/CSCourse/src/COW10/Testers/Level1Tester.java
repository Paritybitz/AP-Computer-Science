package COW10.Testers;

import COW10.BinaryFun;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Level1Tester extends JPanel{

    boolean [] binOne = {true, false, true};
    boolean [] binTwo = {false, true, true};
    boolean [] binThree = {false, true,  true,  true,  false,  false, true, false, true};
    boolean [] binFour =  {false, false, true,  true,  false,  true,  true, false, true};
    boolean [] binFive = {true, false, true, false, true, false, true, false, true, false, true, false, true,  false, true};
    boolean [] binSix =  {true, true,  true, true,  true, false, true, true, true, false,  true, false, false, true,  true};
    int [] correctAnswers = {5, 6, 334, 364, 21845, 26079};
    int [] userResults;
    ArrayList<boolean[]> binaryNumbers;
    BinaryFun binarian;

    public Level1Tester() {
        binarian = new BinaryFun();
        binaryNumbers = new ArrayList<boolean[]>();
        binaryNumbers.add(binOne);
        binaryNumbers.add(binTwo);
        binaryNumbers.add(binThree);
        binaryNumbers.add(binFour);
        binaryNumbers.add(binFive);
        binaryNumbers.add(binSix);
        userResults = new int[6];
        for(int i = 0; i < userResults.length; i++){
            userResults[i] = binarian.convertBinaryToDecimal(binaryNumbers.get(i));
        }

    }


    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 1000, 1000);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Courier New", Font.BOLD, 40));
        g.drawString("Input = Output = Correct Value", 0, 50);
        int xStart = 365;
        int y = 100;
        for(int i = 0; i < userResults.length; i++){
            int x = xStart;
            if(userResults[i] == correctAnswers[i]){
                g.drawString("= " + userResults[i] + " == " + correctAnswers[i], x + 30, y);
            }else{
                g.drawString("= " + userResults[i] + " != " + correctAnswers[i], x + 30, y);
            }
            boolean [] nextNum = binaryNumbers.get(i);
            for(int i2 = 0; i2 < nextNum.length; i2++){
                if(nextNum[i2]){
                    g.drawString("1", x, y);
                }else{
                    g.drawString("0", x, y);
                }
                x -= 25;
            }

            y += 30;
        }


    }

    public static void main(String [] arg){
        Level1Tester game = new Level1Tester();
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