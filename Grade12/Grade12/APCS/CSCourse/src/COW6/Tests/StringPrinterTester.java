package COW6.Tests;

import COW6.StringPrinter;

public class StringPrinterTester
{
    public static void testAll(){
        testPrintEachChar();
        System.out.println();
        System.out.println("===================================================");
        testPrintOutInReverse();
        System.out.println();
        System.out.println("===================================================");
        testPrintTwoWords();
        System.out.println();
        System.out.println("===================================================");
        testPrintOutBirthday();
        System.out.println();
        System.out.println("===================================================");
        testPrintOutAddress();
        System.out.println();
        System.out.println("===================================================");
        testPrintWords();
    }

    public static void testPrintEachChar(){
        StringPrinter printer = new StringPrinter();
        System.out.println("Testing: printOutEachChar(\"Hokies\")");
        printer.printOutEachChar("Hokies");
    }

    public static void testPrintOutInReverse(){
        StringPrinter printer = new StringPrinter();
        System.out.println("Testing: printOutInReverse(\"Hokies\")");
        printer.printOutInReverse("Hokies");
    }

    public static void testPrintTwoWords(){
        StringPrinter printer = new StringPrinter();
        System.out.println("Testing: printTwoWords(\"Virginia Tech\")");
        printer.printTwoWords("Virginia Tech");
    }

    public static void testPrintOutBirthday(){
        StringPrinter printer = new StringPrinter();
        System.out.println("Testing: printOutBirthday(\"January 13, 1978\")");
        printer.printOutBirthday("January 13, 1978");
        System.out.println();
        System.out.println("Testing: printOutBirthday(\"March 9, 1976\")");
        printer.printOutBirthday("March 9, 1976");
    }

    public static void testPrintOutAddress(){
        StringPrinter printer = new StringPrinter();
        System.out.println("Testing: printOutAddress(\"211 Baker Street, Sterling, VA 20165\")");
        printer.printOutAddress("211 Baker Street, Sterling, VA 20165");
        System.out.println();
        System.out.println("Testing: printOutAddress(\"18515 North Crescent Avenue, Prince William, MD 91481\")");
        printer.printOutAddress("18515 North Crescent Avenue, Prince William, MD 91481");

    }

    public static void testPrintWords(){
        StringPrinter printer = new StringPrinter();
        System.out.println("Testing: printWords(\"Virginia Polytechnic Institute State University go yeah\")");
        printer.printWords("Virginia Polytechnic Institute State University go yeah");
    }
}