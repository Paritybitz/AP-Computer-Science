package COW14.Tests;

import COW14.Sorter;

import java.util.*;

public class SorterTesterLevels1To3
{
    public static void main(String [] arg){
        testSorter();
    }

    public static boolean testSorter(){
        boolean one = testGetFirstHalf();
        boolean two = testGetSecondHalf();
        boolean three = testSelectionSort();
        boolean four = testInsertionSort();
        // boolean five = testisNormalTemp();
        if(one && two && three && four){
            System.out.println("Everything works");
            return true;
        }else{
            System.out.println("NOT everything works");
            return false;
        }
    }

    public static boolean testGetFirstHalf(){
        Sorter student = new Sorter(); 
        boolean output = true;

        ArrayList<int[]> ListOfValues = new ArrayList<int[]>();
        ArrayList<int[]> ListOfResults = new ArrayList<int[]>();
        int [] values1 = {-108, };
        int [] results1 = {};
        ListOfValues.add(values1);
        ListOfResults.add(results1);
        int [] values2 = {313, 851, 609, 172, };
        int [] results2 = {313, 851, };
        ListOfValues.add(values2);
        ListOfResults.add(results2);
        int [] values3 = {-393, -503, 311, 647, 412, 188, -700, };
        int [] results3 = {-393, -503, 311, };
        ListOfValues.add(values3);
        ListOfResults.add(results3);
        int [] values4 = {-547, 932, -298, -297, -923, 849, 174, -712, 226, 646, };
        int [] results4 = {-547, 932, -298, -297, -923, };
        ListOfValues.add(values4);
        ListOfResults.add(results4);
        int [] values5 = {34, 17, -612, 357, -807, -120, -908, -27, 843, 737, -68, 776, -679, };
        int [] results5 = {34, 17, -612, 357, -807, -120, };
        ListOfValues.add(values5);
        ListOfResults.add(results5);
        int [] values6 = {256, 90, 984, 189, -619, -665, 250, 939, 268, 218, -183, 545, -896, -432, 424, -552, };
        int [] results6 = {256, 90, 984, 189, -619, -665, 250, 939, };
        ListOfValues.add(values6);
        ListOfResults.add(results6);
        int [] values7 = {-163, 267, 388, 521, 459, 795, -227, 43, -785, 12, 981, -208, -150, -693, -320, 978, 870, -659, 607, };
        int [] results7 = {-163, 267, 388, 521, 459, 795, -227, 43, -785, };
        ListOfValues.add(values7);
        ListOfResults.add(results7);
        int [] values8 = {-59, -341, 367, 411, 281, 246, -605, 503, 406, -422, 284, 612, -642, -842, 290, 662, -778, -862, 542, 469, -579, 83, };
        int [] results8 = {-59, -341, 367, 411, 281, 246, -605, 503, 406, -422, 284, };
        ListOfValues.add(values8);
        ListOfResults.add(results8);
        int [] values9 = {473, -227, 757, -52, -703, -851, -791, 102, -682, -543, -854, 653, 63, -327, 926, -248, 991, 175, 597, 117, -80, 839, -150, 541, 187, };
        int [] results9 = {473, -227, 757, -52, -703, -851, -791, 102, -682, -543, -854, 653, };
        ListOfValues.add(values9);
        ListOfResults.add(results9);
        int [] values10 = {703, 287, 843, 40, 334, -441, -606, 794, -453, 31, -872, -122, -326, -787, 778, -944, -823, -581, 972, 828, 86, -149, -232, -697, 476, -376, -758, -327, };
        int [] results10 = {703, 287, 843, 40, 334, -441, -606, 794, -453, 31, -872, -122, -326, -787, };
        ListOfValues.add(values10);
        ListOfResults.add(results10);
        int [] values11 = {989, -870, -190, 831, -719, -434, 103, 655, -811, 467, -554, 986, -607, 637, -782, -532, -574, -984, 745, 26, 945, 677, 730, -985, -590, -556, 711, -153, -492, 396, 535, };
        int [] results11 = {989, -870, -190, 831, -719, -434, 103, 655, -811, 467, -554, 986, -607, 637, -782, };
        ListOfValues.add(values11);
        ListOfResults.add(results11);

        for(int i = 0; i < ListOfValues.size(); i++){
            int [] nextValues = ListOfValues.get(i);
            int [] expectedResults = ListOfResults.get(i);
            int [] actualResults = Sorter.getFirstHalf(nextValues);
            if(!areArraysSame(expectedResults, actualResults)){
                System.out.println("========================================");
                System.out.println("getFirstHalf Error:");
                System.out.println("Input Array: ");
                printArray(nextValues);
                System.out.println("Expected Array: ");
                printArray(expectedResults);
                System.out.println("Recieved Array: ");
                printArray(actualResults);
                output = false;
            }
        }

        if(output){
            System.out.println("getFirstHalf works");
        }else{
            System.out.println("getFirstHalf does not work");
        }
        return output;
    }

