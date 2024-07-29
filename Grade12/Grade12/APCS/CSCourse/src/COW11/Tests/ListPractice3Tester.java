package COW11.Tests;

import COW11.ListPractice3;

import java.util.*;
public class ListPractice3Tester
{
    public static void main(String [] arg){
        testPrint();
        boolean combineWorks = testCombine();
        boolean subArrayListWorks = testSubArrayList();
        boolean equalWorks = testEqual();
        boolean containsWorks = testContains();

        if(combineWorks && subArrayListWorks && equalWorks && containsWorks){
        System.out.println("ListPractice 3 works");
        }else{
        System.out.println("ListPractice 3 does NOT work");
        }
    }

    public static void testPrint(){
        System.out.println("====================================");
        boolean verified = true;
        ListPractice3 student = new ListPractice3();

        String [] input = {"Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig", "Grape", "Honeydew", "Imbe", "JackFruit", "Kiwi"};
        ArrayList<String> listInput = new ArrayList<String>();
        for(String next : input){
            listInput.add(next);
        }
        student.print(listInput);

        System.out.println("Should have printed:");
        System.out.println("Apple, Banana, Cherry, Date, Elderberry, Fig, Grape, Honeydew, Imbe, JackFruit, Kiwi,");
        System.out.println("====================================");

    }

