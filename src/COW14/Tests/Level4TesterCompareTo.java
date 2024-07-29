package COW14.Tests;

import COW14.Car;
import COW14.Copier;
import COW14.Dancer;
import COW14.Student;

import java.util.*;

public class Level4TesterCompareTo
{
    public static void main(String [] arg){
        testAllCompareTo();
    }
    public static boolean testAllCompareTo(){
        boolean one = testStudentCompareTo();
        boolean two = testCarCompareTo();
        boolean three = testDancerCompareTo();
        boolean four = testCopierCompareTo();
        if(one && two && three && four){
            System.out.println("Everything works");
            return true;
        }else{
            System.out.println("NOT everything works");
            return false;
        }
    }

    public static boolean testStudentCompareTo(){
        double [] gpaValues = {2.95, 2.97, 3.5, 2.6, 3.1, 1.33, };
        int [] results = {0, 0, -1, -1, -1, -1, 1, 1, -1, -1, 1, 1, 0, -1, -1, -1, -1, 1, 1, -1, -1, 1, 1, 0, 0, -1, -1, 1, 1, -1, -1, 1, 1, 0, -1, -1, 1, 1, -1, -1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, -1, -1, 1, 1, 0, -1, -1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, };

        ArrayList<Student> students = new ArrayList<Student>();
        for(int i = 0; i < gpaValues.length; i++){
            students.add(new Student(gpaValues[i]));
            students.add(new Student(gpaValues[i]));
        }

        boolean works = true;

        ArrayList<Integer> actualResults = new ArrayList<Integer>();
        for(int i1 = 0; i1 < students.size(); i1++){
            for(int i2 = i1; i2 < students.size(); i2++){
                actualResults.add(students.get(i1).compareTo(students.get(i2)));
                if(actualResults.get(actualResults.size()-1) > 0 && results[actualResults.size()-1] <= 0){
                    System.out.println("Error - Students with " + students.get(i1).getGPA() + " and " + students.get(i2).getGPA() );
                    works = false;
                }
                if(actualResults.get(actualResults.size()-1) == 0 && results[actualResults.size()-1] != 0){
                    System.out.println("Error - Students with " + students.get(i1).getGPA() + " and " + students.get(i2).getGPA() );
                    works = false;
                }
                if(actualResults.get(actualResults.size()-1) < 0 && results[actualResults.size()-1] >= 0){
                    System.out.println("Error - Students with " + students.get(i1).getGPA() + " and " + students.get(i2).getGPA() );
                    works = false;
                } 
            }
        }

        if(works){
            System.out.println("Student compareTo works");
        }else{
            System.out.println("Student compareTo does not work");
        }

        return works;
    }

