package COW14;

import java.util.Arrays;

public class Sorter
{
    public static int[] getFirstHalf(int[] array){
        int[] newArray = new int[array.length/2];

        for (int i = 0; i < newArray.length; i++)
            newArray[i] = array[i];
        return newArray;
    }

    public static int[] getSecondHalf(int[] array){
        int newArray[] = Arrays.copyOfRange(array, array.length/2, array.length);

        return newArray;
    }

    public static int[] selectionSort(int[] array){
        for(int i1 = 0; i1 < array.length; i1++){
            int indexNextLargest = i1;
            for(int i2 = i1+1; i2 < array.length; i2++){
                if(array[indexNextLargest] < array[i2]){
                    indexNextLargest = i2;
                }
            }
            int temp = array[i1];
            array[i1] = array[indexNextLargest];
            array[indexNextLargest] = temp;
        }
        return array;
    }

    public static int[] insertionSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int indexCurrent = i;
            boolean done = false;
            while(indexCurrent > 0 && !done){
                if(array[indexCurrent] > array[indexCurrent-1]){
                    int temp = array[indexCurrent-1];
                    array[indexCurrent-1] = array[indexCurrent];
                    array[indexCurrent] = temp;
                    indexCurrent--;
                }else{
                    done = true;
                }
            }
        }
        return array;
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int newArray[] = new int[arr1.length + arr2.length];
        int[] reverseArray = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, newArray, 0, arr1.length);
        System.arraycopy(arr2, 0, newArray, arr1.length, arr2.length);
        Arrays.sort(newArray);



        for (int i = 0; i < newArray.length; i++) {
            reverseArray[(newArray.length - 1) - i] = newArray[i];
        }
        newArray = reverseArray;

        return newArray;
    }

    public static int[] pivot(int[] arr1){
        return null;
    }

}
