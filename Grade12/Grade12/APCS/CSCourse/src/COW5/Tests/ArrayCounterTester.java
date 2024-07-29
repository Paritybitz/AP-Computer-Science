package COW5.Tests;

import COW5.ArrayCounter;

public class ArrayCounterTester
{
    public static void main(String [] arg){

        boolean countPositives = testCountPositives();
        boolean countNegativeOdds = testCountNegativeOdds();
        boolean countInRange = testCountInRange();
        boolean countPairs = testCountPairs();
        boolean countUniqueElements = testCountUniqueElements();
        boolean countNonUniqueElements = testCountNonUniqueElements();

        if(countPositives && countNegativeOdds && countInRange && countPairs && countUniqueElements && countNonUniqueElements){
            System.out.println("ArrayCounter works");
        }else{
            System.out.println("ArrayCounter does NOT work");
        }
    }

    public static boolean testCountPositives(){
        System.out.println("====================================");
        boolean verified = true;
        ArrayCounter student = new ArrayCounter();
        int [] input1 = {5, 23, 504, -307, -214, -3, 0, 46, 55, -22, -19};
        int correctResult1 = 5;
        int result1 = student.countPositives(input1);
        if(result1 != correctResult1){
            System.out.println("Counted " + result1 + ", when it should be " + correctResult1);
            verified = false;
        }
        int [] input2 = {-4, 8, 8, -11, 97};
        int correctResult2 = 3;
        int result2 = student.countPositives(input2);
        if(result2 != correctResult2){
            System.out.println("Counted " + result2 + ", when it should be " + correctResult2);
            verified = false;
        }

        if(verified){
            System.out.println("countPositives works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("countPositives does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testCountNegativeOdds(){
        System.out.println("====================================");
        boolean verified = true;
        ArrayCounter student = new ArrayCounter();
        int [] input1 = {5, 23, 504, -307, -214, -3, 0, 46, 55, -22, -19};
        int correctResult1 = 3;
        int result1 = student.countNegativeOdds(input1);
        if(result1 != correctResult1){
            System.out.println("Counted " + result1 + ", when it should be " + correctResult1);
            verified = false;
        }
        int [] input2 = {-4, 8, 8, -11, 97};
        int correctResult2 = 1;
        int result2 = student.countNegativeOdds(input2);
        if(result2 != correctResult2){
            System.out.println("Counted " + result2 + ", when it should be " + correctResult2);
            verified = false;
        }

        if(verified){
            System.out.println("countNegativeOdds works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("countNegativeOdds does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testCountInRange(){
        System.out.println("====================================");
        boolean verified = true;
        ArrayCounter student = new ArrayCounter();
        int [] input1 = {5, 23, 504, -307, -214, -3, 0, 46, 55, -22, -19};
        int correctResult1 = 5;
        int result1 = student.countInRange(input1, -19, 23);
        if(result1 != correctResult1){
            System.out.println("Counted " + result1 + ", when it should be " + correctResult1);
            verified = false;
        }
        int [] input2 = {-100, 8, 8, -11, 97};
        int correctResult2 = 4;
        int result2 = student.countInRange(input2, -100, 90);
        if(result2 != correctResult2){
            System.out.println("Counted " + result2 + ", when it should be " + correctResult2);
            verified = false;
        }

        if(verified){
            System.out.println("countInRange works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("countInRange does NOT work");
            System.out.println("====================================");
            return false;
        }
    }



    public static boolean testCountPairs(){
        System.out.println("====================================");
        boolean verified = true;
        ArrayCounter student = new ArrayCounter();
        int [] input1 = {1, 1, 2, 3, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 7, 7, 8, 8, 9, 10, 10};
        int correctResult1 = 18;
        int result1 = student.countPairs(input1);
        if(result1 != correctResult1){
            System.out.println("Counted " + result1 + ", when it should be " + correctResult1);
            verified = false;
        }
        int [] input2 = {5};
        int correctResult2 = 0;
        int result2 = student.countPairs(input2);
        if(result2 != correctResult2){
            System.out.println("Counted " + result2 + ", when it should be " + correctResult2);
            verified = false;
        }

        if(verified){
            System.out.println("countPairs works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("countPairs does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testCountUniqueElements(){
        System.out.println("====================================");
        boolean verified = true;
        ArrayCounter student = new ArrayCounter();
        int [] input1 = {1, 1, 2, 3, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 7, 7, 8, 8, 9, 10, 10};
        int correctResult1 = 3;
        int result1 = student.countUniqueElements(input1);
        if(result1 != correctResult1){
            System.out.println("Counted " + result1 + ", when it should be " + correctResult1);
            verified = false;
        }
        int [] input2 = {5};
        int correctResult2 = 1;
        int result2 = student.countUniqueElements(input2);
        if(result2 != correctResult2){
            System.out.println("Counted " + result2 + ", when it should be " + correctResult2);
            verified = false;
        }
        int [] input3 = {1, 2, 3, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 7, 7, 8, 8, 9, 10};
        int correctResult3 = 5;
        int result3 = student.countUniqueElements(input3);
        if(result3 != correctResult3){
            System.out.println("Counted " + result3 + ", when it should be " + correctResult3);
            verified = false;
        }

        if(verified){
            System.out.println("countUniqueElements works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("countUniqueElements does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testCountNonUniqueElements(){
        System.out.println("====================================");
        boolean verified = true;
        ArrayCounter student = new ArrayCounter();
        int [] input1 = {1, 1, 2, 3, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 7, 7, 8, 8, 9, 10, 10};
        int correctResult1 = 7;
        int result1 = student.countNonUniqueElements(input1);
        if(result1 != correctResult1){
            System.out.println("Counted " + result1 + ", when it should be " + correctResult1);
            verified = false;
        }
        int [] input2 = {5};
        int correctResult2 = 0;
        int result2 = student.countNonUniqueElements(input2);
        if(result2 != correctResult2){
            System.out.println("Counted " + result2 + ", when it should be " + correctResult2);
            verified = false;
        }
        int [] input3 = {1, 2, 3, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 7, 7, 8, 8, 9, 10};
        int correctResult3 = 5;
        int result3 = student.countNonUniqueElements(input3);
        if(result3 != correctResult3){
            System.out.println("Counted " + result3 + ", when it should be " + correctResult3);
            verified = false;
        }

        if(verified){
            System.out.println("countNonUniqueElements works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("countNonUniqueElements does NOT work");
            System.out.println("====================================");
            return false;
        }
    }
}