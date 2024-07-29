package COW1.Tests;

import COW1.Calculator4;
import COW1.Calculator5;

public class CalcLevel5Tester
{

    public static boolean testLevel5(){
        boolean compoundInterest = testcalcCompoundInterest();
        boolean continousInterest = calcContinousCompoundInterest();
        boolean root = testcalcFirstRootOfQuadratic();
        boolean height = testcalcHeight();
        boolean angle = testcalcAngleOfElevation();
        if(compoundInterest && continousInterest && root && height && angle){
            System.out.println("Level 5 works");
            return true;
        }else{
            System.out.println("Level 5 DOES NOT work");
            return false;
        }
    }

    public static boolean testcalcCompoundInterest(){
        Calculator5 student = new Calculator5();
        boolean output = true;

        double [] doubleAValues = {718.0, 179.0, 71.0, 5692.0, 78.0, 4.0, 99.0, 579.0, 64.0, 859.0, 649.0, 3274.0, 6.0, 5.0, 4.0, 543.0, 829.0, 69.0, 603.0, 73.0, 4399.0, 110.0, 4646.0, 36.0, 598.0, 3793.0, 907.0, 486.0, 8825.0, 2.0, 5.0, 1285.0, 29.0, 0.0, 759.0, 1.0, 8.0, 8800.0, 8329.0, 3.0, };
        double [] doubleBValues = {0.14, 0.88, 0.2, 0.75, 0.31, 0.86, 0.33, 0.94, 0.16, 0.33, 0.13, 0.92, 0.98, 0.39, 0.86, 0.12, 0.06, 0.08, 0.07, 0.11, 0.99, 0.05, 0.12, 0.48, 0.39, 0.14, 0.61, 0.51, 0.59, 0.65, 0.93, 0.78, 0.43, 0.29, 0.13, 0.21, 0.72, 0.44, 0.43, 0.08, };
        double [] doubleCValues = {48.0, 6.0, 85.0, 4.0, 7.0, 3.0, 6.0, 1.0, 0.0, 9.0, 52.0, 0.0, 1.0, 16.0, 9.0, 7.0, 96.0, 4.0, 3.0, 1.0, 80.0, 3.0, 3.0, 19.0, 22.0, 7.0, 62.0, 7.0, 1.0, 3.0, 70.0, 26.0, 7.0, 16.0, 8.0, 2.0, 1.0, 90.0, 9.0, 2.0, };
        double [] doubleDValues = {19.0, 1.0, 78.0, 9.0, 0.0, 8.0, 94.0, 9.0, 32.0, 9.0, 5.0, 0.0, 67.0, 72.0, 51.0, 4.0, 31.0, 6.0, 4.0, 27.0, 1.0, 1.0, 6.0, 96.0, 42.0, 9.0, 20.0, 4.0, 8.0, 31.0, 1.0, 9.0, 3.0, 23.0, 75.0, 72.0, 26.0, 0.0, 9.0, 3.0, };
        double [] resultValues = {10225.071041840432, 406.88919578320036, 4.152352039205107E8, 2767420.477042632, 78.0, 1695.2946449339754, 1.2883160817139605E15, 225368.97687602852, 64.0, 15876.80251155046, 1242.1779986112242, 3274.0, 4.515636740306646E20, 5.593768615175797E12, 6.2266164789737503E18, 873.9659868528489, 5322.184653569612, 110.98217021379061, 795.2849450626366, 1221.9214464643876, 11767.031604394027, 115.5921759259259, 9411.943530448661, 2.0892182000602894E21, 6.731728179747886E9, 13206.680266420784, 1.6986542997372845E8, 3481.8446079107275, 360488.7439062389, 1.6672076760993806E8, 12.595180414012754, 1296622.963154895, 101.41547907921932, 0.0, 1.2038626404427797E7, 1754559.2357862955, 1.0637255885743905E7, 8800.0, 365087.2861003665, 3.7959570554880013, };

        for(int i = 0; i < doubleAValues.length; i++){
            if(Math.abs(student.calcCompoundInterest(doubleAValues[i], doubleBValues[i], doubleCValues[i], doubleDValues[i]) - resultValues[i])/resultValues[i] >= .00001){
                System.out.println("calcCompoundInterest failed, " + "calcCompoundInterest(" + doubleAValues[i] + ", " + doubleBValues[i]  + ", " + doubleCValues[i]  + ", " + doubleDValues[i]  + ")" + " results in " + student.calcCompoundInterest(doubleAValues[i], doubleBValues[i], doubleCValues[i], doubleDValues[i]) + ", not equal to " + resultValues[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("calcCompoundInterest works");
        }else{
            System.out.println("calcCompoundInterest does not work");
        }
        return output;
    }

    public static boolean calcContinousCompoundInterest(){
        Calculator5 student = new Calculator5();
        boolean output = true;

        double [] doubleAValues = {795.0, 10.0, 5.0, 9478.0, 28.0, 90.0, 9.0, 2647.0, 8.0, 28.0, 12.0, 2.0, 8354.0, 748.0, 54.0, 2828.0, 16.0, 3815.0, 65.0, 8317.0, 1.0, 62.0, 449.0, 4.0, 9805.0, 234.0, 0.0, 59.0, 18.0, 58.0, 67.0, 2888.0, 762.0, 573.0, 78.0, 1311.0, 4.0, 15.0, 944.0, 569.0, };
        double [] doubleBValues = {0.0, 0.08, 0.92, 0.77, 0.85, 0.28, 0.49, 0.1, 0.81, 0.26, 0.35, 0.91, 0.03, 0.6, 0.45, 0.76, 0.11, 0.04, 0.44, 0.3, 0.48, 0.3, 0.26, 0.21, 0.72, 0.97, 0.94, 0.66, 0.62, 0.47, 0.84, 0.91, 0.27, 0.72, 0.98, 0.75, 0.59, 0.82, 0.58, 0.46, };
        double [] doubleCValues = {30.0, 56.0, 6.0, 2.0, 80.0, 2.0, 60.0, 10.0, 9.0, 6.0, 5.0, 4.0, 9.0, 8.0, 5.0, 4.0, 92.0, 5.0, 8.0, 6.0, 3.0, 52.0, 7.0, 73.0, 56.0, 8.0, 43.0, 9.0, 7.0, 81.0, 2.0, 71.0, 1.0, 20.0, 80.0, 2.0, 9.0, 8.0, 88.0, 1.0, };
        double [] resultValues = {795.0, 882.3467267565151, 1248.1751859484696, 44210.986588425454, 9.531972939808874E30, 157.56052502664912, 5.278375439247292E13, 7195.2919999310925, 11724.565577631887, 133.24699486385992, 69.05523211206877, 76.18367345079804, 10943.443021425548, 90889.79230401367, 512.3377351633604, 59120.02786884232, 397356.3333610458, 4659.651522381048, 2195.987850150221, 50314.917961522464, 4.220695816996552, 3.6930535681744605E8, 2771.164443997716, 1.8188395906012464E7, 3.178345523444888E21, 548707.6776345589, 0.0, 22416.16084275038, 1380.7357080893207, 1.98161335099687014E18, 359.4922500651723, 3.314085164905654E31, 998.1929114587344, 1.0280048447033595E9, 8.72533246207195E35, 5875.494371213203, 809.4009135525899, 10594.075418930486, 1.3847212298511785E25, 901.3380974618601, };

        for(int i = 0; i < doubleAValues.length; i++){
            if(Math.abs(student.calcContinousCompoundInterest(doubleAValues[i], doubleBValues[i], doubleCValues[i]) - resultValues[i])/resultValues[i] >= .00001){
                System.out.println("calcContinousCompoundInterest failed, " + "calcContinousCompoundInterest(" + doubleAValues[i] + ", " + doubleBValues[i] + ", " + doubleCValues[i] + ")" + " results in " + student.calcContinousCompoundInterest(doubleAValues[i], doubleBValues[i], doubleCValues[i]) + ", not equal to " + resultValues[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("calcContinousCompoundInterest works");
        }else{
            System.out.println("calcContinousCompoundInterest does not work");
        }
        return output;
    }

    public static boolean testcalcFirstRootOfQuadratic(){
        Calculator5 student = new Calculator5();
        boolean output = true;

        double [] doubleAValues = {-8.0, 6.0, -93.0, -191.0, -97.0, 64.0, 28.0, -198.0, 791.0, 390.0, 8.0, 9.0, -673.0, -174.0, -849.0, 36.0, -6.0, -49.0, -25.0, -895.0, 358.0, 7.0, -677.0, 17.0, -60.0, -1.0, -402.0, -10.0, -1.0, -7.0, -77.0, -61.0, -766.0, 0.0, -236.0, 4.0, 1.0, -50.0, -14.0, 94.0, };
        double [] doubleBValues = {-2.0, 708.0, 406.0, -9.0, -49.0, 3.0, 9.0, -89.0, 16.0, 3.0, -5.0, -38.0, 73.0, 24.0, -69.0, -85.0, -97.0, 102.0, 19.0, 983.0, -21.0, 7.0, 645.0, 5.0, 2.0, 9.0, -55.0, 51.0, 652.0, -5.0, -13.0, -867.0, -97.0, 2.0, -74.0, 592.0, -590.0, -10.0, 952.0, 50.0, };
        double [] doubleCValues = {42.0, -86.0, -408.0, -5.0, 882.0, -604.0, -96.0, 121.0, -3.0, 39.0, 9.0, 4.0, 788.0, -879.0, 2.0, -12.0, -1.0, 888.0, -61.0, 47.0, 68.0, -758.0, -931.0, -683.0, 201.0, 34.0, 467.0, 3.0, -100.0, -1.0, -2.0, -10.0, -4.0, 2.0, -7.0, -64.0, -8.0, -8.0, -91.0, 770.0, };
        double [] resultValues = {-2.4196949688357274, 0.1213441434929905, 1.5683851773263806, Double.NaN, -3.2785612599820104, 3.0487033360305116, 1.6978874764187653, -1.0381493056505517, 0.05229580301996199, Double.NaN, Double.NaN, 4.114195153035549, -1.0291940843964744, Double.NaN, -0.10393691558184996, 2.4947263028659723, -16.15635080582224, -3.3416199371433404, Double.NaN, -0.04589502894668814, Double.NaN, 9.918047527522337, Double.NaN, 6.193138088697617, -1.813709736638888, -2.8654599313281173, -1.1483946227588469, -0.058160271148995336, 0.15341032933918086, Double.NaN, Double.NaN, -14.201571353572596, Double.NaN, Double.NaN, Double.NaN, 0.10802925459562118, 590.0135590104292, Double.NaN, 0.09572298367062818, Double.NaN, };

        for(int i = 0; i < doubleAValues.length; i++){
            if(Math.abs(student.calcFirstRootOfQuadratic(doubleAValues[i], doubleBValues[i], doubleCValues[i]) - resultValues[i])/resultValues[i] >= .00001){
                System.out.println("calcFirstRootOfQuadratic failed, " + "calcFirstRootOfQuadratic(" + doubleAValues[i] + ", " + doubleBValues[i] + ", " + doubleCValues[i] + ")" + " results in " + student.calcFirstRootOfQuadratic(doubleAValues[i], doubleBValues[i], doubleCValues[i]) + ", not equal to " + resultValues[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("calcFirstRootOfQuadratic works");
        }else{
            System.out.println("calcFirstRootOfQuadratic does not work");
        }
        return output;
    }

    public static boolean testcalcHeight(){
        Calculator5 student = new Calculator5();
        boolean output = true;

        double [] doubleAValues = {0.0, 84.0, 88.0, 80.0, 48.0, 73.0, 73.0, 0.0, 35.0, 82.0, 16.0, 49.0, 58.0, 33.0, 58.0, 84.0, 25.0, 79.0, 49.0, 20.0, 63.0, 80.0, 59.0, 0.0, 63.0, 33.0, 48.0, 13.0, 29.0, 59.0, 12.0, 77.0, 22.0, 77.0, 88.0, 50.0, 4.0, 27.0, 61.0, 5.0, };
        double [] doubleBValues = {18181.0, 0.0, 4.0, 15.0, 59006.0, 3962.0, 17.0, 3.0, 1734.0, 10.0, 10.0, 92218.0, 81926.0, 60837.0, 12.0, 198.0, 1899.0, 217.0, 1925.0, 93322.0, 126.0, 107380.0, 11137.0, 3.0, 18876.0, 6209.0, 84994.0, 199.0, 1538.0, 77895.0, 179585.0, 1720.0, 163981.0, 110.0, 7443.0, 11287.0, 17786.0, 19.0, 3.0, 189.0, };
        double [] resultValues = {0.0, 0.0, 114.54501313166206, 85.0692272942656, 65532.80205001135, 12959.118074434164, 55.60449451423039, 0.0, 1214.1598712556367, 71.15369722384207, 2.867453857588079, 106084.67377710703, 131109.0066262171, 39508.00974735694, 19.204014348492606, 1883.8441619360722, 885.5182428363423, 1116.3682214655566, 2214.459183900443, 33966.43020219053, 247.28892369364894, 608982.2417905494, 18535.080594937714, 0.0, 37046.23590191522, 4032.171746163342, 94395.40008539241, 45.94277003398705, 852.5273211343587, 129639.05027769355, 38171.97012751092, 7450.138503768743, 66252.62453867485, 476.4623461712568, 213139.63318474017, 13451.322799610849, 1243.7182772272763, 9.680983540394147, 5.4121432658142705, 16.535357406399637, };

        for(int i = 0; i < doubleAValues.length; i++){
            if(Math.abs(student.calcHeight(doubleAValues[i], doubleBValues[i]) - resultValues[i])/resultValues[i] >= .00001){
                System.out.println("calcHeight failed, " + "calcHeight(" + doubleAValues[i] + ", " + doubleBValues[i] + ")" + " results in " + student.calcHeight(doubleAValues[i], doubleBValues[i]) + ", not equal to " + resultValues[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("calcHeight works");
        }else{
            System.out.println("calcHeight does not work");
        }
        return output;
    }

    public static boolean testcalcAngleOfElevation(){
        Calculator5 student = new Calculator5();
        boolean output = true;

        double [] doubleAValues = {187.0, 1206.0, 199.0, 12.0, 7.0, 150.0, 4.0, 31.0, 466.0, 155.0, 166.0, 110.0, 166.0, 990.0, 30.0, 19.0, 815.0, 160.0, 106.0, 3.0, 11.0, 92.0, 1.0, 1.0, 1.0, 1920.0, 107.0, 684.0, 17.0, 133.0, 576.0, 1548.0, 138.0, 47.0, 13.0, 25.0, 6.0, 6.0, 64.0, 17.0, };
        double [] doubleBValues = {9.0, 276.0, 16.0, 111.0, 39.0, 11.0, 1595.0, 695.0, 135.0, 1043.0, 4.0, 10.0, 2.0, 132.0, 12.0, 112.0, 762.0, 166.0, 11.0, 181.0, 146.0, 100.0, 185.0, 68.0, 270.0, 125.0, 513.0, 1.0, 513.0, 194.0, 124.0, 7.0, 17.0, 185.0, 1595.0, 4.0, 5.0, 55.0, 119.0, 54.0, };
        double [] resultValues = {87.24457529949724, 77.10951937024863, 85.40319247029053, 6.1701750950296095, 10.175510843043206, 85.80581721160915, 0.1436881740383142, 2.5539462534811026, 73.84372024567733, 8.452848771420404, 88.61964592655556, 84.8055710922652, 89.30972280213493, 82.40535663140855, 68.19859051364818, 9.628156128486703, 46.924878740767525, 43.94559549647816, 84.0754180180175, 0.9495668564358234, 4.308664916524875, 42.614055969611194, 0.3097038999588388, 0.8425242607404146, 0.21220562048812272, 86.27506286658964, 11.781668501991446, 89.91623430015846, 1.8979959887588933, 34.43324939903389, 77.85090839255867, 89.74091232370289, 82.97720616442679, 14.254650718226664, 0.46697720434635837, 80.90972307917767, 50.19442890773481, 6.225829064425768, 28.27203607943271, 17.47477425625567, };

        for(int i = 0; i < doubleAValues.length; i++){
            if(Math.abs(student.calcAngleOfElevation(doubleAValues[i], doubleBValues[i]) - resultValues[i])/resultValues[i] >= .00001){
                System.out.println("calcAngleOfElevation failed, " + "calcAngleOfElevation(" + doubleAValues[i] + ", " + doubleBValues[i] + ")" + " results in " + student.calcAngleOfElevation(doubleAValues[i], doubleBValues[i]) + ", not equal to " + resultValues[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("calcAngleOfElevation works");
        }else{
            System.out.println("calcAngleOfElevation does not work");
        }
        return output;
    }
}