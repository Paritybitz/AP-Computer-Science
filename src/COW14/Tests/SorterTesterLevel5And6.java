package COW14.Tests;

import COW14.Sorter;

import java.util.*;

public class SorterTesterLevel5And6
{
    public static void main(String [] arg){
        testSorterLevel5And6();
    }

    public static boolean testSorterLevel5And6(){
        boolean one = testMerge();
        boolean two = testPivot();
        if(one && two){
            System.out.println("Everything works");
            return true;
        }else{
            System.out.println("NOT everything works");
            return false;
        }
    }
    
    public static boolean testMerge(){
        Sorter student = new Sorter();
        boolean output = true;

        ArrayList<int[]> ListOfFirstArray = new ArrayList<int[]>();
        ArrayList<int[]> ListOfSecondArray = new ArrayList<int[]>();
        ArrayList<int[]> ListOfResults = new ArrayList<int[]>();
        int [] arr11 = {};
        int [] arr21 = {-442, };
        int [] results1 = {-442, };
        ListOfFirstArray.add(arr11);
        ListOfSecondArray.add(arr21);
        ListOfResults.add(results1);
        int [] arr12 = {592, -267, };
        int [] arr22 = {585, 192, };
        int [] results2 = {592, 585, 192, -267, };
        ListOfFirstArray.add(arr12);
        ListOfSecondArray.add(arr22);
        ListOfResults.add(results2);
        int [] arr13 = {642, 428, 93, };
        int [] arr23 = {784, 686, 286, -47, };
        int [] results3 = {784, 686, 642, 428, 286, 93, -47, };
        ListOfFirstArray.add(arr13);
        ListOfSecondArray.add(arr23);
        ListOfResults.add(results3);
        int [] arr14 = {817, 296, 77, -441, -744, };
        int [] arr24 = {561, 561, 153, -303, -532, };
        int [] results4 = {817, 561, 561, 296, 153, 77, -303, -441, -532, -744, };
        ListOfFirstArray.add(arr14);
        ListOfSecondArray.add(arr24);
        ListOfResults.add(results4);
        int [] arr15 = {563, 400, 315, 248, -16, -289, };
        int [] arr25 = {721, 464, -180, -503, -592, -940, -977, };
        int [] results5 = {721, 563, 464, 400, 315, 248, -16, -180, -289, -503, -592, -940, -977, };
        ListOfFirstArray.add(arr15);
        ListOfSecondArray.add(arr25);
        ListOfResults.add(results5);
        int [] arr16 = {357, 215, 184, 41, -135, -162, -545, -978, };
        int [] arr26 = {908, 905, 749, -368, -388, -659, -784, -942, };
        int [] results6 = {908, 905, 749, 357, 215, 184, 41, -135, -162, -368, -388, -545, -659, -784, -942, -978, };
        ListOfFirstArray.add(arr16);
        ListOfSecondArray.add(arr26);
        ListOfResults.add(results6);
        int [] arr17 = {870, 862, 806, 724, 165, -176, -632, -790, -861, };
        int [] arr27 = {987, 823, 631, 525, 307, -206, -263, -539, -773, -800, };
        int [] results7 = {987, 870, 862, 823, 806, 724, 631, 525, 307, 165, -176, -206, -263, -539, -632, -773, -790, -800, -861, };
        ListOfFirstArray.add(arr17);
        ListOfSecondArray.add(arr27);
        ListOfResults.add(results7);
        int [] arr18 = {877, 859, 836, 651, -87, -131, -141, -157, -249, -475, -607, };
        int [] arr28 = {931, 845, 705, 366, 356, 10, -35, -43, -333, -532, -868, };
        int [] results8 = {931, 877, 859, 845, 836, 705, 651, 366, 356, 10, -35, -43, -87, -131, -141, -157, -249, -333, -475, -532, -607, -868, };
        ListOfFirstArray.add(arr18);
        ListOfSecondArray.add(arr28);
        ListOfResults.add(results8);
        int [] arr19 = {972, 765, 732, 578, 513, 400, 145, -73, -248, -359, -426, -440, };
        int [] arr29 = {872, 870, 702, 586, 519, 518, 189, 146, -117, -154, -405, -480, -950, };
        int [] results9 = {972, 872, 870, 765, 732, 702, 586, 578, 519, 518, 513, 400, 189, 146, 145, -73, -117, -154, -248, -359, -405, -426, -440, -480, -950, };
        ListOfFirstArray.add(arr19);
        ListOfSecondArray.add(arr29);
        ListOfResults.add(results9);
        int [] arr110 = {970, 907, 887, 826, 646, 480, 418, 349, 160, 115, -530, -665, -839, -941, };
        int [] arr210 = {891, 882, 613, 602, 429, 270, 197, 123, 106, -149, -289, -912, -915, -944, };
        int [] results10 = {970, 907, 891, 887, 882, 826, 646, 613, 602, 480, 429, 418, 349, 270, 197, 160, 123, 115, 106, -149, -289, -530, -665, -839, -912, -915, -941, -944, };
        ListOfFirstArray.add(arr110);
        ListOfSecondArray.add(arr210);
        ListOfResults.add(results10);
        int [] arr111 = {918, 777, 727, 723, 384, 369, 293, 287, 106, 54, 51, -155, -167, -378, -968, };
        int [] arr211 = {954, 927, 624, 538, 418, 331, 188, -4, -67, -479, -493, -554, -615, -729, -763, -919, };
        int [] results11 = {954, 927, 918, 777, 727, 723, 624, 538, 418, 384, 369, 331, 293, 287, 188, 106, 54, 51, -4, -67, -155, -167, -378, -479, -493, -554, -615, -729, -763, -919, -968, };
        ListOfFirstArray.add(arr111);
        ListOfSecondArray.add(arr211);
        ListOfResults.add(results11);

        for(int i = 0; i < ListOfResults.size(); i++){
            int [] arr1 = ListOfFirstArray.get(i);
            int [] arr2 = ListOfSecondArray.get(i);
            int [] expectedResults = ListOfResults.get(i);
            int [] actualResults = Sorter.merge(arr1, arr2);
            if(!areArraysSame(expectedResults, actualResults)){
                System.out.println("========================================");
                System.out.println("merge Error:");
                System.out.println("Array 1: ");
                printArray(arr1);
                System.out.println("Array 2: ");
                printArray(arr2);
                System.out.println("Expected Array: ");
                printArray(expectedResults);
                System.out.println("Recieved Array: ");
                printArray(actualResults);
                output = false;
            }
        }

        System.out.println("========================================");
        if(output){
            System.out.println("merge works!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }else{
            System.out.println("merge does not work!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        return output;
    }

    public static boolean testPivot(){
        Sorter student = new Sorter(); 
        boolean output = true;

        ArrayList<int[]> ListOfOriginalValues = new ArrayList<int[]>();
        ArrayList<int[]> ListOfValues = new ArrayList<int[]>();
        ArrayList<int[]> ListOfResults = new ArrayList<int[]>();
        int [] originalValues1 = {727, };
        int [] values1 = {727, };
        int [] results1 = {727, };
        ListOfOriginalValues.add(originalValues1);
        ListOfValues.add(values1);
        ListOfResults.add(results1);
        int [] originalValues2 = {-94, -181, -651, 985, };
        int [] values2 = {-94, -181, -651, 985, };
        int [] results2 = {-651, -181, -94, 985, };
        ListOfOriginalValues.add(originalValues2);
        ListOfValues.add(values2);
        ListOfResults.add(results2);
        int [] originalValues3 = {-376, 901, 296, 880, 895, -824, 411, };
        int [] values3 = {-376, 901, 296, 880, 895, -824, 411, };
        int [] results3 = {-824, -376, 296, 880, 895, 901, 411, };
        ListOfOriginalValues.add(originalValues3);
        ListOfValues.add(values3);
        ListOfResults.add(results3);
        int [] originalValues4 = {408, 219, -634, 802, -230, 109, 590, -634, -145, 365, };
        int [] values4 = {408, 219, -634, 802, -230, 109, 590, -634, -145, 365, };
        int [] results4 = {-634, 219, -634, 365, -230, 109, -145, 408, 590, 802, };
        ListOfOriginalValues.add(originalValues4);
        ListOfValues.add(values4);
        ListOfResults.add(results4);
        int [] originalValues5 = {172, 428, 605, 26, -788, -673, -699, -622, 917, -779, -385, 679, -497, };
        int [] values5 = {172, 428, 605, 26, -788, -673, -699, -622, 917, -779, -385, 679, -497, };
        int [] results5 = {-779, -497, -385, 26, -788, -673, -699, -622, 172, 917, 605, 679, 428, };
        ListOfOriginalValues.add(originalValues5);
        ListOfValues.add(values5);
        ListOfResults.add(results5);
        int [] originalValues6 = {-128, -394, 509, -135, 783, 752, 55, 132, -333, 574, 47, 746, -20, 450, 550, 768, };
        int [] values6 = {-128, -394, 509, -135, 783, 752, 55, 132, -333, 574, 47, 746, -20, 450, 550, 768, };
        int [] results6 = {-135, -394, -333, -128, 783, 752, 55, 132, 509, 574, 47, 746, -20, 450, 550, 768, };
        ListOfOriginalValues.add(originalValues6);
        ListOfValues.add(values6);
        ListOfResults.add(results6);
        int [] originalValues7 = {-47, -199, 362, 719, 463, 9, 390, -524, -91, 116, 35, 489, -748, -324, -628, -106, -604, -61, 690, };
        int [] values7 = {-47, -199, 362, 719, 463, 9, 390, -524, -91, 116, 35, 489, -748, -324, -628, -106, -604, -61, 690, };
        int [] results7 = {-748, -199, -61, -604, -106, -628, -324, -524, -91, -47, 35, 489, 116, 390, 9, 463, 719, 362, 690, };
        ListOfOriginalValues.add(originalValues7);
        ListOfValues.add(values7);
        ListOfResults.add(results7);
        int [] originalValues8 = {-19, 139, 987, 830, -94, -905, -617, 681, -450, 182, 453, 189, -12, 534, -594, 248, -852, 30, 143, -986, -58, -971, };
        int [] values8 = {-19, 139, 987, 830, -94, -905, -617, 681, -450, 182, 453, 189, -12, 534, -594, 248, -852, 30, 143, -986, -58, -971, };
        int [] results8 = {-594, -971, -58, -986, -94, -905, -617, -852, -450, -19, 453, 189, -12, 534, 182, 248, 681, 30, 143, 830, 987, 139, };
        ListOfOriginalValues.add(originalValues8);
        ListOfValues.add(values8);
        ListOfResults.add(results8);
        int [] originalValues9 = {-148, -710, 408, -654, -750, -84, -812, -969, 682, -622, -915, -913, -798, 201, 339, -98, -770, 143, -198, 895, -606, 659, 227, 612, 801, };
        int [] values9 = {-148, -710, 408, -654, -750, -84, -812, -969, 682, -622, -915, -913, -798, 201, 339, -98, -770, 143, -198, 895, -606, 659, 227, 612, 801, };
        int [] results9 = {-798, -710, -606, -654, -750, -198, -812, -969, -770, -622, -915, -913, -148, 201, 339, -98, 682, 143, -84, 895, 408, 659, 227, 612, 801, };
        ListOfOriginalValues.add(originalValues9);
        ListOfValues.add(values9);
        ListOfResults.add(results9);
        int [] originalValues10 = {680, -465, 362, -903, 357, -907, 376, 422, -920, 806, -589, -359, 835, -869, 740, 80, -246, 1, -418, -592, -427, 78, -891, 259, 647, 780, 442, 744, };
        int [] values10 = {680, -465, 362, -903, 357, -907, 376, 422, -920, 806, -589, -359, 835, -869, 740, 80, -246, 1, -418, -592, -427, 78, -891, 259, 647, 780, 442, 744, };
        int [] results10 = {-891, -465, 362, -903, 357, -907, 376, 422, -920, 442, -589, -359, 647, -869, 259, 80, -246, 1, -418, -592, -427, 78, 680, 740, 835, 780, 806, 744, };
        ListOfOriginalValues.add(originalValues10);
        ListOfValues.add(values10);
        ListOfResults.add(results10);
        int [] originalValues11 = {-873, 51, 243, -905, -993, -983, -89, 317, 800, 321, 720, 979, 817, 208, -259, -965, 249, -775, -127, 917, -462, 805, -88, 60, 899, 905, -790, -528, 285, -586, 203, };
        int [] values11 = {-873, 51, 243, -905, -993, -983, -89, 317, 800, 321, 720, 979, 817, 208, -259, -965, 249, -775, -127, 917, -462, 805, -88, 60, 899, 905, -790, -528, 285, -586, 203, };
        int [] results11 = {-993, -965, -983, -905, -873, 243, -89, 317, 800, 321, 720, 979, 817, 208, -259, 51, 249, -775, -127, 917, -462, 805, -88, 60, 899, 905, -790, -528, 285, -586, 203, };
        ListOfOriginalValues.add(originalValues11);
        ListOfValues.add(values11);
        ListOfResults.add(results11);

        for(int i = 0; i < ListOfResults.size(); i++){
            int [] originalValues = ListOfOriginalValues.get(i);
            int [] values = ListOfValues.get(i);
            int [] expectedResults = ListOfResults.get(i);
            int [] actualResults = Sorter.pivot(values);
            
            if(!areArraysSame(expectedResults, actualResults)){
                System.out.println("========================================");
                System.out.println("pivot Error:");
                System.out.println("Input Array: ");
                printArray(originalValues);
                System.out.println("Expected Array: ");
                printArray(expectedResults);
                System.out.println("Recieved Array: ");
                printArray(actualResults);
                output = false;
            }
        }

        System.out.println("========================================");
        if(output){
            System.out.println("pivot works!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }else{
            System.out.println("pivot does not work!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        return output;
    }

    public static void printArray(int [] arr){
        for(int i = 0; i < arr.length; i++){
            int next = arr[i];
            System.out.print(arr[i]  + ", ");
        }
        System.out.println();
    }

    public static boolean areArraysSame(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            //System.out.println("Results are a different size");
            return false;
        }
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                //System.out.println(list1.get(i) + " != " + list2.get(i));
                return false;
            }
        }
        return true;
    }
    
    
}
