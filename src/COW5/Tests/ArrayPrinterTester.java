package COW5.Tests;

import COW5.ArrayPrinter;

public class ArrayPrinterTester
{
    public static void main(String [] arg){

        boolean print = testPrint();
        boolean printReverse = testPrintReverse();
        boolean printEveryOtherElement = testPrintEveryOtherElement();
        boolean printFirstHalf = testPrintFirstHalf();
        boolean printSecondHalf = testPrintSecondHalf();
        boolean printSection = testPrintSection();


        if(print && printReverse && printEveryOtherElement && printFirstHalf && printSecondHalf && printSection){
            System.out.println("ArrayPrinter works");
        }else{
            System.out.println("ArrayPrinter does NOT work");
        }
    }



    public static boolean testPrint(){
        System.out.println("====================================");
        boolean verified = true;
        ArrayPrinter student = new ArrayPrinter();
        int [] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Intake feed = new Intake(values);
        int [] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        student.print(input, feed);
        if(!feed.verify()){
            verified = false;
        }
        int [] values2 = {5, 2, 6, 3, 4, 9, 1, 7};
        Intake feed2 = new Intake(values);
        int [] input2 = {5, 2, 6, 3, 4, 9, 1, 7};
        student.print(input, feed2);
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
        ArrayPrinter student = new ArrayPrinter();
        int [] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Intake feed = new Intake(values);
        int [] input = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        student.printReverse(input, feed);
        if(!feed.verify()){
            verified = false;
        }
        int [] values2 = {5, 2, 6, 3, 4, 9, 1, 7};
        Intake feed2 = new Intake(values);
        int [] input2 = {7, 1, 9, 4, 3, 6, 2, 5};
        student.printReverse(input, feed2);
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

    public static boolean testPrintEveryOtherElement(){
        System.out.println("====================================");
        boolean verified = true;
        ArrayPrinter student = new ArrayPrinter();
        int [] values = {1, 3, 5, 7, 9};
        Intake feed = new Intake(values);
        int [] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        student.printEveryOtherElement(input, feed);
        if(!feed.verify()){
            verified = false;
        }
        int [] values2 = {5, 6, 4, 1, 8};
        Intake feed2 = new Intake(values);
        int [] input2 = {5, 2, 6, 3, 4, 9, 1, 7, 8};
        student.printEveryOtherElement(input, feed2);
        if(!feed2.verify()){
            verified = false;
        }
        if(verified){
            System.out.println("printEveryOtherElement works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("printEveryOtherElement does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testPrintFirstHalf(){
        System.out.println("====================================");
        boolean verified = true;
        ArrayPrinter student = new ArrayPrinter();
        int [] values = {5, 23, 504, -307, -214};
        Intake feed = new Intake(values);
        int [] input = {5, 23, 504, -307, -214, -3, 0, 46, 55, -22, -19};
        student.printFirstHalf(input, feed);
        if(!feed.verify()){
            verified = false;
        }
        int [] values2 = {-88, 10};
        Intake feed2 = new Intake(values2);
        int [] input2 = {-88, 10, 20, 38};
        student.printFirstHalf(input2, feed2);
        if(!feed2.verify()){
            verified = false;
        }
        if(verified){
            System.out.println("printFirstHalf works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("printFirstHalf does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testPrintSecondHalf(){
        System.out.println("====================================");
        boolean verified = true;
        ArrayPrinter student = new ArrayPrinter();
        int [] values = {0, 46, 55, -22, -19};
        Intake feed = new Intake(values);
        int [] input = {5, 23, 504, -307, -214, -3, 0, 46, 55, -22, -19};
        student.printSecondHalf(input, feed);
        if(!feed.verify()){
            verified = false;
        }
        int [] values2 = {20, 38};
        Intake feed2 = new Intake(values2);
        int [] input2 = {-88, 10, 20, 38};
        student.printSecondHalf(input2, feed2);
        if(!feed2.verify()){
            verified = false;
        }
        if(verified){
            System.out.println("printSecondHalf works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("printSecondHalf does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testPrintSection(){
        System.out.println("====================================");
        boolean verified = true;
        ArrayPrinter student = new ArrayPrinter();
        int [] values = {504, -307, -214, -3};
        Intake feed = new Intake(values);
        int [] input = {5, 23, 504, -307, -214, -3, 0, 46, 55, -22, -19};
        student.printSection(input, feed, 2, 5);
        if(!feed.verify()){
            System.out.println("Input #1 Failed");
            verified = false;
        }
        int [] values2 = {-3, -214, -307, 504};
        Intake feed2 = new Intake(values2);
        int [] input2 = {5, 23, 504, -307, -214, -3, 0, 46, 55, -22, -19};
        student.printSection(input, feed2, 5, 2);
        if(!feed2.verify()){
            System.out.println("Input #2 Failed");
            verified = false;
        }
        int [] values3 = {5, 23, 504, -307, -214, -3, 0, 46, 55, -22, -19};
        Intake feed3 = new Intake(values3);
        int [] input3 = {5, 23, 504, -307, -214, -3, 0, 46, 55, -22, -19};
        student.printSection(input, feed3, -2, 20);
        if(!feed3.verify()){
            System.out.println("Input #3 Failed");
            verified = false;
        }
        int [] values4 = {-3, -214, -307, 504, 23, 5};
        Intake feed4 = new Intake(values4);
        int [] input4 = {5, 23, 504, -307, -214, -3, 0, 46, 55, -22, -19};
        student.printSection(input, feed4, 5, -1);
        if(!feed3.verify()){
            System.out.println("Input #4 Failed");
            verified = false;
        }
        if(verified){
            System.out.println("printSection works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("printSection does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

}