    public static boolean testGetSecondHalf(){
        Sorter student = new Sorter(); 
        boolean output = true;

        ArrayList<int[]> ListOfValues = new ArrayList<int[]>();
        ArrayList<int[]> ListOfResults = new ArrayList<int[]>();
        int [] values1 = {989, };
        int [] results1 = {989, };
        ListOfValues.add(values1);
        ListOfResults.add(results1);
        int [] values2 = {-690, 752, -58, -231, };
        int [] results2 = {-58, -231, };
        ListOfValues.add(values2);
        ListOfResults.add(results2);
        int [] values3 = {135, -459, -463, -528, 672, -667, -129, };
        int [] results3 = {-528, 672, -667, -129, };
        ListOfValues.add(values3);
        ListOfResults.add(results3);
        int [] values4 = {-48, 61, -384, -513, 854, 849, -351, 586, 193, -941, };
        int [] results4 = {849, -351, 586, 193, -941, };
        ListOfValues.add(values4);
        ListOfResults.add(results4);
        int [] values5 = {340, -720, 78, 545, 469, 62, 232, -610, 30, -493, -435, 659, 68, };
        int [] results5 = {232, -610, 30, -493, -435, 659, 68, };
        ListOfValues.add(values5);
        ListOfResults.add(results5);
        int [] values6 = {-919, 205, -548, 582, -194, -878, 834, -161, 512, -245, -991, -287, 369, -98, 843, 596, };
        int [] results6 = {512, -245, -991, -287, 369, -98, 843, 596, };
        ListOfValues.add(values6);
        ListOfResults.add(results6);
        int [] values7 = {-445, 539, 766, -182, 971, -782, 945, -462, -816, -811, 664, -359, 19, -451, -156, 287, -451, 309, -213, };
        int [] results7 = {-811, 664, -359, 19, -451, -156, 287, -451, 309, -213, };
        ListOfValues.add(values7);
        ListOfResults.add(results7);
        int [] values8 = {-562, 634, -452, -618, 982, 613, -426, -749, 838, -734, -632, -394, -160, -247, -503, -28, -891, 860, -858, 324, 157, 615, };
        int [] results8 = {-394, -160, -247, -503, -28, -891, 860, -858, 324, 157, 615, };
        ListOfValues.add(values8);
        ListOfResults.add(results8);
        int [] values9 = {942, -313, -5, -925, -79, -190, -828, -53, -49, 108, -153, 560, 903, -236, -245, -301, -55, -395, 233, 806, -741, 176, 362, 129, -108, };
        int [] results9 = {903, -236, -245, -301, -55, -395, 233, 806, -741, 176, 362, 129, -108, };
        ListOfValues.add(values9);
        ListOfResults.add(results9);
        int [] values10 = {-716, 714, -426, -603, 223, -811, 173, -515, 860, -1, 401, 961, -168, 989, -151, 926, -809, 155, -790, -598, -966, -511, -60, -639, 867, -912, -490, -563, };
        int [] results10 = {-151, 926, -809, 155, -790, -598, -966, -511, -60, -639, 867, -912, -490, -563, };
        ListOfValues.add(values10);
        ListOfResults.add(results10);
        int [] values11 = {762, 844, 723, 565, 738, 966, 216, 210, -804, 90, -5, 916, 750, 804, 572, -515, 320, -973, -843, -744, -9, -111, -792, 686, -204, 490, 616, 694, -685, -750, 827, };
        int [] results11 = {-515, 320, -973, -843, -744, -9, -111, -792, 686, -204, 490, 616, 694, -685, -750, 827, };
        ListOfValues.add(values11);
        ListOfResults.add(results11);

        for(int i = 0; i < ListOfValues.size(); i++){
            int [] nextValues = ListOfValues.get(i);
            int [] expectedResults = ListOfResults.get(i);
            int [] actualResults = Sorter.getSecondHalf(nextValues);
            if(!areArraysSame(expectedResults, actualResults)){
                System.out.println("========================================");
                System.out.println("getSecondHalf Error:");
                System.out.println("Input Array: ");
                printArray(nextValues);
                System.out.println("Expected Array: ");
                printArray(expectedResults);
                System.out.println("Recieved Array: ");
                printArray(actualResults);
                output = false;
            }
        }

        if(output){
            System.out.println("getSecondHalf works");
        }else{
            System.out.println("getSecondHalf does not work");
        }
        return output;
    }

