package COW6.Tests;

import COW6.StringModifier;

public class StringModifierTester
{
    public static void main(String [] args){
        testAll();
    }

    public static boolean testAll(){
        boolean one = testTurnIntoAllCaps();
        boolean two = testExclaimWord();
        boolean three = testTwistWord();
        boolean four = testRespondToAction();
        boolean five = testMakeMoreDramatic();
        boolean six = testConvertPhoneNumber();
        boolean seven = testPigLatinateWord();
        boolean eight = testPigLatinateText();
        boolean nine = testStaggerCapitals();
        if(one && two && three && four && five && six && seven && eight && nine){
            System.out.println("String Modifier works");
            return true;
        }else{
            System.out.println("String Modifier does NOT work");
            return false;
        }
    }

    public static boolean testTurnIntoAllCaps(){
        StringModifier modifier = new StringModifier();
        String result = modifier.turnIntoAllCaps("Virginia Tech");
        if(result.equals("VIRGINIA TECH")){
            System.out.println("turnIntoAllCaps WORKS!!!!");
            return true;
        }else{
            System.out.println("turnIntoAllCaps doesn't work");
            System.out.println("turnIntoAllCaps(\"Virginia Tech\") returned \"" + result + "\", not \"VIRGINIA TECH\"");
            return false;
        }
    }

    public static boolean testExclaimWord(){
        StringModifier modifier = new StringModifier();
        String result = modifier.exclaimWord("Virginia Tech");
        if(result.equals("Virginia Tech!")){
            System.out.println("exclaimWord WORKS!!!!");
            return true;
        }else{
            System.out.println("exclaimWord doesn't work");
            System.out.println("exclaimWord(\"Virginia Tech\") returned \"" + result + "\", not \"Virginia Tech!\"");
            return false;
        }
    }

    public static boolean testTwistWord(){
        StringModifier modifier = new StringModifier();
        boolean success = true;
        String result1 = modifier.twistWord("TicToky");
        if(!result1.equals("TokyTic")){
            System.out.println("twistWord(\"TicToky\") returned \"" + result1 + "\", not \"TokyTic\"");
            success = false;
        }
        String result2 = modifier.twistWord("TicToc");
        if(!result2.equals("TocTic")){
            System.out.println("twistWord(\"TicToc\") returned \"" + result2 + "\", not \"TocTic\"");
            success = false;
        }
        if(success){
            System.out.println("twistWord WORKS!!!!");
            return true;
        }else{
            System.out.println("twistWord doesn't work");
            return false;
        }
    }

    public static boolean testRespondToAction(){
        StringModifier modifier = new StringModifier();
        boolean success = true;
        String result1 = modifier.respondToAction("Mayewsky made a test");
        if(!result1.equals("a test was created by Mayewsky")){
            System.out.println("respondToAction(\"Mayewsky made a test\") returned \"" + result1 + "\", not \"a test was created by Mayewsky\"");
            success = false;
        }
        String result2 = modifier.respondToAction("Yaro Mayewsky made dinner");
        if(!result2.equals("dinner was created by Yaro Mayewsky")){
            System.out.println("respondToAction(\"Yaro Mayewsky made dinner\") returned \"" + result2 + "\", not \"dinner was created by Yaro Mayewsky\"");
            success = false;
        }
        if(success){
            System.out.println("respondToAction WORKS!!!!");
            return true;
        }else{
            System.out.println("respondToAction doesn't work");
            return false;
        }
    }

    public static boolean testMakeMoreDramatic(){
        StringModifier modifier = new StringModifier();
        boolean success = true;
        String result1 = modifier.makeMoreDramatic("I like beans");
        if(!result1.equals("Do you really like beans, or do you love beans?")){
            System.out.println("makeMoreDramatic(\"I like beans\") returned \"" + result1 + "\", not \"Do you really like beans, or do you love beans?\"");
            success = false;
        }
        String result2 = modifier.makeMoreDramatic("I dislike celery and black licorice");
        if(!result2.equals("Do you really dislike celery and black licorice, or do you hate celery and black licorice?")){
            System.out.println("makeMoreDramatic(\"I dislike celery and black licorice\") returned \"" + result2 + "\", not \"Do you really dislike celery and black licorice, or do you hate celery and black licorice?\"");
            success = false;
        }
        if(success){
            System.out.println("makeMoreDramatic WORKS!!!!");
            return true;
        }else{
            System.out.println("makeMoreDramatic doesn't work");
            return false;
        }
    }

