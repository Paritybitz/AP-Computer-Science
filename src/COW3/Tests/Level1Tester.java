package COW3.Tests;

import COW3.*;
import COW3.Point;

import java.awt.*;

public class Level1Tester
{
    public static void main(String [] arg){
        testLevel1();
    }

    public static boolean testLevel1(){
        boolean one = testMyDateLevel1();
        boolean two = testNameLevel1();
        boolean three = testPointLevel1();
        boolean four = testBoxLevel1();
        boolean five = testDigitLevel1();
        if(one && two && three && four && five){
            System.out.println("Level 1 works");
            return true;
        }else{
            System.out.println("Level 1 DOES NOT work");
            return false;
        }
    }

    public static boolean testMyDateLevel1(){
        int[] days =     {16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13 , 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, };
        int[] months =   {5, 5, 5, 5, 1, 1, 1, 1 , 10, 10, 10, 10, 5, 5, 5, 5, 1, 1, 1, 1 , 10, 10, 10, 10, 5, 5, 5, 5, 1, 1, 1, 1 , 10, 10, 10, 10, };
        int[] years =    {1978, 1978, 1976, 2001, 1978, 1978, 1976, 2001, 1978, 1978, 1976, 2001, 1978, 1978, 1976, 2001, 1978, 1978, 1976, 2001, 1978, 1978, 1976, 2001, 1978, 1978, 1976, 2001, 1978, 1978, 1976, 2001, 1978, 1978, 1976, 2001, };

        MyDate[] dates = new MyDate[36];
        boolean output = true;

        for(int i = 0; i < days.length; i++){
            dates[i] = new MyDate(days[i], months[i], years[i]);
        }

        for(int i = 0; i < days.length; i++){
            if(dates[i].getDay() != days[i]){
                System.out.println("day either not set up correctly in constructor or accessor method is incorrect");
                output = false;
            }
            if(dates[i].getMonth() != months[i]){
                System.out.println("month either not set up correctly in constructor or accessor method is incorrect");
                output = false;
            }
            if(dates[i].getYear() != years[i]){
                System.out.println("year either not set up correctly in constructor or accessor method is incorrect");
                output = false;
            }
        }

        if(output){
            System.out.println("COW7.MyDate Level 1 works");
        }else{

            System.out.println("COW7.MyDate Level 1 does NOT work");
        }
        return output;
    }

    public static boolean testNameLevel1(){
        String[] middleNames =  {"Borys", "Borys", "Borys", "Borys", "Borys", "Borys", "Borys", "Borys", "Borys", "Borys", "Borys", "Borys", "Adam", "Adam", "Adam", "Adam", "Adam", "Adam", "Adam", "Adam", "Adam", "Adam", "Adam", "Adam", "Dilbert", "Dilbert", "Dilbert", "Dilbert", "Dilbert", "Dilbert", "Dilbert", "Dilbert", "Dilbert", "Dilbert", "Dilbert", "Dilbert", };
        String[] firstNames =   {"Chris", "Chris", "Chris", "Chris", "Cathy", "Cathy", "Cathy", "Cathy", "Yaroslav", "Yaroslav", "Yaroslav", "Yaroslav", "Chris", "Chris", "Chris", "Chris", "Cathy", "Cathy", "Cathy", "Cathy", "Yaroslav", "Yaroslav", "Yaroslav", "Yaroslav", "Chris", "Chris", "Chris", "Chris", "Cathy", "Cathy", "Cathy", "Cathy", "Yaroslav", "Yaroslav", "Yaroslav", "Yaroslav", };
        String[] lastNames = {"Mayewsky", "Mayewsky", "Marsh", "Washington", "Mayewsky", "Mayewsky", "Marsh", "Washington", "Mayewsky", "Mayewsky", "Marsh", "Washington", "Mayewsky", "Mayewsky", "Marsh", "Washington", "Mayewsky", "Mayewsky", "Marsh", "Washington", "Mayewsky", "Mayewsky", "Marsh", "Washington", "Mayewsky", "Mayewsky", "Marsh", "Washington", "Mayewsky", "Mayewsky", "Marsh", "Washington", "Mayewsky", "Mayewsky", "Marsh", "Washington", };

        Name[] names = new Name[36];
        boolean output = true;

        for(int i = 0; i < lastNames.length; i++){
            names[i] = new Name(firstNames[i], middleNames[i], lastNames[i]);
        }

        for(int i = 0; i < lastNames.length; i++){
            if(!names[i].getFirstName().equals(firstNames[i])){
                System.out.println("firstName either not set up correctly in constructor or accessor method is incorrect");
                output = false;
            }
            if(!names[i].getMiddleName().equals(middleNames[i])){
                System.out.println("firstName either not set up correctly in constructor or accessor method is incorrect");
                output = false;
            }
            if(!names[i].getLastName().equals(lastNames[i])){
                System.out.println("lastName either not set up correctly in constructor or accessor method is incorrect");
                output = false;
            }
        }

        if(output){
            System.out.println("COW7.Name Level 1 works");
        }else{
            System.out.println("COW7.Name Level 1 does NOT work");
        }
        return output;
    }