    public static boolean testSelectionSort(){
        Sorter student = new Sorter(); 
        boolean output = true;

        ArrayList<int[]> ListOfOriginalValues = new ArrayList<int[]>();
        ArrayList<int[]> ListOfValues = new ArrayList<int[]>();
        ArrayList<int[]> ListOfResults = new ArrayList<int[]>();
        int [] originalValues1 = {-70, };
        int [] values1 = {-70, };
        int [] results1 = {-70, };
        ListOfOriginalValues.add(originalValues1);
        ListOfValues.add(values1);
        ListOfResults.add(results1);
        int [] originalValues2 = {-908, 830, 122, -88, };
        int [] values2 = {-908, 830, 122, -88, };
        int [] results2 = {830, 122, -88, -908, };
        ListOfOriginalValues.add(originalValues2);
        ListOfValues.add(values2);
        ListOfResults.add(results2);
        int [] originalValues3 = {564, 103, -149, -819, -760, -655, 895, };
        int [] values3 = {564, 103, -149, -819, -760, -655, 895, };
        int [] results3 = {895, 564, 103, -149, -655, -760, -819, };
        ListOfOriginalValues.add(originalValues3);
        ListOfValues.add(values3);
        ListOfResults.add(results3);
        int [] originalValues4 = {95, 91, -948, 613, 54, 852, 20, 980, -371, -796, };
        int [] values4 = {95, 91, -948, 613, 54, 852, 20, 980, -371, -796, };
        int [] results4 = {980, 852, 613, 95, 91, 54, 20, -371, -796, -948, };
        ListOfOriginalValues.add(originalValues4);
        ListOfValues.add(values4);
        ListOfResults.add(results4);
        int [] originalValues5 = {-165, 176, 897, -480, 721, -95, -339, -444, 774, 384, -686, 571, -253, };
        int [] values5 = {-165, 176, 897, -480, 721, -95, -339, -444, 774, 384, -686, 571, -253, };
        int [] results5 = {897, 774, 721, 571, 384, 176, -95, -165, -253, -339, -444, -480, -686, };
        ListOfOriginalValues.add(originalValues5);
        ListOfValues.add(values5);
        ListOfResults.add(results5);
        int [] originalValues6 = {237, 784, 425, -791, -32, 190, 402, -822, -907, -347, 748, -863, 559, -966, -818, 709, };
        int [] values6 = {237, 784, 425, -791, -32, 190, 402, -822, -907, -347, 748, -863, 559, -966, -818, 709, };
        int [] results6 = {784, 748, 709, 559, 425, 402, 237, 190, -32, -347, -791, -818, -822, -863, -907, -966, };
        ListOfOriginalValues.add(originalValues6);
        ListOfValues.add(values6);
        ListOfResults.add(results6);
        int [] originalValues7 = {-348, -732, -970, 226, 237, -525, -946, -94, 878, 2, -502, 432, -856, 213, 478, -650, 264, 938, -594, };
        int [] values7 = {-348, -732, -970, 226, 237, -525, -946, -94, 878, 2, -502, 432, -856, 213, 478, -650, 264, 938, -594, };
        int [] results7 = {938, 878, 478, 432, 264, 237, 226, 213, 2, -94, -348, -502, -525, -594, -650, -732, -856, -946, -970, };
        ListOfOriginalValues.add(originalValues7);
        ListOfValues.add(values7);
        ListOfResults.add(results7);
        int [] originalValues8 = {892, 153, -735, -166, -419, 812, -400, 850, 292, 107, -191, -76, -682, 26, 619, 996, 422, -364, 460, -489, 884, -814, };
        int [] values8 = {892, 153, -735, -166, -419, 812, -400, 850, 292, 107, -191, -76, -682, 26, 619, 996, 422, -364, 460, -489, 884, -814, };
        int [] results8 = {996, 892, 884, 850, 812, 619, 460, 422, 292, 153, 107, 26, -76, -166, -191, -364, -400, -419, -489, -682, -735, -814, };
        ListOfOriginalValues.add(originalValues8);
        ListOfValues.add(values8);
        ListOfResults.add(results8);
        int [] originalValues9 = {442, -919, -918, 61, -716, 521, -711, -372, -380, -900, -927, 387, -609, 42, -95, -671, 767, -473, 428, -102, 402, 755, 192, -479, 753, };
        int [] values9 = {442, -919, -918, 61, -716, 521, -711, -372, -380, -900, -927, 387, -609, 42, -95, -671, 767, -473, 428, -102, 402, 755, 192, -479, 753, };
        int [] results9 = {767, 755, 753, 521, 442, 428, 402, 387, 192, 61, 42, -95, -102, -372, -380, -473, -479, -609, -671, -711, -716, -900, -918, -919, -927, };
        ListOfOriginalValues.add(originalValues9);
        ListOfValues.add(values9);
        ListOfResults.add(results9);
        int [] originalValues10 = {-11, -387, 364, 629, -71, -584, -394, 202, -761, -127, 359, -713, -391, 798, -863, -136, -655, -579, 708, 542, -859, -956, 103, -71, -548, 672, 561, -260, };
        int [] values10 = {-11, -387, 364, 629, -71, -584, -394, 202, -761, -127, 359, -713, -391, 798, -863, -136, -655, -579, 708, 542, -859, -956, 103, -71, -548, 672, 561, -260, };
        int [] results10 = {798, 708, 672, 629, 561, 542, 364, 359, 202, 103, -11, -71, -71, -127, -136, -260, -387, -391, -394, -548, -579, -584, -655, -713, -761, -859, -863, -956, };
        ListOfOriginalValues.add(originalValues10);
        ListOfValues.add(values10);
        ListOfResults.add(results10);
        int [] originalValues11 = {-352, 706, -701, 867, -983, 216, 110, 615, 611, -688, -983, 841, 884, -286, 456, 813, -829, -291, 832, -710, -898, 429, -376, -466, -704, 575, -265, 725, 844, 578, 249, };
        int [] values11 = {-352, 706, -701, 867, -983, 216, 110, 615, 611, -688, -983, 841, 884, -286, 456, 813, -829, -291, 832, -710, -898, 429, -376, -466, -704, 575, -265, 725, 844, 578, 249, };
        int [] results11 = {884, 867, 844, 841, 832, 813, 725, 706, 615, 611, 578, 575, 456, 429, 249, 216, 110, -265, -286, -291, -352, -376, -466, -688, -701, -704, -710, -829, -898, -983, -983, };
        ListOfOriginalValues.add(originalValues11);
        ListOfValues.add(values11);
        ListOfResults.add(results11);

        for(int i = 0; i < ListOfValues.size(); i++){
            int [] originalValues = ListOfOriginalValues.get(i);
            int [] nextValues = ListOfValues.get(i);
            int [] expectedResults = ListOfResults.get(i);
            int [] actualResults = Sorter.selectionSort(nextValues);
            if(!areArraysSame(expectedResults, actualResults)){
                System.out.println("========================================");
                System.out.println("selectionSort Error:");
                System.out.println("Input Array: ");
                printArray(originalValues);
                System.out.println("Expected Array: ");
                printArray(expectedResults);
                System.out.println("Recieved Array: ");
                printArray(actualResults);
                output = false;
            }
        }

        if(output){
            System.out.println("selectionSort works");
        }else{
            System.out.println("selectionSort does not work");
        }
        return output;
    }

