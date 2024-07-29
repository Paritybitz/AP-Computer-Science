package COW4.Tests;

import COW4.Looper;

public class LooperLevel2Tester
{
    public static void main(String [] arg){
        boolean countUpToX = testcountUpToX();
        boolean countDownFromX = testcountDownFromX();
        if(countUpToX && countDownFromX){
            System.out.println("Looper Level 2 works");
        }else{
            System.out.println("Looper Level 2 does NOT work");
        }
    }

    public static boolean testcountUpToX(){
        int [] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        Intake feed = new Intake(values);
        Looper student = new Looper();
        student.countUpToX(feed, 14);
        boolean verified = true;
        if(!feed.verify()){
            verified = false;
        }
        int [] values2 = {1, 2, 3, 4, 5};
        Intake feed2 = new Intake(values2);
        student.countUpToX(feed2, 5);
        if(!feed2.verify()){
            verified = false;
        }
        if(verified){
            System.out.println("countUpToX works");
            return true;
        }else{
            System.out.println("countUpToX does NOT work");
            return false;
        }
    }

    public static boolean testcountDownFromX(){
        int [] values = {8, 7, 6, 5, 4, 3, 2, 1};
        Intake feed = new Intake(values);
        Looper student = new Looper();
        student.countDownFromX(feed, 8);
        boolean verified = true;
        if(!feed.verify()){
            verified = false;
        }
        int [] values2 = {13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Intake feed2 = new Intake(values2);
        student.countDownFromX(feed2, 13);
        if(!feed2.verify()){
            verified = false;
        }
        if(verified){
            System.out.println("countDownFromX works");
            return true;
        }else{
            System.out.println("countDownFromX does NOT work");
            return false;
        }
    }
}