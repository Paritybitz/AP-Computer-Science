package COW11;

import java.util.ArrayList;

public class ListPractice2 {

    public ArrayList<Integer> generateReverse(ArrayList<Integer> numbers) {
        ArrayList<Integer> reversed = new ArrayList<Integer>();
        for (int i = numbers.size() - 1; i >= 0; i--) {
            reversed.add(numbers.get(i));
        }
        return reversed;
    }

    public ArrayList<Integer> generatePositiveEvens(ArrayList<Integer> numbers)
    {
        ArrayList<Integer> retVal = new ArrayList<>();

        for (int i : numbers) {
            if (i > 0 && i % 2 == 0) {
                retVal.add(i);
            }
        }
        return retVal;
    }

    public ArrayList<Integer> generateInRange(ArrayList<Integer> numbers, int min, int max)
    {
        ArrayList<Integer> inRange = new ArrayList<>();
        for (int i : numbers) {
            if (i >= min && i <= max) {
                inRange.add(i);
            }
        }
        return inRange;
    }

    public ArrayList<Integer> generateFirstMiddleLast(ArrayList<Integer> numbers)
    {
        ArrayList<Integer> firstMiddleLast = new ArrayList<>();

        //first element
        firstMiddleLast.add(numbers.get(0));

        // even odd check
        if (numbers.size() % 2 == 0) {
            int middle1 = numbers.get(numbers.size()/2 - 1);
            int middle2 = numbers.get(numbers.size()/2);
            // avg middle two elements
            int avg = (middle1 + middle2) / 2;
            firstMiddleLast.add(avg);
        }
        else {
            //middle element
            firstMiddleLast.add(numbers.get(numbers.size()/2));
        }

        // add the last element
        firstMiddleLast.add(numbers.get(numbers.size() - 1));

        return firstMiddleLast;
    }

    public ArrayList<Integer> generateFirstHalf(ArrayList<Integer> numbers)
    {
        ArrayList<Integer> retVal = new ArrayList<>();
        retVal.addAll(numbers.subList(0 , (int)(numbers.size() / 2)));

        return retVal;
    }
}
