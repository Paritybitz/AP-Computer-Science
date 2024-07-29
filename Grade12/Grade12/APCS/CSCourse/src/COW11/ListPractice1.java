package COW11;

import COW11.Tests.Intake;

import java.util.ArrayList;

public class ListPractice1 {

    public void print(ArrayList<Integer> numbers, Intake feed)
    {
        for (int i : numbers){
            feed.give(i);
        }
    }

    public void printReverse(ArrayList<Integer> numbers, Intake feed)
    {
        for (int i = numbers.size()-1; i >= 0; i--){
            feed.give(numbers.get(i));
        }
    }

    public void printPositives(ArrayList<Integer> numbers, Intake feed)
    {
        for (int i = 0; i < numbers.size(); i++)
            if(numbers.get(i) > 0)
                feed.give(numbers.get(i));
    }

    public void printNegativeOdds(ArrayList<Integer> numbers, Intake feed)
    {
        for (int i = 0; i < numbers.size(); i++)
            if(numbers.get(i) < 0 && numbers.get(i) % 2 != 0)
                feed.give(numbers.get(i));
    }

    public void printMultiples(ArrayList<Integer> numbers, Intake feed, int num)
    {
        for (int i : numbers) {
            if (i % num == 0) {
                feed.give(i);
            }
        }
    }
}
