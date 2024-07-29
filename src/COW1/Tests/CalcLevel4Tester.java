package COW1.Tests;

import COW1.Calculator4;

public class CalcLevel4Tester
{
    public static boolean testLevel4(){
        boolean radius = testCalcLengthOfRadius();
        boolean parallel = testCalcResistanceInParallel();
        boolean distance = testcalcDistance();
        boolean intercept = testcalcIntercept();
        boolean coneSurfaceArea = testCalcSurfaceAreaOfCone();
        if(radius && parallel && distance && intercept && coneSurfaceArea){
            System.out.println("Level 4 works");
            return true;
        }else{
            System.out.println("Level 4 DOES NOT work");
            return false;
        }
    }

    public static boolean testCalcLengthOfRadius(){
        Calculator4 student = new Calculator4();
        boolean output = true;

        double [] doubleAreas = {0.0, 144.0, 1309.0, 5.0, 1084.0, 8.0, 1.0, 1237.0, 46.0, 28.0, 900.0, 3.0, 161716.0, 13616.0, 463.0, 12207.0, 1420.0, 25259.0, 13303.0, 137.0, 1324.0, 1117.0, 10102.0, 65031.0, 5626.0, 1732.0, 14875.0, 57.0, 17.0, 50459.0, 4.0, 5417.0, 141.0, 94373.0, 57.0, 120571.0, 1861.0, 0.0, 9796.0, 170760.0, };
        double [] resultValues = {0.0, 6.770275002573076, 20.41243838973144, 1.2615662610100802, 18.575465448360347, 1.5957691216057308, 0.5641895835477563, 19.843117930641572, 3.826519928662906, 2.985410660720923, 16.925687506432688, 0.9772050238058398, 226.88279254738094, 65.83393813435814, 12.139912573947766, 62.33465152421671, 21.260292528114064, 89.66710330503807, 65.07285467768389, 6.6036697681803656, 20.529059630371258, 18.856090338861186, 56.70596503216089, 143.87498117608249, 42.31797986281961, 23.480049464818542, 68.81031577448171, 4.259537945889915, 2.326213245840639, 126.73436213966556, 1.1283791670955126, 41.52450666121867, 6.699380116989518, 173.32010526428513, 4.259537945889915, 195.90543965665125, 24.338748903508463, 0.0, 55.840519741997504, 233.14072180711824, };

        for(int i = 0; i < doubleAreas.length; i++){
            if(Math.abs(student.calcLengthOfRadius(doubleAreas[i]) - resultValues[i])/resultValues[i] >= .00001){
                System.out.println("calcLengthOfRadius failed, " + "calcLengthOfRadius(" + doubleAreas[i] + ")" + " results in " + student.calcLengthOfRadius(doubleAreas[i]) + ", not equal to " + resultValues[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("calcLengthOfRadius works");
        }else{
            System.out.println("calcLengthOfRadius does not work");
        }
        return output;
    }

    public static boolean testCalcResistanceInParallel(){
        Calculator4 student = new Calculator4();
        boolean output = true;

        double [] doubleAValues = {5610.0, 1905.0, 1239.0, 45.0, 84.0, 146.0, 19370.0, 1828.0, 177.0, 183.0, 89034.0, 1.0, 17290.0, 52534.0, 4.0, 965.0, 16.0, 64.0, 505.0, 16365.0, 1953.0, 119236.0, 190.0, 18.0, 39.0, 11731.0, 19.0, 18414.0, 153443.0, 67594.0, 114.0, 38.0, 1105.0, 17.0, 1872.0, 9.0, 1296.0, 3501.0, 432.0, 131727.0, };
        double [] doubleBValues = {137.0, 7.0, 51218.0, 159.0, 68.0, 1063.0, 6434.0, 6908.0, 16.0, 860.0, 16.0, 720.0, 14.0, 9.0, 43063.0, 1188.0, 15272.0, 2358.0, 14.0, 236.0, 998.0, 377.0, 3291.0, 46.0, 650.0, 115.0, 16.0, 1719.0, 18697.0, 13.0, 48.0, 14.0, 8.0, 18886.0, 19622.0, 19274.0, 134804.0, 129.0, 169314.0, 189061.0, };
        double [] resultValues = {133.7341221506873, 6.974372384937238, 1209.73563108832, 35.0735294117647, 37.578947368421055, 128.36889991728702, 4829.738800186018, 1445.492673992674, 14.67357512953368, 150.89165867689357, 15.997125210555868, 0.9986130374479889, 13.988673139158577, 8.99845840549645, 3.9996284858476328, 532.4756154203437, 15.983254840397697, 62.308835672997525, 13.622350674373795, 232.64502138425397, 660.4859369705184, 375.8117595913488, 179.62941683424305, 12.9375, 36.79245283018868, 113.8835893972649, 8.685714285714285, 1572.2279839070184, 16666.223835250377, 12.997500258848936, 33.77777777777778, 10.23076923076923, 7.942497753818508, 16.98471142146749, 1708.9598957848702, 8.995799408805684, 1283.6589566495225, 124.41570247933885, 430.90056908557494, 77635.19317119094, };

        for(int i = 0; i < doubleAValues.length; i++){
            if(Math.abs(student.calcResistanceInParallel(doubleAValues[i], doubleBValues[i]) - resultValues[i])/resultValues[i] >= .00001){
                System.out.println("calcResistanceInParallel failed, " + "calcResistanceInParallel(" + doubleAValues[i] + ", " + doubleBValues[i] + ")" + " results in " + student.calcResistanceInParallel(doubleAValues[i], doubleBValues[i]) + ", not equal to " + resultValues[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("calcResistanceInParallel works");
        }else{
            System.out.println("calcResistanceInParallel does not work");
        }
        return output;
    }

    public static boolean testcalcDistance(){
        Calculator4 student = new Calculator4();
        boolean output = true;

        double [] doubleAValues = {881.0, 7.0, 1.0, -657.0, -4.0, -100.0, -18.0, 29.0, -236.0, -4.0, 593.0, -122.0, 24.0, -52.0, -48.0, 0.0, 3.0, -92.0, -8.0, 34.0, -50.0, -33.0, -4.0, 9.0, 698.0, -655.0, -288.0, -8.0, -34.0, 83.0, -57.0, 730.0, -83.0, 0.0, 344.0, 721.0, -658.0, -54.0, -168.0, 18.0, };
        double [] doubleBValues = {0.0, 68.0, -85.0, -1.0, 8.0, -63.0, 3.0, -20.0, 379.0, 64.0, 627.0, -1.0, 661.0, -220.0, 19.0, 72.0, 364.0, -6.0, 794.0, -4.0, -512.0, -631.0, 53.0, -9.0, 622.0, -865.0, -584.0, -10.0, 69.0, 64.0, -639.0, -31.0, -768.0, -307.0, 68.0, -248.0, -10.0, -181.0, -89.0, 2.0, };
        double [] doubleCValues = {-28.0, 90.0, 99.0, -58.0, 2.0, -400.0, 1.0, 7.0, 68.0, 2.0, -37.0, -40.0, -89.0, 26.0, 5.0, 457.0, -2.0, -900.0, -943.0, -2.0, -804.0, -51.0, -7.0, 256.0, 9.0, 5.0, 5.0, -86.0, 91.0, 14.0, 28.0, 4.0, 99.0, -82.0, -4.0, 68.0, 5.0, -7.0, 76.0, 72.0, };
        double [] doubleDValues = {1.0, -1.0, 79.0, -9.0, 821.0, 44.0, -31.0, -944.0, -850.0, 911.0, -28.0, -669.0, 78.0, 1.0, -216.0, 3.0, 37.0, 870.0, -18.0, -603.0, -209.0, 9.0, -16.0, 553.0, 92.0, -38.0, -29.0, 613.0, 9.0, -53.0, 9.0, -14.0, 246.0, -294.0, 574.0, -79.0, 3.0, -62.0, 7.0, -124.0, };
        double [] resultValues = {909.0005500548391, 107.93516572461452, 191.049731745428, 599.0534199885683, 813.022139919941, 318.5105963700423, 38.948684188300895, 924.2618676544002, 1266.0398887870792, 847.0212512092007, 908.8041593214679, 673.0141157509254, 593.8501494484951, 234.3608329051593, 240.9024698918631, 462.17961876309516, 327.0382240656281, 1191.7382262896497, 1238.3735300788692, 600.0808278890436, 812.603839518372, 640.2530749633304, 69.06518659932803, 613.8835394437613, 869.2646317434064, 1058.0779744423376, 627.5938176878418, 627.8638387421273, 138.6542462386205, 135.83077707206124, 653.551069159863, 726.1990085369162, 1030.2038633202653, 83.02409288875127, 614.1172526480591, 674.5146403155383, 663.1274387325561, 127.94530081249565, 262.20602586515815, 137.08391590555036, };

        for(int i = 0; i < doubleAValues.length; i++){
            if(Math.abs(student.calcDistance(doubleAValues[i], doubleBValues[i], doubleCValues[i], doubleDValues[i]) - resultValues[i])/resultValues[i] >= .00001){
                System.out.println("calcDistance failed, " + "calcDistance(" + doubleAValues[i] + ", " + doubleBValues[i]  + ", " + doubleCValues[i]  + ", " + doubleDValues[i]  + ")" + " results in " + student.calcDistance(doubleAValues[i], doubleBValues[i], doubleCValues[i], doubleDValues[i]) + ", not equal to " + resultValues[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("calcDistance works");
        }else{
            System.out.println("calcDistance does not work");
        }
        return output;
    }



    public static boolean testcalcIntercept(){
        Calculator4 student = new Calculator4();
        boolean output = true;

        double [] doubleAValues = {8.0, 615.0, -2.0, -62.0, 6.0, 0.0, 0.0, -3.0, -378.0, 2.0, -67.0, 562.0, -96.0, -668.0, 90.0, -5.0, -20.0, -64.0, 8.0, 110.0, 9.0, -479.0, 98.0, -1.0, 7.0, -845.0, 21.0, 910.0, 865.0, -34.0, 5.0, -10.0, -20.0, 785.0, -55.0, -10.0, 14.0, -7.0, 848.0, -771.0, };
        double [] doubleBValues = {-328.0, 70.0, -90.0, 589.0, -705.0, -975.0, -922.0, 5.0, -28.0, 7.0, -52.0, -92.0, -31.0, 0.0, -2.0, -15.0, 546.0, 5.0, -3.0, 71.0, 0.0, -483.0, -243.0, 6.0, 60.0, -1.0, -7.0, -623.0, 18.0, 4.0, 38.0, -4.0, 74.0, -5.0, 854.0, -42.0, -4.0, 84.0, 5.0, 15.0, };
        double [] doubleCValues = {46.0, 5.0, 435.0, -61.0, -7.0, 2.0, 95.0, -640.0, 1.0, 6.0, 8.0, 67.0, -6.0, 88.0, -68.0, -152.0, -21.0, -54.0, -5.0, -10.0, -73.0, -9.0, 734.0, -10.0, 504.0, 0.0, 5.0, -5.0, 767.0, 3.0, -7.0, 61.0, 4.0, -5.0, -7.0, 442.0, 33.0, 47.0, -737.0, 110.0, };
        double [] doubleDValues = {863.0, 6.0, -26.0, -2.0, -61.0, 51.0, 954.0, 281.0, -100.0, -69.0, -10.0, 91.0, -9.0, -7.0, 17.0, -8.0, 2.0, -762.0, 341.0, -92.0, -10.0, -6.0, -766.0, 964.0, 7.0, -451.0, 10.0, -404.0, 35.0, -730.0, 3.0, -625.0, -8.0, 6.0, 4.0, 5.0, -79.0, 396.0, -4.0, -1.0, };
        double [] resultValues = {-578.7368421052631, 5.47540983606558, -89.7070938215103, -36053.0, -407.7692307692308, -975.0, -922.0, 3.7001569858712715, -99.81002638522428, 45.0, -14.479999999999997, 115.76969696969698, -7.533333333333335, -6.185185185185185, 8.822784810126583, -15.238095238095237, 11426.0, -4903.8, 208.69230769230768, -78.41666666666669, -1.0975609756097562, 3.1340425531914775, -162.41194968553458, -100.44444444444444, 60.74647887323944, -451.00000000000006, 15.3125, -405.1967213114754, 168.05102040816325, -670.4864864864865, 23.416666666666668, -91.46478873239437, 5.666666666666671, 5.9303797468354436, -119.95833333333326, -40.96017699115044, 51.26315789473684, 124.44444444444444, 0.18485804416403795, 0.9977298524404095, };

        for(int i = 0; i < doubleAValues.length; i++){
            if(Math.abs(student.calcIntercept(doubleAValues[i], doubleBValues[i], doubleCValues[i], doubleDValues[i]) - resultValues[i])/resultValues[i] >= .00001){
                System.out.println("calcIntercept failed, " + "calcIntercept(" + doubleAValues[i] + ", " + doubleBValues[i]  + ", " + doubleCValues[i]  + ", " + doubleDValues[i]  + ")" + " results in " + student.calcIntercept(doubleAValues[i], doubleBValues[i], doubleCValues[i], doubleDValues[i]) + ", not equal to " + resultValues[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("calcIntercept works");
        }else{
            System.out.println("calcIntercept does not work");
        }
        return output;
    }

    public static boolean testCalcSurfaceAreaOfCone(){
        Calculator4 student = new Calculator4();
        boolean output = true;

        double [] doubleRadius = {181744.0, 15.0, 18.0, 1575.0, 145.0, 172329.0, 699.0, 2.0, 136.0, 841.0, 857.0, 180.0, 6.0, 135.0, 1570.0, 1404.0, 49.0, 197844.0, 185.0, 1416.0, 151.0, 19.0, 1123.0, 111.0, 19248.0, 1403.0, 9064.0, 39207.0, 1192.0, 16907.0, 78439.0, 1.0, 3.0, 1891.0, 13948.0, 179006.0, 7800.0, 72798.0, 15946.0, 173.0, };
        double [] doubleHeight = {19325.0, 107.0, 124498.0, 71754.0, 19.0, 608.0, 617.0, 53.0, 14.0, 1.0, 163063.0, 14614.0, 1213.0, 167765.0, 186469.0, 149.0, 125.0, 1525.0, 141139.0, 2594.0, 5.0, 12603.0, 116.0, 3.0, 16.0, 2.0, 0.0, 965.0, 960.0, 67289.0, 29.0, 27449.0, 1373.0, 5.0, 136660.0, 89798.0, 4839.0, 192293.0, 245.0, 164757.0, };
        double [] resultArea = {1.2269356754198938E10, 72287.89818083795, 9.738781456539815E10, 3.2353733396748177E10, 9863.190549608018, 3.3032699477493846E8, 3003216.2083845423, 17655.7484779608, 6628.954178260965, 2645.2228820940345, 1.6706817308608072E11, 1.3419444696071887E9, 9244940.630561395, 1.7684087741464874E11, 2.1847454750433057E11, 730645.6889977034, 101811.53304418626, 9.551908411619077E8, 1.251624705476127E11, 4.522299193087997E7, 2451.7422416464533, 9.979941317828734E8, 453699.7729401929, 1074.806703371607, 968314.5883275501, 8827.884313368666, 0.0, 1.2182291548593839E8, 7511204.296550189, 2.889120176130812E10, 7148920.766321553, 4.734050897903704E9, 1.1844628972088214E7, 29782.40218955724, 1.1764929135155931E11, 8.182984093077997E10, 2.1310553172320402E8, 2.4037669054756876E11, 1.2463502604485039E7, 1.70556289386341E11, };

        for(int i = 0; i < doubleRadius.length; i++){
            if(Math.abs(student.calcSurfaceAreaOfCone(doubleRadius[i], doubleHeight[i]) - resultArea[i])/resultArea[i] >= .00001){
                System.out.println("calcSurfaceAreaOfCone failed, " + "calcSurfaceAreaOfCone(" + doubleRadius[i] + ", " + doubleHeight[i] + ")" + " results in " + student.calcSurfaceAreaOfCone(doubleRadius[i], doubleHeight[i]) + ", not equal to " + resultArea[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("calcSurfaceAreaOfCone works");
        }else{
            System.out.println("calcSurfaceAreaOfCone does not work");
        }
        return output;
    }
}