    public static boolean testInsertionSort(){
        Sorter student = new Sorter(); 
        boolean output = true;

        ArrayList<int[]> ListOfOriginalValues = new ArrayList<int[]>();
        ArrayList<int[]> ListOfValues = new ArrayList<int[]>();
        ArrayList<int[]> ListOfResults = new ArrayList<int[]>();
        int [] originalValues1 = {-70, };
        int [] values1 = {-70, };
        int [] results1 = {-70, };
        ListOfOriginalValues.add(originalValues1);
        ListOfValues.add(values1);
        ListOfResults.add(results1);
        int [] originalValues2 = {-908, 830, 122, -88, };
        int [] values2 = {-908, 830, 122, -88, };
        int [] results2 = {830, 122, -88, -908, };
        ListOfOriginalValues.add(originalValues2);
        ListOfValues.add(values2);
        ListOfResults.add(results2);
        int [] originalValues3 = {564, 103, -149, -819, -760, -655, 895, };
        int [] values3 = {564, 103, -149, -819, -760, -655, 895, };
        int [] results3 = {895, 564, 103, -149, -655, -760, -819, };
        ListOfOriginalValues.add(originalValues3);
        ListOfValues.add(values3);
        ListOfResults.add(results3);
        int [] originalValues4 = {95, 91, -948, 613, 54, 852, 20, 980, -371, -796, };
        int [] values4 = {95, 91, -948, 613, 54, 852, 20, 980, -371, -796, };
        int [] results4 = {980, 852, 613, 95, 91, 54, 20, -371, -796, -948, };
        ListOfOriginalValues.add(originalValues4);
        ListOfValues.add(values4);
        ListOfResults.add(results4);
        int [] originalValues5 = {-165, 176, 897, -480, 721, -95, -339, -444, 774, 384, -686, 571, -253, };
        int [] values5 = {-165, 176, 897, -480, 721, -95, -339, -444, 774, 384, -686, 571, -253, };
        int [] results5 = {897, 774, 721, 571, 384, 176, -95, -165, -253, -339, -444, -480, -686, };
        ListOfOriginalValues.add(originalValues5);
        ListOfValues.add(values5);
        ListOfResults.add(results5);
        int [] originalValues6 = {237, 784, 425, -791, -32, 190, 402, -822, -907, -347, 748, -863, 559, -966, -818, 709, };
        int [] values6 = {237, 784, 425, -791, -32, 190, 402, -822, -907, -347, 748, -863, 559, -966, -818, 709, };
        int [] results6 = {784, 748, 709, 559, 425, 402, 237, 190, -32, -347, -791, -818, -822, -863, -907, -966, };
        ListOfOriginalValues.add(originalValues6);
        ListOfValues.add(values6);
        ListOfResults.add(results6);
        int [] originalValues7 = {-348, -732, -970, 226, 237, -525, -946, -94, 878, 2, -502, 432, -856, 213, 478, -650, 264, 938, -594, };
        int [] values7 = {-348, -732, -970, 226, 237, -525, -946, -94, 878, 2, -502, 432, -856, 213, 478, -650, 264, 938, -594, };
        int [] results7 = {938, 878, 478, 432, 264, 237, 226, 213, 2, -94, -348, -502, -525, -594, -650, -732, -856, -946, -970, };
        ListOfOriginalValues.add(originalValues7);
        ListOfValues.add(values7);
        ListOfResults.add(results7);
        int [] originalValues8 = {892, 153, -735, -166, -419, 812, -400, 850, 292, 107, -191, -76, -682, 26, 619, 996, 422, -364, 460, -489, 884, -814, };
        int [] values8 = {892, 153, -735, -166, -419, 812, -400, 850, 292, 107, -191, -76, -682, 26, 619, 996, 422, -364, 460, -489, 884, -814, };
        int [] results8 = {996, 892, 884, 850, 812, 619, 460, 422, 292, 153, 107, 26, -76, -166, -191, -364, -400, -419, -489, -682, -735, -814, };
        ListOfOriginalValues.add(originalValues8);
        ListOfValues.add(values8);
        ListOfResults.add(results8);
        int [] originalValues9 = {442, -919, -918, 61, -716, 521, -711, -372, -380, -900, -927, 387, -609, 42, -95, -671, 767, -473, 428, -102, 402, 755, 192, -479, 753, };
        int [] values9 = {442, -919, -918, 61, -716, 521, -711, -372, -380, -900, -927, 387, -609, 42, -95, -671, 767, -473, 428, -102, 402, 755, 192, -479, 753, };
        int [] results9 = {767, 755, 753, 521, 442, 428, 402, 387, 192, 61, 42, -95, -102, -372, -380, -473, -479, -609, -671, -711, -716, -900, -918, -919, -927, };
        ListOfOriginalValues.add(originalValues9);
        ListOfValues.add(values9);
        ListOfResults.add(results9);
        int [] originalValues10 = {-11, -387, 364, 629, -71, -584, -394, 202, -761, -127, 359, -713, -391, 798, -863, -136, -655, -579, 708, 542, -859, -956, 103, -71, -548, 672, 561, -260, };
        int [] values10 = {-11, -387, 364, 629, -71, -584, -394, 202, -761, -127, 359, -713, -391, 798, -863, -136, -655, -579, 708, 542, -859, -956, 103, -71, -548, 672, 561, -260, };
        int [] results10 = {798, 708, 672, 629, 561, 542, 364, 359, 202, 103, -11, -71, -71, -127, -136, -260, -387, -391, -394, -548, -579, -584, -655, -713, -761, -859, -863, -956, };
        ListOfOriginalValues.add(originalValues10);
        ListOfValues.add(values10);
        ListOfResults.add(results10);
        int [] originalValues11 = {-352, 706, -701, 867, -983, 216, 110, 615, 611, -688, -983, 841, 884, -286, 456, 813, -829, -291, 832, -710, -898, 429, -376, -466, -704, 575, -265, 725, 844, 578, 249, };
        int [] values11 = {-352, 706, -701, 867, -983, 216, 110, 615, 611, -688, -983, 841, 884, -286, 456, 813, -829, -291, 832, -710, -898, 429, -376, -466, -704, 575, -265, 725, 844, 578, 249, };
        int [] results11 = {884, 867, 844, 841, 832, 813, 725, 706, 615, 611, 578, 575, 456, 429, 249, 216, 110, -265, -286, -291, -352, -376, -466, -688, -701, -704, -710, -829, -898, -983, -983, };
        ListOfOriginalValues.add(originalValues11);
        ListOfValues.add(values11);
        ListOfResults.add(results11);

        for(int i = 0; i < ListOfValues.size(); i++){
            int [] originalValues = ListOfOriginalValues.get(i);
            int [] nextValues = ListOfValues.get(i);
            int [] expectedResults = ListOfResults.get(i);
            int [] actualResults = Sorter.insertionSort(nextValues);
            if(!areArraysSame(expectedResults, actualResults)){
                System.out.println("========================================");
                System.out.println("insertionSort Error:");
                System.out.println("Input Array: ");
                printArray(originalValues);
                System.out.println("Expected Array: ");
                printArray(expectedResults);
                System.out.println("Recieved Array: ");
                printArray(actualResults);
                output = false;
            }
        }

        if(output){
            System.out.println("insertionSort works");
        }else{
            System.out.println("insertionSort does not work");
        }
        return output;
    }
    // public static boolean testisItNegative(){
    // NumberAnalyzer student = new NumberAnalyzer(); 
    // boolean output = true;

