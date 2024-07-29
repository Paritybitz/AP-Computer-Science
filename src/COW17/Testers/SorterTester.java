package COW17.Testers;

import COW17.Sorter;
import COW17.AgeSorter;
import COW17.GenderSorter;
import COW17.Person;

public class SorterTester
{
    public static void main(String[] args){
        System.out.println("Does the sorter work: " + testSorts());
    }
    
    public static boolean testSorts(){
        boolean success = true;
        
        Person p1 = new Person("Beatric Burgle", 67, false);
        Person p2 = new Person("Frank Funk", 5, true);
        Person p3 = new Person("Evelen Engle", 38, false);
        Person p4 = new Person("Garry Grape", 99, true);
        Person p5 = new Person("Catherine Cane", 29, false);
        Person p6 = new Person("Doug Danger", 25, true);
        Person p7 = new Person("Heather Heart", 41, false);
        Person p8 = new Person("Adam Apple", 40, true);
        
        Person[] original = {p1, p2, p3, p4, p5, p6, p7, p8};
        Person[] alpha = {p8, p1, p5, p6, p3, p2, p4, p7};
        Person[] age = {p2, p6, p5, p3, p8, p7, p1, p4};
        
        Sorter guy = new Sorter();
        Person[] alphaSorted = guy.sort(original);
        if(areArraysEqual(alpha, alphaSorted)){
            System.out.println("Sorter appears to work");
        }else{
            success = false;
            System.out.println("Sorter does NOT appear to work");
        }
        
        Sorter guy2 = new AgeSorter();
        Person[] ageSorted = guy2.sort(original);
        if(areArraysEqual(age, ageSorted)){
            System.out.println("AgeSorter appears to work");
        }else{
            success = false;
            System.out.println("AgeSorter does NOT appear to work");
        }
        
        Sorter guy3 = new GenderSorter();
        Person[] genderSorted = guy3.sort(original);
        for(int i = 0; i < genderSorted.length/2; i++){
            if(!genderSorted[i].isMale()){
                success = false;
                System.out.println("GenderSorter does NOT appear to work");
            }
        }
        for(int i = genderSorted.length/2; i < genderSorted.length; i++){
            if(genderSorted[i].isMale()){
                success = false;
                System.out.println("GenderSorter does NOT appear to work");
            }
        }
        
        return success;
    }
    
    public static boolean areArraysEqual(Person[] arr1, Person[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        for(int i = 0; i < arr1.length; i++){
            if(!arr1[i].getName().equals(arr2[i].getName())){
                return false;
            }
        }
        return true;
    }
}
