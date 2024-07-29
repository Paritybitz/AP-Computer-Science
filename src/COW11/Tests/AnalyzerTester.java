
package COW11.Tests;

import COW11.Analyzer;
import COW11.ListPractice3;

import java.util.*;
public class AnalyzerTester
{
    public static void main(String [] arg){
        boolean getOccurencesWorks = testGetOccurences();
        boolean countRepitionsWorks = testCountRepitions();
        boolean getNumberInCommonWorks = testGetNumberInCommon();
        boolean getNumberDifferentWorks = testGetNumberDifferent();
        boolean getMostCommonWorks = testGetMostCommon();

        if(getOccurencesWorks && countRepitionsWorks && getNumberInCommonWorks && getNumberDifferentWorks && getMostCommonWorks){
        System.out.println("Level 6 works");
        }else{
        System.out.println("Level 6 does NOT work");
        }
    }

    public static boolean testGetOccurences(){
        System.out.println("====================================");
        System.out.println("Testing Get Occurences");
        System.out.println();
        boolean verified = true;
        Analyzer student = new Analyzer();
        ListPractice3 student3 = new ListPractice3();

        String [] input1 = {"ape", "bat", "cat", "ape", "ape", "bat", "ape"};
        ArrayList<String> listInput1 = new ArrayList<String>();
        for(String next : input1){
            listInput1.add(next);
        }
        String searchTerm1 = "ape";

        System.out.print("List 1: ");
        student3.print(listInput1);
        System.out.println();
        System.out.println("Search Term 1: " + searchTerm1);
        System.out.println();

        int count1 = student.getOccurences(listInput1, searchTerm1);

        System.out.println(searchTerm1 + " shows up " + count1 + " times");
        if(count1 != 4){
            verified = false;
            System.out.println("This is not the correct count");
        }
        System.out.println();

        if(verified){
            System.out.println("getOccurences works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("getOccurences does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testCountRepitions(){
        System.out.println("====================================");
        System.out.println("Testing Count Repitions");
        System.out.println();
        boolean verified = true;
        Analyzer student = new Analyzer();
        ListPractice3 student3 = new ListPractice3();

        String [] input1 = {"ape", "bat", "cat", "ape", "ape", "bat", "ape"};
        ArrayList<String> listInput1 = new ArrayList<String>();
        for(String next : input1){
            listInput1.add(next);
        }

        System.out.print("List 1: ");
        student3.print(listInput1);
        System.out.println();

        int repeats = student.countRepititions(listInput1);

        System.out.println("There are " + repeats + " words that repeat");
        if(repeats != 2){
            verified = false;
            System.out.println("This is not the correct number of repeats");
        }
        System.out.println();

        if(verified){
            System.out.println("countRepititions works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("countRepititions does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testGetNumberInCommon(){
        System.out.println("====================================");
        System.out.println("Testing Get Number In Common");
        System.out.println();
        boolean verified = true;
        Analyzer student = new Analyzer();
        ListPractice3 student3 = new ListPractice3();

        String [] input1 = {"ape", "bat", "cat", "dog"};
        ArrayList<String> listInput1 = new ArrayList<String>();
        for(String next : input1){
            listInput1.add(next);
        }
        String [] input2 = {"ape", "dog", "eel", "fox"};
        ArrayList<String> listInput2 = new ArrayList<String>();
        for(String next : input2){
            listInput2.add(next);
        }

        System.out.print("List 1: ");
        student3.print(listInput1);
        System.out.println();
        System.out.print("List 2: ");
        student3.print(listInput2);
        System.out.println();

        int numCommon = student.getNumberInCommon(listInput1, listInput2);

        System.out.println("There are " + numCommon + " words in both lists");
        if(numCommon != 2){
            verified = false;
            System.out.println("This is not the correct number");
        }
        System.out.println();

        if(verified){
            System.out.println("getNumberInCommon works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("getNumberInCommon does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testGetNumberDifferent(){
        System.out.println("====================================");
        System.out.println("Testing Get Number Different");
        System.out.println();
        boolean verified = true;
        Analyzer student = new Analyzer();
        ListPractice3 student3 = new ListPractice3();

        String [] input1 = {"ape", "bat", "cat", "dog"};
        ArrayList<String> listInput1 = new ArrayList<String>();
        for(String next : input1){
            listInput1.add(next);
        }
        String [] input2 = {"ape", "dog", "eel", "fox"};
        ArrayList<String> listInput2 = new ArrayList<String>();
        for(String next : input2){
            listInput2.add(next);
        }

        System.out.print("List 1: ");
        student3.print(listInput1);
        System.out.println();
        System.out.print("List 2: ");
        student3.print(listInput2);
        System.out.println();

        int numDifferent = student.getNumberDifferent(listInput1, listInput2);

        System.out.println("There are " + numDifferent + " words in only one list");
        if(numDifferent != 4){
            verified = false;
            System.out.println("This is not the correct number");
        }
        System.out.println();

        if(verified){
            System.out.println("getNumberDifferent works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("getNumberDifferent does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testGetMostCommon(){
        System.out.println("====================================");
        System.out.println("Testing Get Most Common");
        System.out.println();
        boolean verified = true;
        Analyzer student = new Analyzer();
        ListPractice3 student3 = new ListPractice3();

        String [] input1 = {"ape", "bat", "cat", "ape", "ape", "bat", "ape"};
        ArrayList<String> listInput1 = new ArrayList<String>();
        for(String next : input1){
            listInput1.add(next);
        }

        System.out.print("List 1: ");
        student3.print(listInput1);
        System.out.println();

        String mostCommonWord = student.getMostCommon(listInput1);

        System.out.println("Most common word: " + mostCommonWord);
        if(!mostCommonWord.equals("ape")){
            verified = false;
            System.out.println("This is not the correct word");
        }
        System.out.println();

        if(verified){
            System.out.println("getMostCommon works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("getMostCommon does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean areListsSame(ArrayList<String> list1, ArrayList<String> list2){
        if(list1.size() != list2.size()){
            System.out.println("Results are a different size");
            return false;
        }
        for(int i = 0; i < list1.size(); i++){
            if(!list1.get(i).equals(list2.get(i))){
                System.out.println(list1.get(i) + " is not the same as " + list2.get(i));
                return false;
            }
        }
        return true;
    }
}

