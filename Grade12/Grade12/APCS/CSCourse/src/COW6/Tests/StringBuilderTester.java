package COW6.Tests;
import COW6.StringBuilder;

public class StringBuilderTester
{
    public static void main(String [] args){
        testAll();
    }

    public static boolean testAll(){
        boolean one = testCombineWords();
        boolean two = testCombineNumTimes();
        boolean three = testCombineWordsInOrder();
        boolean four = testHideText();
        boolean five = testReverseWord();
        boolean six = testGetStartingLetters();
        boolean seven = testCombineWordsInOrder2();
        boolean eight = testElongateWord();
        boolean nine = testRepeatedAndReverse();
        if(one && two && three && four && five && six && seven && eight && nine){
            System.out.println("String Builder works");
            return true;
        }else{
            System.out.println("String Builder does NOT work");
            return false;
        }
    }


    public static boolean testCombineWords(){
        StringBuilder modifier = new StringBuilder();
        String result = modifier.combineWords("GO", "Virginia", "Tech");
        if(result.equals("GO Virginia Tech")){
            System.out.println("combineWords WORKS!!!!");
            return true;
        }else{
            System.out.println("combineWords doesn't work");
            System.out.println("combineWords(\"GO\", \"Virginia\", \"Tech\") returned \"" + result + "\", not \"GO Virginia Tech\"");
            return false;
        }
    }

    public static boolean testCombineNumTimes(){
        StringBuilder modifier = new StringBuilder();
        boolean success = true;
        String result1 = modifier.combineNumTimes("Tech", 5);
        if(!result1.equals("TechTechTechTechTech")){
            System.out.println("combineNumTimes(\"Tech\", \"5\") returned \"" + result1 + "\", not \"TechTechTechTechTech\"");
            success = false;
        }

        if(success){
            System.out.println("combineNumTimes WORKS!!!!");
            return true;
        }else{
            System.out.println("combineNumTimes doesn't work");
            return false;
        }
    }

    public static boolean testCombineWordsInOrder(){
        StringBuilder modifier = new StringBuilder();
        boolean success = true;
        String result1 = modifier.combineWordsInOrder("Ant", "Bear");
        if(!result1.equals("Ant Bear")){
            System.out.println("combineWordsInOrder(\"Ant\", \"Bear\") returned \"" + result1 + "\", not \"Ant Bear\"");
            success = false;
        }
        String result2 = modifier.combineWordsInOrder("Dog", "Cat");
        if(!result2.equals("Cat Dog")){
            System.out.println("combineWordsInOrder(\"Dog\", \"Cat\") returned \"" + result2 + "\", not \"Cat Dog\"");
            success = false;
        }
        if(success){
            System.out.println("combineWordsInOrder WORKS!!!!");
            return true;
        }else{
            System.out.println("combineWordsInOrder doesn't work");
            return false;
        }
    }

    public static boolean testHideText(){
        StringBuilder modifier = new StringBuilder();
        boolean success = true;
        String result1 = modifier.hideText("Virginia Polytechnic Institute State University");
        if(!result1.equals("XOXXOXOO+XOXXXOXXXOX+OXXXOXOXO+XXOXO+OXOXOXXOXX")){
            System.out.println("hideText(\"Virginia Polytechnic Institute State University\") returned \"" + result1 + "\", not \"XOXXOXOO+XOXXXOXXXOX+OXXXOXOXO+XXOXO+OXOXOXXOXX\"");
            success = false;
        }

        if(success){
            System.out.println("hideText WORKS!!!!");
            return true;
        }else{
            System.out.println("hideText doesn't work");
            return false;
        }
    }

    public static boolean testReverseWord(){
        StringBuilder modifier = new StringBuilder();
        boolean success = true;
        String result1 = modifier.reverseWord("mathematics");
        if(!result1.equals("scitamehtam")){
            System.out.println("reverseWord(\"mathematics\") returned \"" + result1 + "\", not \"scitamehtam\"");
            success = false;
        }

        if(success){
            System.out.println("reverseWord WORKS!!!!");
            return true;
        }else{
            System.out.println("reverseWord doesn't work");
            return false;
        }
    }

