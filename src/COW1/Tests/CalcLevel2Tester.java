package COW1.Tests;

import COW1.Calculator2;

public class CalcLevel2Tester
{
    public static boolean testLevel2(){
        boolean volPrism = testVolOfRectPrism();
        boolean areaTriangle = testAreaOfTriangle();
        boolean FtoC = testcalcFahrenheitToCelsius();
        boolean CtoF = testcalcCelsiusToFahrenheit();
        boolean slope = testcalcSlope();

        if(volPrism && areaTriangle && FtoC && CtoF && slope){
            System.out.println("Level 2 works");
            return true;
        }else{
            System.out.println("Level 2 DOES NOT work");
            return false;
        }
    }

    public static boolean testVolOfRectPrism(){
        Calculator2 student = new Calculator2();
        boolean output = true;

        double [] doubleAValues = {102175.0, 13503.0, 431.0, 197525.0, 143.0, 63.0, 14292.0, 146167.0, 159224.0, 14.0, 455.0, 194.0, 180056.0, 169568.0, 18336.0, 3708.0, 8742.0, 18921.0, 115780.0, 1865.0, 9.0, 19318.0, 18.0, 19400.0, 153111.0, 867.0, 1.0, 0.0, 37.0, 1190.0, 12694.0, 11.0, 197412.0, 9696.0, 1581.0, 1745.0, 1747.0, 2.0, 1.0, 98.0, };
        double [] doubleBValues = {46.0, 6444.0, 8.0, 168626.0, 18.0, 11.0, 64918.0, 13532.0, 193242.0, 14622.0, 13.0, 904.0, 469.0, 5025.0, 14331.0, 3.0, 12137.0, 103.0, 104.0, 18129.0, 764.0, 184.0, 24.0, 1332.0, 170284.0, 13.0, 16.0, 3.0, 1772.0, 12.0, 618.0, 318.0, 167538.0, 482.0, 14690.0, 8444.0, 4931.0, 19.0, 9.0, 191.0, };
        double [] doubleCValues = {1052.0, 7617.0, 1838.0, 108200.0, 8.0, 16698.0, 15.0, 801.0, 0.0, 587.0, 1657.0, 59172.0, 165.0, 5853.0, 18420.0, 5807.0, 78.0, 3.0, 16.0, 97.0, 115004.0, 6.0, 1892.0, 235.0, 14.0, 84965.0, 6592.0, 186.0, 64273.0, 12.0, 83.0, 11858.0, 97176.0, 25443.0, 154.0, 1918.0, 85.0, 5.0, 834.0, 7.0, };
        double [] resultValues = {4.9444526E9, 6.62780549844E11, 6337424.0, 3.60390944033E15, 20592.0, 1.1571714E7, 1.391712084E10, 1.584323407044E12, 0.0, 1.20163596E8, 9801155.0, 1.0377348672E10, 1.393363356E10, 4.9872195576E12, 4.84028263872E12, 6.4597068E7, 8.275929012E9, 5846589.0, 1.9265792E8, 3.279626745E9, 7.90767504E8, 2.1327072E7, 817344.0, 6.072588E9, 3.65012949336E11, 9.57640515E8, 105472.0, 0.0, 4.213994972E9, 171360.0, 6.51126036E8, 4.1479284E7, 3.214000156683456E15, 1.18907148096E11, 3.57663306E9, 2.826130804E10, 7.32228845E8, 190.0, 7506.0, 131026.0, };

        for(int i = 0; i < doubleAValues.length; i++){
            if(Math.abs(student.calcVolOfRectPrism(doubleAValues[i], doubleBValues[i], doubleCValues[i]) - resultValues[i])/resultValues[i] >= .00001){
                System.out.println("calcVolOfRectPrism failed, " + "calcVolOfRectPrism(" + doubleAValues[i] + ", " + doubleBValues[i] + ", " + doubleCValues[i] + ")" + " results in " + student.calcVolOfRectPrism(doubleAValues[i], doubleBValues[i], doubleCValues[i]) + ", not equal to " + resultValues[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("calcVolOfRectPrism works");
        }else{
            System.out.println("calcVolOfRectPrism does not work");
        }
        return output;
    }

    public static boolean testAreaOfTriangle(){
        Calculator2 student = new Calculator2();
        boolean output = true;

        double [] doubleAValues = {7.0, 17.0, 1702.0, 198.0, 701.0, 19485.0, 6839.0, 134.0, 15.0, 5627.0, 6.0, 19.0, 13.0, 183492.0, 515.0, 5436.0, 8.0, 86075.0, 19.0, 7115.0, 187.0, 412.0, 13.0, 16388.0, 11806.0, 16.0, 823.0, 134370.0, 1757.0, 1480.0, 186962.0, 160788.0, 2.0, 38.0, 81460.0, 93.0, 15807.0, 36732.0, 18889.0, 103.0, };
        double [] doubleBValues = {13956.0, 0.0, 192.0, 8263.0, 7.0, 1874.0, 153.0, 183061.0, 189.0, 86591.0, 17853.0, 11965.0, 143552.0, 1145.0, 3737.0, 49.0, 131241.0, 14142.0, 44.0, 16278.0, 139851.0, 124.0, 88.0, 819.0, 147988.0, 10.0, 10.0, 897.0, 1695.0, 95.0, 14.0, 69.0, 41937.0, 9062.0, 5.0, 68789.0, 59314.0, 3388.0, 401.0, 1801.0, };
        double [] resultValues = {48846.0, 0.0, 163392.0, 818037.0, 2453.5, 1.8257445E7, 523183.5, 1.2265087E7, 1417.5, 2.436237785E8, 53559.0, 113667.5, 933088.0, 1.0504917E8, 962277.5, 133182.0, 524964.0, 6.08636325E8, 418.0, 5.7908985E7, 1.30760685E7, 25544.0, 572.0, 6710886.0, 8.73573164E8, 80.0, 4115.0, 6.0264945E7, 1489057.5, 70300.0, 1308734.0, 5547186.0, 41937.0, 172178.0, 203650.0, 3198688.5, 4.68788199E8, 6.2224008E7, 3787244.5, 92751.5, };

        for(int i = 0; i < doubleAValues.length; i++){
            if(Math.abs(student.calcAreaOfTriangle(doubleAValues[i], doubleBValues[i]) - resultValues[i])/resultValues[i] >= .00001){
                System.out.println("calcAreaOfTriangle failed, " + "calcAreaOfTriangle(" + doubleAValues[i] + ", " + doubleBValues[i] + ")" + " results in " + student.calcAreaOfTriangle(doubleAValues[i], doubleBValues[i]) + ", not equal to " + resultValues[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("calcAreaOfTriangle works");
        }else{
            System.out.println("calcAreaOfTriangle does not work");
        }
        return output;
    }





    public static boolean testcalcFahrenheitToCelsius(){
        Calculator2 student = new Calculator2();
        boolean output = true;

        double [] doubleXValues = {-451.67, 6428.33, 102.32999999999998, 18149.33, 6641.33, 425.33, -429.67, 4441.33, 339.33, -455.67, -327.67, 776.3299999999999, -442.67, 33.329999999999984, 11521.33, 5996.33, 930.3299999999999, -454.67, -87.67000000000002, 953.3299999999999, -456.67, -446.67, -323.67, -116.67000000000002, 1349.33, -317.67, 114.32999999999998, -412.67, 2186.33, 11148.33, -53.670000000000016, -449.67, -70.67000000000002, -131.67000000000002, 1391.33, -456.67, -282.67, 16210.33, -334.67, -400.67, };
        double [] resultValues = {-268.7055555555556, 3553.5166666666664, 39.072222222222216, 10065.183333333334, 3671.85, 218.51666666666665, -256.48333333333335, 2449.6277777777777, 170.73888888888888, -270.9277777777778, -199.81666666666666, 413.5166666666666, -263.7055555555556, 0.73888888888888, 6382.961111111111, 3313.5166666666664, 499.0722222222222, -270.3722222222222, -66.48333333333333, 511.84999999999997, -271.48333333333335, -265.9277777777778, -197.59444444444443, -82.59444444444445, 731.8499999999999, -194.26111111111112, 45.73888888888888, -247.0388888888889, 1196.85, 6175.738888888889, -47.594444444444456, -267.59444444444443, -57.0388888888889, -90.92777777777779, 755.1833333333333, -271.48333333333335, -174.81666666666666, 8987.961111111112, -203.70555555555555, -240.37222222222223, };

        for(int i = 0; i < doubleXValues.length; i++){
            if(Math.abs(student.calcFahrenheitToCelsius(doubleXValues[i]) - resultValues[i])/resultValues[i] >= .00001){
                System.out.println("calcFahrenheitToCelsius failed, " + "calcFahrenheitToCelsius(" + doubleXValues[i] + ")" + " results in " + student.calcFahrenheitToCelsius(doubleXValues[i]) + ", not equal to " + resultValues[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("calcFahrenheitToCelsius works");
        }else{
            System.out.println("calcFahrenheitToCelsius does not work");
        }
        return output;
    }

    public static boolean testcalcCelsiusToFahrenheit(){
        Calculator2 student = new Calculator2();
        boolean output = true;

        double [] doubleXValues = {-259.15, -130.14999999999998, 4869.85, -148.14999999999998, -255.14999999999998, 4253.85, 313.85, 5531.85, 193.85000000000002, 16818.85, 931.85, 9034.85, -232.14999999999998, 8966.85, -267.15, 8181.85, -210.14999999999998, 917.85, -234.14999999999998, -256.15, -139.14999999999998, 11145.85, -264.15, 4932.85, -257.15, -208.14999999999998, -227.14999999999998, 5289.85, 1078.85, 343.85, -270.15, 14611.85, 18817.85, 1486.85, -141.14999999999998, -259.15, 18840.85, 211.85000000000002, 2620.85, -263.15, };
        double [] resultValues = {-434.46999999999997, -202.26999999999995, 8797.730000000001, -234.66999999999996, -427.27, 7688.930000000001, 596.9300000000001, 9989.330000000002, 380.93000000000006, 30305.929999999997, 1709.3300000000002, 16294.730000000001, -385.86999999999995, 16172.330000000002, -448.86999999999995, 14759.330000000002, -346.27, 1684.13, -389.46999999999997, -429.07, -218.46999999999997, 20094.530000000002, -443.46999999999997, 8911.130000000001, -430.86999999999995, -342.66999999999996, -376.86999999999995, 9553.730000000001, 1973.9299999999998, 650.9300000000001, -454.27, 26333.33, 33904.13, 2708.33, -222.06999999999996, -434.46999999999997, 33945.53, 413.33000000000004, 4749.53, -441.66999999999996, };

        for(int i = 0; i < doubleXValues.length; i++){
            if(Math.abs(student.calcCelsiusToFahrenheit(doubleXValues[i]) - resultValues[i])/resultValues[i] >= .00001){
                System.out.println("calcCelsiusToFahrenheit failed, " + "calcCelsiusToFahrenheit(" + doubleXValues[i] + ")" + " results in " + student.calcCelsiusToFahrenheit(doubleXValues[i]) + ", not equal to " + resultValues[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("calcCelsiusToFahrenheit works");
        }else{
            System.out.println("calcCelsiusToFahrenheit does not work");
        }
        return output;
    }

    public static boolean testcalcSlope(){
        Calculator2 student = new Calculator2();
        boolean output = true;

        double [] doubleAValues = {27.0, 1.0, -63.0, -10.0, 103.0, -36.0, -515.0, -2.0, 612.0, 960.0, -89.0, -85.0, -100.0, 64.0, 982.0, -40.0, 7.0, 93.0, 312.0, 42.0, -71.0, -501.0, -702.0, -64.0, 20.0, -22.0, -47.0, -76.0, -168.0, -3.0, 96.0, -977.0, 5.0, -755.0, -766.0, -7.0, 27.0, -28.0, -290.0, 578.0, };
        double [] doubleBValues = {94.0, 97.0, 9.0, -8.0, 1.0, -492.0, -554.0, 89.0, 3.0, -976.0, -448.0, 76.0, 32.0, 429.0, -2.0, 31.0, -727.0, 5.0, -538.0, -807.0, -16.0, -112.0, 8.0, -53.0, -7.0, -8.0, -47.0, 24.0, -7.0, 265.0, -13.0, 7.0, 188.0, -852.0, -277.0, -9.0, -468.0, 27.0, -613.0, 727.0, };
        double [] doubleCValues = {183.0, -10.0, -6.0, -1.0, -3.0, -41.0, -10.0, 14.0, -23.0, -1.0, -6.0, 492.0, 26.0, -6.0, 4.0, 150.0, -310.0, -6.0, -4.0, 63.0, 617.0, 0.0, -232.0, 17.0, 27.0, 391.0, -85.0, 582.0, -54.0, -18.0, -528.0, 54.0, 7.0, -65.0, -70.0, -6.0, 96.0, -156.0, 4.0, -18.0, };
        double [] doubleDValues = {-2.0, 381.0, 8.0, -1.0, 1.0, -10.0, -453.0, 629.0, 1.0, -276.0, 22.0, 5.0, 459.0, -72.0, -97.0, -10.0, -69.0, -977.0, 258.0, 521.0, 75.0, -19.0, 9.0, 23.0, -48.0, 84.0, -107.0, 44.0, 35.0, 0.0, -81.0, -993.0, -29.0, -914.0, 25.0, 59.0, 1.0, 52.0, 38.0, 3.0, };
        double [] resultValues = {-0.6153846153846154, -25.818181818181817, -0.017543859649122806, 0.7777777777777778, -0.0, -96.4, 0.2, 33.75, 0.0031496062992125984, -0.72840790842872, 5.662650602409639, -0.12305025996533796, 3.388888888888889, 7.1571428571428575, 0.09713701431492842, -0.21578947368421053, -2.0757097791798107, 9.919191919191919, -2.518987341772152, 63.23809523809524, 0.13226744186046513, 0.18562874251497005, 0.002127659574468085, 0.9382716049382716, -5.857142857142857, 0.22276029055690072, 1.5789473684210527, 0.030395136778115502, 0.3684210526315789, 17.666666666666668, 0.10897435897435898, -0.9699321047526673, -108.5, -0.08985507246376812, 0.4339080459770115, 68.0, 6.797101449275362, -0.1953125, 2.2142857142857144, 1.2147651006711409, };

        for(int i = 0; i < doubleAValues.length; i++){
            if(Math.abs(student.calcSlope(doubleAValues[i], doubleBValues[i], doubleCValues[i], doubleDValues[i]) - resultValues[i])/resultValues[i] >= .00001){
                System.out.println("calcSlope failed, " + "calcSlope(" + doubleAValues[i] + ", " + doubleBValues[i]  + ", " + doubleCValues[i]  + ", " + doubleDValues[i]  + ")" + " results in " + student.calcSlope(doubleAValues[i], doubleBValues[i], doubleCValues[i], doubleDValues[i]) + ", not equal to " + resultValues[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("calcSlope works");
        }else{
            System.out.println("calcSlope does not work");
        }
        return output;
    }
}
