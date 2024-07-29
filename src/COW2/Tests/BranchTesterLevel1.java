package COW2.Tests;

import COW2.*;

public class BranchTesterLevel1
{
    public static void main(String [] arg){
        testLevel1();
    }

    public static boolean testLevel1(){
        boolean one = testisItPassing();
        boolean two = testareTheySpeeding();
        boolean three = testIsItEven();
        boolean four = testgetBonus();
        boolean five = testIsCauldronAtCorrectTemp();
        if(one && two && three && four && five){
            System.out.println("Level 1 works");
            return true;
        }else{
            System.out.println("Level 1 DOES NOT work");
            return false;
        }
    }


    public static boolean testisItPassing(){
        Grader student = new Grader();
        boolean output = true;

        double [] grades = {0.0, 0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0, 5.5, 6.0, 6.5, 7.0, 7.5, 8.0, 8.5, 9.0, 9.5, 10.0, 10.5, 11.0, 11.5, 12.0, 12.5, 13.0, 13.5, 14.0, 14.5, 15.0, 15.5, 16.0, 16.5, 17.0, 17.5, 18.0, 18.5, 19.0, 19.5, 20.0, 20.5, 21.0, 21.5, 22.0, 22.5, 23.0, 23.5, 24.0, 24.5, 25.0, 25.5, 26.0, 26.5, 27.0, 27.5, 28.0, 28.5, 29.0, 29.5, 30.0, 30.5, 31.0, 31.5, 32.0, 32.5, 33.0, 33.5, 34.0, 34.5, 35.0, 35.5, 36.0, 36.5, 37.0, 37.5, 38.0, 38.5, 39.0, 39.5, 40.0, 40.5, 41.0, 41.5, 42.0, 42.5, 43.0, 43.5, 44.0, 44.5, 45.0, 45.5, 46.0, 46.5, 47.0, 47.5, 48.0, 48.5, 49.0, 49.5, 50.0, 50.5, 51.0, 51.5, 52.0, 52.5, 53.0, 53.5, 54.0, 54.5, 55.0, 55.5, 56.0, 56.5, 57.0, 57.5, 58.0, 58.5, 59.0, 59.5, 60.0, 60.5, 61.0, 61.5, 62.0, 62.5, 63.0, 63.5, 64.0, 64.5, 65.0, 65.5, 66.0, 66.5, 67.0, 67.5, 68.0, 68.5, 69.0, 69.5, 70.0, 70.5, 71.0, 71.5, 72.0, 72.5, 73.0, 73.5, 74.0, 74.5, 75.0, 75.5, 76.0, 76.5, 77.0, 77.5, 78.0, 78.5, 79.0, 79.5, 80.0, 80.5, 81.0, 81.5, 82.0, 82.5, 83.0, 83.5, 84.0, 84.5, 85.0, 85.5, 86.0, 86.5, 87.0, 87.5, 88.0, 88.5, 89.0, 89.5, 90.0, 90.5, 91.0, 91.5, 92.0, 92.5, 93.0, 93.5, 94.0, 94.5, 95.0, 95.5, 96.0, 96.5, 97.0, 97.5, 98.0, 98.5, 99.0, 99.5, 100.0, };
        boolean [] results = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, };