    public static boolean testGetStartingLetters(){
        StringBuilder modifier = new StringBuilder();
        boolean success = true;
        String result1 = modifier.getStartingLetters("You can do it and so can I");
        if(!result1.equals("YcdiascI")){
            System.out.println("getStartingLetters(\"You can do it and so can I\") returned \"" + result1 + "\", not \"YcdiascI\"");
            success = false;
        }

        if(success){
            System.out.println("getStartingLetters WORKS!!!!");
            return true;
        }else{
            System.out.println("getStartingLetters doesn't work");
            return false;
        }
    }

    public static boolean testCombineWordsInOrder2(){
        StringBuilder modifier = new StringBuilder();
        boolean success = true;
        String result1 = modifier.combineWordsInOrder("Cat", "Ant", "Bear");
        if(!result1.equals("Ant Bear Cat")){
            System.out.println("combineWordsInOrder(\"Cat\", \"Ant\", \"Bear\") returned \"" + result1 + "\", not \"Ant Bear Cat\"");
            success = false;
        }
        String result2 = modifier.combineWordsInOrder("Toyota", "Volvo", "Ford");
        if(!result2.equals("Ford Toyota Volvo")){
            System.out.println("combineWordsInOrder(\"Toyota\", \"Volvo\", \"Ford\") returned \"" + result2 + "\", not \"Ford Toyota Volvo\"");
            success = false;
        }
        String result3 = modifier.combineWordsInOrder("Apple", "Pear", "Grape");
        if(!result3.equals("Apple Grape Pear")){
            System.out.println("combineWordsInOrder(\"Apple\", \"Pear\", \"Grape\") returned \"" + result3 + "\", not \"Apple Grape Pear\"");
            success = false;
        }
        if(success){
            System.out.println("combineWordsInOrder WORKS!!!!");
            return true;
        }else{
            System.out.println("combineWordsInOrder doesn't work");
            return false;
        }
    }

    public static boolean testElongateWord(){
        StringBuilder modifier = new StringBuilder();
        boolean success = true;
        String result1 = modifier.elongateWord("cat");
        if(!result1.equals("caaaat")){
            System.out.println("elongateWord(\"cat\") returned \"" + result1 + "\", not \"caaaat\"");
            success = false;
        }
        String result2 = modifier.elongateWord("prediction");
        if(!result2.equals("prreeeeddiiiiccttiiiooon")){
            System.out.println("elongateWord(\"prediction\") returned \"" + result2 + "\", not \"prreeeeddiiiiccttiiiooon\"");
            success = false;
        }
        String result3 = modifier.elongateWord("aunt");
        if(!result3.equals("aaauuunnt")){
            System.out.println("elongateWord(\"aunt\") returned \"" + result3 + "\", not \"aaauuunnt\"");
            success = false;
        }
        if(success){
            System.out.println("elongateWord WORKS!!!!");
            return true;
        }else{
            System.out.println("elongateWord doesn't work");
            return false;
        }
    }

    public static boolean testRepeatedAndReverse(){
        StringBuilder modifier = new StringBuilder();
        boolean success = true;
        String result1 = modifier.repeatedAndReverse("Tech", 5);
        if(!result1.equals("Tech hceT Tech hceT Tech")){
            System.out.println("repeatedAndReverse(\"Tech\", 5) returned \"" + result1 + "\", not \"Tech hceT Tech hceT Tech\"");
            success = false;
        }
        String result2 = modifier.repeatedAndReverse("Yaroslav", 6);
        if(!result2.equals("Yaroslav valsoraY Yaroslav valsoraY Yaroslav valsoraY")){
            System.out.println("repeatedAndReverse(\"Yaroslav\", 6) returned \"" + result2 + "\", not \"Yaroslav valsoraY Yaroslav valsoraY Yaroslav valsoraY\"");
            success = false;
        }
        if(success){
            System.out.println("repeatedAndReverse WORKS!!!!");
            return true;
        }else{
            System.out.println("repeatedAndReverse doesn't work");
            return false;
        }
    }
}