package COW6.Tests;

import COW6.StringAnalyzer;

public class StringAnalyzerTester
{
    public static void main(String [] args){
        testAll();
    }

    public static boolean testAll(){
        boolean countSentencesWorks = testCountSentences();
        boolean countVowelsWorks = testCountVowels();
        boolean countConsonantsWorks = testCountConsonants();
        boolean countOccurencesWorks = testCountOccurences();
        boolean countTotalOccurance = testCountTotalOccurance();
        boolean findWordsWorks = testFindWords();
        if(countSentencesWorks && countVowelsWorks && countConsonantsWorks && countOccurencesWorks && countTotalOccurance && findWordsWorks){
            System.out.println("String Analyzer works");
            return true;
        }else{
            System.out.println("String Analyzer does NOT work");
            return false;
        }
    }

    public static boolean testCountSentences(){
        StringAnalyzer analyzer = new StringAnalyzer();
        int result1 = analyzer.countSentences("GO");
        int result2 = analyzer.countSentences("GO Tech GO.");
        int result3 = analyzer.countSentences("GO Tech Go! Beat them hoos.  By how much?");
        if(result1 == 0 && result2 == 1 && result3 == 3){
            System.out.println("Count Sentences WORKS!!!!");
            return true;
        }else{
            System.out.println("Count Sentences doesn't work");
            System.out.println("Counts: " + result1 + ", " + result2 + ", " + result3);
            System.out.println("Should be: 0 1 3");
            return false;
        }
    }

    public static boolean testCountVowels(){
        StringAnalyzer analyzer = new StringAnalyzer();
        int result1 = analyzer.countVowels("GRR");
        int result2 = analyzer.countVowels("Virginia");
        int result3 = analyzer.countVowels("Electricaloraumas");
        int result4 = analyzer.countVowels("aeiouAEIOU");
        if(result1 == 0 && result2 == 4 && result3 == 8 && result4 == 10){
            System.out.println("Count Vowels WORKS!!!!");
            return true;
        }else{
            System.out.println("Count Vowels doesn't work XXXXXX");
            System.out.println("Vowel Counts: " + result1 + ", " + result2 + ", " + result3 + ", " + result4);
            System.out.println("Should be: 0 4 8 10");
            return false;
        }
    }

    public static boolean testCountConsonants(){
        StringAnalyzer analyzer = new StringAnalyzer();
        int result1 = analyzer.countConsonants("GRR");
        int result2 = analyzer.countConsonants("Virginia");
        int result3 = analyzer.countConsonants("Electricaloraumas");
        int result4 = analyzer.countConsonants("aeiouAEIOU");
        if(result1 == 3 && result2 == 4 && result3 == 9 && result4 == 0){
            System.out.println("Count Consonants WORKS!!!!");
            return true;
        }else{
            System.out.println("Count Consonants doesn't work");
            System.out.println("Vowel Consonants: " + result1 + ", " + result2 + ", " + result3 + ", " + result4);
            System.out.println("Should be: 3 4 9 0");
            return false;
        }
    }

    public static boolean testCountOccurences(){
        StringAnalyzer analyzer = new StringAnalyzer();
        int result1 = analyzer.countOccurences("GRR", "R");
        int result2 = analyzer.countOccurences("GO TECH GO... GO TECH", "GO");
        int result3 = analyzer.countOccurences("hohohohohohohoho", "hoho");
        if(result1 == 2 && result2 == 3 && result3 == 7){
            System.out.println("Count Occurences WORKS!!!!");
            return true;
        }else{
            System.out.println("Count Occurences doesn't work");
            System.out.println("Count Occurences: " + result1 + ", " + result2 + ", " + result3);
            System.out.println("Should be: 2 3 7");
            return false;
        }
    }

    public static boolean testCountTotalOccurance(){
        StringAnalyzer analyzer = new StringAnalyzer();
        String [] searchTerms1 =  {"so", "you", "am", "eat"};
        String text1 = "I am so so so great";
        int result1 = analyzer.countTotalOccurance(text1, searchTerms1);
        String [] searchTerms2 =  {"I", "am", "so", "great"};
        String text2 = "I am so so great";
        int result2 = analyzer.countTotalOccurance(text2, searchTerms2);
        String [] searchTerms3 =  {"I", "am", "so", "great"};
        String text3 = "IIIIII am so so great";
        int result3 = analyzer.countTotalOccurance(text3, searchTerms3);
        if(result1 == 5 && result2 == 5 && result3 == 10){
            System.out.println("CountTotalOccurance WORKS!!!!");
            return true;
        }else{
            System.out.println("CountTotalOccurance doesn't work");
            System.out.println("Occurances Counts: " + result1 + ", " + result2 + ", " + result3);
            System.out.println("Should be: 5 5 10");
            return false;
        }
    }

    public static boolean testFindWords(){
        StringAnalyzer analyzer = new StringAnalyzer();
        String [] searchTerms1 =  {"ate", "blue", "for", "lunch", "eat", "and", "key", "I"};
        String text1 = "I ate a turkey sandwhich for lunch";
        String [] result = analyzer.findWords(text1, searchTerms1);
        String [] correctResult = {"ate", "for", "lunch", "and", "key", "I"};
        boolean success = true;
        if(result.length != correctResult.length){
            success = false;
            System.out.println("Result for findWords is not the same size");
        }else{
            for(int i = 0; i < result.length; i++){
                if(!result[i].equals(correctResult[i])){
                    System.out.println(result[i] + " is not " + correctResult[i]);
                    success = false;
                }
            }
        }
        if(success){
            System.out.println("findWords WORKS!!!!");
            return true;
        }else{
            System.out.println("findWords doesn't work");
            return false;
        }
    }
}