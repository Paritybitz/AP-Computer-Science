package COW3.Tests;

import COW3.*;
import COW3.Point;

import java.awt.*;
import java.util.*;

public class Level3Tester {
    public static void main(String[] arg) {
        testLevel3();
    }

    public static boolean testLevel3() {
        boolean one = testMyDateLevel3();
        boolean two = testNameLevel3();
        boolean three = testPointLevel3();
        boolean four = testBoxLevel3();
        boolean five = testDigitLevel3();
        if (one && two && three && four && five) {
            System.out.println("Level 3 works");
            return true;
        } else {
            System.out.println("Level 3 DOES NOT work");
            return false;
        }
    }

    public static boolean testMyDateLevel3() {
        int[] days = {3, 12, 21, 24, 28};
        int[] months = {1, 3, 4, 7, 12};
        int[] years = {1734, 1990, 1999, 2001, 30000};
        ArrayList<MyDate> beforeDates = new ArrayList<MyDate>();
        ArrayList<MyDate> afterDates = new ArrayList<MyDate>();
        MyDate centerDate = new MyDate(21, 4, 1999);
        MyDate centerDate2 = new MyDate(21, 4, 1999);
        boolean before = true;
        boolean success = true;

        for (int iYear = 0; iYear < years.length; iYear++) {
            for (int iMonth = 0; iMonth < months.length; iMonth++) {
                for (int iDay = 0; iDay < days.length; iDay++) {
                    if (days[iDay] == centerDate.getDay() && months[iMonth] == centerDate.getMonth() && years[iYear] == centerDate.getYear()) {
                        before = false;
                    } else {
                        if (before) {
                            beforeDates.add(new MyDate(days[iDay], months[iMonth], years[iYear]));
                        } else {
                            afterDates.add(new MyDate(days[iDay], months[iMonth], years[iYear]));
                        }
                    }
                }
            }
        }

        if (!centerDate.equals(centerDate2)) {
            success = false;
            System.out.println("equals not set up correctly!  False negative");
            System.out.println("Date 1: " + centerDate + ",    Other Date: " + centerDate2);
        }

        if (centerDate.compareTo(centerDate2) != 0) {
            success = false;
            System.out.println("compareTo not set up correctly!  False negative for equality");
            System.out.println("Date 1: " + centerDate + ",    Other Date: " + centerDate2);
            System.out.println("Returns: " + centerDate.compareTo(centerDate2));
        }

        for (MyDate nextDate : beforeDates) {
            if (centerDate.equals(nextDate)) {
                success = false;
                System.out.println("equals not set up correctly!  False positive for equality");
                System.out.println("Date 1: " + centerDate + ",    Other Date: " + nextDate);
            }

            if (centerDate.compareTo(nextDate) <= 0) {
                success = false;
                System.out.println("compareTo not set up correctly!  Should be negative");
                System.out.println("Date 1: " + centerDate + ",    Other Date: " + nextDate);
                System.out.println("Returns: " + centerDate.compareTo(nextDate));
            }
        }

        for (MyDate nextDate : afterDates) {
            if (centerDate.equals(nextDate)) {
                success = false;
                System.out.println("equals not set up correctly!  False positive for equality");
                System.out.println("Date 1: " + centerDate + ",    Other Date: " + nextDate);
            }

            if (centerDate.compareTo(nextDate) >= 0) {
                success = false;
                System.out.println("compareTo not set up correctly!  Should be positive");
                System.out.println("Date 1: " + centerDate + ",    Other Date: " + nextDate);
                System.out.println("Returns: " + centerDate.compareTo(nextDate));
            }
        }
        if (success) {
            System.out.println("COW7.MyDate Level 3 works");
        } else {
            System.out.println("COW7.MyDate Level 3 does NOT work");
        }
        return success;

    }