    public static boolean testCarCompareTo(){
        int [] results = {0, 1, -1, 1, -14, -14, -14, -14, -13, -13, -13, -13, -17, -17, -17, -17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -1, 1, -14, -14, -14, -14, -13, -13, -13, -13, -17, -17, -17, -17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, -14, -14, -14, -14, -13, -13, -13, -13, -17, -17, -17, -17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -14, -14, -14, -14, -13, -13, -13, -13, -17, -17, -17, -17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, -1, 1, -13, -13, -13, -13, -17, -17, -17, -17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -1, 1, -13, -13, -13, -13, -17, -17, -17, -17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, -13, -13, -13, -13, -17, -17, -17, -17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -13, -13, -13, -13, -17, -17, -17, -17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, -1, 1, -4, -4, -4, -4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -1, 1, -4, -4, -4, -4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, -4, -4, -4, -4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -4, -4, -4, -4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, -1, 1, -14, -14, -14, -14, -13, -13, -13, -13, -17, -17, -17, -17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -1, 1, -14, -14, -14, -14, -13, -13, -13, -13, -17, -17, -17, -17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, -14, -14, -14, -14, -13, -13, -13, -13, -17, -17, -17, -17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -14, -14, -14, -14, -13, -13, -13, -13, -17, -17, -17, -17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, -1, 1, -13, -13, -13, -13, -17, -17, -17, -17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -1, 1, -13, -13, -13, -13, -17, -17, -17, -17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, -13, -13, -13, -13, -17, -17, -17, -17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -13, -13, -13, -13, -17, -17, -17, -17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, -1, 1, -4, -4, -4, -4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -1, 1, -4, -4, -4, -4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, -4, -4, -4, -4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -4, -4, -4, -4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, -1, 1, -14, -14, -14, -14, -13, -13, -13, -13, -17, -17, -17, -17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -1, 1, -14, -14, -14, -14, -13, -13, -13, -13, -17, -17, -17, -17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, -14, -14, -14, -14, -13, -13, -13, -13, -17, -17, -17, -17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -14, -14, -14, -14, -13, -13, -13, -13, -17, -17, -17, -17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, -1, 1, -13, -13, -13, -13, -17, -17, -17, -17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -1, 1, -13, -13, -13, -13, -17, -17, -17, -17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, -13, -13, -13, -13, -17, -17, -17, -17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -13, -13, -13, -13, -17, -17, -17, -17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, -1, 1, -4, -4, -4, -4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -1, 1, -4, -4, -4, -4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, -4, -4, -4, -4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -4, -4, -4, -4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, -1, 1, -14, -14, -14, -14, -13, -13, -13, -13, -17, -17, -17, -17, 0, -1, 1, -14, -14, -14, -14, -13, -13, -13, -13, -17, -17, -17, -17, 0, 1, -14, -14, -14, -14, -13, -13, -13, -13, -17, -17, -17, -17, 0, -14, -14, -14, -14, -13, -13, -13, -13, -17, -17, -17, -17, 0, 1, -1, 1, -13, -13, -13, -13, -17, -17, -17, -17, 0, -1, 1, -13, -13, -13, -13, -17, -17, -17, -17, 0, 1, -13, -13, -13, -13, -17, -17, -17, -17, 0, -13, -13, -13, -13, -17, -17, -17, -17, 0, 1, -1, 1, -4, -4, -4, -4, 0, -1, 1, -4, -4, -4, -4, 0, 1, -4, -4, -4, -4, 0, -4, -4, -4, -4, 0, 1, -1, 1, 0, -1, 1, 0, 1, 0, };

        int [] year = {2020, 2019, 2018, 2017};
        String [] names = {"Camry", "Corolla", "Prius", "Tacoma"};
        double [] prices = {35000.5, 32264.75, 284576.25, 25154.49};

        ArrayList<Car> cars = new ArrayList<Car>();

        for(int i1 = 0; i1 < year.length; i1++){
            for(int i2 = 0; i2 < names.length; i2++){
                for(int i3 = 0; i3 < prices.length; i3++){
                    cars.add( new Car(year[i1], names[i2], prices[i3]) );
                }
            }
        }

        boolean works = true;

        ArrayList<Integer> actualResults = new ArrayList<Integer>();
        for(int i1 = 0; i1 < cars.size(); i1++){
            for(int i2 = i1; i2 < cars.size(); i2++){
                actualResults.add(cars.get(i1).compareTo(cars.get(i2)));
                String name1 = cars.get(i1).getYear() + " " + cars.get(i1).getName() + " " + cars.get(i1).getCost();
                String name2 = cars.get(i2).getYear() + " " + cars.get(i2).getName() + " " + cars.get(i2).getCost();
                if(actualResults.get(actualResults.size()-1) > 0 && results[actualResults.size()-1] <= 0){
                    System.out.println("Error1 - Cars: \"" + name1 + "\" and \"" + name2 + "\"");
                    System.out.println("actual: " + actualResults.get(actualResults.size()-1) + ", expected: " + results[actualResults.size()-1]);
                    works = false;
                }
                if(actualResults.get(actualResults.size()-1) == 0 && results[actualResults.size()-1] != 0){
                    System.out.println("Error2 - Cars: \"" + name1 + "\" and \"" + name2 + "\"");
                    System.out.println("actual: " + actualResults.get(actualResults.size()-1) + ", expected: " + results[actualResults.size()-1]);
                    works = false;
                }
                if(actualResults.get(actualResults.size()-1) < 0 && results[actualResults.size()-1] >= 0){
                    System.out.println("Error3 - Cars: \"" + name1 + "\" and \"" + name2 + "\"");
                    System.out.println("actual: " + actualResults.get(actualResults.size()-1) + ", expected: " + results[actualResults.size()-1]);
                    works = false;
                } 
            }
        }

        if(works){
            System.out.println("Name compareTo works");
        }else{
            System.out.println("Name compareTo does not work");
        }

        return works;
    }

