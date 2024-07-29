package COW17;

import java.util.Arrays;
import java.util.Comparator;

public class GenderSorter extends Sorter
{
    public Person[] sort (Person[] people){
        int maleCount = 0;
        for (Person person : people) {
            if (person.isMale()) {
                maleCount++;
            }
        }
        Person[] sorted = new Person[people.length];
        int maleIndex = 0;
        int femaleIndex = maleCount;
        for (Person person : people) {
            if (person.isMale()) {
                sorted[maleIndex] = person;
                maleIndex++;
            } else {
                sorted[femaleIndex] = person;
                femaleIndex++;
            }
        }
        return sorted;
    }
}