    public static boolean testCombine(){
        System.out.println("====================================");
        boolean verified = true;
        ListPractice3 student = new ListPractice3();

        String [] correctValues =  {"Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig", "Grape", "Honeydew", "Imbe", "JackFruit", "Kiwi"};
        ArrayList<String> correctList = new ArrayList<String>();
        for(String next : correctValues){
            correctList.add(next);
        }
        String [] input1 = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        ArrayList<String> listInput1 = new ArrayList<String>();
        for(String next : input1){
            listInput1.add(next);
        }
        String [] input2 = {"Fig", "Grape", "Honeydew", "Imbe", "JackFruit", "Kiwi"};
        ArrayList<String> listInput2 = new ArrayList<String>();
        for(String next : input2){
            listInput2.add(next);
        }
        ArrayList<String> results = student.combine(listInput1, listInput2);
        if(!areListsSame(correctList, results)){
            verified = false;
        }
        System.out.print("List 1: ");
        student.print(listInput1);
        System.out.println();
        System.out.print("List 2: ");
        student.print(listInput2);
        System.out.println();
        System.out.print("Result of Combined: ");
        student.print(results);
        System.out.println();

        if(verified){
            System.out.println("combine works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("combine does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testSubArrayList(){
        System.out.println("====================================");
        boolean verified = true;
        ListPractice3 student = new ListPractice3();

        String [] correctValues =  {"Cherry", "Date", "Elderberry", "Fig"};
        ArrayList<String> correctList = new ArrayList<String>();
        for(String next : correctValues){
            correctList.add(next);
        }
        String [] input1 = {"Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig", "Grape", "Honeydew", "Imbe", "JackFruit", "Kiwi"};
        ArrayList<String> listInput1 = new ArrayList<String>();
        for(String next : input1){
            listInput1.add(next);
        }
        int i1 = 2;
        int i2 = 5;
        ArrayList<String> results = student.subArrayList(listInput1, i1, i2);
        if(!areListsSame(correctList, results)){
            verified = false;
        }
        System.out.println("i1: " + i1);
        System.out.println("i2: " + i2);
        System.out.print("List: ");
        student.print(listInput1);
        System.out.println();   
        System.out.print("Result of SubArrayList: ");
        student.print(results);
        System.out.println();

        if(verified){
            System.out.println("subArrayList works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("subArrayList does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testEqual(){
        System.out.println("====================================");
        boolean verified = true;
        ListPractice3 student = new ListPractice3();

        String [] correctValues =  {"Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig", "Grape", "Honeydew", "Imbe", "JackFruit", "Kiwi"};
        ArrayList<String> correctList = new ArrayList<String>();
        for(String next : correctValues){
            correctList.add(next);
        }
        String [] input1 = {"Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig", "Grape", "Honeydew", "Imbe", "JackFruit", "Kiwi"};
        ArrayList<String> listInput1 = new ArrayList<String>();
        for(String next : input1){
            listInput1.add(next);
        }
        String [] input2 = {"Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig", "Grape", "Honeydew", "Imbe", "JackFruit"};
        ArrayList<String> listInput2 = new ArrayList<String>();
        for(String next : input2){
            listInput2.add(next);
        }
        String [] input3 = {"Grape", "Honeydew", "Imbe", "JackFruit", "Kiwi", "Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig"};
        ArrayList<String> listInput3 = new ArrayList<String>();
        for(String next : input3){
            listInput3.add(next);
        }
        String [] input4 = {"Lime", "Mango", "Nectarine", "Olive", "Papaya", "Quince", "Rasberry", "Strawberry", "Tangerine", "Ugni", "Voavanga"};
        ArrayList<String> listInput4 = new ArrayList<String>();
        for(String next : input4){
            listInput4.add(next);
        }
        String [] input5 = {"Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig", "Grape", "Honeydew", "Imbe", "JackRabbit", "Kiwi"};
        ArrayList<String> listInput5 = new ArrayList<String>();
        for(String next : input5){
            listInput5.add(next);
        }

        System.out.print("Master List: ");
        student.print(correctList);
        System.out.println();
        System.out.print("List 1: ");
        student.print(listInput1);
        System.out.println();
        System.out.print("List 2: ");
        student.print(listInput2);
        System.out.println();
        System.out.print("List 3: ");
        student.print(listInput3);
        System.out.println();
        System.out.print("List 4: ");
        student.print(listInput4);
        System.out.println();
        System.out.print("List 5: ");
        student.print(listInput5);
        System.out.println();

        if(!student.equal(correctList, listInput1)){
            verified = false;
            System.out.println("Error - List1 does not equal Master List");
        }
        if(student.equal(correctList, listInput2)){
            verified = false;
            System.out.println("Error - List2 does equal Master List");
        }
        if(student.equal(correctList, listInput3)){
            verified = false;
            System.out.println("Error - List3 does equal Master List");
        }
        if(student.equal(correctList, listInput4)){
            verified = false;
            System.out.println("Error - List4 does equal Master List");
        }
        if(student.equal(correctList, listInput5)){
            verified = false;
            System.out.println("Error - List5 does equal Master List");
        }


        if(verified){
            System.out.println("equal works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("equal does NOT work");
            System.out.println("====================================");
            return false;
        }
    }

    public static boolean testContains(){
        System.out.println("====================================");
        boolean verified = true;
        ListPractice3 student = new ListPractice3();

        String [] input1 = {"Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig", "Grape", "Honeydew", "Imbe", "JackFruit", "Kiwi"};
        ArrayList<String> listInput1 = new ArrayList<String>();
        for(String next : input1){
            listInput1.add(next);
        }
        String word1 = "Apple";
        String word2 = "Fig";
        String word3 = "Kiwi";
        String word4 = "Cheese";
        String word5 = "Ban";

        System.out.print("List: ");
        student.print(listInput1);
        System.out.println();
        System.out.println("Search Terms: " + word1 + ", " + word2 + ", " + word3 + ", " + word4 + ", " + word5);
        System.out.println();

        if(!student.contains(listInput1, word1)){
            verified = false;
            System.out.println("Error: contains states that " + word1 + " is not in the list");
        }
        if(!student.contains(listInput1, word2)){
            verified = false;
            System.out.println("Error: contains states that " + word2 + " is not in the list");
        }
        if(!student.contains(listInput1, word3)){
            verified = false;
            System.out.println("Error: contains states that " + word3 + " is not in the list");
        }
        if(student.contains(listInput1, word4)){
            verified = false;
            System.out.println("Error: contains states that " + word4 + " is in the list");
        }
        if(student.contains(listInput1, word5)){
            verified = false;
            System.out.println("Error: contains states that " + word5 + " is in the list");
        }

        if(verified){
            System.out.println("contains works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("contains does NOT work");
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