    public static boolean testConvertPhoneNumber(){
        StringModifier modifier = new StringModifier();
        boolean success = true;
        String result1 = modifier.convertPhoneNumber("987-654-3210");
        if(!result1.equals("9876543210")){
            System.out.println("convertPhoneNumber(\"987-654-3210\") returned \"" + result1 + "\", not \"9876543210\"");
            success = false;
        }
        String result2 = modifier.convertPhoneNumber("(987)654-3210");
        if(!result2.equals("9876543210")){
            System.out.println("convertPhoneNumber(\"(987)654-3210\") returned \"" + result2 + "\", not \"9876543210\"");
            success = false;
        }
        String result3 = modifier.convertPhoneNumber("1(987)654-3210");
        if(!result3.equals("9876543210")){
            System.out.println("convertPhoneNumber(\"1(987)654-3210\") returned \"" + result3 + "\", not \"9876543210\"");
            success = false;
        }
        if(success){
            System.out.println("convertPhoneNumber WORKS!!!!");
            return true;
        }else{
            System.out.println("convertPhoneNumber doesn't work");
            return false;
        }
    }

    public static boolean testPigLatinateWord(){
        StringModifier modifier = new StringModifier();
        boolean success = true;
        String result1 = modifier.pigLatinateWord("orbit");
        if(!result1.equals("orbitohay")){
            System.out.println("pigLatinateWord(\"orbit\") returned \"" + result1 + "\", not \"orbitohay\"");
            success = false;
        }
        String result2 = modifier.pigLatinateWord("happy");
        if(!result2.equals("appyhay")){
            System.out.println("pigLatinateWord(\"happy\") returned \"" + result2 + "\", not \"appyhay\"");
            success = false;
        }
        String result3 = modifier.pigLatinateWord("scram");
        if(!result3.equals("amscray")){
            System.out.println("pigLatinateWord(\"scram\") returned \"" + result3 + "\", not \"amscray\"");
            success = false;
        }
        if(success){
            System.out.println("pigLatinateWord WORKS!!!!");
            return true;
        }else{
            System.out.println("pigLatinateWord doesn't work");
            return false;
        }
    }

    public static boolean testPigLatinateText(){
        StringModifier modifier = new StringModifier();
        boolean success = true;
        String result1 = modifier.pigLatinateText("the rocket man came out of orbit");
        if(!result1.equals("ethay ocketray anmay amecay outohay ofohay orbitohay")){
            System.out.println("pigLatinateText(\"the rocket man came out of orbit\") returned \"" + result1 + "\", not \"ethay ocketray anmay amecay outohay ofohay orbitohay\"");
            success = false;
        }
        String result2 = modifier.pigLatinateText("you look happy");
        if(!result2.equals("ouyay ooklay appyhay")){
            System.out.println("pigLatinateText(\"you look happy\") returned \"" + result2 + "\", not \"ouyay ooklay appyhay\"");
            success = false;
        }
        String result3 = modifier.pigLatinateText("it was all scramble to finish");
        if(!result3.equals("itihay asway allahay amblescray otay inishfay")){
            System.out.println("pigLatinateText(\"it was all scramble to finish\") returned \"" + result3 + "\", not \"itihay asway allahay amblescray otay inishfay\"");
            success = false;
        }
        if(success){
            System.out.println("pigLatinateText WORKS!!!!");
            return true;
        }else{
            System.out.println("pigLatinateText doesn't work");
            return false;
        }
    }

    public static boolean testStaggerCapitals(){
        StringModifier modifier = new StringModifier();
        boolean success = true;
        String result1 = modifier.staggerCapitals("I went to the store.  I bought milk.");
        if(!result1.equals("I wEnT tO tHe StOrE.  i BoUgHt MiLk.")){
            System.out.println("staggerCapitals(\"I went to the store.  I bought milk.\") returned \"" + result1 + "\", not \"I wEnT tO tHe StOrE.  i BoUgHt MiLk.\"");
            success = false;
        }

        if(success){
            System.out.println("staggerCapitals WORKS!!!!");
            return true;
        }else{
            System.out.println("staggerCapitals doesn't work");
            return false;
        }
    }
}