    public static boolean testDancerCompareTo(){
        int [] results = {0, -1, -1, 1, 1, 1, 1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -1, 1, 1, 1, 1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 1, -1, -1, 0, -1, -1, 1, 1, -1, -1, 1, 1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -1, -1, -1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 1, -1, -1, 0, 1, 1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -1, -1, -1, -1, 1, 1, -1, -1, 1, 1, 1, 1, -1, -1, 1, 1, 1, 1, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, 1, 1, -1, -1, 1, 1, 1, 1, -1, -1, 1, 1, 1, 1, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 1, -1, -1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, -1, -1, -1, -1, 1, 1, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 1, -1, -1, 1, 1, -1, -1, -1, -1, 1, 1, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 1, -1, -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 1, 1, 1, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 0, 1, 1, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 1, -1, -1, 1, 1, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 1, -1, -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 1, -1, -1, 0, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -1, -1, 1, 1, 1, 1, -1, -1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, -1, -1, -1, -1, 0, };

        ArrayList<Dancer> dancers = new ArrayList<Dancer>();

        double [] scores1 = {10.0, 9.0, 8.2, 7.7, 7.7, 0.5, 5.3, 6.6, 0.3, 7.4, };
        dancers.add(new Dancer(scores1));
        dancers.add(new Dancer(scores1));
        double [] scores2 = {9.9, 5.8, 4.4, 7.3, 8.0, 9.0, 9.5, 8.3, 3.9, 8.8, };
        dancers.add(new Dancer(scores2));
        dancers.add(new Dancer(scores2));
        double [] scores3 = {2.0, 8.4, 4.0, 0.4, 1.9, 9.0, 1.5, 5.3, 5.1, 3.5, };
        dancers.add(new Dancer(scores3));
        dancers.add(new Dancer(scores3));
        double [] scores4 = {0.6, 7.0, 4.4, 1.3, 7.8, 7.1, 4.9, 4.7, 8.4, 10.0, };
        dancers.add(new Dancer(scores4));
        dancers.add(new Dancer(scores4));
        double [] scores5 = {10.0, 10.0, 8.6, 7.1, 8.4, 10.0, 3.9, 7.8, 5.2, 3.0, };
        dancers.add(new Dancer(scores5));
        dancers.add(new Dancer(scores5));
        double [] scores6 = {6.7, 0.6, 0.6, 1.3, 7.3, 1.6, 7.3, 2.1, 5.6, 9.7, };
        dancers.add(new Dancer(scores6));
        dancers.add(new Dancer(scores6));
        double [] scores7 = {7.5, 4.1, 3.0, 4.3, 7.1, 6.4, 7.1, 3.4, 7.7, 6.7, };
        dancers.add(new Dancer(scores7));
        dancers.add(new Dancer(scores7));
        double [] scores8 = {3.7, 8.5, 0.9, 2.0, 6.9, 0.5, 7.2, 0.5, 9.2, 9.9, };
        dancers.add(new Dancer(scores8));
        dancers.add(new Dancer(scores8));
        double [] scores9 = {2.8, 8.8, 8.9, 0.2, 8.4, 4.2, 6.7, 4.6, 3.6, 8.7, };
        dancers.add(new Dancer(scores9));
        dancers.add(new Dancer(scores9));
        double [] scores10 = {7.5, 4.1, 3.6, 8.1, 9.1, 2.6, 5.2, 3.6, 4.5, 9.4, };
        dancers.add(new Dancer(scores10));
        dancers.add(new Dancer(scores10));
        double [] scores11 = {0.0, 7.7, 0.8, 0.2, 9.3, 1.7, 2.6, 0.7, 8.8, 6.5, };
        dancers.add(new Dancer(scores11));
        dancers.add(new Dancer(scores11));
        double [] scores12 = {5.4, 0.6, 5.8, 5.2, 10.0, 7.9, 3.1, 1.5, 7.8, 8.8, };
        dancers.add(new Dancer(scores12));
        dancers.add(new Dancer(scores12));
        double [] scores13 = {5.3, 3.5, 0.5, 9.3, 2.5, 9.3, 0.8, 4.0, 3.4, 10.0, };
        dancers.add(new Dancer(scores13));
        dancers.add(new Dancer(scores13));
        double [] scores14 = {1.1, 4.3, 0.6, 7.5, 4.8, 4.0, 9.0, 0.5, 3.9, 0.9, };
        dancers.add(new Dancer(scores14));
        dancers.add(new Dancer(scores14));
        double [] scores15 = {0.9, 7.3, 2.6, 7.1, 8.1, 8.9, 1.0, 4.1, 3.9, 5.7, };
        dancers.add(new Dancer(scores15));
        dancers.add(new Dancer(scores15));
        double [] scores16 = {6.2, 0.4, 0.2, 9.4, 4.6, 7.9, 1.6, 7.8, 1.4, 8.5, };
        dancers.add(new Dancer(scores16));
        dancers.add(new Dancer(scores16));
        double [] scores17 = {4.9, 8.6, 3.6, 2.2, 0.8, 3.6, 1.3, 2.4, 8.5, 2.3, };
        dancers.add(new Dancer(scores17));
        dancers.add(new Dancer(scores17));
        double [] scores18 = {7.2, 1.1, 4.8, 4.2, 0.4, 0.9, 4.8, 2.5, 8.4, 8.8, };
        dancers.add(new Dancer(scores18));
        dancers.add(new Dancer(scores18));
        double [] scores19 = {9.9, 7.6, 5.2, 7.4, 6.7, 7.0, 5.7, 4.9, 2.2, 1.7, };
        dancers.add(new Dancer(scores19));
        dancers.add(new Dancer(scores19));
        double [] scores20 = {8.2, 8.8, 3.4, 0.3, 10.0, 1.8, 5.7, 3.3, 5.9, 7.5, };
        dancers.add(new Dancer(scores20));
        dancers.add(new Dancer(scores20));
        double [] scores21 = {8.5, 5.6, 8.8, 9.2, 1.1, 2.8, 2.3, 5.3, 7.3, 8.4, };
        dancers.add(new Dancer(scores21));
        dancers.add(new Dancer(scores21));
        double [] scores22 = {0.7, 2.7, 2.4, 9.2, 4.7, 5.4, 3.2, 8.7, 8.7, 9.3, };
        dancers.add(new Dancer(scores22));
        dancers.add(new Dancer(scores22));
        double [] scores23 = {6.7, 0.0, 7.2, 7.8, 9.0, 7.5, 7.1, 9.4, 6.8, 7.4, };
        dancers.add(new Dancer(scores23));
        dancers.add(new Dancer(scores23));
        double [] scores24 = {3.5, 8.6, 3.5, 8.0, 8.3, 3.9, 8.9, 7.4, 1.6, 2.8, };
        dancers.add(new Dancer(scores24));
        dancers.add(new Dancer(scores24));
        double [] scores25 = {8.9, 2.8, 8.5, 1.5, 9.6, 9.2, 3.7, 7.6, 1.1, 4.0, };
        dancers.add(new Dancer(scores25));
        dancers.add(new Dancer(scores25));
        double [] scores26 = {1.9, 8.9, 8.6, 9.0, 1.2, 8.5, 5.7, 0.1, 1.3, 4.0, };
        dancers.add(new Dancer(scores26));
        dancers.add(new Dancer(scores26));
        double [] scores27 = {7.7, 7.0, 3.1, 3.0, 5.1, 2.9, 4.8, 1.1, 7.0, 8.0, };
        dancers.add(new Dancer(scores27));
        dancers.add(new Dancer(scores27));
        double [] scores28 = {0.7, 7.5, 4.3, 4.2, 5.0, 2.2, 2.8, 0.8, 4.7, 6.4, };
        dancers.add(new Dancer(scores28));
        dancers.add(new Dancer(scores28));
        double [] scores29 = {8.6, 7.9, 5.1, 7.3, 5.2, 0.5, 0.2, 6.6, 2.0, 4.7, };
        dancers.add(new Dancer(scores29));
        dancers.add(new Dancer(scores29));

        boolean works = true;

        ArrayList<Integer> actualResults = new ArrayList<Integer>();
        for(int i1 = 0; i1 < dancers.size(); i1++){
            for(int i2 = i1 + 1; i2 < dancers.size(); i2++){
                actualResults.add(dancers.get(i1).compareTo(dancers.get(i2)));

                if(actualResults.get(actualResults.size()-1) > 0 && results[actualResults.size()-1] <= 0){
                    System.out.println("Error - Dancer: " + i1 + " and " + i2 + "");
                    works = false;
                }
                if(actualResults.get(actualResults.size()-1) == 0 && results[actualResults.size()-1] != 0){
                    System.out.println("Error - Dancer: " + i1 + " and " + i2 + "");
                    works = false;
                }
                if(actualResults.get(actualResults.size()-1) < 0 && results[actualResults.size()-1] >= 0){
                    System.out.println("Error - Dancer: " + i1 + " and " + i2 + "");
                    works = false;
                } 
            }
        }

        if(works){
            System.out.println("Dancer compareTo works");
        }else{
            System.out.println("Dancer compareTo does not work");
        }

        return works;
    }

