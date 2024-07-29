package COW3.Tests;

import COW3.*;
import COW3.Point;

import java.awt.*;


public class Level4Tester
{
    public static void main(String [] arg){
        testLevel4();
    }

    public static boolean testLevel4(){
        boolean one = testPerson();
        boolean two = testLine();
        if(one && two ){
            System.out.println("Level 4 works");
            return true;
        }else{
            System.out.println("Level 1 DOES NOT work");
            return false;
        }
    }

    public static boolean testPerson(){
        Name name1 = new Name("Yaroslav", "Borys", "Mayewsky");
        MyDate date1 = new MyDate(13, 1, 1978);

        Person person1 = new Person(name1, date1, 123456789);

        Name name2 = new Name("Yaroslav", "Borys", "Mayewsky");
        MyDate date2 = new MyDate(13, 1, 1978);

        Person person2 = new Person(name2, date2, 987654321);

        Name name3 = new Name("Yaroslav", "Volodymyr", "Mayewsky");
        MyDate date3 = new MyDate(13, 1, 1978);

        Person person3 = new Person(name3, date3, 111111111);

        boolean success = true;

        if(!person1.getName().equals(name1)){
            success = false;
            System.out.println("name variable or accessor method not set up correctly!");
        }
        if(!person1.getBirthDay().equals(date1)){
            success = false;
            System.out.println("birthDay variable or accessor method not set up correctly!");
        }
        if(person1.getSocSecNumber() != 123456789){
            success = false;
            System.out.println("socialSecurityNumber variable or accessor method not set up correctly!");
        }


        if(!person1.equals(person1)){
            success = false;
            System.out.println("False negative for equals");
        }
        if(person1.equals(person2)){
            success = false;
            System.out.println("False positive for equals");
        }
        if(person1.equals(person3)){
            success = false;
            System.out.println("False positive for equals");
        }

        if(person1.compareTo(person2) != 0){
            success = false;
            System.out.println("compareTo does not recognise people with same name");
        }
        if(person1.compareTo(person3) >= 0){
            success = false;
            System.out.println("compareTo not working properly");
        }
        if(person3.compareTo(person1) <= 0){
            success = false;
            System.out.println("compareTo not working properly");
        }

        if(success){
            System.out.println("COW7.Person working correctly");
        }else{
            System.out.println("COW7.Person NOT working correctly");
        }

        return success;
    }

    public static boolean testLine(){
        boolean success = true;
        int[] xValues = {10, 40,  10, 40,  40, 10,  50, 10,  60, 60,   125, 130,  0, 45};
        int[] yValues = {50, 10,  50, 10,  10, 50,  10, 40,  60, 110,  127, 129,  0, 45};
        int[] xValues2 = {14, 44,  2, 32,  40, 10,  50, 10,};
        int[] yValues2 = {50, 10,  50, 10,  28, 68,  5, 35,};
        double[] distances = {50.0, 50.0, 50.0, 50.0, 50.0, 5.385164807134504, 63.63961030678928, };
        int[] xMids = {25, 25, 25, 30, 60, 127, 22};
        int[] yMids = {30, 30, 30, 25, 85, 128, 22};
        Line[] lines = new Line[xValues.length/2];
        Line[] lines2 = new Line[xValues2.length/2];
        Point[] endpoints = new Point[xValues.length];
        Point[] endpoints2 = new Point[xValues2.length];
        Point[] midpoints = new Point[lines.length];

        for(int i = 0; i < endpoints.length; i++){
            endpoints[i] = new Point(xValues[i], yValues[i], Color.BLUE, 10);
        }
        for(int i = 0; i < lines.length; i++){
            lines[i] = new Line(endpoints[i*2], endpoints[i*2+1]);
        }
        for(int i = 0; i < lines.length; i++){
            midpoints[i] = new Point(xMids[i], yMids[i], Color.BLUE, 10);
        }
        for(int i = 0; i < endpoints2.length; i++){
            endpoints2[i] = new Point(xValues[i], yValues[i], Color.BLUE, 10);
        }
        for(int i = 0; i < lines2.length; i++){
            lines2[i] = new Line(endpoints2[i*2], endpoints2[i*2+1]);
        }

        for(int i = 0; i < lines.length; i++){
            if(!lines[i].getEndpoint1().equals(endpoints[i*2]) || !lines[i].getEndpoint2().equals(endpoints[i*2+1])){
                System.out.println("Endpoints are not stored correctly in constructor or accessor method incorrect");
                success = false;
            }
        }
        for(int i = 0; i < lines.length; i++){
            if(Math.abs(lines[i].getDistance() - distances[i]) >= .0001){
                System.out.println("Distance not calculated correctly");
                success = false;
            }
        }
        for(int i = 0; i < lines.length; i++){
            if(!lines[i].getMidPoint().equals(midpoints[i])){
                System.out.println("Midpoint not created correctly");
                success = false;
            }
        }
        for(int i = 1; i < lines.length; i++){
            if(i <= 2 && !lines[0].equals(lines[i])){
                System.out.println("False negative for equals for line, i = " + i);
                success = false;
            }else if(i > 2 && lines[0].equals(lines[i])){
                System.out.println("False positive for equals for line, i = " + i);
                success = false;
            }
        }
        for(int i = 1; i < lines.length; i++){
            if(i <= 4 && lines[0].compareTo(lines[i]) != 0){
                System.out.println("False none zero for compareTo");
                success = false;
            }else if(i == 5 && lines[0].compareTo(lines[i]) <= 0){
                System.out.println("False none positive for compareTo");
                success = false;
            }else if(i == 6 && lines[0].compareTo(lines[i]) >= 0){
                System.out.println("False none negative for compareTo");
                success = false;
            }
        }

        lines[0].moveRight(4);
        if(lines[0].equals(lines2[0])){
            System.out.println("MoveRight not working properly");
            success = false;
        }
        lines[0].moveLeft(8);
        if(lines[0].equals(lines2[0])){
            System.out.println("MoveLeft not working properly");
            success = false;
        }
        lines[0].moveDown(18);
        if(lines[0].equals(lines2[0])){
            System.out.println("MoveDown not working properly");
            success = false;
        }
        lines[0].moveUp(5);
        if(lines[0].equals(lines2[0])){
            System.out.println("MoveUp not working properly");
            success = false;
        }

        if(success){
            System.out.println("Line working correctly");
        }else{
            System.out.println("Line NOT working correctly");
        }

        return success;
    }
}