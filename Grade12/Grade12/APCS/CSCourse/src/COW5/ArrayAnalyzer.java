package COW5;

public class ArrayAnalyzer {
    public boolean hasValue(int[] array, int value) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == value)
                return (true);

        return (false);
    }

    public boolean allTheSame(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[0] != array[i])
                return (false);

        return true;
    }

    public boolean isDecending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public boolean isAscending(int[] array) {

        return true;
    }

    public boolean inOrder(int[] array) {
        return false;
    }

    public boolean equal(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i].toLowerCase().equals(arr2[i].toLowerCase()) == false)
                return false;
        }

        return true;
    }

    public boolean hasTwoUniquePairs(int[] array) {
/*        int pairs = 0;

        for (int i = 0; i < array.length - 1; i++)
            if (array[i] == array[i + 1])
                pairs++;

        if (pairs == 2) ;*/
        return true;
    }
}