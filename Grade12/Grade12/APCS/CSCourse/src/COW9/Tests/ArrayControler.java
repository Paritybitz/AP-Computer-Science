package COW9.Tests;

import COW9.ArrayContainer;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ArrayControler extends JPanel implements ActionListener
{
    private static final String [] commands = {"Reset", "Swap", "Index Of Biggest", "Index Of Smallest", "Append Array",
            "Reverse", "Biggest Value", "Smallest Value", "Range", "Append At Front",
            "Shift Left", "Index of Biggest(Range)", "Index of Smallest(Range)", "Get Sub Array", "",
            "Shift Right", "Biggest(Range)", "Smallest(Range)", "Range(Range)", "Remove Back",
            "Remove Front", "Move", "Swap Largest To Front", "Swap Largest To Back", "Remove Range",
            "Move Largest To Front", "Move Largest To Back", "Remove Sub Array", "Append Array At Index", ""};

    private ArrayContainer theArrayContainer;
    private int[] otherArray;
    private int index, value;
    private boolean otherArrayUsed, indexUsed, valueUsed;

    private TextField  amountTextField;
    private TextField  firstIndexTextField;
    private TextField  secondIndexTextField;

    private int width = 150;
    private int height = 25;
    private int spacing = 5;

    public ArrayControler(){
        setLayout(null);

        //create Buttons
        int x = spacing;
        int y = 200;
        int count = 0;
        otherArrayUsed = false;
        indexUsed = false;
        valueUsed = false;
        for(String nextCommand : commands){
            Button nextButton = new Button(nextCommand);
            nextButton.setBounds(x, y, width, height);
            nextButton.setActionCommand(nextCommand);
            add(nextButton);
            nextButton.addActionListener(this);
            x += width + spacing;
            count++;
            if(count % 5 == 0){
                x = spacing;
                y += height + spacing;
                count = 0;
            }
        }

        int yTestBoxes = y + 20;
        amountTextField = new TextField(20);
        amountTextField.addActionListener(this);
        amountTextField.setBounds(100, yTestBoxes, width/2, height);
        add(amountTextField);

        firstIndexTextField = new TextField(20);
        firstIndexTextField.addActionListener(this);
        firstIndexTextField.setBounds(250, yTestBoxes, width/2, height);
        add(firstIndexTextField);

        secondIndexTextField = new TextField(20);
        secondIndexTextField.addActionListener(this);
        secondIndexTextField.setBounds(400, yTestBoxes, width/2, height);
        add(secondIndexTextField);

        theArrayContainer = new ArrayContainer();
    }

    public void actionPerformed (ActionEvent event)
    {
        otherArrayUsed = false;
        indexUsed = false;
        valueUsed = false;
        String command = event.getActionCommand();

        // "Reset", "Swap", "Find Index Of Biggest", "Find Index Of Smallest", "Append Array",
        if("Reset".equals(command)){
            theArrayContainer.createArray();
        }else if("Swap".equals(command)){
            String text1 = firstIndexTextField.getText();
            String text2 = secondIndexTextField.getText();
            try{
                Integer bigInt1 = new Integer(text1);
                Integer bigInt2 = new Integer(text2);
                int index1 = bigInt1.intValue();
                int index2 = bigInt2.intValue();
                theArrayContainer.swap(index1, index2);
            }catch(NumberFormatException bad){
                System.out.println("Invalid Input");
            }
        }else if("Index Of Smallest".equals(command)){
            indexUsed = true;
            index = theArrayContainer.findIndexOfSmallest();
            //System.out.println(index);
            theArrayContainer.setIndex(index);
        }else if("Index Of Biggest".equals(command)){
            indexUsed = true;
            index = theArrayContainer.findIndexOfBiggest();
            //System.out.println(index);
            theArrayContainer.setIndex(index);
        }else if("Append Array".equals(command)){
            otherArray = createArray(4, 10);
            otherArrayUsed = true;
            theArrayContainer.appendArray(otherArray);

        }

        // "Reverse", "Find Biggest Value", "Find Smallest Value", "Find Range", "Append Array At Front",
        else if("Reverse".equals(command)){
            theArrayContainer.reverse();
        }else if("Smallest Value".equals(command)){
            valueUsed = true;
            value = theArrayContainer.findSmallestValue();
        }else if("Biggest Value".equals(command)){
            valueUsed = true;
            value = theArrayContainer.findBiggestValue();
        }else if("Range".equals(command)){
            valueUsed = true;
            value = theArrayContainer.findRangeOfValues();
        }else if("Append At Front".equals(command)){
            //System.out.println("Appending at front");
            otherArray = createArray(4, 10);
            otherArrayUsed = true;
            theArrayContainer.appendArrayAtFront(otherArray);

        }

        // "Shift Left", "Find Index of Biggest In Range", "Find Index of Smallest In Range", "Get Sub Array", "",
        else if("Shift Left".equals(command)){
            theArrayContainer.shiftLeft();
        }else if("Index of Biggest(Range)".equals(command)){
            String text1 = firstIndexTextField.getText();
            String text2 = secondIndexTextField.getText();
            try{
                Integer bigInt1 = new Integer(text1);
                Integer bigInt2 = new Integer(text2);
                int index1 = bigInt1.intValue();
                int index2 = bigInt2.intValue();
                indexUsed = true;
                index = theArrayContainer.findIndexOfBiggestInRangeOfIndexes(index1, index2);
                theArrayContainer.setIndex(index);
            }catch(NumberFormatException bad){
                System.out.println("Invalid Input");
            }
        }else if("Index of Smallest(Range)".equals(command)){
            String text1 = firstIndexTextField.getText();
            String text2 = secondIndexTextField.getText();
            try{
                Integer bigInt1 = new Integer(text1);
                Integer bigInt2 = new Integer(text2);
                int index1 = bigInt1.intValue();
                int index2 = bigInt2.intValue();
                indexUsed = true;
                index = theArrayContainer.findIndexOfSmallestInRangeOfIndexes(index1, index2);
                theArrayContainer.setIndex(index);
            }catch(NumberFormatException bad){
                System.out.println("Invalid Input");
            }
        }else if("Get Sub Array".equals(command)){
            String text1 = firstIndexTextField.getText();
            String text2 = secondIndexTextField.getText();
            try{
                Integer bigInt1 = new Integer(text1);
                Integer bigInt2 = new Integer(text2);
                int index1 = bigInt1.intValue();
                int index2 = bigInt2.intValue();
                otherArrayUsed = true;
                otherArray = theArrayContainer.getSubArray(index1, index2);
            }catch(NumberFormatException bad){
                System.out.println("Invalid Input");
            }
        }

        // "Shift Right", "Find Biggest In Range", "Find Smallest In Range", "Find Range in Range", "Remove Elements",
        else if("Shift Right".equals(command)){
            theArrayContainer.shiftRight();

        }else if("Biggest(Range)".equals(command)){
            String text1 = firstIndexTextField.getText();
            String text2 = secondIndexTextField.getText();
            try{
                Integer bigInt1 = new Integer(text1);
                Integer bigInt2 = new Integer(text2);
                int index1 = bigInt1.intValue();
                int index2 = bigInt2.intValue();
                valueUsed = true;
                value = theArrayContainer.findBiggestValueInRangeOfIndexes(index1, index2);
            }catch(NumberFormatException bad){
                System.out.println("Invalid Input");
            }
        }else if("Smallest(Range)".equals(command)){
            String text1 = firstIndexTextField.getText();
            String text2 = secondIndexTextField.getText();
            try{
                Integer bigInt1 = new Integer(text1);
                Integer bigInt2 = new Integer(text2);
                int index1 = bigInt1.intValue();
                int index2 = bigInt2.intValue();
                valueUsed = true;
                value = theArrayContainer.findSmallestValueInRangeOfIndexes(index1, index2);
            }catch(NumberFormatException bad){
                System.out.println("Invalid Input");
            }
        }else if("Range(Range)".equals(command)){
            String text1 = firstIndexTextField.getText();
            String text2 = secondIndexTextField.getText();
            try{
                Integer bigInt1 = new Integer(text1);
                Integer bigInt2 = new Integer(text2);
                int index1 = bigInt1.intValue();
                int index2 = bigInt2.intValue();
                valueUsed = true;
                value = theArrayContainer.findRangeOfValuesInRangeOfIndexes(index1, index2);
            }catch(NumberFormatException bad){
                System.out.println("Invalid Input");
            }
        }else if("Remove Back".equals(command)){
            String text = amountTextField.getText();
            try{
                Integer bigInt = new Integer(text);
                int amount = bigInt.intValue();
                theArrayContainer.removeElements(amount);
            }catch(NumberFormatException bad){
                System.out.println("Invalid Input");
            }

        }

        // "Remove Elements From Front", "Move", "Swap Largest To Front", "Swap Largest To Back", "Remove Range",
        else if("Remove Front".equals(command)){
            String text = amountTextField.getText();
            try{
                Integer bigInt = new Integer(text);
                int amount = bigInt.intValue();
                theArrayContainer.removeElementsFromFront(amount);
            }catch(NumberFormatException bad){
                System.out.println("Invalid Input");
            }

        }else if("Move".equals(command)){
            String text1 = firstIndexTextField.getText();
            String text2 = secondIndexTextField.getText();
            try{
                Integer bigInt1 = new Integer(text1);
                Integer bigInt2 = new Integer(text2);
                int index1 = bigInt1.intValue();
                int index2 = bigInt2.intValue();
                theArrayContainer.move(index1, index2);
            }catch(NumberFormatException bad){
                System.out.println("Invalid Input");
            }

        }else if("Swap Largest To Front".equals(command)){
            theArrayContainer.swapLargestToFront();
        }else if("Swap Largest To Back".equals(command)){
            theArrayContainer.swapLargestToBack();
        }else if("Remove Range".equals(command)){
            String text1 = firstIndexTextField.getText();
            String text2 = secondIndexTextField.getText();
            try{
                Integer bigInt1 = new Integer(text1);
                Integer bigInt2 = new Integer(text2);
                int index1 = bigInt1.intValue();
                int index2 = bigInt2.intValue();
                theArrayContainer.removeElements(index1, index2);
            }catch(NumberFormatException bad){
                System.out.println("Invalid Input");
            }
        }

        // "Move Largest To Front", "Move Largest To Back", "Remove Sub Array", "Append Array At Index", ""};
        else if("Move Largest To Front".equals(command)){
            theArrayContainer.moveLargestToFront();
        }else if("Move Largest To Back".equals(command)){
            theArrayContainer.moveLargestToBack();
        }else if("Remove Sub Array".equals(command)){
            String text1 = firstIndexTextField.getText();
            String text2 = secondIndexTextField.getText();
            try{
                Integer bigInt1 = new Integer(text1);
                Integer bigInt2 = new Integer(text2);
                int index1 = bigInt1.intValue();
                int index2 = bigInt2.intValue();
                otherArrayUsed = true;
                otherArray = theArrayContainer.removeSubArray(index1, index2);
            }catch(NumberFormatException bad){
                System.out.println("Invalid Input");
            }
        }else if("Append Array At Index".equals(command)){
            String text1 = firstIndexTextField.getText();
            String text2 = secondIndexTextField.getText();
            try{
                Integer bigInt1 = new Integer(text1);
                int index1 = bigInt1.intValue();
                otherArray = createArray(4, 10);
                otherArrayUsed = true;
                theArrayContainer.appendArrayAtIndex(otherArray, index1);
            }catch(NumberFormatException bad){
                System.out.println("Invalid Input");
            }

        }
        repaint();
    }

    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 2000, 2000);
        g.setColor(Color.YELLOW);
        g.fillRect(0, 200 - spacing, 2000, (height + spacing) * 6 + spacing);
        g.setColor(Color.WHITE);
        g.drawString("Value", 100, 449);
        g.drawString("Index #1", 250, 449);
        g.drawString("Index #2", 400, 449);
        theArrayContainer.paintArray(g);
        if(otherArrayUsed){
            paintArray(g);
        }
        if(valueUsed){
            paintValue(g);
        }

    }

    public void paintArray(Graphics g){
        int size;

        for(int index = 0; index < otherArray.length; index ++){
            size = otherArray[index];

            g.setColor(Color.RED);
            g.fillRect(10 + index * 23, 580 - size, 13 , size);

            String valueInString = ("" + size);
            g.setColor(Color.WHITE);
            g.drawString(valueInString, 10 + index * 23, 575 - size);

            valueInString = ("" + index);
            g.setColor(Color.GREEN);
            g.drawString(valueInString, 10 + index * 23, 592);
        }
    }

    public void paintValue(Graphics g){
        int size = value;
        g.setColor(Color.RED);
        g.fillRect(10 + 1 * 23, 580 - size, 13 , size);
        String valueInString = ("" + size);
        g.setColor(Color.WHITE);
        g.drawString(valueInString, 10 + 1 * 23, 575 - size);
    }

    public static int[] createArray(int minSize, int maxSize){
        //create an array of integers of random size (range 1 to 30)
        int size = minSize + (int)(Math.random() * (maxSize - minSize + 1));
        int[] theArray = new int[size];

        //assign a random value to each integer in the array (range 0 to 99)
        for(int i = 0; i < theArray.length; i++){
            theArray[i] = (int)(Math.random() * 100);
        }

        return theArray;
    }

    public static void main(String [] arg){
        JFrame frame = new JFrame("Array Sorting");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(1200, 700);
        frame.setLocation(0,0);
        ArrayControler theControler = new ArrayControler();
        frame.getContentPane().add(theControler);
        frame.setVisible(true);
    }
}