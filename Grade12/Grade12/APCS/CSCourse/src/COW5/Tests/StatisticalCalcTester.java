package COW5.Tests;

import COW5.StatisticalCalculator;

public class StatisticalCalcTester
{
    public static void main(String [] arg){

        boolean sumArray = testSumArray();
        boolean ave = testGetAverageValue ();
        boolean median = testGetMedianValue();
        boolean deviation = testStandardDeviation ();
        boolean deviations = testGetDeviations ();
        boolean correlations = testGetCorrelation ();

        if(sumArray && ave && median && deviation && deviations && correlations){
            System.out.println("Statistical Calculator 1 works");
        }else{
            System.out.println("Statistical Calculator 1 does NOT work");
        }
    }


    public static boolean testSumArray(){
        System.out.println("====================================");
        boolean verified = true;
        StatisticalCalculator student = new StatisticalCalculator();
        double [] input = {4, 1, 8, 11, 13, 10, 7, 5, 15, 1};
        double sum1 = student.sumArray(input);
        if(sum1 != 75){
            verified = false;
            System.out.println("sumArray({4, 1, 8, 11, 13, 10, 7, 5, 15, 1}) returns " + sum1 + ", not 75");
        }
        double [] input2 = {3, 2, 10, 10, 12, 11, 7, 4, 17, 0};
        double sum2 = student.sumArray(input2);
        if(sum2 != 76){
            verified = false;
            System.out.println("sumArray({3, 2, 10, 10, 12, 11, 7, 4, 17, 0}) returns " + sum2 + ", not 76");
        }
        if(verified){
            System.out.println("sumArray works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("sumArray does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testGetAverageValue (){
        System.out.println("====================================");
        boolean verified = true;
        StatisticalCalculator student = new StatisticalCalculator();
        double [] input = {4, 1, 8, 11, 13, 10, 7, 5, 15, 1};
        double ave1 = student.getAverageValue (input);
        if(ave1 != 7.5){
            verified = false;
            System.out.println("getAverageValue({4, 1, 8, 11, 13, 10, 7, 5, 15, 1}) returns " + ave1 + ", not 7.5");
        }
        double [] input2 = {3, 2, 10, 10, 12, 11, 7, 4, 17, 0};
        double ave2 = student.getAverageValue(input2);
        if(ave2 != 7.6){
            verified = false;
            System.out.println("getAverageValue({3, 2, 10, 10, 12, 11, 7, 4, 17, 0}) returns " + ave2 + ", not 7.6");
        }
        if(verified){
            System.out.println("getAverageValue works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("getAverageValue does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testGetMedianValue(){
        System.out.println("====================================");
        boolean verified = true;
        StatisticalCalculator student = new StatisticalCalculator();
        double [] input = {1, 1, 4, 5, 9, 10, 11, 13, 15, 30, 80};
        double median1 = student.getMedianValue(input);
        if(median1 != 10){
            verified = false;
            System.out.println("getMedianValue({1, 1, 4, 5, 9, 10, 11, 13, 15, 30, 80}) returns " + median1 + ", not 10");
        }
        double [] input2 = {1, 1, 4, 5, 9, 10, 11, 13, 15, 30};
        double median2 = student.getMedianValue(input2);
        if(median2 != 9.5){
            verified = false;
            System.out.println("getMedianValue({1, 1, 4, 5, 9, 10, 11, 13, 15, 30}) returns " + median2 + ", not 9.5");
        }
        if(verified){
            System.out.println("getMedianValue works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("getMedianValue does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testStandardDeviation (){
        System.out.println("====================================");
        boolean verified = true;
        StatisticalCalculator student = new StatisticalCalculator();
        // {4, 1, 8, 11, 13, 10, 7, 5, 15, 1}

        // sum = 75
        // ave = 7.5
        // deviation = 4.5661800227323

        // {3, 2, 10, 10, 12, 11, 7, 4, 17, 0}

        // sum = 76
        // ave = 7.6
        // deviation = 5.0438080851674
        double [] input = {4, 1, 8, 11, 13, 10, 7, 5, 15, 1};
        double dev1 = student.standardDeviation (input);
        if(Math.abs(dev1 - 4.5661800227323) > .000001){
            verified = false;
            System.out.println("standardDeviation({4, 1, 8, 11, 13, 10, 7, 5, 15, 1}) returns " + dev1 + ", not 4.5661800227323");
        }
        double [] input2 = {3, 2, 10, 10, 12, 11, 7, 4, 17, 0};
        double dev2 = student.standardDeviation(input2);
        if(Math.abs(dev2 - 5.0438080851674) > .000001){
            verified = false;
            System.out.println("standardDeviation({3, 2, 10, 10, 12, 11, 7, 4, 17, 0}) returns " + dev2 + ", not 5.0438080851674");
        }
        if(verified){
            System.out.println("standardDeviation works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("standardDeviation does NOT work");
            System.out.println("====================================");
            return false;
        }
    }
    //-0.766505039787205, -1.4235093596048092, 0.10950071996960072, 0.766505039787205, 1.2045079196656079, 0.5475035998480036, -0.10950071996960072, -0.5475035998480036, 1.6425107995440107, -1.4235093596048092,
    public static boolean testGetDeviations (){
        System.out.println("====================================");
        boolean verified = true;
        StatisticalCalculator student = new StatisticalCalculator();

        double [] input = {4, 1, 8, 11, 13, 10, 7, 5, 15, 1};
        double[] correctDeviations = {-0.766505039787205, -1.4235093596048092, 0.10950071996960072, 0.766505039787205, 1.2045079196656079, 0.5475035998480036, -0.10950071996960072, -0.5475035998480036, 1.6425107995440107, -1.4235093596048092};
        double[] deviations = student.getDeviations(input);
        if(deviations.length != correctDeviations.length){
            verified = false;
            System.out.println("Did not return an array of values that is the correct size");
        }else{
            for(int i = 0; i < deviations.length; i++){
                if(Math.abs(correctDeviations[i] - deviations[i]) > .000001){
                    verified = false;
                    System.out.println("The deviation of the element at index " + i + " is indicated as " + deviations[i] + " but should be " + correctDeviations[i]);
                }
            }
        }

        if(verified){
            System.out.println("getDeviations works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("getDeviations does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testGetCorrelation (){
        System.out.println("====================================");
        boolean verified = true;
        StatisticalCalculator student = new StatisticalCalculator();

        double [] x1s = {4, 1, 8, 11, 13, 10, 7, 5, 15, 1};
        double [] y1s = {3, 2, 10, 10, 12, 11, 7, 4, 17, 0};
        double corr1 = student.getCorrelation(x1s, y1s);
        if(Math.abs(corr1 - 0.9726) > .001){
            verified = false;
            System.out.println("getCorrelation({4, 1, 8, 11, 13, 10, 7, 5, 15, 1}, {3, 2, 10, 10, 12, 11, 7, 4, 17, 0}) returns " + corr1 + ", not 0.9726");
        }
        double [] x2s = {4, 1, 8, 11, 13, 10, 7, 5, 15, 1};
        double [] y2s = {4, 1, 8, 11, 13, 10, 7, 5, 15, 1};
        double corr2 = student.getCorrelation(x2s, y2s);
        if(Math.abs(corr2 - 1) > .001){
            verified = false;
            System.out.println("getCorrelation({4, 1, 8, 11, 13, 10, 7, 5, 15, 1}, {4, 1, 8, 11, 13, 10, 7, 5, 15, 1}) returns " + corr2 + ", not 1");
        }
        double [] x3s = {4, 1, 8, 11, 13, 10, 7, 5, 15, 1};
        double [] y3s = {17, 13, 9, 11, 6, 8, 12, 16, 2, 20};
        double corr3 = student.getCorrelation(x3s, y3s);
        if(Math.abs(corr3 - (-0.8901)) > .001){
            verified = false;
            System.out.println("getCorrelation({4, 1, 8, 11, 13, 10, 7, 5, 15, 1}, {17, 13, 9, 11, 6, 8, 12, 16, 2, 20}) returns " + corr3 + ", not -0.8901");
        }
        double [] x4s = {4, 1, 8, 11, 13, 10, 7, 5, 15, 1};
        double [] y4s = {14, 11, 18, 11, 13, 10, 17, 15, 15, 11};
        double corr4 = student.getCorrelation(x4s, y4s);
        if(Math.abs(corr4 - 0.1548) > .001){
            verified = false;
            System.out.println("getCorrelation({4, 1, 8, 11, 13, 10, 7, 5, 15, 1}, {14, 11, 18, 11, 13, 10, 17, 15, 15, 11}) returns " + corr4 + ", not 0.1548");
        }
        if(verified){
            System.out.println("getCorrelation works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("getCorrelation does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

}