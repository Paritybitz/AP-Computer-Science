package COW5.Tests;

import COW5.ArrayPrinter;
import COW5.Tests.ArrayAnalyzerTester;
import COW5.Tests.ArrayCounterTester;
import COW5.Tests.ArrayModifierTester;
import COW5.Tests.StatisticalCalcTester;

public class Main {
    public static void main(String[] args) {
        //ArrayAnalyzerTester
        ArrayAnalyzerTester.testAllTheSame();
        ArrayAnalyzerTester.testEqual();
        ArrayAnalyzerTester.testHasValue();
        ArrayAnalyzerTester.testInOrder();
        ArrayAnalyzerTester.testHasTwoUniquePairs();
        ArrayAnalyzerTester.testIsAscending();
        ArrayAnalyzerTester.testIsDecending();

        //ArrayPrinterTester
        ArrayPrinterTester.testPrint();
        ArrayPrinterTester.testPrintEveryOtherElement();
        ArrayPrinterTester.testPrintFirstHalf();
        ArrayPrinterTester.testPrintReverse();
        ArrayPrinterTester.testPrintSecondHalf();
        ArrayPrinterTester.testPrintSection();

        //ArrayCounterTester
        ArrayCounterTester.testCountInRange();
        ArrayCounterTester.testCountNegativeOdds();
        ArrayCounterTester.testCountNonUniqueElements();
        ArrayCounterTester.testCountPairs();
        ArrayCounterTester.testCountPositives();
        ArrayCounterTester.testCountUniqueElements();

        //ArrayModifierTester
        ArrayModifierTester.testAmplify();
        ArrayModifierTester.testCap();
        ArrayModifierTester.testAverageElements();
        ArrayModifierTester.testCompress();
        ArrayModifierTester.testEvenOut();
        ArrayModifierTester.testFlip();

        //StatisticalCalcTester
        StatisticalCalcTester.testGetAverageValue();
        StatisticalCalcTester.testGetCorrelation();
        StatisticalCalcTester.testGetDeviations();
        StatisticalCalcTester.testGetMedianValue();
        StatisticalCalcTester.testStandardDeviation();
        StatisticalCalcTester.testSumArray();
    }
}
