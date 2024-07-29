package COW9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.Arrays;

public class ArrayContainer {
    int[] theArray;

    public int[] getArray() {
        return theArray;
    }

    public void setArray(int[] theArray) {
        this.theArray = theArray;
    }

    //Level 1 methods

    public void swap(int index1, int index2) {
        int temp = theArray[index1];
        theArray[index1] = theArray[index2];
        theArray[index2] = temp;
    }

    public int findIndexOfBiggest() {
        int greaterIndex = 0;

        for (int i = 1; i < theArray.length - 1; i++) {
            if (theArray[i] > theArray[greaterIndex]) {
                greaterIndex = i;
            }
        }

        return greaterIndex;
    }

    public int findIndexOfSmallest() {
        int smallestIndex = 0;

        for (int i = 1; i < theArray.length - 1; i++) {
            if (theArray[i] < theArray[smallestIndex]) {
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public void appendArray(int[] otherArray) {
        int newArray[] = new int[theArray.length + otherArray.length];
        System.arraycopy(theArray, 0, newArray, 0, theArray.length);
        System.arraycopy(otherArray, 0, newArray, theArray.length, otherArray.length);
        theArray = newArray;
    }

    //Level 2 Methods

    public void reverse() {
        int[] reverseArray = new int[theArray.length];

        for (int i = 0; i < theArray.length; i++) {
            reverseArray[(theArray.length - 1) - i] = theArray[i];
        }
        theArray = reverseArray;
    }

    public int findBiggestValue() {
        int greatestVal = 0;

        for (int i = 1; i < theArray.length - 1; i++) {
            if (theArray[i] > theArray[greatestVal]) {
                greatestVal = i;
            }
        }

        return theArray[greatestVal];
    }

    public int findSmallestValue() {
        int smallestVal = 0;

        for (int i = 1; i < theArray.length - 1; i++) {
            if (theArray[i] < theArray[smallestVal]) {
                smallestVal = i;
            }
        }

        return theArray[smallestVal];
    }

    public int findRangeOfValues() {
        int range = findBiggestValue() - findSmallestValue();

        return range;
    }

    public void appendArrayAtFront(int[] otherArray) {
        int newArray[] = new int[theArray.length + otherArray.length];
        System.arraycopy(otherArray, 0, newArray, 0, otherArray.length);
        System.arraycopy(theArray, 0, newArray, otherArray.length, theArray.length);
        theArray = newArray;
    }

    //Level 3 Methods
    public void shiftLeft() {
        int Lshift[] = new int[theArray.length];
        for (int n = 0; n < theArray.length - 1; n++) {
            Lshift[n] = theArray[n + 1];
        }
        Lshift[theArray.length - 1] = theArray[0];
        theArray = Lshift;
    }

    public int findIndexOfBiggestInRangeOfIndexes(int index1, int index2) {
        int greatestVal = 0;

        for (int i = index1; i <= index2; i++) {
            if (theArray[i] > theArray[greatestVal]) {
                greatestVal = i;
            }
        }

        return greatestVal;
    }

    public int findIndexOfSmallestInRangeOfIndexes(int index1, int index2) {
        int smallestIndex = 0;

        for (int i = index1; i <= index2; i++) {
            if (theArray[i] < theArray[smallestIndex]) {
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public int[] getSubArray(int index1, int index2) {
        int newArray[] = Arrays.copyOfRange(theArray, index1, index2 + 1);

        return newArray;
    }

    //Level 4 Methods

    public void shiftRight() {
        int temp = theArray[theArray.length - 1];

        for (int i = theArray.length - 2; i >= 0; i--) {
            theArray[i + 1] = theArray[i];
        }

        theArray[0] = temp;
    }

    public int findBiggestValueInRangeOfIndexes(int index1, int index2) {
        int greatestVal = 0;

        for (int i = index1; i <= index2 - 1; i++) {
            if (theArray[i] > theArray[greatestVal]) {
                greatestVal = i;
            }
        }

        return theArray[greatestVal];
    }

    public int findSmallestValueInRangeOfIndexes(int index1, int index2) {
        int smallestVal = 0;

        for (int i = index1; i <= index2; i++) {
            if (theArray[i] < theArray[smallestVal]) {
                theArray[smallestVal] = i;
            }
        }

        return theArray[smallestVal];
    }

    public int findRangeOfValuesInRangeOfIndexes(int index1, int index2) {
        int range = findBiggestValueInRangeOfIndexes(index1, index2) - findSmallestValueInRangeOfIndexes(index1, index2);

        return range;
    }

    public void removeElements(int n) {
        int newArray[] = Arrays.copyOfRange(theArray, 0, n + 1);
        theArray = newArray;
    }

    public void removeElementsFromFront(int n) {
        int newArray[] = Arrays.copyOfRange(theArray, n, theArray.length - 1);
        theArray = newArray;
    }

    //Level 5 Methods

    public void move(int index1, int index2) {
        // contains element at index1
        int temp = theArray[index1];

        // shift elements between index1 and index2 (based on which is greater)
        if (index1 < index2) { //if index 2 is greater...
            for (int i = index1; i < index2; i++) {
                theArray[i] = theArray[i + 1];
            }
        } else { //if index 1 is greater...
            for (int i = index1; i > index2; i--) {
                theArray[i] = theArray[i - 1];
            }
        }

        // place element at index2 to complete loop
        theArray[index2] = temp;
    }

    public void swapLargestToFront() {
        // find the largest element in array
        int largest = theArray[0];
        int largestIndex = 0;
        for (int i = 1; i < theArray.length; i++) {
            if (theArray[i] > largest) {
                largest = theArray[i];
                largestIndex = i;
            }
        }

        // swap the largest element with first element in array
        int temp = theArray[0];
        theArray[0] = largest;
        theArray[largestIndex] = temp;
    }

    public void swapLargestToBack() {
        // find the largest element in array
        int largest = theArray[0];
        int largestIndex = 0;
        for (int i = 1; i < theArray.length; i++) {
            if (theArray[i] > largest) {
                largest = theArray[i];
                largestIndex = i;
            }
        }

        // swap the largest element with last element in array
        int temp = theArray[theArray.length - 1];
        theArray[theArray.length - 1] = largest;
        theArray[largestIndex] = temp;
    }

    public void removeElements(int index1, int index2) {
        // create new array to store elements
        int[] newArr = new int[theArray.length - (index2 - index1 + 1)];

        // copy the elements before index1 to the new array
        System.arraycopy(theArray, 0, newArr, 0, index1);

        // refer to appendArrayAtFront() to refresh how to use "System.arraycopy"

        // copy the elements after index2 to new array
        System.arraycopy(theArray, index2 + 1, newArr, index1, theArray.length - index2 - 1);

        theArray = newArr;
    }


    //Level 6 Methods

    public void moveLargestToFront() {

    }

    public void moveLargestToBack() {

    }

    public int[] removeSubArray(int index1, int index2) {
        return new int[0];
    }

    public void appendArrayAtIndex(int[] otherArray, int index) {

    }


    ////////////////////////////////////////////////////////////////////////////////
    //DO NOT EDIT BELOW!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    private int markedIndex;
    private boolean indexMarked;

    public ArrayContainer() {
        indexMarked = false;
        createArray();
    }

    public void createArray() {
        //create an array of integers of random size (range 1 to 30)
        int size = 10 + (int) (Math.random() * 30);
        theArray = new int[size];

        //assign a random value to each integer in the array (range 0 to 99)
        for (int i = 0; i < theArray.length; i++) {
            theArray[i] = (int) (Math.random() * 100);
        }

    }

    public void setIndex(int n) {
        markedIndex = n;
        indexMarked = true;
    }

    public void paintArray(Graphics g) {
        if (theArray != null) {
            int size;
            if (indexMarked) {
                //System.out.println("Marking index");
                size = theArray[markedIndex];
                g.setColor(Color.darkGray);
                g.fillRect(8 + markedIndex * 23, 130 - size, 17, size + 40);
                g.setColor(Color.ORANGE);
                g.drawRect(7 + markedIndex * 23, 129 - size, 19, size + 41);
                indexMarked = false;
            }

            for (int index = 0; index < theArray.length; index++) {
                size = theArray[index];

                g.setColor(Color.RED);
                g.fillRect(10 + index * 23, 150 - size, 13, size);

                String valueInString = ("" + size);
                g.setColor(Color.WHITE);
                g.drawString(valueInString, 10 + index * 23, 145 - size);

                valueInString = ("" + index);
                g.setColor(Color.GREEN);
                g.drawString(valueInString, 10 + index * 23, 162);
            }

        }
    }
}