    // int [] numbers = {-50, -49, -48, -47, -46, -45, -44, -43, -42, -41, -40, -39, -38, -37, -36, -35, -34, -33, -32, -31, -30, -29, -28, -27, -26, -25, -24, -23, -22, -21, -20, -19, -18, -17, -16, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, -2762, -8437, -6782, 1095, 3045, 1239, 4678, -37, 710, 2797, 3464, -4296, -2272, 7689, 2817, -6307, -1669, 178, -7075, -7026, -718, -9607, 8123, -1571, -8298, -9350, 5395, -2290, 2456, 2792, -16, 4622, 7066, -7718, -7347, 1420, -9813, 3413, 7546, 3912, -579, -774, -369, 5328, -6455, 9596, 6336, 7572, 7210, 1431, };
    // boolean [] results = {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, false, false, false, false, true, false, false, false, true, true, false, false, true, true, false, true, true, true, true, false, true, true, true, false, true, false, false, true, false, false, true, true, false, true, false, false, false, true, true, true, false, true, false, false, false, false, false, };

    // for(int i = 0; i < numbers.length; i++){
    // if(student.isItNegative(numbers[i]) != results[i]){
    // System.out.println("isItNegative failed, " + "isItNegative(" + numbers[i] + ")" + " results in " + student.isItNegative(numbers[i]) + ", not equal to " + results[i]);
    // output = false;
    // }
    // }

