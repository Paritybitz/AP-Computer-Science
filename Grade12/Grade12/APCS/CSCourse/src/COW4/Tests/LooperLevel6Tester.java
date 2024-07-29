package COW4.Tests;

import COW4.Looper;

public class LooperLevel6Tester
{
    public static void main(String [] arg){
        boolean one = testrunSequence7();
        boolean two = testrunSequence8();
        if(one && two){
            System.out.println("Looper Level 6 works");
        }else{
            System.out.println("Looper Level 6 does NOT work");
        }
    }

    public static boolean testrunSequence7(){
        boolean verified = true;
        Looper student = new Looper();
        int [] values = {1, 2, 4, 7, 11, 14, 16, 17, 17, 18, 20, 23, 27};
        Intake feed = new Intake(values);
        student.runSequence7(feed, 27);
        if(!feed.verify()){
            verified = false;
        }
        int [] values2 = {1, 2, 4, 7, 11, 14, 16, 17, 17, 18, 20, 23, 27, 30, 32};
        Intake feed2 = new Intake(values2);
        student.runSequence7(feed2, 32);
        if(!feed2.verify()){
            verified = false;
        }
        if(verified){
            System.out.println("runSequence7 works");
            return true;
        }else{
            System.out.println("runSequence7 does NOT work");
            return false;
        }
    }

    public static boolean testrunSequence8(){
        boolean verified = true;
        Looper student = new Looper();
        int [] values = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        Intake feed = new Intake(values);
        student.runSequence8(feed, 10);
        if(!feed.verify()){
            verified = false;
        }
        int [] values2 = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6};
        Intake feed2 = new Intake(values2);
        student.runSequence8(feed2, 17);
        if(!feed2.verify()){
            verified = false;
        }
        if(verified){
            System.out.println("runSequence8 works");
            return true;
        }else{
            System.out.println("runSequence8 does NOT work");
            return false;
        }
    }

}