package COW5;

import COW5.Tests.Intake;
import java.util.Arrays;

public class ArrayPrinter
{
    public static void print(int [] array, Intake feed){
        for(int i = 0; i < array.length; i++)
            feed.give(array[i]);
    }

    public static void printReverse(int [] array, Intake feed){
        for(int i = array.length-1; i <= 0; i--)
            feed.give(array[i]);
    }

    public static void printEveryOtherElement(int [] array, Intake feed){
        for(int i = 0; i < array.length; i += 2)
            feed.give(array[i]);
    }

    public static void printFirstHalf(int [] array, Intake feed){
        for(int i = 0; i < array.length/2; i++)
            feed.give(array[i]);
    }

    public static void printSecondHalf(int [] array, Intake feed){
        for(int i = array.length/2; i < array.length; i++)
            feed.give(array[i]);
    }

    public static void printSection(int [] array, Intake feed, int startIndex, int endIndex){

    }



}