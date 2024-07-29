
package COW3.Tests;

import COW3.Point;
import COW3.*;

import java.awt.*;

import java.awt.*;

public class Level2Tester
{
    public static void main(String [] arg){
        testLevel2();
    }

    public static boolean testLevel2(){
        boolean one = testMyDateLevel2();
        boolean two = testNameLevel2();
        boolean three = testPointLevel2();
        boolean four = testBoxLevel2();
        boolean five = testDigitLevel2();
        if(one && two && three && four && five){
            System.out.println("Level 2 works");
            return true;
        }else{
            System.out.println("Level 2 DOES NOT work");
            return false;
        }
    }

    public static boolean testMyDateLevel2(){
        int[] days =     {16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13 , 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, };
        int[] months =   {5, 5, 5, 5, 1, 1, 1, 1 , 10, 10, 10, 10, 5, 5, 5, 5, 1, 1, 1, 1 , 10, 10, 10, 10, 5, 5, 5, 5, 1, 1, 1, 1 , 10, 10, 10, 10, };
        int[] years =    {1978, 1978, 1976, 2001, 1978, 1978, 1976, 2001, 1978, 1978, 1976, 2001, 1978, 1978, 1976, 2001, 1978, 1978, 1976, 2001, 1978, 1978, 1976, 2001, 1978, 1978, 1976, 2001, 1978, 1978, 1976, 2001, 1978, 1978, 1976, 2001, };
        String[] texts = {"5\\16\\1978", "5\\16\\1978", "5\\16\\1976", "5\\16\\2001", "1\\16\\1978", "1\\16\\1978", "1\\16\\1976", "1\\16\\2001", "10\\16\\1978", "10\\16\\1978", "10\\16\\1976", "10\\16\\2001", "5\\13\\1978", "5\\13\\1978", "5\\13\\1976", "5\\13\\2001", "1\\13\\1978", "1\\13\\1978", "1\\13\\1976", "1\\13\\2001", "10\\13\\1978", "10\\13\\1978", "10\\13\\1976", "10\\13\\2001", "5\\17\\1978", "5\\17\\1978", "5\\17\\1976", "5\\17\\2001", "1\\17\\1978", "1\\17\\1978", "1\\17\\1976", "1\\17\\2001", "10\\17\\1978", "10\\17\\1978", "10\\17\\1976", "10\\17\\2001"};

        MyDate[] dates = new MyDate[36];
        boolean output = true;

        for(int i = 0; i < days.length; i++){
            dates[i] = new MyDate(days[i], months[i], years[i]);
        }

        for(int i = 0; i < days.length; i++){
            if(!dates[i].toString().equals(texts[i])){
                System.out.println("COW7.MyDate toString method is incorrect, returning " + dates[i].toString() + "  , should be " + texts[i]);
                output = false;
            }

        }

        if(output){
            System.out.println("COW7.MyDate Level 2 works");
        }else{
            System.out.println("COW7.MyDate Level 2 does NOT work");
        }
        return output;
    }

