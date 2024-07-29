package COW5.Tests;

import COW5.ArrayAnalyzer;

public class ArrayAnalyzerTester
{
    public static void main(String [] arg){
        boolean hasValueWorks = testHasValue();
        boolean allTheSameWorks = testAllTheSame();
        boolean isDecendingWorks = testIsDecending();
        boolean inOrderWorks = testInOrder();
        boolean equalWorks = testEqual();
        boolean hasTwoUniquePairsWorks = testHasTwoUniquePairs();

        if(hasValueWorks && allTheSameWorks && isDecendingWorks && inOrderWorks && equalWorks && hasTwoUniquePairsWorks){
            System.out.println("ArrayAnalyzer works");
        }else{
            System.out.println("ArrayAnalyzer does NOT work");
        }
    }

    public static boolean testHasValue(){
        System.out.println("====================================");
        boolean verified = true;
        ArrayAnalyzer student = new ArrayAnalyzer();
        int [] input = {4, 1, 8, 11, 13, 10, 7, 5, 15, 1};
        boolean has1 = student.hasValue(input, 4);
        if(!has1){
            verified = false;
            System.out.println("hasValue does not work for ({4, 1, 8, 11, 13, 10, 7, 5, 15, 1}, 4).  Results in a false negative");
        }
        boolean has2 = student.hasValue(input, 13);
        if(!has2){
            verified = false;
            System.out.println("hasValue does not work for ({4, 1, 8, 11, 13, 10, 7, 5, 15, 1}, 13).  Results in a false negative");
        }
        boolean has3 = student.hasValue(input, 1);
        if(!has3){
            verified = false;
            System.out.println("hasValue does not work for ({4, 1, 8, 11, 13, 10, 7, 5, 15, 1}, 1).  Results in a false negative");
        }
        boolean has4 = student.hasValue(input, 22);
        if(has4){
            verified = false;
            System.out.println("hasValue does not work for ({4, 1, 8, 11, 13, 10, 7, 5, 15, 1}, 22).  Results in a false positive");
        }
        boolean has5 = student.hasValue(input, 2);
        if(has5){
            verified = false;
            System.out.println("hasValue does not work for ({4, 1, 8, 11, 13, 10, 7, 5, 15, 1}, 2).  Results in a false positive");
        }
        boolean has6 = student.hasValue(input, 14);
        if(has6){
            verified = false;
            System.out.println("hasValue does not work for ({4, 1, 8, 11, 13, 10, 7, 5, 15, 1}, 14).  Results in a false positive");
        }

        if(verified){
            System.out.println("hasValue works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("hasValue does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testAllTheSame(){
        System.out.println("====================================");
        boolean verified = true;
        ArrayAnalyzer student = new ArrayAnalyzer();
        int [] input1 = {5, 5, 5, 5, 5, 5, 5};
        boolean allSame1 = student.allTheSame(input1);
        if(!allSame1){
            verified = false;
            System.out.println("allTheSame does not work for ({5, 5, 5, 5, 5, 5, 5}).  Results in a false negative");
        }
        int [] input2 = {3, 5, 5, 5, 5, 5, 5};
        boolean allSame2 = student.allTheSame(input2);
        if(allSame2){
            verified = false;
            System.out.println("allTheSame does not work for ({3, 5, 5, 5, 5, 5, 5}).  Results in a false positive");
        }
        int [] input3 = {5, 5, 5, 5, 3, 5, 5};
        boolean allSame3 = student.allTheSame(input3);
        if(allSame3){
            verified = false;
            System.out.println("allTheSame does not work for ({5, 5, 5, 5, 3, 5, 5}).  Results in a false positive");
        }
        int [] input4 = {3, 5, 5, 5, 5, 5, 5};
        boolean allSame4 = student.allTheSame(input4);
        if(allSame4){
            verified = false;
            System.out.println("allTheSame does not work for ({5, 5, 5, 5, 5, 5, 3}).  Results in a false positive");
        }

        if(verified){
            System.out.println("allTheSame works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("allTheSame does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testIsAscending(){
        System.out.println("====================================");
        boolean verified = true;
        ArrayAnalyzer student = new ArrayAnalyzer();
        int [] input0 = {4, 7, 8, 9, 11, 14, 15, 21, 23};
        boolean isAscending0 = student.isAscending(input0);
        if(!isAscending0){
            verified = false;
            System.out.println("isAscending does not work for ({4, 7, 8, 9, 11, 14, 15, 21, 23}).  Results in a false negative");
        }
        int [] input1 = {4, 2, 7, 8, 9, 11, 14, 15, 21, 23};
        boolean isAscending1 = student.isAscending(input1);
        if(isAscending1){
            verified = false;
            System.out.println("isAscending does not work for ({4, 2, 7, 8, 9, 11, 14, 15, 21, 23}).  Results in a false positive");
        }
        int [] input2 = {4, 7, 8, 9, 11, 14, 15, 21, 23, 1};
        boolean isAscending2 = student.isAscending(input2);
        if(isAscending2){
            verified = false;
            System.out.println("isAscending does not work for ({4, 7, 8, 9, 11, 14, 15, 21, 23, 1}).  Results in a false positive");
        }
        int [] input3 = {4, 7, 8, 9, 11, 14, 10, 15, 21, 23};
        boolean isAscending3 = student.isAscending(input3);
        if(isAscending3){
            verified = false;
            System.out.println("isAscending does not work for ({4, 7, 8, 9, 11, 14, 10, 15, 21, 23}).  Results in a false positive");
        }
        int [] input4 = {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        boolean isAscending4 = student.isAscending(input4);
        if(isAscending4){
            verified = false;
            System.out.println("isAscending does not work for ({4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}).  Results in a false positive");
        }

        if(verified){
            System.out.println("isAscending works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("isAscending does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testIsDecending(){
        System.out.println("====================================");
        boolean verified = true;
        ArrayAnalyzer student = new ArrayAnalyzer();
        int [] input0 = {23, 21, 15, 14, 11, 9, 8, 7, 4};
        boolean isDecending0 = student.isDecending(input0);
        if(!isDecending0){
            verified = false;
            System.out.println("isDecending does not work for ({23, 21, 15, 14, 11, 9, 8, 7, 4}).  Results in a false negative");
        }
        int [] input1 = {1, 23, 21, 15, 14, 11, 9, 8, 7, 4};
        boolean isDecending1 = student.isDecending(input1);
        if(isDecending1){
            verified = false;
            System.out.println("isDecending does not work for ({1, 23, 21, 15, 14, 11, 9, 8, 7, 4}).  Results in a false positive");
        }
        int [] input2 = {23, 21, 15, 14, 11, 9, 8, 7, 2, 4};
        boolean isDecending2 = student.isDecending(input2);
        if(isDecending2){
            verified = false;
            System.out.println("isDecending does not work for ({23, 21, 15, 14, 11, 9, 8, 7, 2, 4}).  Results in a false positive");
        }
        int [] input3 = {23, 21, 15, 10, 14, 11, 9, 8, 7, 4};
        boolean isDecending3 = student.isDecending(input3);
        if(isDecending3){
            verified = false;
            System.out.println("isDecending does not work for ({23, 21, 15, 10, 14, 11, 9, 8, 7, 4}).  Results in a false positive");
        }
        int [] input4 = {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        boolean isDecending4 = student.isDecending(input4);
        if(isDecending4){
            verified = false;
            System.out.println("isDecending does not work for ({4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}).  Results in a false positive");
        }

        if(verified){
            System.out.println("isDecending works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("isDecending does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testInOrder(){
        System.out.println("====================================");
        boolean verified = true;
        ArrayAnalyzer student = new ArrayAnalyzer();
        int [] input0 = {4, 7, 8, 9, 11, 14, 15, 21, 23};
        boolean inOrder0 = student.inOrder(input0);
        if(!inOrder0){
            verified = false;
            System.out.println("inOrder does not work for ({4, 7, 8, 9, 11, 14, 15, 21, 23}).  Results in a false negative");
        }
        int [] input1 = {23, 21, 15, 14, 11, 9, 8, 7, 4};
        boolean inOrder1 = student.inOrder(input1);
        if(!inOrder1){
            verified = false;
            System.out.println("inOrder does not work for ({23, 21, 15, 14, 11, 9, 8, 7, 4}).  Results in a false negative");
        }
        int [] input2 = {23, 21, 15, 10, 14, 11, 9, 8, 7, 4};
        boolean inOrder2 = student.inOrder(input2);
        if(inOrder2){
            verified = false;
            System.out.println("inOrder does not work for ({23, 21, 15, 10, 14, 11, 9, 8, 7, 4}).  Results in a false positive");
        }
        int [] input3 = {4, 2, 7, 8, 9, 11, 14, 15, 21, 23};
        boolean inOrder3 = student.inOrder(input3);
        if(inOrder3){
            verified = false;
            System.out.println("inOrder does not work for ({4, 2, 7, 8, 9, 11, 14, 15, 21, 23}).  Results in a false positive");
        }
        int [] input4 = {23, 21, 15, 14, 11, 9, 8, 7, 2, 4};
        boolean inOrder4 = student.inOrder(input4);
        if(inOrder4){
            verified = false;
            System.out.println("inOrder does not work for ({23, 21, 15, 14, 11, 9, 8, 7, 2, 4}).  Results in a false positive");
        }
        int [] input5 = {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        boolean inOrder5 = student.inOrder(input5);
        if(inOrder5){
            verified = false;
            System.out.println("inOrder does not work for ({4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}).  Results in a false positive");
        }

        if(verified){
            System.out.println("inOrder works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("inOrder does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static String [] words0 = {"Apple", "Banana", "Chimp", "Dog", "Eleven", "Fruit", "Gum", "Hello", "Ice"};
    public static String [] words1 = {"Apple", "Banana", "Chimp", "Dog", "Eleven", "Fruit", "Gum", "Hello", "Ice"};
    public static String [] words2 = {"Apple", "Banana", "Chimp", "Dog", "Eleven", "Fun", "Gum", "Hello", "Ice"};
    public static String [] words3 = {"Ark", "Banana", "Chimp", "Dog", "Eleven", "Fruit", "Gum", "Hello", "Ice"};
    public static String [] words4 = {"Apple", "Banana", "Chimp", "Dog", "Eleven", "Fruit", "Gum", "Hello", "Igloo"};
    public static String [] words5 = {"Apple", "Banana", "Chimp", "Dog", "Eleven", "Fruit", "Gum", "Hello", "Ice", "Venus"};
    public static String [] words6 = {"Apple", "Banana", "Chimp", "Dog", "Eleven", "Fruit", "Gum", "Hello"};


    //returns whether or not all the two arrays are exactly the same.
    public static boolean testEqual(){
        System.out.println("====================================");
        boolean verified = true;
        ArrayAnalyzer student = new ArrayAnalyzer();

        if(!student.equal(words0, words1)){
            verified = false;
            System.out.println("Error - Equal returned a false for words0 and words1");
        }
        if(student.equal(words0, words2)){
            verified = false;
            System.out.println("Error - Equal returned a true for words0 and words2");
        }
        if(student.equal(words0, words3)){
            verified = false;
            System.out.println("Error - Equal returned a true for words0 and words3");
        }
        if(student.equal(words0, words4)){
            verified = false;
            System.out.println("Error - Equal returned a true for words0 and words4");
        }
        if(student.equal(words0, words5)){
            verified = false;
            System.out.println("Error - Equal returned a true for words0 and words5");
        }
        if(student.equal(words0, words6)){
            verified = false;
            System.out.println("Error - Equal returned a true for words0 and words6");
        }

        if(verified){
            System.out.println("equal works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("equal does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testHasTwoUniquePairs(){
        System.out.println("====================================");
        boolean verified = true;
        ArrayAnalyzer student = new ArrayAnalyzer();

        int [] input1 = {2, 2, 6, 4, 5, 7, 7};
        boolean hasTwoUniquePairs1 = student.hasTwoUniquePairs(input1);
        if(!hasTwoUniquePairs1){
            verified = false;
            System.out.println("hasTwoUniquePairs does not work for ({2, 2, 6, 4, 5, 7, 7}).  Results in a false negative");
        }
        int [] input2 = {1, 3, 3, 5, 8, 8, 9, 10};
        boolean hasTwoUniquePairs2 = student.hasTwoUniquePairs(input2);
        if(!hasTwoUniquePairs2){
            verified = false;
            System.out.println("hasTwoUniquePairs does not work for ({1, 3, 3, 5, 8, 8, 9, 10}).  Results in a false negative");
        }
        int [] input3 = {2, 6, 4, 7, 7, 5};
        boolean hasTwoUniquePairs3 = student.hasTwoUniquePairs(input3);
        if(hasTwoUniquePairs3){
            verified = false;
            System.out.println("hasTwoUniquePairs does not work for ({2, 6, 4, 7, 7, 5}).  Results in a false positive");
        }
        int [] input4 = {1, 2, 2, 2, 6, 4, 7, 5};
        boolean hasTwoUniquePairs4 = student.hasTwoUniquePairs(input4);
        if(hasTwoUniquePairs4){
            verified = false;
            System.out.println("hasTwoUniquePairs does not work for ({1, 2, 2, 2, 6, 4, 7, 5}).  Results in a false positive");
        }


        if(verified){
            System.out.println("hasTwoUniquePairs works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("hasTwoUniquePairs does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

}