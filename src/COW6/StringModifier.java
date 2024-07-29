package COW6;

public class StringModifier{
    //Level 1
    public static String turnIntoAllCaps(String text){
        return text.toUpperCase();
    }

    public static String exclaimWord(String word){
        return (word + "!");
    }

    //Level 2
    public static String twistWord(String word){
        String firstHalf;
        String secondHalf;

        firstHalf = word.substring(0, word.length()/2);
        secondHalf = word.substring(word.length()/2);

        return (secondHalf + firstHalf);
    }

    public static String combineWordsInOrder(String word1, String word2){
        return "";
    }

    //Level 3
    public static String respondToAction(String text){
        String subject = text.substring(text.indexOf("made")+5, text.length());
        String noun = text.substring(0, text.indexOf(" made"));

        String retVal = String.format("%1$s was created by %2$s", subject, noun);

        return(retVal);
    }

    //Level 4
    public static String makeMoreDramatic(String text){
        String retVal = "";

        //get the subject
        String subject = text.substring(text.lastIndexOf(' ')+1, text.length());

        //if text has like keyword
        if (text.indexOf(" like ") != -1)
            retVal = String.format("Do you really like %1$s, or do you love %1$s?", subject);
        else
            retVal = String.format("Do you really dislike %1$s, or do you hate %1$s?", subject);

        return retVal;
    }

    //Level 5
    public static boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    public static String convertPhoneNumber(String phoneNumber) {

        String retPhone = phoneNumber;

        //remove leading 1, if any
        if(retPhone.charAt(0) == '1') {
            retPhone = retPhone.substring(1,retPhone.length());
        }

        retPhone = retPhone.replace("(", "");
        retPhone = retPhone.replace(")", "");
        retPhone = retPhone.replace("-", "");
        retPhone = retPhone.replace(" ", "");

        return(retPhone);
    }

    public static String pigLatinateWord(String word){
        String retVal="";
        boolean vowelFound = false;
        int vowelIdx = 0;

        char c = word.toLowerCase().charAt(0);

        if (isVowel(c))
            retVal = String.format("%1$s%2$shay", word, String.valueOf(c));
        else {
            //find index of first vowel
            for (vowelIdx = 0; vowelIdx < word.length(); vowelIdx++)
                if (isVowel(word.toLowerCase().charAt(vowelIdx))) {
                    vowelFound = true;
                    break;
                }

            if (vowelFound) {
                String startStr = word.substring(0, vowelIdx);
                retVal = word.substring(vowelIdx, word.length()) + startStr + "ay";
            }
        }

        return (retVal);
    }

    //Level 6
    public static String pigLatinateText(String text){
        return "";
    }

    public static String staggerCapitals(String text){
        return "";
    }

}