package COW4.Tests;

import COW4.Looper;

public class LooperLevel4Tester
{
    public static void main(String [] arg){
        boolean one = testrunSequence1();
        boolean two = testrunSequence2();
        if(one && two){
            System.out.println("Looper Level 4 works");
        }else{
            System.out.println("Looper Level 4 does NOT work");
        }
    }

    public static boolean testrunSequence1(){
        boolean verified = true;
        Looper student = new Looper();
        int [] values = {1, 3, 7, 15, 31, 63, 127, 255, 511};
        Intake feed = new Intake(values);
        student.runSequence1(feed, 511);
        if(!feed.verify()){
            verified = false;
        }
        int [] values2 = {1, 3, 7, 15, 31, 63, 127, 255, 511, 1023};
        Intake feed2 = new Intake(values2);
        student.runSequence1(feed2, 1023);
        if(!feed2.verify()){
            verified = false;
        }
        if(verified){
            System.out.println("runSequence1 works");
            return true;
        }else{
            System.out.println("runSequence1 does NOT work");
            return false;
        }
    }

    public static boolean testrunSequence2(){
        boolean verified = true;
        Looper student = new Looper();
        int [] values = {1, 4, 10, 22, 46, 94, 190, 382, 766};
        Intake feed = new Intake(values);
        student.runSequence2(feed, 766);
        if(!feed.verify()){
            verified = false;
        }
        int [] values2 = {1, 4, 10, 22, 46, 94, 190, 382, 766, 1534};
        Intake feed2 = new Intake(values2);
        student.runSequence2(feed2, 1534);
        if(!feed2.verify()){
            verified = false;
        }
        if(verified){
            System.out.println("runSequence2 works");
            return true;
        }else{
            System.out.println("runSequence2 does NOT work");
            return false;
        }
    }


}