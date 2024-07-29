package COW4.Tests;

import COW4.Looper;

public class LooperLevel5Tester
{
    public static void main(String [] arg){
        boolean one = testrunSequence4();
        boolean two = testrunSequence5();
        if(one && two){
            System.out.println("Looper Level 5 works");
        }else{
            System.out.println("Looper Level 5 does NOT work");
        }
    }

    public static boolean testrunSequence4(){
        boolean verified = true;
        Looper student = new Looper();
        int [] values = {1, -1, 1, -1, 1, -1, 1, -1};
        Intake feed = new Intake(values);
        student.runSequence4(feed, 8);
        if(!feed.verify()){
            verified = false;
        }
        int [] values2 = {1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1};
        Intake feed2 = new Intake(values2);
        student.runSequence4(feed2, 13);
        if(!feed2.verify()){
            verified = false;
        }
        if(verified){
            System.out.println("runSequence4 works");
            return true;
        }else{
            System.out.println("runSequence4 does NOT work");
            return false;
        }
    }

    public static boolean testrunSequence5(){
        boolean verified = true;
        Looper student = new Looper();
        int [] values = {1, -10, 100, -1000, 10000, -100000};
        Intake feed = new Intake(values);
        student.runSequence5(feed, 6);
        if(!feed.verify()){
            verified = false;
        }
        int [] values2 = {1, -10, 100, -1000, 10000, -100000, 1000000, -10000000};
        Intake feed2 = new Intake(values2);
        student.runSequence5(feed2, 8);
        if(!feed2.verify()){
            verified = false;
        }
        if(verified){
            System.out.println("runSequence5 works");
            return true;
        }else{
            System.out.println("runSequence5 does NOT work");
            return false;
        }
    }


}