    // if(output){
    // System.out.println("isItNegative works");
    // }else{
    // System.out.println("isItNegative does not work");
    // }
    // return output;
    // }

    // public static boolean testgetBonus(){
    // PayRoll student = new PayRoll(); 
    // boolean output = true;

    // double [] sales = {0.0, 15000.0, 30000.0, 45000.0, 60000.0, 75000.0, 90000.0, 105000.0, 120000.0, 135000.0, 150000.0, 165000.0, 180000.0, 195000.0, 210000.0, 225000.0, 240000.0, 255000.0, 270000.0, 285000.0, 300000.0, 315000.0, 330000.0, 345000.0, 360000.0, 375000.0, 390000.0, 405000.0, 420000.0, 435000.0, 450000.0, 465000.0, 480000.0, 495000.0, 510000.0, 525000.0, 540000.0, 555000.0, 570000.0, 585000.0, 600000.0, 100864.57, 841316.48, 124996.51, 641165.96, 298165.18, 715652.17, 61371.16, 831306.72, 457055.28, 179089.76, 128972.7, 326216.68, 87269.77, 526496.81, 750676.7, 138761.88, 393090.32, 838056.98, 144468.26, 660805.26, 876868.29, 55687.05, 162244.54, 759651.17, 551481.34, 867094.9, 491960.82, 184221.65, 587193.22, 274950.49, 685796.29, 315174.08, 563113.74, 424930.8, 87369.17, 880085.04, 619431.64, 993938.76, 622630.47, 372988.34, 713820.22, 198585.23, 591918.4, 566969.68, 873891.88, 274062.27, 54756.68, 689184.68, 807304.4, 94824.98, };
    // double [] results = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1500.0, 3000.0, 4500.0, 6000.0, 7500.0, 9000.0, 10500.0, 12000.0, 13500.0, 15000.0, 16500.0, 18000.0, 19500.0, 21000.0, 22500.0, 24000.0, 25500.0, 27000.0, 28500.0, 30000.0, 0.0, 54131.648, 0.0, 34116.596, 0.0, 41565.217000000004, 0.0, 53130.672, 15705.528000000004, 0.0, 0.0, 2621.6679999999997, 0.0, 22649.681000000008, 45067.67, 0.0, 9309.032000000001, 53805.698000000004, 0.0, 36080.526000000005, 57686.829000000005, 0.0, 0.0, 45965.117000000006, 25148.134, 56709.490000000005, 19196.082000000002, 0.0, 28719.322, 0.0, 38579.62900000001, 1517.4080000000017, 26311.374, 12493.08, 0.0, 58008.50400000001, 31943.164000000004, 69393.876, 32263.047, 7298.834000000003, 41382.022, 0.0, 29191.840000000004, 26696.968000000008, 57389.188, 0.0, 0.0, 38918.46800000001, 50730.44, 0.0, };