        for(int i = 0; i < grades.length; i++){
            if(student.isItPassing(grades[i]) != results[i]){
                System.out.println("isItPassing failed, " + "isItPassing(" + grades[i] + ")" + " results in " + student.isItPassing(grades[i]) + ", not equal to " + results[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("isItPassing works");
        }else{
            System.out.println("isItPassing does not work");
        }
        return output;
    }

    public static boolean testareTheySpeeding(){
        Cop student = new Cop();
        boolean output = true;

        double [] speeds = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, };
        double [] speedLimits = {20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, };
        boolean [] results = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, true, true, true, false, false, false, false, false, false, false, false, false, false, true, true, true, false, false, false, false, false, false, false, false, false, false, true, true, true, true, false, false, false, false, false, false, false, false, false, true, true, true, true, false, false, false, false, false, false, false, false, false, true, true, true, true, true, false, false, false, false, false, false, false, false, true, true, true, true, true, false, false, false, false, false, false, false, false, true, true, true, true, true, true, false, false, false, false, false, false, false, true, true, true, true, true, true, false, false, false, false, false, false, false, true, true, true, true, true, true, true, false, false, false, false, false, false, true, true, true, true, true, true, true, false, false, false, false, false, false, true, true, true, true, true, true, true, true, false, false, false, false, false, true, true, true, true, true, true, true, true, false, false, false, false, false, true, true, true, true, true, true, true, true, true, false, false, false, false, true, true, true, true, true, true, true, true, true, false, false, false, false, true, true, true, true, true, true, true, true, true, true, false, false, false, true, true, true, true, true, true, true, true, true, true, false, false, false, true, true, true, true, true, true, true, true, true, true, true, false, false, true, true, true, true, true, true, true, true, true, true, true, false, false, true, true, true, true, true, true, true, true, true, true, true, true, false, true, true, true, true, true, true, true, true, true, true, true, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, };

        for(int i = 0; i < results.length; i++){
            if(student.areTheySpeeding(speeds[i], speedLimits[i]) != results[i]){
                System.out.println("areTheySpeeding failed, " + "areTheySpeeding(" + speeds[i] + ", " + speedLimits[i] + ")" + " results in " + student.areTheySpeeding(speeds[i], speedLimits[i]) + ", not equal to " + results[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("areTheySpeeding works");
        }else{
            System.out.println("areTheySpeeding does not work");
        }
        return output;
    }

    public static boolean testIsItEven(){
        NumberAnalyzer student = new NumberAnalyzer();
        boolean output = true;

        int [] numbers = {-350, -343, -336, -329, -322, -315, -308, -301, -294, -287, -280, -273, -266, -259, -252, -245, -238, -231, -224, -217, -210, -203, -196, -189, -182, -175, -168, -161, -154, -147, -140, -133, -126, -119, -112, -105, -98, -91, -84, -77, -70, -63, -56, -49, -42, -35, -28, -21, -14, -7, 0, 7, 14, 21, 28, 35, 42, 49, 56, 63, 70, 77, 84, 91, 98, 105, 112, 119, 126, 133, 140, 147, 154, 161, 168, 175, 182, 189, 196, 203, 210, 217, 224, 231, 238, 245, 252, 259, 266, 273, 280, 287, 294, 301, 308, 315, 322, 329, 336, 343, 350, -7972, -5527, 813, -6494, -3579, -504, 2701, 3461, 944, -3224, 1548, -7044, 8452, -4648, 7107, -2659, -7990, -6778, 5157, 7022, 2386, -2413, 1319, 9446, -1757, 5387, 8192, -3141, -5800, 8244, 171, 9735, 4172, 7671, -7220, -9658, 5219, -1227, -8449, 6091, 582, 3655, -795, 8104, -313, 9351, 9318, -3145, -2415, 9349, };
        boolean [] results = {true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, true, false, false, true, false, true, false, false, true, true, true, true, true, true, false, false, true, true, false, true, true, false, false, true, false, false, true, false, true, true, false, false, true, false, true, true, false, false, false, false, true, false, false, true, false, false, true, false, false, false, };

        for(int i = 0; i < numbers.length; i++){
            if(student.isItEven(numbers[i]) != results[i]){
                System.out.println("isItEven failed, " + "isItEven(" + numbers[i] + ")" + " results in " + student.isItEven(numbers[i]) + ", not equal to " + results[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("isItEven works");
        }else{
            System.out.println("isItEven does not work");
        }
        return output;
    }

    public static boolean testgetBonus(){
        PayRoll student = new PayRoll();
        boolean output = true;

        double [] sales = {0.0, 15000.0, 30000.0, 45000.0, 60000.0, 75000.0, 90000.0, 105000.0, 120000.0, 135000.0, 150000.0, 165000.0, 180000.0, 195000.0, 210000.0, 225000.0, 240000.0, 255000.0, 270000.0, 285000.0, 300000.0, 315000.0, 330000.0, 345000.0, 360000.0, 375000.0, 390000.0, 405000.0, 420000.0, 435000.0, 450000.0, 465000.0, 480000.0, 495000.0, 510000.0, 525000.0, 540000.0, 555000.0, 570000.0, 585000.0, 600000.0, 100864.57, 841316.48, 124996.51, 641165.96, 298165.18, 715652.17, 61371.16, 831306.72, 457055.28, 179089.76, 128972.7, 326216.68, 87269.77, 526496.81, 750676.7, 138761.88, 393090.32, 838056.98, 144468.26, 660805.26, 876868.29, 55687.05, 162244.54, 759651.17, 551481.34, 867094.9, 491960.82, 184221.65, 587193.22, 274950.49, 685796.29, 315174.08, 563113.74, 424930.8, 87369.17, 880085.04, 619431.64, 993938.76, 622630.47, 372988.34, 713820.22, 198585.23, 591918.4, 566969.68, 873891.88, 274062.27, 54756.68, 689184.68, 807304.4, 94824.98, };
        double [] results = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1500.0, 3000.0, 4500.0, 6000.0, 7500.0, 9000.0, 10500.0, 12000.0, 13500.0, 15000.0, 16500.0, 18000.0, 19500.0, 21000.0, 22500.0, 24000.0, 25500.0, 27000.0, 28500.0, 30000.0, 0.0, 54131.648, 0.0, 34116.596, 0.0, 41565.217000000004, 0.0, 53130.672, 15705.528000000004, 0.0, 0.0, 2621.6679999999997, 0.0, 22649.681000000008, 45067.67, 0.0, 9309.032000000001, 53805.698000000004, 0.0, 36080.526000000005, 57686.829000000005, 0.0, 0.0, 45965.117000000006, 25148.134, 56709.490000000005, 19196.082000000002, 0.0, 28719.322, 0.0, 38579.62900000001, 1517.4080000000017, 26311.374, 12493.08, 0.0, 58008.50400000001, 31943.164000000004, 69393.876, 32263.047, 7298.834000000003, 41382.022, 0.0, 29191.840000000004, 26696.968000000008, 57389.188, 0.0, 0.0, 38918.46800000001, 50730.44, 0.0, };

        for(int i = 0; i < sales.length; i++){
            if(Math.abs(student.getBonus(sales[i]) - results[i]) > .01){
                System.out.println("getBonus failed, " + "getBonus(" + sales[i] + ")" + " results in " + student.getBonus(sales[i]) + ", not equal to " + results[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("getBonus works");
        }else{
            System.out.println("getBonus does not work");
        }
        return output;
    }

    public static boolean testIsCauldronAtCorrectTemp(){
        Hogwarts student = new Hogwarts();
        boolean output = true;

        double [] numbers = {-500.1927, -2, 200, 200.23, 200.24, 201, 4592.198  };
        boolean [] results = {false, false, false, true, false, false, false};

        for(int i = 0; i < numbers.length; i++){
            if(student.isCauldronAtCorrectTemp(numbers[i]) != results[i]){
                System.out.println("isCauldronAtCorrectTemp failed, " + "isCauldronAtCorrectTemp(" + numbers[i] + ")" + " results in " + student.isCauldronAtCorrectTemp(numbers[i]) + ", not equal to " + results[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("isCauldronAtCorrectTemp works");
        }else{
            System.out.println("isCauldronAtCorrectTemp does not work");
        }
        return output;
    }


}