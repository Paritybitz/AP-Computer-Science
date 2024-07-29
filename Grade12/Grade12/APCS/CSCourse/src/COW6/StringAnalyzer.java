package COW6;
import java.io.*;

public class StringAnalyzer{
    //Level 1
    public static int countSentences(String word){
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if(c == '.' || c == '?' || c == '!')
                count++;
        }

        return count;
    }

    //Level 2
    public static int countVowels(String word){
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.toLowerCase().charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
        }

        return count;
    }

    //Level 3
    public static int countConsonants (String word) {
        int count = word.length() - countVowels(word);

        return count;
    }

    //Level 4
    public static int countOccurences(String text, String word){
        int count = 0;

        for (int i = 0; i < text.length(); ) {

            //find next word occurrence
            i = text.indexOf(word, i);

            //if found next occurrence
            if (i != -1)
            {
                count++;
                i++;
            }
            else
                break;
        }

        return count;
    }

    //Level 5
    public static int countTotalOccurance(String text, String[] searchTerms){
        int retVal=0;
        int count=0;

        //for each search term
        for (int i = 0; i < searchTerms.length; i++) {
            int j = 0;

            //find sum of all indeces of term occurrances
            while ((j = text.indexOf(searchTerms[i], j)) != -1) {
                count++;
                j++;
            }
        }

        return count;
    }

    //Level 6
    public static String[] findWords(String text, String[] searchTerms){
        return new String[0];
    }
}