    // for(int i = 0; i < sales.length; i++){
    // if(Math.abs(student.getBonus(sales[i]) - results[i]) > .01){
    // System.out.println("getBonus failed, " + "getBonus(" + sales[i] + ")" + " results in " + student.getBonus(sales[i]) + ", not equal to " + results[i]);
    // output = false;
    // }
    // }

    // if(output){
    // System.out.println("getBonus works");
    // }else{
    // System.out.println("getBonus does not work");
    // }
    // return output;
    // }

    // public static boolean testisNormalTemp(){
    // Decider student = new Decider(); 
    // boolean output = true;

    // double [] temps = {98.6, 26.8, 107.9, 96.4, 92.2, 117.0, 15.5, 64.4, 91.7, 53.1, 155.3, 95.0, 43.0, 146.9, 69.8, 42.0, 64.3, 11.1, 56.7, 172.6, 33.4, 5.8, 1.6, 186.8, 87.6, 99.0, 76.2, 168.4, 16.5, 13.0, 131.2, 118.8, 21.0, 121.2, 3.3, 22.2, 131.1, 17.4, 56.4, 47.0, 5.6, 186.1, 79.9, 102.6, 64.0, 171.5, 178.7, 137.9, 146.8, 59.6, 109.0, };
    // boolean [] results = {true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, };

    // for(int i = 0; i < temps.length; i++){
    // if(student.isNormalTemp(temps[i]) != results[i]){
    // System.out.println("isNormalTemp failed, " + "isNormalTemp(" + temps[i] + ")" + " results in " + student.isNormalTemp(temps[i]) + ", not equal to " + results[i]);
    // output = false;
    // }
    // }

    // if(output){
    // System.out.println("isNormalTemp works");
    // }else{
    // System.out.println("isNormalTemp does not work");
    // }
    // return output;
    // }

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