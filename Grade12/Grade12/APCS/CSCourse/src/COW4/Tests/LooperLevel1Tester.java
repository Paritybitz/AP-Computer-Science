package COW4.Tests;

import COW4.Looper;

public class LooperLevel1Tester
{
    public static void main(String [] arg){
        boolean upTo10 = testCountUpTo10();
        boolean downFrom10 = testCountDownFrom10();
        if(upTo10 && downFrom10){
            System.out.println("Looper Level 1 works");
        }else{
            System.out.println("Looper Level 1 does NOT work");
        }
    }

    public static boolean testCountUpTo10(){
        int [] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Intake feed = new Intake(values);
        Looper student = new Looper();
        student.countUpTo10(feed);
        if(feed.verify()){
            System.out.println("countUpTo10 works");
            return true;
        }else{
            System.out.println("countUpTo10 does NOT work");
            return false;
        }
    }

    public static boolean testCountDownFrom10(){
        int [] values = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Intake feed = new Intake(values);
        Looper student = new Looper();
        student.countDownFrom10(feed);
        if(feed.verify()){
            System.out.println("ccountDownFrom10 works");
            return true;
        }else{
            System.out.println("countDownFrom10 does NOT work");
            return false;
        }
    }
}