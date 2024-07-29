package COW17;
import java.util.Arrays;

public class Sorter
{
    public Person[] sort (Person[] people){
        for (int i = 0; i < people.length; i++) {
            for (int j = i+1; j < people.length; j++) {
                if (people[i].getName().compareTo(people[j].getName()) > 0) {
                    Person temp = people[i];
                    people[i] = people[j];
                    people[j] = temp;
                }
            }
        }
        return people;
    }
}
