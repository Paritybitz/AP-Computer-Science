package COW5.Tests;

import COW5.ArrayModifier;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class ArrayModifierTester extends JPanel implements KeyListener {

    private Data original, flipped, amplified, capped, evenedOut, second, averaged, compressed;
    private int numDots = 38;
    private int min = -200, max = 200;
    private double [] originalData, secondData;
    private char choice;

    public ArrayModifierTester() {
        reset();
        choice = ' ';
    }

    public void reset(){
        originalData = new double[numDots];
        double number = min + (Math.random() * (max - min + 1));
        double diff = 0;
        for(int i = 0; i < originalData.length; i++){
            originalData[i] = number;
            diff = (min + (Math.random() * (max - min + 1)))/3;
            if(number + diff < max && number + diff > min){
                number += diff;
            }else{
                number -= diff;
            }
        }
        original = new Data(originalData, Color.BLUE);

    }

    /** Handle the key released event from the text field. */
    public void keyReleased(KeyEvent e) {
        choice = e.getKeyChar();
        if(choice == ' '){
            reset();
        }else if(choice == 'f'){
            flipped = new Data(ArrayModifier.flip(originalData), Color.RED);
        }else if(choice == 'a'){
            amplified = new Data(ArrayModifier.amplify(originalData, 2), Color.GREEN);
        }else if(choice == 'c'){
            capped = new Data(ArrayModifier.cap(originalData, -100, 100), Color.ORANGE);
        }else if(choice == 'e'){
            evenedOut = new Data(ArrayModifier.evenOut(originalData), Color.WHITE);
        }else if(choice == 'm'){
            secondData = new double[numDots];
            double number = min + (Math.random() * (max - min + 1));
            double diff = 0;
            for(int i = 0; i < originalData.length; i++){
                secondData[i] = number;
                diff = (min + (Math.random() * (max - min + 1)))/3;
                if(number + diff < max && number + diff > min){
                    number += diff;
                }else{
                    number -= diff;
                }
            }
            second = new Data(secondData, Color.BLUE);
            averaged = new Data(ArrayModifier.averageElements(originalData, secondData), Color.MAGENTA);
        }else if(choice == 'p'){
            compressed = new Data(ArrayModifier.compress(originalData), Color.WHITE);
        }

        repaint();
    }

    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 1000, 1000);
        g.setColor(Color.WHITE);
        g.drawString("SPACE - reset, f - flip, a - amplify, c - cap, m - average arrays, e - even out, p - compress", 0, 20);
        original.paint(g);
        if(flipped != null && choice == 'f'){
            flipped.paint(g);
        }
        if(amplified != null && choice == 'a'){
            amplified.paint(g);
        }
        if(capped != null && choice == 'c'){
            capped.paint(g);
        }
        if(evenedOut != null && choice == 'e'){
            evenedOut.paint(g);
        }
        if(averaged != null && choice == 'm'){
            second.paint(g);
            averaged.paint(g);
        }
        if(compressed != null && choice == 'p'){
            compressed.paint(g);
        }
        g.setColor(Color.WHITE);
        g.drawLine(0, 400, 900, 400);
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {

    }

    public static void main(String [] arg){
        ArrayModifierTester game = new ArrayModifierTester();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(800, 800);
        frame.addKeyListener(game);
        frame.getContentPane().add(game);
        frame.setLocation(0, 0);
        frame.setVisible(true);
    }

    public static boolean testFlip(){
        System.out.println("====================================");
        boolean verified = true;
        ArrayModifier student = new ArrayModifier();

        double [] input = {4, 1, -3, -11, -13, -10, -7, 0, 5, 15, 1};
        double[] correctOutput = {-4, -1, 3, 11, 13, 10, 7, 0, -5, -15, -1};
        double[] output = student.flip(input);
        for(int i = 0; i < output.length; i++){
            if(Math.abs(correctOutput[i] - output[i]) > .000001){
                verified = false;
                System.out.println("flip of the element at index " + i + " is indicated as " + output[i] + " but should be " + correctOutput[i]);
            }
        }

        if(verified){
            System.out.println("flip works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("flip does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testAmplify(){
        System.out.println("====================================");
        boolean verified = true;
        ArrayModifier student = new ArrayModifier();

        double [] input = {4, 1, -3, -11, -13, -10, -7, 0, 5, 15, 1};
        double[] correctOutput = {12, 3, -9, -33, -39, -30, -21, 0, 15, 45, 3};
        double[] output = student.amplify(input, 3);
        for(int i = 0; i < output.length; i++){
            if(Math.abs(correctOutput[i] - output[i]) > .000001){
                verified = false;
                System.out.println("amplify of the element at index " + i + " is indicated as " + output[i] + " but should be " + correctOutput[i]);
            }
        }

        if(verified){
            System.out.println("amplify works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("amplify does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testCap(){
        System.out.println("====================================");
        boolean verified = true;
        ArrayModifier student = new ArrayModifier();

        double [] input = {4, 1, -3, -11, -13, -10, -7, 0, 5, 15, 1};
        double[] correctOutput = {4, 1, -3, -7, -7, -7, -7, 0, 5, 5, 1};
        double[] output = student.cap(input, -7, 5);
        for(int i = 0; i < output.length; i++){
            if(Math.abs(correctOutput[i] - output[i]) > .000001){
                verified = false;
                System.out.println("cap of the element at index " + i + " is indicated as " + output[i] + " but should be " + correctOutput[i]);
            }
        }

        if(verified){
            System.out.println("cap works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("cap does NOT work");
            System.out.println("====================================");
            return false;
        }
    }
    public static boolean testAverageElements(){
        System.out.println("====================================");
        boolean verified = true;
        ArrayModifier student = new ArrayModifier();

        double [] input1 = {4, 1, -3, -11, -13, -10, -7, 0, 5, 15, 1};
        double [] input2 = {-2, 3, 6, 10, 17, 6, -1, -4, 2, 8, 10};
        double[] correctOutput = {1, 2, 1.5, -.5, 2, -2, -4, -2, 3.5, 11.5, 5.5};
        double[] output = student.averageElements(input1, input2);
        for(int i = 0; i < output.length; i++){
            if(Math.abs(correctOutput[i] - output[i]) > .000001){
                verified = false;
                System.out.println("averageElements of the element at index " + i + " is indicated as " + output[i] + " but should be " + correctOutput[i]);
            }
        }

        if(verified){
            System.out.println("averageElements works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("averageElements does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testEvenOut(){
        System.out.println("====================================");
        boolean verified = true;
        ArrayModifier student = new ArrayModifier();

        double [] input1 = {4, 1, -3, -11, -13, -10, -7, 0, 5, 15, 1};
        double[] correctOutput = {2.5, 2.0/3.0, -13.0/3.0, -27.0/3.0, -34/3.0, -30.0/3.0, -17.0/3.0, -2.0/3.0, 20.0/3.0, 7, 8};
        double[] output = student.evenOut(input1);
        for(int i = 0; i < output.length; i++){
            if(Math.abs(correctOutput[i] - output[i]) > .000001){
                verified = false;
                System.out.println("evenOut of the element at index " + i + " is indicated as " + output[i] + " but should be " + correctOutput[i]);
            }
        }

        if(verified){
            System.out.println("evenOut works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("evenOut does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testCompress(){
        System.out.println("====================================");
        boolean verified = true;
        ArrayModifier student = new ArrayModifier();

        //odd
        double [] input1 = {4, 1, -3, -11, -13, -10, -7, 0, 5, 15, 1};
        double[] correctOutput = {2.5, -7, -11.5, -3.5, 7.0};
        double[] output = student.compress(input1);
        for(int i = 0; i < output.length; i++){
            if(Math.abs(correctOutput[i] - output[i]) > .000001){
                verified = false;
                System.out.println("odd size - compress of the element at index " + i + " is indicated as " + output[i] + " but should be " + correctOutput[i]);
            }
        }
        //even
        double [] input2 = {4, 1, -3, -11, -13, -10, -7, 0, 5, 15};
        double[] correctOutput2 = {2.5, -7, -11.5, -3.5, 10.0};
        double[] output2 = student.compress(input2);
        for(int i = 0; i < output2.length; i++){
            if(Math.abs(correctOutput2[i] - output2[i]) > .000001){
                verified = false;
                System.out.println("even size - compress of the element at index " + i + " is indicated as " + output2[i] + " but should be " + correctOutput2[i]);
            }
        }

        if(verified){
            System.out.println("compress works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("compress does NOT work");
            System.out.println("====================================");
            return false;
        }
    }
}