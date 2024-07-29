package COW3.Tests;

import COW3.Address;
import COW3.Box;
import COW3.Digit;

import java.awt.*;

public class Level5Tester
{
    public static void main(String [] arg){
        testLevel5();
    }

    public static boolean testLevel5(){
        boolean one = testAddress();
        boolean two = testDigit();
        if(one && two ){
            System.out.println("Level 5 works");
            return true;
        }else{
            System.out.println("Level 5 DOES NOT work");
            return false;
        }
    }

    public static boolean testAddress(){
        Address [] addresses = new Address [6];

        addresses[0] = new Address(1234, "Milky Way Lane", "Sterling", "VA", 20165, "USA");

        addresses[1] = new Address(986, "Glowood Drive", "Pittsburgh", "PA", 15227, "USA");

        addresses[2] = new Address(1235, "Milky Way Lane", "Sterling", "VA", 20165, "USA");

        addresses[3] = new Address(1234, "Milky Way Road", "Sterling", "VA", 20165, "USA");

        addresses[4] = new Address(1234, "Milky Way Lane", "Sterling", "MD", 34157, "USA");

        addresses[5] = new Address(1234, "Milky Way Lane", "Sterling", "VA", 20165, "USA");

        boolean success = true;

        if(addresses[0].getNumber() != 1234 || addresses[1].getNumber() != 986){
            success = false;
            System.out.println("number variable or accessor method not set up correctly!");
        }
        if(!addresses[0].getStreet().equals("Milky Way Lane") || !addresses[1].getStreet().equals("Glowood Drive")){
            success = false;
            System.out.println("street variable or accessor method not set up correctly!");
        }
        if(!addresses[0].getCounty().equals("Sterling") || !addresses[1].getCounty().equals("Pittsburgh")){
            success = false;
            System.out.println("county variable or accessor method not set up correctly!");
        }
        if(!addresses[0].getState().equals("VA") || !addresses[1].getState().equals("PA")){
            success = false;
            System.out.println("state variable or accessor method not set up correctly!");
        }
        if(addresses[0].getZipCode() != 20165 || addresses[1].getZipCode() != 15227){
            success = false;
            System.out.println("zipCode variable or accessor method not set up correctly!");
        }
        if(!addresses[0].getCountry().equals("USA") || !addresses[1].getCountry().equals("USA")){
            success = false;
            System.out.println("country variable or accessor method not set up correctly!");
        }

        if(!addresses[0].toString().equals("1234 Milky Way Lane\nSterling, VA 20165\nUSA")){
            success = false;
            System.out.println("toString method not set up correctly!");
        }

        if(!addresses[1].toString().equals("986 Glowood Drive\nPittsburgh, PA 15227\nUSA")){
            success = false;
            System.out.println("toString method not set up correctly!");
        }

        // for(int n = 0; n < addresses.length; n++){
        // System.out.println("     COW7.Address " + (n+1));
        // System.out.println(addresses[n]);
        // System.out.println();
        // }
        for(int n = 1; n < addresses.length-1; n++){
            if(addresses[n].equals(addresses[0])){
                success = false;
                System.out.println("False positive for equals");
            }
        }
        if(!addresses[5].equals(addresses[0])){
            success = false;
            System.out.println("False negative for equals");
        }

        if(success){
            System.out.println("COW7.Address works for Level 5");
        }else{
            System.out.println("COW7.Address does NOT work for Level 5");
        }
        return success;

    }

    public static boolean testDigit(){
        boolean success = true;

        Digit [] theDigits = new Digit[10];
        for(int i = 0; i < theDigits.length; i++){
            Box top = new Box(20, 0, Color.GREEN, 80, 20);
            Box middle = new Box(20, 100, Color.GREEN, 80, 20);
            Box bottom = new Box(20, 200, Color.GREEN, 80, 20);
            Box upperRight = new Box(100, 20, Color.GREEN, 20, 80);
            Box lowerRight = new Box(100, 120, Color.GREEN, 20, 80);
            Box upperLeft = new Box(0, 20, Color.GREEN, 20, 80);
            Box lowerLeft = new Box(0, 120, Color.GREEN, 20, 80);
            theDigits[i] = new Digit(i, top, middle, bottom, upperRight, lowerRight, upperLeft, lowerLeft);
            theDigits[i].updateDisplay();
        }

        boolean [][] values = { {true, false, true, true, true, true, true},
                {false, false, false, true, true, false, false},
                {true, true, true, true, false, false, true},
                {true, true, true, true, true, false, false},
                {false, true, false, true, true, true, false},
                {true, true, true, false, true, true, false},
                {true, true, true, false, true, true, true},
                {true, false, false, true, true, false, false},
                {true, true, true, true, true, true, true},
                {true, true, false, true, true, true, false}
        };
        String [] descriptions = {"Top", "Middle", "Bottom", "Upper Right", "Lower Right", "Upper Left", "Lower Left"};

        for(int i = 0; i < theDigits.length; i++){
            for(int i2 = 0; i2 < descriptions.length; i2++){
                if(theDigits[i].getBar(descriptions[i2]).getIsOn() != values[i][i2]){
                    success = false;
                    System.out.println(descriptions[i2] + " isOn setting nor correct for digit value of " + i);
                }
            }
        }

        if(success){
            System.out.println("Digit works for Level 5");
        }else{
            System.out.println("Digit does NOT work for Level 5");
        }

        return success;
    }
}