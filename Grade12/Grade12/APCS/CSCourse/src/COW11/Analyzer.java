package COW11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Analyzer
{
    public int getOccurences(ArrayList<String> words, String wordToFind) {
        //convert words ArrayList to Hashmap containing <Key, Value> tuples
        HashMap<String, Integer> wordMap = convertToHashMap(words);

        //return the occuurances of particular word
        return wordMap.get(wordToFind);
    }

    public int countRepititions(ArrayList<String> words) {
        int counter=0;
        HashMap<String, Integer> wordMap = convertToHashMap(words);

        for (Map.Entry<String, Integer> mapElement : wordMap.entrySet()) {
            Integer wordCount = mapElement.getValue();

            if (wordCount > 1)
                counter++;
        }

        return counter;
    }

    public int getNumberInCommon(ArrayList<String> words1, ArrayList<String> words2)
    {
        int counter=0;
        HashMap<String, Integer> word1Map = convertToHashMap(words1);
        HashMap<String, Integer> word2Map = convertToHashMap(words2);

        //check to see which list has more words. Loop over the list with most words.
        if (word1Map.size() >= word2Map.size()) {
            for (Map.Entry<String, Integer> mapElement : word1Map.entrySet()) {
                String word = mapElement.getKey();
                //check if the word exists in the other list
                if (word2Map.get(word) != null)
                    counter++;
            }
        }
        else {
            for (Map.Entry<String, Integer> mapElement : word2Map.entrySet()) {
                String word = mapElement.getKey();
                //check if the word exists in the other list
                if (word1Map.get(word) != null)
                    counter++;
            }
        }

        return counter;
    }

    public int getNumberDifferent(ArrayList<String> words1, ArrayList<String> words2) {
        int counter=0;
        HashMap<String, Integer> word1Map = convertToHashMap(words1);
        HashMap<String, Integer> word2Map = convertToHashMap(words2);

        for (Map.Entry<String, Integer> mapElement : word1Map.entrySet()) {
            String word = mapElement.getKey();
            if (word2Map.get(word) == null)
                counter++;
        }

        for (Map.Entry<String, Integer> mapElement : word2Map.entrySet()) {
            String word = mapElement.getKey();
            if (word1Map.get(word) == null)
                counter++;
        }

        return counter;
    }

    public String getMostCommon(ArrayList<String> words) {
        int highestCount=0;
        String mostCommonWord  = "";

        HashMap<String, Integer> wordMap = convertToHashMap(words);

        for (Map.Entry<String, Integer> mapElement : wordMap.entrySet()) {
            Integer wordCount = mapElement.getValue();

            if (wordCount >= highestCount) {
                highestCount = wordCount;
                mostCommonWord =  mapElement.getKey();
            }
        }

        return mostCommonWord;
    }

    private HashMap<String, Integer> convertToHashMap(ArrayList<String> words) {
        HashMap<String, Integer> wordMap = new HashMap<String, Integer>();

        for(String word: words) {
             Integer count = wordMap.get(word);
            wordMap.put(word, (count==null) ? 1 : count+1);
        }

        return wordMap;
    }
}
