package COW11;

import java.util.ArrayList;

public class ListPractice3 {

    public void print(ArrayList<String> words) {
        System.out.println(String.join(", ", words) + ",");
    }

    public ArrayList<String> combine(ArrayList<String> words1, ArrayList<String> words2)
    {
        words1.addAll(words2);

        return words1;
    }

    public ArrayList<String> subArrayList(ArrayList<String> words, int i1, int i2) {
        ArrayList<String> subList = new ArrayList<>();
        for (int i = i1; i <= i2; i++) {
            subList.add(words.get(i));
        }

        return subList;
    }

    public boolean equal(ArrayList<String> words1, ArrayList<String> words2)
    {
        boolean retVal = words1.equals(words2);

        return retVal;
    }

    public boolean contains(ArrayList<String> words, String word)
    {
        boolean retVal = words.contains(word);

        return retVal;
    }
}