    public static boolean testNameLevel3() {
        String[] middleNames = {"Colton", "Jason", "John", "Tomas", "Xavier"};
        String[] firstNames = {"Austin", "Borys", "Eli", "Varun", "Yaro"};
        String[] lastNames = {"Bluto", "Martinez", "Mayewsky", "Mozart", "Roosevelt"};
        ArrayList<Name> beforeNames = new ArrayList<Name>();
        ArrayList<Name> afterNames = new ArrayList<Name>();
        Name centerName = new Name("Eli", "John", "Mayewsky");
        Name centerName2 = new Name("Eli", "John", "Mayewsky");
        boolean before = true;
        boolean success = true;

        for (int iLastNames = 0; iLastNames < lastNames.length; iLastNames++) {
            for (int iFirstNames = 0; iFirstNames < firstNames.length; iFirstNames++) {
                for (int iMiddleNames = 0; iMiddleNames < middleNames.length; iMiddleNames++) {
                    if (middleNames[iMiddleNames].equals(centerName.getMiddleName()) && firstNames[iFirstNames].equals(centerName.getFirstName()) && lastNames[iLastNames].equals(centerName.getLastName())) {
                        before = false;
                    } else {
                        if (before) {
                            beforeNames.add(new Name(firstNames[iFirstNames], middleNames[iMiddleNames], lastNames[iLastNames]));
                        } else {
                            afterNames.add(new Name(firstNames[iFirstNames], middleNames[iMiddleNames], lastNames[iLastNames]));
                        }
                    }
                }
            }
        }

        if (!centerName.equals(centerName2)) {
            success = false;
            System.out.println("COW7.Name equals not set up correctly! False negative");
            System.out.println("COW7.Name 1: " + centerName + ",    Other COW7.Name: " + centerName2);
        }

        if (centerName.compareTo(centerName2) != 0) {
            success = false;
            System.out.println("COW7.Name compareTo not set up correctly! Equality not working");
            System.out.println("COW7.Name 1: " + centerName + ",    Other COW7.Name: " + centerName2);
            System.out.println("Returns: " + centerName.compareTo(centerName2));
        }

        for (Name nextName : beforeNames) {
            if (centerName.equals(nextName)) {
                success = false;
                System.out.println("COW7.Name equals not set up correctly!, False positive for equality");
                System.out.println("COW7.Name 1: " + centerName + ",    Other COW7.Name: " + nextName);
            }

            if (centerName.compareTo(nextName) <= 0) {
                success = false;
                System.out.println("COW7.Name compareTo not set up correctly!, Negative expected");
                System.out.println("COW7.Name 1: " + centerName + ",    Other COW7.Name: " + nextName);
                System.out.println("Returns: " + centerName.compareTo(nextName));
            }
        }

        for (Name nextName : afterNames) {
            if (centerName.equals(nextName)) {
                success = false;
                System.out.println("COW7.Name equals not set up correctly!, False positive for equality");
                System.out.println("COW7.Name 1: " + centerName + ",    Other COW7.Name: " + nextName);
            }

            if (centerName.compareTo(nextName) >= 0) {
                success = false;
                System.out.println("COW7.Name compareTo not set up correctly!, Positive expected");
                System.out.println("COW7.Name 1: " + centerName + ",    Other COW7.Name: " + nextName);
                System.out.println("Returns: " + centerName.compareTo(nextName));
            }
        }

        if (success) {
            System.out.println("COW7.Name Level 3 works");
        } else {
            System.out.println("COW7.Name Level 3 does NOT work");
        }
        return success;
    }

    public static boolean testPointLevel3() {
        int[] xValues = {100, 100, 104, 100, 50, 300, 10};
        int[] yValues = {104, 104, 100, 200, 104, 400, 12};
        Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.PINK};
        int[] radii = {10, 7, 5, 20, 13, 11, 9};

        Point[] points = new Point[xValues.length];
        boolean output = true;

        for (int i = 0; i < xValues.length; i++) {
            points[i] = new Point(xValues[i], yValues[i], colors[i], radii[i]);
        }

