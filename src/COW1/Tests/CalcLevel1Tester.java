package COW1.Tests;

import COW1.Calculator1;

public class CalcLevel1Tester
{
    public static boolean testLevel1(){
        boolean square = testSquare();
        boolean series = testcalcResistanceInSeries();
        boolean areaRectangle = testAreaOfRectangle();
        boolean milesPerHour = testCalcMilesPerHour();
        boolean profit = testGetProfit();
        if(square && series && areaRectangle && milesPerHour && profit){
            System.out.println("Level 1 works");
            return true;
        }else{
            System.out.println("Level 1 DOES NOT work");
            return false;
        }
    }

    public static boolean testSquare(){
        Calculator1 student = new Calculator1();
        boolean output = true;

        double [] doubleXValues = {1208.0, 1.0, 2815.0, 110.0, 30.0, 180.0, 961.0, 16.0, 1564.0, 9.0, 124.0, 11.0, 1722.0, 12.0, 105.0, 10135.0, 4.0, 17.0, 2448.0, 183.0, 111.0, 1489.0, 11.0, 11202.0, 327.0, 11311.0, 1399.0, 18341.0, 6.0, 90.0, 1989.0, 111.0, 80.0, 866.0, 17719.0, 1525.0, 18556.0, 179.0, 6806.0, 15678.0, };
        double [] resultValues = {1459264.0, 1.0, 7924225.0, 12100.0, 900.0, 32400.0, 923521.0, 256.0, 2446096.0, 81.0, 15376.0, 121.0, 2965284.0, 144.0, 11025.0, 1.02718225E8, 16.0, 289.0, 5992704.0, 33489.0, 12321.0, 2217121.0, 121.0, 1.25484804E8, 106929.0, 1.27938721E8, 1957201.0, 3.36392281E8, 36.0, 8100.0, 3956121.0, 12321.0, 6400.0, 749956.0, 3.13962961E8, 2325625.0, 3.44325136E8, 32041.0, 4.6321636E7, 2.45799684E8, };

        for(int i = 0; i < doubleXValues.length; i++){
            if(Math.abs(student.calcAreaOfSquare(doubleXValues[i]) - resultValues[i])/resultValues[i] >= .00001){
                System.out.println("square failed, " + "calcAreaOfSquare(" + doubleXValues[i] + ")" + " results in " + student.calcAreaOfSquare(doubleXValues[i]) + ", not equal to " + resultValues[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("calcAreaOfSquare works");
        }else{
            System.out.println("calcAreaOfSquare does not work");
        }
        return output;
    }

    public static boolean testcalcResistanceInSeries(){
        Calculator1 student = new Calculator1();
        boolean output = true;

        double [] doubleAValues = {2437.0, 769.0, 88975.0, 0.0, 1067.0, 140529.0, 1397.0, 198961.0, 9115.0, 14701.0, 13054.0, 1050.0, 10346.0, 1916.0, 4.0, 49864.0, 170116.0, 50975.0, 148730.0, 1972.0, 15.0, 17581.0, 18.0, 361.0, 58.0, 7259.0, 2.0, 168.0, 1827.0, 172.0, 137.0, 86.0, 5.0, 9.0, 0.0, 481.0, 20.0, 172.0, 1502.0, 268.0, };
        double [] doubleBValues = {652.0, 2.0, 10.0, 6.0, 19746.0, 113080.0, 57.0, 195897.0, 36.0, 14815.0, 1897.0, 127138.0, 35.0, 1526.0, 17326.0, 58902.0, 17.0, 80054.0, 18.0, 1439.0, 1502.0, 8.0, 168781.0, 16301.0, 824.0, 7975.0, 22868.0, 25111.0, 10.0, 230.0, 1782.0, 186572.0, 65350.0, 95476.0, 99.0, 902.0, 9.0, 6004.0, 10.0, 12383.0, };
        double [] resultValues = {3089.0, 771.0, 88985.0, 6.0, 20813.0, 253609.0, 1454.0, 394858.0, 9151.0, 29516.0, 14951.0, 128188.0, 10381.0, 3442.0, 17330.0, 108766.0, 170133.0, 131029.0, 148748.0, 3411.0, 1517.0, 17589.0, 168799.0, 16662.0, 882.0, 15234.0, 22870.0, 25279.0, 1837.0, 402.0, 1919.0, 186658.0, 65355.0, 95485.0, 99.0, 1383.0, 29.0, 6176.0, 1512.0, 12651.0, };

        for(int i = 0; i < doubleAValues.length; i++){
            if(Math.abs(student.calcResistanceInSeries(doubleAValues[i], doubleBValues[i]) - resultValues[i])/resultValues[i] >= .00001){
                System.out.println("calcResistanceInSeries failed, " + "calcResistanceInSeries(" + doubleAValues[i] + ", " + doubleBValues[i] + ")" + " results in " + student.calcResistanceInSeries(doubleAValues[i], doubleBValues[i]) + ", not equal to " + resultValues[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("calcResistanceInSeries works");
        }else{
            System.out.println("calcResistanceInSeries does not work");
        }
        return output;
    }

    public static boolean testAreaOfRectangle(){
        Calculator1 student = new Calculator1();
        boolean output = true;

        double [] doubleAValues = {1651.0, 12.0, 51.0, 423.0, 6889.0, 18961.0, 653.0, 148.0, 178708.0, 53.0, 130.0, 60812.0, 32546.0, 11.0, 2064.0, 33.0, 975.0, 843.0, 191550.0, 141.0, 1081.0, 191.0, 9184.0, 9.0, 16754.0, 1731.0, 81702.0, 17.0, 11.0, 184.0, 670.0, 1828.0, 4028.0, 66541.0, 146641.0, 144.0, 10.0, 18410.0, 172.0, 689.0, };
        double [] doubleBValues = {186352.0, 6458.0, 117010.0, 9588.0, 109.0, 1391.0, 133876.0, 160873.0, 171.0, 9.0, 52.0, 12599.0, 51292.0, 0.0, 199983.0, 6.0, 122274.0, 596.0, 31.0, 6.0, 19774.0, 15.0, 37773.0, 3.0, 20212.0, 99.0, 4549.0, 1057.0, 19.0, 7938.0, 94.0, 165.0, 74603.0, 7.0, 251.0, 2.0, 71569.0, 18.0, 9875.0, 62.0, };
        double [] resultValues = {3.07667152E8, 77496.0, 5967510.0, 4055724.0, 750901.0, 2.6374751E7, 8.7421028E7, 2.3809204E7, 3.0559068E7, 477.0, 6760.0, 7.66170388E8, 1.669349432E9, 0.0, 4.12764912E8, 198.0, 1.1921715E8, 502428.0, 5938050.0, 846.0, 2.1375694E7, 2865.0, 3.46907232E8, 27.0, 3.38631848E8, 171369.0, 3.71662398E8, 17969.0, 209.0, 1460592.0, 62980.0, 301620.0, 3.00500884E8, 465787.0, 3.6806891E7, 288.0, 715690.0, 331380.0, 1698500.0, 42718.0, };

        for(int i = 0; i < doubleAValues.length; i++){
            if(Math.abs(student.calcAreaOfRectangle(doubleAValues[i], doubleBValues[i]) - resultValues[i])/resultValues[i] >= .00001){
                System.out.println("calcAreaOfRectangle failed, " + "calcAreaOfRectangle(" + doubleAValues[i] + ", " + doubleBValues[i] + ")" + " results in " + student.calcAreaOfRectangle(doubleAValues[i], doubleBValues[i]) + ", not equal to " + resultValues[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("calcAreaOfRectangle works");
        }else{
            System.out.println("calcAreaOfRectangle does not work");
        }
        return output;
    }

    public static boolean testCalcMilesPerHour(){
        Calculator1 student = new Calculator1();
        boolean output = true;

        double [] doubleAValues = {-8282.0, 16.0, -5445.0, -90.0, -966.0, -1635.0, 313.0, -57047.0, 4140.0, 0.0, -83.0, -1.0, 7278.0, -2.0, -8.0, 107.0, -84306.0, 985.0, -46.0, -8.0, -1129.0, 97398.0, 80.0, -70.0, 9.0, 755.0, 602.0, 2842.0, -1063.0, -6.0, 5.0, -89.0, 592.0, 5.0, 8127.0, -19891.0, -65095.0, -23042.0, -999.0, -566.0, };
        double [] doubleBValues = {57932.0, 9356.0, 12862.0, 144.0, 192.0, 5775.0, 55.0, 19356.0, 1260.0, 4732.0, 72417.0, 88.0, 149529.0, 196449.0, 1371.0, 9338.0, 85177.0, 17.0, 150242.0, 1888.0, 3.0, 43.0, 90.0, 2933.0, 16.0, 20.0, 13036.0, 136366.0, 4254.0, 22.0, 6612.0, 341.0, 14.0, 42645.0, 1180.0, 23.0, 90.0, 815.0, 4247.0, 131996.0, };
        double [] resultValues = {-0.1429607125595526, 0.0017101325352714834, -0.42334007152853365, -0.625, -5.03125, -0.2831168831168831, 5.6909090909090905, -2.9472514982434386, 3.2857142857142856, 0.0, -0.001146139718574368, -0.011363636363636364, 0.04867283269466124, -1.0180759382842367E-5, -0.005835156819839533, 0.01145855643606768, -0.9897742348286509, 57.94117647058823, -3.0617270803104325E-4, -0.00423728813559322, -376.3333333333333, 2265.0697674418607, 0.8888888888888888, -0.02386634844868735, 0.5625, 37.75, 0.04617980975759436, 0.02084097208981711, -0.24988246356370475, -0.2727272727272727, 7.562008469449486E-4, -0.26099706744868034, 42.285714285714285, 1.1724703951225231E-4, 6.88728813559322, -864.8260869565217, -723.2777777777778, -28.27239263803681, -0.23522486461031317, -0.004288008727537198, };

        for(int i = 0; i < doubleAValues.length; i++){
            if(Math.abs(student.calcMilesPerHour(doubleAValues[i], doubleBValues[i]) - resultValues[i])/resultValues[i] >= .00001){
                System.out.println("divide failed, " + "calcMilesPerHour(" + doubleAValues[i] + ", " + doubleBValues[i] + ")" + " results in " + student.calcMilesPerHour(doubleAValues[i], doubleBValues[i]) + ", not equal to " + resultValues[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("calcMilesPerHour works");
        }else{
            System.out.println("calcMilesPerHour does not work");
        }
        return output;
    }

    public static boolean testGetProfit(){
        Calculator1 student = new Calculator1();
        boolean output = true;

        double [] doubleAValues = {-532.0, -10.0, 62.0, -1.0, 2.0, 5692.0, -8.0, -49.0, 81320.0, -488.0, -89.0, -39.0, 1.0, 33211.0, 702.0, 31413.0, -62757.0, -478.0, 48.0, 30832.0, 4512.0, 35862.0, -6835.0, -5.0, -10.0, 496.0, 4.0, -30501.0, 271.0, -54101.0, 66360.0, 8356.0, -10.0, -10.0, -79.0, -246.0, -85672.0, -7.0, 28.0, 45.0, };
        double [] doubleBValues = {310.0, 28.0, 9.0, 4.0, 1797.0, 26.0, -9153.0, 41.0, 713.0, -48.0, 13.0, -6248.0, -301.0, -92.0, 2416.0, -85341.0, -7.0, 64808.0, -6353.0, -6.0, -389.0, -54.0, 6443.0, -1.0, 22767.0, -39.0, 1.0, -24060.0, -1535.0, -8.0, -13.0, 748.0, -132.0, 726.0, -53.0, 49253.0, -37371.0, 256.0, 9097.0, -887.0, };
        double [] resultValues = {-842.0, -38.0, 53.0, -5.0, -1795.0, 5666.0, 9145.0, -90.0, 80607.0, -440.0, -102.0, 6209.0, 302.0, 33303.0, -1714.0, 116754.0, -62750.0, -65286.0, 6401.0, 30838.0, 4901.0, 35916.0, -13278.0, -4.0, -22777.0, 535.0, 3.0, -6441.0, 1806.0, -54093.0, 66373.0, 7608.0, 122.0, -736.0, -26.0, -49499.0, -48301.0, -263.0, -9069.0, 932.0, };

        for(int i = 0; i < doubleAValues.length; i++){
            if(Math.abs(student.getProfit(doubleAValues[i], doubleBValues[i]) - resultValues[i])/resultValues[i] >= .00001){
                System.out.println("getProfit failed, " + "getProfit(" + doubleAValues[i] + ", " + doubleBValues[i] + ")" + " results in " + student.getProfit(doubleAValues[i], doubleBValues[i]) + ", not equal to " + resultValues[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("getProfit works");
        }else{
            System.out.println("getProfit does not work");
        }
        return output;
    }
}