    public static boolean testPointLevel1(){
        int[] xValues =   {100, 100, 200, 100, 50};
        int[] yValues =   {100, 100, 100, 200, 100};
        Color[] colors =    {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE};
        int[] radii =     {10, 10, 5, 20, 13};

        Point[] points = new Point[xValues.length];
        boolean output = true;

        for(int i = 0; i < xValues.length; i++){
            points[i] = new Point(xValues[i], yValues[i], colors[i], radii[i]);
        }

        for(int i = 0; i < xValues.length; i++){
            if(points[i].getX() != xValues[i]){
                System.out.println("the x value either not set up correctly in constructor or accessor method is incorrect");
                output = false;
            }
            if(points[i].getY() != yValues[i]){
                System.out.println("the y value either not set up correctly in constructor or accessor method is incorrect");
                output = false;
            }
            if(!points[i].getColor().equals(colors[i])){
                System.out.println("the color either not set up correctly in constructor or accessor method is incorrect");
                output = false;
            }
            if(points[i].getRadius() != radii[i]){
                System.out.println("the radius either not set up correctly in constructor or accessor method is incorrect");
                output = false;
            }
        }

        if(output){
            System.out.println("COW7.Point Level 1 works");
        }else{

            System.out.println("COW7.Point Level 1 does NOT work");
        }
        return output;
    }

    public static boolean testBoxLevel1(){
        int[] xValues =   {100, 100, 200, 100, 50};
        int[] yValues =   {100, 100, 100, 200, 100};
        Color[] colors =    {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE};
        int[] widths =     {50, 50, 100, 13, 400};
        int[] heights =    {100, 100, 50, 101, 40};

        Box[] boxes = new Box[xValues.length];
        boolean output = true;

        for(int i = 0; i < xValues.length; i++){
            boxes[i] = new Box(xValues[i], yValues[i], colors[i], widths[i], heights[i]);
        }

        for(int i = 0; i < xValues.length; i++){
            if(boxes[i].getX() != xValues[i]){
                System.out.println("the x value either not set up correctly in constructor or accessor method is incorrect");
                output = false;
            }
            if(boxes[i].getY() != yValues[i]){
                System.out.println("the y value either not set up correctly in constructor or accessor method is incorrect");
                output = false;
            }
            if(!boxes[i].getColor().equals(colors[i])){
                System.out.println("the color either not set up correctly in constructor or accessor method is incorrect");
                output = false;
            }
            if(boxes[i].getWidth() != widths[i]){
                System.out.println("the width either not set up correctly in constructor or accessor method is incorrect");
                output = false;
            }
            if(boxes[i].getHeight() != heights[i]){
                System.out.println("the height either not set up correctly in constructor or accessor method is incorrect");
                output = false;
            }
        }

        if(output){
            System.out.println("Box Level 1 works");
        }else{

            System.out.println("Box Level 1 does NOT work");
        }
        return output;
    }

    public static boolean testDigitLevel1(){
        int[] values =     {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,};

        Digit[] digits = new Digit[values.length];
        boolean output = true;

        for(int i = 0; i < digits.length; i++){
            digits[i] = new Digit(values[i]);
        }

        for(int i = 0; i < digits.length; i++){
            if(digits[i].getValue() != values[i]){
                System.out.println("value either not set up correctly in constructor or accessor method is incorrect");
                output = false;
            }
        }

        if(output){
            System.out.println("Digit Level 1 works");
        }else{
            System.out.println("Digit Level 1 does NOT work");
        }
        return output;
    }

}