    public static boolean testCopierCompareTo(){
        int [] results = {0, 0, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, 0, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, 0, 1, 1, 0, 0, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, 0, 0, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, 0, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, 0, 0, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, 0, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, };

        double [] speed = {1, 3, 3, 5, 20, 20};
        boolean [] working = {true, true, false, false};

        ArrayList<Copier> copiers = new ArrayList<Copier>();

        for(int i1 = 0; i1 < speed.length; i1++){
            for(int i2 = 0; i2 < working.length; i2++){
                copiers.add( new Copier(speed[i1], working[i2]) );
            }
        }

        boolean works = true;

        ArrayList<Integer> actualResults = new ArrayList<Integer>();
        for(int i1 = 0; i1 < copiers.size(); i1++){
            for(int i2 = i1; i2 < copiers.size(); i2++){
                actualResults.add(copiers.get(i1).compareTo(copiers.get(i2)));
                String name1 = "working: " + copiers.get(i1).isWorking() + " - speed: " + copiers.get(i1).getSpeed();
                String name2 = "working: " + copiers.get(i2).isWorking() + " - speed: " + copiers.get(i2).getSpeed();
                if(actualResults.get(actualResults.size()-1) > 0 && results[actualResults.size()-1] <= 0){
                    System.out.println("Error - Copiers: " + name1 + " and " + name2 + "");
                    works = false;
                }
                if(actualResults.get(actualResults.size()-1) == 0 && results[actualResults.size()-1] != 0){
                    System.out.println("Error - Copiers: " + name1 + " and " + name2 + "");
                    works = false;
                }
                if(actualResults.get(actualResults.size()-1) < 0 && results[actualResults.size()-1] >= 0){
                    System.out.println("Error - Copiers: " + name1 + " and " + name2 + "");
                    works = false;
                } 
            }
        }

        if(works){
            System.out.println("Copier compareTo works");
        }else{
            System.out.println("Copier compareTo does not work");
        }

        return works;
    }
}
