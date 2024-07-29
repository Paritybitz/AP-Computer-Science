package COW11.Tests;

import COW11.ListPractice1;

import java.util.*;
public class ListPractice1Tester
{
    public static void main(String [] arg){
        boolean print = testPrint();
        boolean printReverse = testPrintReverse();
        boolean printPositives = testPrintPositives();
        boolean printNegativeOdds = testPrintNegativeOdds();
        boolean printMultiples = testPrintMultiples();

        if(print && printReverse && printPositives && printNegativeOdds && printMultiples){
            System.out.println("ListPractice 1 works");
        }else{
            System.out.println("ListPractice 1 does NOT work");
        }
    }

    public static boolean testPrint(){
        System.out.println("====================================");
        boolean verified = true;
        ListPractice1 student = new ListPractice1();
        int [] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Intake feed = new Intake(values);
        int [] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> listInput = new ArrayList<Integer>();
        for(int next : input){
            listInput.add(next);
        }
        student.print(listInput, feed);
        if(!feed.verify()){
            verified = false;
        }
        int [] values2 = {5, 2, 6, 3, 4, 9, 1, 7};
        Intake feed2 = new Intake(values2);
        int [] input2 = {5, 2, 6, 3, 4, 9, 1, 7};
        ArrayList<Integer> listInput2 = new ArrayList<Integer>();
        for(int next : input2){
            listInput2.add(next);
        }
        student.print(listInput2, feed2);
        if(!feed2.verify()){
            verified = false;
        }
        if(verified){
            System.out.println("print works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("print does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testPrintReverse(){
        System.out.println("====================================");
        boolean verified = true;
        ListPractice1 student = new ListPractice1();
        int [] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Intake feed = new Intake(values);
        int [] input = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        ArrayList<Integer> listInput = new ArrayList<Integer>();
        for(int next : input){
            listInput.add(next);
        }
        student.printReverse(listInput, feed);
        if(!feed.verify()){
            verified = false;
        }
        int [] values2 = {5, 2, 6, 3, 4, 9, 1, 7};
        Intake feed2 = new Intake(values2);
        int [] input2 = {7, 1, 9, 4, 3, 6, 2, 5};
        ArrayList<Integer> listInput2 = new ArrayList<Integer>();
        for(int next : input2){
            listInput2.add(next);
        }
        student.printReverse(listInput2, feed2);
        if(!feed2.verify()){
            verified = false;
        }
        if(verified){
            System.out.println("printReverse works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("printReverse does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testPrintPositives(){
        System.out.println("====================================");
        boolean verified = true;
        ListPractice1 student = new ListPractice1();
        int [] values = {5, 23, 504, 46, 55};
        Intake feed = new Intake(values);
        int [] input = {5, 23, 504, -307, -214, -3, 0, 46, 55, -22, -19};
        ArrayList<Integer> listInput = new ArrayList<Integer>();
        for(int next : input){
            listInput.add(next);
        }
        student.printPositives(listInput, feed);
        if(!feed.verify()){
            verified = false;
        }

        if(verified){
            System.out.println("printPositives works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("printPositives does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testPrintNegativeOdds(){
        System.out.println("====================================");
        boolean verified = true;
        ListPractice1 student = new ListPractice1();
        int [] values = {-307, -3, -19};
        Intake feed = new Intake(values);
        int [] input = {5, 23, 504, -307, -214, -3, 0, 46, 55, -22, -19};
        ArrayList<Integer> listInput = new ArrayList<Integer>();
        for(int next : input){
            listInput.add(next);
        }
        student.printNegativeOdds(listInput, feed);
        if(!feed.verify()){
            verified = false;
        }
        if(verified){
            System.out.println("printNegativeOdds works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("printNegativeOdds does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testPrintMultiples(){
        System.out.println("====================================");
        boolean verified = true;
        ListPractice1 student = new ListPractice1();
        int [] values = {2, 4, 6, 8, 10};
        Intake feed = new Intake(values);
        int [] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> listInput = new ArrayList<Integer>();
        for(int next : input){
            listInput.add(next);
        }
        student.printMultiples(listInput, feed, 2);
        if(!feed.verify()){
            verified = false;
        }
        int [] values2 = {5, 0, 55, -190};
        Intake feed2 = new Intake(values2);
        int [] input2 = {5, 23, 504, -307, -214, -3, 0, 46, 55, -22, -190};
        ArrayList<Integer> listInput2 = new ArrayList<Integer>();
        for(int next : input2){
            listInput2.add(next);
        }
        student.printMultiples(listInput2, feed2, 5);
        if(!feed2.verify()){
            verified = false;
        }
        if(verified){
            System.out.println("printMultiples works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("printMultiples does NOT work");
            System.out.println("====================================");
            return false;
        }
    }
}