    public static boolean testNameLevel2(){
        String[] middleNames =  {"Borys", "Borys", "Borys", "Borys", "Borys", "Borys", "Borys", "Borys", "Borys", "Borys", "Borys", "Borys", "Adam", "Adam", "Adam", "Adam", "Adam", "Adam", "Adam", "Adam", "Adam", "Adam", "Adam", "Adam", "Dilbert", "Dilbert", "Dilbert", "Dilbert", "Dilbert", "Dilbert", "Dilbert", "Dilbert", "Dilbert", "Dilbert", "Dilbert", "Dilbert", };
        String[] firstNames =   {"Chris", "Chris", "Chris", "Chris", "Cathy", "Cathy", "Cathy", "Cathy", "Yaroslav", "Yaroslav", "Yaroslav", "Yaroslav", "Chris", "Chris", "Chris", "Chris", "Cathy", "Cathy", "Cathy", "Cathy", "Yaroslav", "Yaroslav", "Yaroslav", "Yaroslav", "Chris", "Chris", "Chris", "Chris", "Cathy", "Cathy", "Cathy", "Cathy", "Yaroslav", "Yaroslav", "Yaroslav", "Yaroslav", };
        String[] lastNames = {"Mayewsky", "Mayewsky", "Marsh", "Washington", "Mayewsky", "Mayewsky", "Marsh", "Washington", "Mayewsky", "Mayewsky", "Marsh", "Washington", "Mayewsky", "Mayewsky", "Marsh", "Washington", "Mayewsky", "Mayewsky", "Marsh", "Washington", "Mayewsky", "Mayewsky", "Marsh", "Washington", "Mayewsky", "Mayewsky", "Marsh", "Washington", "Mayewsky", "Mayewsky", "Marsh", "Washington", "Mayewsky", "Mayewsky", "Marsh", "Washington", };
        String[] texts = {"Chris Borys Mayewsky", "Chris Borys Mayewsky", "Chris Borys Marsh", "Chris Borys Washington", "Cathy Borys Mayewsky", "Cathy Borys Mayewsky", "Cathy Borys Marsh", "Cathy Borys Washington", "Yaroslav Borys Mayewsky", "Yaroslav Borys Mayewsky", "Yaroslav Borys Marsh", "Yaroslav Borys Washington", "Chris Adam Mayewsky", "Chris Adam Mayewsky", "Chris Adam Marsh", "Chris Adam Washington", "Cathy Adam Mayewsky", "Cathy Adam Mayewsky", "Cathy Adam Marsh", "Cathy Adam Washington", "Yaroslav Adam Mayewsky", "Yaroslav Adam Mayewsky", "Yaroslav Adam Marsh", "Yaroslav Adam Washington", "Chris Dilbert Mayewsky", "Chris Dilbert Mayewsky", "Chris Dilbert Marsh", "Chris Dilbert Washington", "Cathy Dilbert Mayewsky", "Cathy Dilbert Mayewsky", "Cathy Dilbert Marsh", "Cathy Dilbert Washington", "Yaroslav Dilbert Mayewsky", "Yaroslav Dilbert Mayewsky", "Yaroslav Dilbert Marsh", "Yaroslav Dilbert Washington", };

        Name[] names = new Name[36];
        boolean output = true;

        for(int i = 0; i < lastNames.length; i++){
            names[i] = new Name(firstNames[i], middleNames[i], lastNames[i]);
        }

        for(int i = 0; i < lastNames.length; i++){
            if(!names[i].toString().equals(texts[i])){
                System.out.println("COW7.Name toString method is incorrect, returning " + names[i].toString() + "  , should be " + texts[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("COW7.Name Level 2 works");
        }else{
            System.out.println("COW7.Name Level 2 does NOT work");
        }
        return output;
    }

    public static boolean testPointLevel2(){
        int x = 100; int y = 100;
        Point thePoint = new Point(x, y, Color.BLUE, 10);
        boolean output = true;


        for(int n = 0; n < 5; n++){
            int amount = (int)(100 * Math.random());
            x += amount;
            thePoint.moveRight(amount);
            if(thePoint.getX() != x || thePoint.getY() != y){
                System.out.println("the moveRight method of the COW7.Point Class does not appear to work");
                output = false;
            }
        }
        for(int n = 0; n < 5; n++){
            int amount = (int)(100 * Math.random());
            x -= amount;
            thePoint.moveLeft(amount);
            if(thePoint.getX() != x || thePoint.getY() != y){
                System.out.println("the moveLeft method of the COW7.Point Class does not appear to work");
                output = false;
            }
        }
        for(int n = 0; n < 5; n++){
            int amount = (int)(100 * Math.random());
            y -= amount;
            thePoint.moveUp(amount);
            if(thePoint.getX() != x || thePoint.getY() != y){
                System.out.println("the moveUp method of the COW7.Point Class does not appear to work");
                output = false;
            }
        }
        for(int n = 0; n < 5; n++){
            int amount = (int)(100 * Math.random());
            y += amount;
            thePoint.moveDown(amount);
            if(thePoint.getX() != x || thePoint.getY() != y){
                System.out.println("the moveDown method of the COW7.Point Class does not appear to work");
                output = false;
            }
        }
        for(int n = 0; n < 5; n++){
            x = (int)(100 * Math.random());
            y = (int)(100 * Math.random());
            thePoint.moveTo(x, y);
            if(thePoint.getX() != x || thePoint.getY() != y){
                System.out.println("the moveTo method of the COW7.Point Class does not appear to work");
                output = false;
            }
        }


        if(output){
            System.out.println("COW7.Point Level 2 works");
        }else{

            System.out.println("COW7.Point Level 2 does NOT work");
        }
        return output;
    }

    public static boolean testBoxLevel2(){
        int x = 100, y = 100, width = 100, height = 100;
        Box theBox = new Box(x, y, Color.BLUE, width, height);
        boolean output = true;


        for(int n = 0; n < 5; n++){
            int amount = (int)(100 * Math.random());
            x += amount;
            theBox.moveRight(amount);
            if(theBox.getX() != x || theBox.getY() != y){
                System.out.println("the moveRight method of the Box Class does not appear to work");
                output = false;
            }
        }
        for(int n = 0; n < 5; n++){
            int amount = (int)(100 * Math.random());
            x -= amount;
            theBox.moveLeft(amount);
            if(theBox.getX() != x || theBox.getY() != y){
                System.out.println("the moveLeft method of the Box Class does not appear to work");
                output = false;
            }
        }
        for(int n = 0; n < 5; n++){
            int amount = (int)(100 * Math.random());
            y -= amount;
            theBox.moveUp(amount);
            if(theBox.getX() != x || theBox.getY() != y){
                System.out.println("the moveUp method of the Box Class does not appear to work");
                output = false;
            }
        }
        for(int n = 0; n < 5; n++){
            int amount = (int)(100 * Math.random());
            y += amount;
            theBox.moveDown(amount);
            if(theBox.getX() != x || theBox.getY() != y){
                System.out.println("the moveDown method of the Box Class does not appear to work");
                output = false;
            }
        }
        for(int n = 0; n < 5; n++){
            int amount = (int)(100 * Math.random());
            width += amount;
            theBox.stretchRight(amount);
            if(theBox.getWidth() != width || theBox.getHeight() != height){
                System.out.println("the stretchRight method of the Box Class does not appear to work");
                output = false;
            }
        }
        for(int n = 0; n < 5; n++){
            int amount = (int)(100 * Math.random());
            height += amount;
            theBox.stretchDown(amount);
            if(theBox.getWidth() != width || theBox.getHeight() != height){
                System.out.println("the stretchDown method of the Box Class does not appear to work");
                output = false;
            }
        }
        for(int n = 0; n < 5; n++){
            x = (int)(100 * Math.random());
            y = (int)(100 * Math.random());
            theBox.moveTo(x, y);
            if(theBox.getX() != x || theBox.getY() != y){
                System.out.println("the moveTo method of the Box Class does not appear to work");
                output = false;
            }
        }



        if(output){
            System.out.println("Box Level 2 works");
        }else{

            System.out.println("Box Level 2 does NOT work");
        }
        return output;
    }

    public static boolean testDigitLevel2(){
        int[] values =     {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,};

        Digit theDigit = new Digit(0);
        boolean output = true;



        for(int i = 1; i <= 10; i++){
            theDigit.increment();
            if(theDigit.getValue() != values[i%10]){
                System.out.println("increment method is incorrect, value should be " + values[i%10] + ", but is " + theDigit.getValue());
                output = false;
            }
            //System.out.println(theDigit.getValue());
        }
        for(int i = 9; i >= 0; i--){
            theDigit.decrement();
            if(theDigit.getValue() != values[i]){
                System.out.println("decrement method is incorrect, value should be " + values[i] + ", but is " + theDigit.getValue());
                output = false;
            }
            //System.out.println(theDigit.getValue());
        }
        for(int n = 0; n <= 9; n++){
            theDigit.setValue(n);
            if(theDigit.getValue() != n){
                System.out.println("setValue method is incorrect, value should be " + n + ", but is " + theDigit.getValue());
                output = false;
            }
            //System.out.println(theDigit.getValue());
        }

        if(output){
            System.out.println("Digit Level 2 works");
        }else{
            System.out.println("Digit Level 2 does NOT work");
        }
        return output;
    }
}