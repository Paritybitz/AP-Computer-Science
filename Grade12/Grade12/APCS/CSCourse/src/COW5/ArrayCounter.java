package COW5;

public class ArrayCounter
{
    public static int countPositives(int[] numbers){
        int count = 0;

        for (int i = 0; i < numbers.length; i++)
            if(numbers[i] > 0)
                count++;

        return count;
    }

    public static int countNegativeOdds(int [] numbers){
        int count = 0;

        for (int i = 0; i < numbers.length; i++)
            if(numbers[i] < 0 && numbers[i]%2 != 0)
                count++;

        return count;
    }

    public static int countInRange(int [] numbers, int min, int max){
        int count = 0;

        for (int i = 0; i < numbers.length; i++)
            if(numbers[i] >= min && numbers[i] <= max)
                count++;

        return count;
    }

    public static int countPairs(int [] numbers){
        int count = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1])
                count++;
        }

        return count;
    }

    public static int countUniqueElements (int [] numbers){
        int count = 0;

        if(numbers.length-1 != numbers.length-2)
            count++;

        for (int i = 1; i < numbers.length-1; i++) {
            if (numbers[i] != numbers[i - 1] && numbers[i] != numbers[i + 1])
                count++;
        }

        return count;
    }

    public static int countNonUniqueElements (int [] numbers){
        int count = 0;

        if(numbers.length-1 == numbers.length-2)
            count++;

        for (int i = 1; i < numbers.length-1; i++) {
            if (numbers[i] == numbers[i - 1] && numbers[i] == numbers[i + 1])
                count++;
        }

        return count;
    }
}