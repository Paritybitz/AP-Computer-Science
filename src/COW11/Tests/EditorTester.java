package COW11.Tests;

import COW11.Editor;
import COW11.ListPractice3;

import java.util.*;
public class EditorTester
{
    public static void main(String [] arg){
        boolean findFirstWorks = testFindFirst();
        boolean findLastWorks = testFindLast();
        boolean removeWorks = testRemove();
        boolean removeListWorks = testRemoveList();
        boolean replaceWorks = testReplace();

        if(findFirstWorks && findLastWorks && removeWorks && removeListWorks && replaceWorks){
            System.out.println("Level 5 works");
        }else{
            System.out.println("Level 5 does NOT work");
        }
    }

    public static boolean testFindFirst(){
        System.out.println("====================================");
        System.out.println("Testing Find First");
        System.out.println();
        boolean verified = true;
        Editor student = new Editor();
        ListPractice3 student3 = new ListPractice3();

        String [] input1 = {"ape", "bat", "cat", "ape", "ape", "bat", "ape"};
        ArrayList<String> listInput1 = new ArrayList<String>();
        for(String next : input1){
            listInput1.add(next);
        }
        String searchTerm1 = "bat";
        String searchTerm2 = "elephant";
        
        System.out.print("List 1: ");
        student3.print(listInput1);
        System.out.println();
        System.out.println("Search Term 1: " + searchTerm1);
        System.out.println("Search Term 2: " + searchTerm2);
        System.out.println();
        
        int location1 = student.findFirst(listInput1, searchTerm1);
        int location2 = student.findFirst(listInput1, searchTerm2);
        
        System.out.println("SearchTerm 1 first found at " + location1);
        if(location1 != 1){
            verified = false;
            System.out.println("This is not the correct location");
        }
        System.out.println("SearchTerm 2 first found at " + location2);
        if(location2 != -1){
            verified = false;
            System.out.println("This is not the correct location");
        }
        System.out.println();

        if(verified){
            System.out.println("findFirst works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("findFirst does NOT work");
            System.out.println("====================================");
            return false;
        }
    }
    
    public static boolean testFindLast(){
        System.out.println("====================================");
        System.out.println("Testing Find Last");
        System.out.println();
        boolean verified = true;
        Editor student = new Editor();
        ListPractice3 student3 = new ListPractice3();

        String [] input1 = {"ape", "bat", "cat", "ape", "ape", "bat", "ape"};
        ArrayList<String> listInput1 = new ArrayList<String>();
        for(String next : input1){
            listInput1.add(next);
        }
        String searchTerm1 = "bat";
        String searchTerm2 = "elephant";
        
        System.out.print("List 1: ");
        student3.print(listInput1);
        System.out.println();
        System.out.println("Search Term 1: " + searchTerm1);
        System.out.println("Search Term 2: " + searchTerm2);
        System.out.println();
        
        int location1 = student.findLast(listInput1, searchTerm1);
        int location2 = student.findLast(listInput1, searchTerm2);
        
        System.out.println("SearchTerm 1 first found at " + location1);
        if(location1 != 5){
            verified = false;
            System.out.println("This is not the correct location");
        }
        System.out.println("SearchTerm 2 first found at " + location2);
        if(location2 != -1){
            verified = false;
            System.out.println("This is not the correct location");
        }
        System.out.println();

        if(verified){
            System.out.println("findLast works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("findLast does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testRemove(){
        System.out.println("====================================");
        System.out.println("Testing Remove");
        System.out.println();
        boolean verified = true;
        Editor student = new Editor();
        ListPractice3 student3 = new ListPractice3();

        String [] correctValues =  {"bat", "cat", "bat"};
        ArrayList<String> correctList = new ArrayList<String>();
        for(String next : correctValues){
            correctList.add(next);
        }
        String [] input1 = {"ape", "bat", "cat", "ape", "ape", "bat", "ape"};
        ArrayList<String> listInput1 = new ArrayList<String>();
        for(String next : input1){
            listInput1.add(next);
        }
        
        String wordToRemove = "ape";

        System.out.print("List: ");
        student3.print(listInput1);
        System.out.println(); 

        System.out.println("Word To Remove: " + wordToRemove);
        System.out.println();
        
        ArrayList<String> results = student.remove(listInput1, wordToRemove);
        if(!areListsSame(correctList, results)){
            verified = false;
        }
        
        System.out.print("Result of Remove: ");
        student3.print(results);
        System.out.println();

        if(verified){
            System.out.println("remove works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("remove does NOT work");
            System.out.println("====================================");
            return false;
        }
    }
    
    public static boolean testRemoveList(){
        System.out.println("====================================");
        System.out.println("Testing Remove (List)");
        System.out.println();
        boolean verified = true;
        Editor student = new Editor();
        ListPractice3 student3 = new ListPractice3();

        String [] correctValues =  {"bat", "bat"};
        ArrayList<String> correctList = new ArrayList<String>();
        for(String next : correctValues){
            correctList.add(next);
        }
        String [] input1 = {"ape", "bat", "cat", "ape", "ape", "bat", "ape"};
        ArrayList<String> listInput1 = new ArrayList<String>();
        for(String next : input1){
            listInput1.add(next);
        }
        String [] wordsToRemove = {"ape", "cat", "dog"};
        ArrayList<String> listWordsToRemove = new ArrayList<String>();
        for(String next : wordsToRemove){
            listWordsToRemove.add(next);
        }

        System.out.print("List: ");
        student3.print(listInput1);
        System.out.println(); 
        System.out.print("Words To Remove: ");
        student3.print(listWordsToRemove);
        System.out.println(); 
        
        ArrayList<String> results = student.remove(listInput1, listWordsToRemove);
        if(!areListsSame(correctList, results)){
            verified = false;
        }
        
        System.out.print("Result of Remove: ");
        student3.print(results);
        System.out.println();

        if(verified){
            System.out.println("remove (List) works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("remove (List) does NOT work");
            System.out.println("====================================");
            return false;
        }
    }
    
    public static boolean testReplace(){
        System.out.println("====================================");
        System.out.println("Testing Replace");
        System.out.println();
        boolean verified = true;
        Editor student = new Editor();
        ListPractice3 student3 = new ListPractice3();

        String [] correctValues =  {"dog", "bat", "cat", "dog", "dog", "bat", "dog"};
        ArrayList<String> correctList = new ArrayList<String>();
        for(String next : correctValues){
            correctList.add(next);
        }
        String [] input1 = {"ape", "bat", "cat", "ape", "ape", "bat", "ape"};
        ArrayList<String> listInput1 = new ArrayList<String>();
        for(String next : input1){
            listInput1.add(next);
        }
        
        String wordToRemove = "ape";
        String wordToInsert = "dog";

        System.out.print("List: ");
        student3.print(listInput1);
        System.out.println(); 

        System.out.println("Word To Remove: " + wordToRemove);
        System.out.println("Word To Insert: " + wordToInsert);
        System.out.println();
        
        ArrayList<String> results = student.replace(listInput1, wordToRemove, wordToInsert);
        if(!areListsSame(correctList, results)){
            verified = false;
        }
        
        System.out.print("Result of Replace: ");
        student3.print(results);
        System.out.println();

        if(verified){
            System.out.println("replace works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("replace does NOT work");
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
