package COW6;

public class StringBuilder
{
    //Level 1
    public static String combineWords(String word1, String word2, String word3){
        String retVal;

        retVal = word1.concat(" " + word2).concat(" " + word3);
        return retVal;
    }

    //Level 2
    public static String combineNumTimes(String text, int n){
        String retVal;

        retVal = text.repeat(n);

        return retVal;
    }

    public static String combineWordsInOrder(String word1, String word2){
        String retVal;

        if (word1.compareTo(word2) > 0)
            retVal = word2 + " " + word1;
        else
            retVal = word1 + " " + word2;

        return retVal;
    }

    //Level 3
    public static String hideText(String text){
        String retVal = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.toLowerCase().charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                retVal.concat("O");
            else if (c == ' ')
                retVal.concat("+");
            else
                retVal.concat("X");
        }

        return retVal;
    }

    public static String reverseWord(String word) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(word);
        String retVal = sb.reverse().toString();

        return retVal;

/*        //using normal loop
        for (int i = word.length() - 1; i >= 0; i--) {
            retVal.concat(String.valueOf(word.charAt(i)));
        }

        //using string builder
        for (int i = word.length() - 1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }*/
    }

    //Level 4
    public static String getStartingLetters(String text){
        String retVal = "";

        for (int i=0; i < text.length(); ) {
            System.out.print(text.charAt(i));

            //find space start at current location i
            i = text.indexOf(' ', i);

            //if space was not found, exit loop
            if (i == -1)
                break;
            else
                i++;    //else, inc i by one to point to next char
        }

        return retVal;
    }

    public static String combineWordsInOrder(String word1, String word2, String word3){
        String retVal;

        if (word1.compareTo(word2) > 0)
            retVal = word2 + " " + word1;
        else
            retVal = word1 + " " + word2;

        return retVal;
    }

    //Level 5
    public static boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    public static String elongateWord(String text){
        String retVal = "";
        int repeatNum=0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.toLowerCase().charAt(i);

            if (i == 0 || i == text.length()-1) {
                if (isVowel(c)) {
                    if (i == 0)
                        if (isVowel(text.charAt(i + 1)))
                            repeatNum = 3;
                        else
                            repeatNum = 4;

                    if (i == text.length()-1)
                        if (isVowel(text.charAt(i - 1)))
                            repeatNum = 3;
                        else
                            repeatNum = 4;
                }
                else
                    repeatNum = 1;
            }
            else
            {
                if (isVowel(c)) {
                    if (isVowel(text.charAt(i - 1)) || isVowel(text.charAt(i + 1)))
                        repeatNum = 3;
                    else
                        repeatNum = 4;
                }
                else
                    repeatNum = 2;
                }

            retVal += (String.valueOf(c).repeat(repeatNum));
        }

        return retVal;
    }

    //Level 6
    public static String repeatedAndReverse(String word, int n){
        return "";
    }
}