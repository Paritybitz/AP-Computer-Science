package COW10;

import java.math.BigInteger;

public class BinaryFun {

    //ASCII CHART
    //https://www.techonthenet.com/ascii/chart.php

    //level 1
    //https://www.youtube.com/watch?time_continue=500&v=cWRB9P5NpqE&feature=emb_logo
    public int convertBinaryToDecimal(boolean[] binaryValues) {
        int decimalNumber = 0;

        for (int i = 0; i < binaryValues.length; i++) {
            if (binaryValues[i]) {
                decimalNumber += Math.pow(2, i);
            }
        }

        return decimalNumber;
    }

    //level 2
    //https://www.geeksforgeeks.org/java-program-for-hexadecimal-to-decimal-conversion/
    public int convertHexadecimalToDecimal(char[] hexValues) {
        int decimalNumber = 0;

        for(int i = 0; i < hexValues.length; i++){
            // number values '0' through '9' are 48 through 57 in ASCII
            if((int) hexValues[i] >= 48 && (int) hexValues[i] <= 57){
                decimalNumber += Character.getNumericValue(hexValues[i]) * Math.pow(16, i);
            }
            // uppercase letters 'A' - 'F' are 65 through 70 in ASCII.
            // HEX values of 'A' - 'F' are 10 - 15,
            // we subtract 55 from their ASCII values to start its count from 10
            else if((int) hexValues[i] <= 70 && (int) hexValues[i] >= 65){
                decimalNumber += ((int) hexValues[i] - 55) * Math.pow(16, i);
            }
        }

        return decimalNumber;
    }

    //level 3
    //(done by teacher) - just needed to add loop
    public boolean[] addBinary(boolean[] binaryOne, boolean[] binaryTwo) {
        boolean[] binarySum;
        binarySum = new boolean[binaryOne.length + 1];
        boolean carry = false;

        for (int i = 0; i < binaryOne.length; i++) {
            if (binaryOne[i] == false && binaryTwo[i] == false && carry == false) {
                binarySum[i] = false;
                carry = false;
            }

            else if (binaryOne[i] == true && binaryTwo[i] == false && carry == false) {
                binarySum[i] = true;
                carry = false;
            }

            else if (binaryOne[i] == false && binaryTwo[i] == true && carry == false) {
                binarySum[i] = true;
                carry = false;
            }

            else if (binaryOne[i] == true && binaryTwo[i] == true && carry == false) {
                binarySum[i] = false;
                carry = true;
            }

            else if (binaryOne[i] == false && binaryTwo[i] == false && carry == true) {
                binarySum[i] = true;
                carry = false;
            }

            else if (binaryOne[i] == true && binaryTwo[i] == false && carry == true) {
                binarySum[i] = false;
                carry = true;
            }

            else if (binaryOne[i] == false && binaryTwo[i] == true && carry == true) {
                binarySum[i] = false;
                carry = true;
            }

            else if (binaryOne[i] == true && binaryTwo[i] == true && carry == true) {
                binarySum[i] = true;
                carry = true;
            }
        }

        binarySum[binarySum.length - 1] = carry;
        return binarySum;
    }

    //level 4
    public char[] addHexadecimal(char[] hexOne, char[] hexTwo) {
        // convert the hexadecimal values to decimal
        int decimal1 = convertHexadecimalToDecimal(hexOne);
        int decimal2 = convertHexadecimalToDecimal(hexTwo);

        // add converted decimal values
        int decimalSum = decimal1 + decimal2;

        // convert decimal sum back to hexadecimal and make all UpperCase
        String hexSum = Integer.toHexString(decimalSum).toUpperCase();

        // convert the hexadecimal string to array of chars
        char[] hexSumArray = hexSum.toCharArray(); //

        // flip the hexadecimal sum array
        char[] flippedHexSumArray = new char[hexSumArray.length];
        for (int i = 0; i < hexSumArray.length; i++) {
            flippedHexSumArray[i] = hexSumArray[hexSumArray.length - 1 - i];
        }

        // return the flipped hexadecimal sum as array
        return flippedHexSumArray;
    }

    //level 5
    public char[] convertBinaryToHex(boolean[] binary) {
        //Convert the binary to decimal
        int decValue = convertBinaryToDecimal(binary);

        //convert dec to hex
        String hexValue = convertDecimalToHex(decValue);

        char[] retVal = hexValue.toCharArray();

        // flip the hexadecimal sum array
        char[] flippedHexArray = new char[retVal.length];
        for (int i = 0; i < retVal.length; i++) {
            flippedHexArray[i] = retVal[retVal.length - 1 - i];
        }
        // return the flipped hexadecimal sum as array
        return flippedHexArray;

    }

    public String convertDecimalToHex(int decimalValue)
    {
        String hexValue = Integer.toHexString(decimalValue).toUpperCase();
        return hexValue;
    }
}