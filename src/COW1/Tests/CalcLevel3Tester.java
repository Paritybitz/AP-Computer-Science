package COW1.Tests;

import COW1.Calculator3;

public class CalcLevel3Tester
{
    public static boolean testLevel3(){

        boolean diff = testcalcDifference();
        boolean circleArea = testAreaOfCircle();
        boolean volSphere = testcalcVolOfSphere();
        boolean gravity = testcalcGravity();
        boolean coneVolume = testCalcVolumeOfCone();
        if(diff && circleArea && volSphere && gravity && coneVolume){
            System.out.println("Level 3 works");
            return true;
        }else{
            System.out.println("Level 3 DOES NOT work");
            return false;
        }
    }

    public static boolean testcalcDifference(){
        Calculator3 student = new Calculator3();
        boolean output = true;

        double [] doubleAValues = {-679.0, -66.0, 29.0, -19835.0, 3090.0, -66.0, -626.0, 79564.0, 26388.0, 57576.0, -1.0, -165.0, 78.0, 9.0, 6.0, 9645.0, 3647.0, 5.0, 62.0, 4895.0, -768.0, -282.0, 44133.0, -1186.0, 66.0, -91487.0, 93867.0, -68483.0, -39952.0, 7752.0, -287.0, 8393.0, 105.0, -19.0, -873.0, 179.0, -25.0, 5.0, 4.0, 1762.0, };
        double [] doubleBValues = {-91.0, -509.0, -9.0, -8918.0, -17.0, -81776.0, -49.0, -577.0, -47305.0, -258.0, 9.0, 32.0, 5819.0, -84012.0, -68.0, 99.0, 37572.0, 2.0, 790.0, -10.0, 4.0, -69.0, -1.0, -439.0, -5.0, 480.0, 52.0, 9.0, -9303.0, -7.0, 42.0, 2593.0, 52.0, 15001.0, 42.0, 90.0, -486.0, 4.0, -1528.0, -11745.0, };
        double [] resultValues = {588.0, 443.0, 38.0, 10917.0, 3107.0, 81710.0, 577.0, 80141.0, 73693.0, 57834.0, 10.0, 197.0, 5741.0, 84021.0, 74.0, 9546.0, 33925.0, 3.0, 728.0, 4905.0, 772.0, 213.0, 44134.0, 747.0, 71.0, 91967.0, 93815.0, 68492.0, 30649.0, 7759.0, 329.0, 5800.0, 53.0, 15020.0, 915.0, 89.0, 461.0, 1.0, 1532.0, 13507.0, };

        for(int i = 0; i < doubleAValues.length; i++){
            if(Math.abs(student.calcDifference(doubleAValues[i], doubleBValues[i]) - resultValues[i])/resultValues[i] >= .00001){
                System.out.println("calcDifference failed, " + "calcDifference(" + doubleAValues[i] + ", " + doubleBValues[i] + ")" + " results in " + student.calcDifference(doubleAValues[i], doubleBValues[i]) + ", not equal to " + resultValues[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("calcDifference works");
        }else{
            System.out.println("calcDifference does not work");
        }
        return output;
    }


    public static boolean testAreaOfCircle(){
        Calculator3 student = new Calculator3();
        boolean output = true;

        double [] doubleXValues = {0.0, 6.0, 186.0, 191.0, 101.0, 47.0, 6.0, 223.0, 41.0, 17198.0, 3037.0, 10026.0, 17.0, 1482.0, 14.0, 181.0, 1505.0, 531.0, 1702.0, 2.0, 8009.0, 583.0, 123.0, 11510.0, 1445.0, 4506.0, 3340.0, 15970.0, 19.0, 6577.0, 15.0, 3.0, 6507.0, 11459.0, 18269.0, 13024.0, 18.0, 19.0, 1344.0, 18.0, };
        double [] resultValues = {0.0, 113.09733552923255, 108686.53944359247, 114608.44159560924, 32047.38665926948, 6939.778171779853, 113.09733552923255, 156228.26107036683, 5281.017250684442, 9.291926416298081E8, 2.8976068291747835E7, 3.157950172554798E8, 907.9202768874503, 6899955.343302949, 615.7521601035994, 102921.71692425522, 7115785.900197221, 885806.6061988316, 9100578.165289527, 12.566370614359172, 2.0151457364086863E8, 1067792.7854359811, 47529.15525615998, 4.1619850890684116E8, 6559724.000511828, 6.3787010335822694E7, 3.5046351006386295E7, 8.01234617804929E8, 1134.1149479459152, 1.3589565036325526E8, 706.8583470577034, 28.274333882308138, 1.3301832848368546E8, 4.1251838758216566E8, 1.0485265318064629E9, 5.328913218298836E8, 1017.8760197630929, 1134.1149479459152, 5674771.907514773, 1017.8760197630929, };

        for(int i = 0; i < doubleXValues.length; i++){
            if(Math.abs(student.calcAreaOfCircle(doubleXValues[i]) - resultValues[i])/resultValues[i] >= .00001){
                System.out.println("calcAreaOfCircle failed, " + "calcAreaOfCircle(" + doubleXValues[i] + ")" + " results in " + student.calcAreaOfCircle(doubleXValues[i]) + ", not equal to " + resultValues[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("calcAreaOfCircle works");
        }else{
            System.out.println("calcAreaOfCircle does not work");
        }
        return output;
    }

    public static boolean testcalcVolOfSphere(){
        Calculator3 student = new Calculator3();
        boolean output = true;

        double [] doubleXValues = {15.0, 1497.0, 176.0, 1325.0, 1063.0, 1987.0, 512.0, 4.0, 285.0, 971.0, 160.0, 11.0, 6.0, 19.0, 0.0, 670.0, 13497.0, 10825.0, 16097.0, 344.0, 13960.0, 12.0, 171.0, 6.0, 965.0, 2302.0, 1883.0, 2905.0, 1935.0, 11.0, 16.0, 2.0, 11709.0, 7.0, 192.0, 2865.0, 104.0, 42.0, 2967.0, 8.0, };
        double [] resultValues = {14137.166941154068, 1.4052513472413101E10, 2.283634590748953E7, 9.74397686434349E9, 5.031394872883746E9, 3.286110859684002E10, 5.622099043550841E8, 268.082573106329, 9.696682804937574E7, 3.834831614252346E9, 1.7157284678805057E7, 5575.279762570686, 904.7786842338604, 28730.912014629856, 0.0, 1.259833108362169E9, 1.0299125563668848E13, 5.313397711614839E12, 1.7471228408594314E13, 1.705155291197192E8, 1.1395801194936467E13, 7238.229473870883, 2.0944834858665165E7, 904.7786842338604, 3.7641814429063797E9, 5.109807826685591E10, 2.7966593464604702E10, 1.0268973177433742E11, 3.0348100763739082E10, 5575.279762570686, 17157.284678805056, 33.510321638291124, 6.724314652722202E12, 1436.755040241732, 2.964778792497514E7, 9.850595555142615E10, 4711819.304916838, 310339.08869221417, 1.094060272570114E11, 2144.660584850632, };

        for(int i = 0; i < doubleXValues.length; i++){
            if(Math.abs(student.calcVolOfSphere(doubleXValues[i]) - resultValues[i])/resultValues[i] >= .00001){
                System.out.println("calcVolOfSphere failed, " + "calcVolOfSphere(" + doubleXValues[i] + ")" + " results in " + student.calcVolOfSphere(doubleXValues[i]) + ", not equal to " + resultValues[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("calcVolOfSphere works");
        }else{
            System.out.println("calcVolOfSphere does not work");
        }
        return output;
    }

    public static boolean testcalcGravity(){
        Calculator3 student = new Calculator3();
        boolean output = true;

        double [] doubleAValues = {2.147483647E9, 49.0, 1.981798006E9, 289790.0, 2.147483647E9, 6233.0, 2.147483647E9, 2.147483647E9, 1437.0, 6.89976414E8, 10358.0, 127.0, 2.147483647E9, 2.147483647E9, 2.147483647E9, 60304.0, 63.0, 2.147483647E9, 8.0, 2540.0, 1.16157695E8, 135.0, 42073.0, 2.147483647E9, 4.0, 2.147483647E9, 1.35533387E8, 2.147483647E9, 1.604559174E9, 2.147483647E9, 180807.0, 2.147483647E9, 9.0, 14266.0, 2.147483647E9, 2.147483647E9, 55.0, 9715.0, 2.147483647E9, 2.147483647E9, };
        double [] doubleBValues = {180496.0, 2.147483647E9, 168.0, 2.147483647E9, 2.147483647E9, 11667.0, 1344.0, 2.147483647E9, 59.0, 1708.0, 2.147483647E9, 2.147483647E9, 14.0, 1519.0, 2.147483647E9, 2.147483647E9, 16796.0, 6993.0, 2.147483647E9, 53.0, 2.147483647E9, 1.1088557E7, 167.0, 2.147483647E9, 1.0946827E9, 1.4593378E7, 2.147483647E9, 101224.0, 1.0462166E7, 199389.0, 1.8680066E7, 290.0, 71161.0, 2.147483647E9, 107.0, 2.147483647E9, 2.147483647E9, 2.147483647E9, 2628004.0, 1.134614756E9, };
        double [] doubleCValues = {2.147483647E9, 19544.0, 1.308637E7, 463.0, 104935.0, 2.147483647E9, 6.5803081E7, 2.147483647E9, 16.0, 733.0, 139962.0, 132823.0, 113.0, 2.147483647E9, 71.0, 341.0, 136282.0, 2.147483647E9, 2.147483647E9, 2.147483647E9, 2.147483647E9, 9615791.0, 8.0, 54290.0, 2.147483647E9, 5835914.0, 6.3261927E7, 747019.0, 4.21188312E8, 1.558677E7, 8827100.0, 2.147483647E9, 242.0, 1575.0, 14494.0, 2.147483647E9, 60217.0, 2.147483647E9, 38901.0, 16.0, };
        double [] resultValues = {5.60956422351746E-15, 1.83861350414428E-8, 1.297542782952231E-13, 0.19375043503187908, 0.027951840222632474, 1.0524173570350615E-21, 4.4486484289559735E-14, 6.674079999999999E-11, 2.2103457993749995E-8, 1.4638803133945968E-4, 7.578389117681399E-8, 1.0317593757463394E-9, 1.571420528019239E-4, 4.720840381794068E-17, 61056.85656258858, 0.07432905915278089, 3.802426488584318E-15, 2.173326977609343E-16, 2.4862885486736368E-19, 1.9482346518099296E-24, 3.6100193364853123E-12, 1.0805134548324073E-15, 7.327087629574999E-6, 0.10442667631900528, 6.336944789412729E-20, 6.141286220185725E-8, 4.853809548304354E-9, 2.5998091776467084E-8, 6.3156220250022635E-12, 1.1762786509673426E-10, 2.8930035161401084E-12, 9.012795988941935E-18, 7.298695208524006E-10, 8.24256492940325E-4, 7.300095425869346E-8, 6.674079999999999E-11, 2.1739308844061156E-9, 3.019286656295548E-16, 2.4890049726342546E-4, 635228.1500656446, };

        for(int i = 0; i < doubleAValues.length; i++){
            if(Math.abs(student.calcGravity(doubleAValues[i], doubleBValues[i], doubleCValues[i]) - resultValues[i])/resultValues[i] >= .00001){
                System.out.println("calcGravity failed, " + "calcGravity(" + doubleAValues[i] + ", " + doubleBValues[i] + ", " + doubleCValues[i] + ")" + " results in " + student.calcGravity(doubleAValues[i], doubleBValues[i], doubleCValues[i]) + ", not equal to " + resultValues[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("calcGravity works");
        }else{
            System.out.println("calcGravity does not work");
        }
        return output;
    }

    public static boolean testCalcVolumeOfCone(){
        Calculator3 student = new Calculator3();
        boolean output = true;

        double [] doubleRadius = {109195.0, 133.0, 751.0, 509.0, 5.0, 11.0, 1167.0, 77250.0, 98927.0, 30.0, 163.0, 5611.0, 49500.0, 12394.0, 11.0, 9.0, 1.0, 92797.0, 1661.0, 830.0, 7853.0, 92601.0, 11.0, 77497.0, 8896.0, 34.0, 157.0, 13481.0, 19592.0, 69372.0, 1217.0, 4.0, 0.0, 16.0, 1968.0, 5890.0, 87596.0, 4.0, 8.0, 668.0, };
        double [] doubleHeight = {1879.0, 13649.0, 34942.0, 43437.0, 0.0, 42.0, 5.0, 1377.0, 1600.0, 13.0, 910.0, 110780.0, 21130.0, 24.0, 892.0, 12670.0, 164.0, 118709.0, 180.0, 20.0, 4.0, 17736.0, 173876.0, 85567.0, 120.0, 153736.0, 1199.0, 184896.0, 75290.0, 199408.0, 769.0, 76458.0, 14.0, 139.0, 16794.0, 620.0, 16229.0, 1179.0, 3.0, 5429.0, };
        double [] resultVolume = {4.0372433774844354E11, 2.5946687812154766E10, 9.602052445988326E11, 1.0056944326955737E12, 0.0, 20319.821283418783, 30551.988556160737, 1.5338927211895795E11, 2.652060470968981E11, 5309.29158456675, 1.4135103961978212E8, 7.210935456425097E13, 2.314370105911949E13, 7475884.674929644, 9165391.316128187, 1.5129492387865515E9, 28165.42533698369, 1.3693984984197748E15, 5.635640229421657E7, 347669.58699727047, 131578.2779127501, 3.0503920110183645E13, 3.4825758542309357E11, 5.941910696582561E14, 1.3414851958240704E8, 8.415088530007887E11, 2.363560027472515E8, 4.82620492308966E14, 1.1630060779102444E14, 2.8886703832963115E15, 7.536537697360493E8, 2.448693769913112E10, 0.0, 323726.46218671143, 5.812487203403162E11, 2.370976730825036E9, 2.4159971264097934E13, 5822590.12505148, 75.39822368615503, 2.0617915897457504E10, };

        for(int i = 0; i < resultVolume.length; i++){
            if(Math.abs(student.calcVolumeOfCone(doubleRadius[i], doubleHeight[i]) - resultVolume [i])/resultVolume [i] >= .00001){
                System.out.println("calcVolumeOfCone failed, " + "calcVolumeOfCone(" + doubleRadius[i] + ", " + doubleHeight + ")" + " results in " + student.calcVolumeOfCone(doubleRadius[i], doubleHeight[i]) + ", not equal to " + resultVolume[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("calcVolumeOfCone works");
        }else{
            System.out.println("calcVolumeOfCone does not work");
        }
        return output;
    }
}