package COW11;

import java.util.ArrayList;
import java.util.*;

public class Editor {

    public int findFirst(ArrayList<String> words, String wordToFind){
        for(int i = 0; i < words.size(); i++){

            if(words.get(i).equals(wordToFind)){
                return i;
            }
        }
        return -1;
    }

    public int findLast(ArrayList<String> words, String wordToFind){
        int lastIndex = -1;
        for(int i = 0; i < words.size(); i++){
            if(words.get(i).equals(wordToFind)){
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public ArrayList<String> remove (ArrayList<String> words, String wordToRemove) {
        words.removeAll(Arrays.asList(wordToRemove));
        return words;
    }

    public ArrayList<String> remove(ArrayList<String> words, ArrayList<String> wordsToRemove) {
        words.removeAll(wordsToRemove);
        return words;
    }

    public ArrayList<String> replace(ArrayList<String> words, String wordToRemove, String wordToInsert) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals(wordToRemove)) {
                words.set(i, wordToInsert);
            }
        }
        return words;
    }

}