        if (!points[0].equals(points[1])) {
            System.out.println("False negative for .equals.");
            output = false;
        }
        for (int i = 2; i < points.length; i++) {
            if (points[0].equals(points[i])) {
                System.out.println("False positive for .equals.");
                output = false;
            }
        }

        if (points[0].compareTo(points[1]) != 0 || points[0].compareTo(points[2]) != 0) {
            System.out.println("compareTo fails for equality");
            output = false;
        }

        if (points[0].compareTo(points[3]) >= 0 || points[0].compareTo(points[5]) >= 0) {
            System.out.println("compareTo fails for negative result");
            output = false;
        }

        if (points[0].compareTo(points[4]) <= 0 || points[0].compareTo(points[6]) <= 0) {
            System.out.println("compareTo fails for positive result");
            output = false;
        }

        if (output) {
            System.out.println("COW7.Point Level 3 works");
        } else {
            System.out.println("COW7.Point Level 3 does NOT work");
        }
        return output;
    }

    public static boolean testBoxLevel3() {
        int[] xValues = {100, 100, 200, 100, 50, 300, 250};
        int[] yValues = {100, 100, 100, 200, 100, 400, 74};
        Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.PINK};
        int[] widths = {50, 50, 200, 70, 50, 230, 23};
        int[] heights = {100, 100, 25, 100, 99, 190, 19};

        Box[] boxes = new Box[xValues.length];
        boolean output = true;

        for (int i = 0; i < xValues.length; i++) {
            boxes[i] = new Box(xValues[i], yValues[i], colors[i], widths[i], heights[i]);
        }

        if (!boxes[0].equals(boxes[1])) {
            System.out.println("False negative for .equals.");
            output = false;
        }
        for (int i = 2; i < boxes.length; i++) {
            if (boxes[0].equals(boxes[i])) {
                System.out.println("False positive for .equals.");
                output = false;
            }
        }

        if (boxes[0].compareTo(boxes[1]) != 0 || boxes[0].compareTo(boxes[2]) != 0) {
            System.out.println("compareTo fails for equality");
            output = false;
        }

        if (boxes[0].compareTo(boxes[3]) >= 0 || boxes[0].compareTo(boxes[5]) >= 0) {
            System.out.println("compareTo fails for negative result");
            output = false;
        }

        if (boxes[0].compareTo(boxes[4]) <= 0 || boxes[0].compareTo(boxes[6]) <= 0) {
            System.out.println("compareTo fails for positive result");
            output = false;
        }

        if (output) {
            System.out.println("Box Level 3 works");
        } else {

            System.out.println("Box Level 3 does NOT work");
        }
        return output;
    }

    public static boolean testDigitLevel3() {
        int[] values = {4, 4, 6, 7, 3, 9, 1};

        Digit[] digits = new Digit[values.length];
        boolean output = true;

        for (int i = 0; i < digits.length; i++) {
            digits[i] = new Digit(values[i]);
        }

        if (!digits[0].equals(digits[1])) {
            System.out.println("False negative for .equals.");
            output = false;
        }
        for (int i = 2; i < digits.length; i++) {
            if (digits[0].equals(digits[i])) {
                System.out.println("False positive for .equals.");
                output = false;
            }
        }

        if (digits[0].compareTo(digits[1]) != 0) {
            System.out.println("compareTo fails for equality");
            output = false;
        }

        if (digits[0].compareTo(digits[3]) >= 0 || digits[0].compareTo(digits[5]) >= 0) {
            System.out.println("compareTo fails for negative result");
            output = false;
        }

        if (digits[0].compareTo(digits[4]) <= 0 || digits[0].compareTo(digits[6]) <= 0) {
            System.out.println("compareTo fails for positive result");
            output = false;
        }

        if (output) {
            System.out.println("Digit Level 3 works");
        } else {
            System.out.println("Digit Level 3 does NOT work");
        }
        return output;
    }
}