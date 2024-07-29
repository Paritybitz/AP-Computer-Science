package COW4.Tests;

import COW4.Looper;

public class LooperLevel3Tester
{
    public static void main(String [] arg){
        boolean one = testcountUpToXfromYbyA();
        boolean two = countDownFromXtoYbyA();
        if(one && two){
            System.out.println("Looper Level 3 works");
        }else{
            System.out.println("Looper Level 3 does NOT work");
        }
    }

    public static boolean testcountUpToXfromYbyA(){
        boolean verified = true;
        Looper student = new Looper();
        int [] values = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        Intake feed = new Intake(values);
        student.countUpToXfromYbyA(feed, 20, 2, 2);
        if(!feed.verify()){
            verified = false;
        }
        int [] values2 = {-4, 0, 4, 8, 12, 16, 20, 24, 28, 32};
        Intake feed2 = new Intake(values2);
        student.countUpToXfromYbyA(feed2, 32, -4, 4);
        if(!feed2.verify()){
            verified = false;
        }
        if(verified){
            System.out.println("countUpToXfromYbyA works");
            return true;
        }else{
            System.out.println("countUpToXfromYbyA does NOT work");
            return false;
        }
    }

    public static boolean countDownFromXtoYbyA(){
        boolean verified = true;
        Looper student = new Looper();
        int [] values = {20, 15, 10, 5, 0};
        Intake feed = new Intake(values);
        student.countDownFromXtoYbyA(feed, 20, 0, 5);
        if(!feed.verify()){
            verified = false;
        }
        int [] values2 = {32, 28, 24, 20, 16, 12, 8, 4, 0, -4};
        Intake feed2 = new Intake(values2);
        student.countDownFromXtoYbyA(feed2, 32, -4, 4);
        if(!feed2.verify()){
            verified = false;
        }
        if(verified){
            System.out.println("countDownFromXtoYbyA works");
            return true;
        }else{
            System.out.println("countDownFromXtoYbyA does NOT work");
            return false;
        }
    }


}