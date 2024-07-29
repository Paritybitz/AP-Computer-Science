package COW11.Tests;

import COW11.ListPractice2;

import java.util.*;
public class ListPractice2Tester
{
    public static void main(String [] arg){
        boolean reverseWorks = testGenerateReverse();
        boolean posEvensWorks = testGeneratePositiveEvens();
        boolean inRangeWorks = testGenerateInRange();
        boolean endsWorks = testGenerateFirstMiddleLast();
        boolean multiplesWorks = testGenerateFirstHalf();

        if(reverseWorks && posEvensWorks && inRangeWorks && endsWorks && multiplesWorks){
            System.out.println("ListPractice 2 works");
        }else{
            System.out.println("ListPractice 2 does NOT work");
        }
    }
    
    public static boolean testGenerateReverse(){
        System.out.println("====================================");
        boolean verified = true;
        ListPractice2 student = new ListPractice2();
        
        int [] correctValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> correctList = new ArrayList<Integer>();
        for(int next : correctValues){
            correctList.add(next);
        }
        int [] input = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        ArrayList<Integer> listInput = new ArrayList<Integer>();
        for(int next : input){
            listInput.add(next);
        }
        ArrayList<Integer> results = student.generateReverse(listInput);
        if(!areListsSame(correctList, results)){
            verified = false;
        }
        
        int [] correctValues2 = {5, 2, 6, 3, 4, 9, 1, 7};
        ArrayList<Integer> correctList2 = new ArrayList<Integer>();
        for(int next : correctValues2){
            correctList2.add(next);
        }
        int [] input2 = {7, 1, 9, 4, 3, 6, 2, 5};
        ArrayList<Integer> listInput2 = new ArrayList<Integer>();
        for(int next : input2){
            listInput2.add(next);
        }
        ArrayList<Integer> results2 = student.generateReverse(listInput2);
        if(!areListsSame(correctList2, results2)){
            verified = false;
        }
        
        if(verified){
            System.out.println("generateReverse works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("generateReverse does NOT work");
            System.out.println("====================================");
            return false;
        }
    }
    
    public static boolean testGeneratePositiveEvens(){
        System.out.println("====================================");
        boolean verified = true;
        ListPractice2 student = new ListPractice2();
        
        int [] correctValues = {504, 46};
        ArrayList<Integer> correctList = new ArrayList<Integer>();
        for(int next : correctValues){
            correctList.add(next);
        }
        int [] input = {5, 23, 504, -307, -214, -3, 0, 46, 55, -22, -19};
        ArrayList<Integer> listInput = new ArrayList<Integer>();
        for(int next : input){
            listInput.add(next);
        }
        ArrayList<Integer> results = student.generatePositiveEvens(listInput);
        if(!areListsSame(correctList, results)){
            verified = false;
        }
        
        if(verified){
            System.out.println("generatePositiveEvens works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("generatePositiveEvens does NOT work");
            System.out.println("====================================");
            return false;
        }
    }
    
    public static boolean testGenerateInRange(){
        System.out.println("====================================");
        boolean verified = true;
        ListPractice2 student = new ListPractice2();
        
        int [] correctValues = {3, 4, 5, 6, 7, 8};
        ArrayList<Integer> correctList = new ArrayList<Integer>();
        for(int next : correctValues){
            correctList.add(next);
        }
        int [] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> listInput = new ArrayList<Integer>();
        for(int next : input){
            listInput.add(next);
        }
        ArrayList<Integer> results = student.generateInRange(listInput, 3, 8);
        if(!areListsSame(correctList, results)){
            verified = false;
        }
        
        int [] correctValues2 = {-214, -3, -22, -19};
        ArrayList<Integer> correctList2 = new ArrayList<Integer>();
        for(int next : correctValues2){
            correctList2.add(next);
        }
        int [] input2 = {5, 23, 504, -307, -214, -3, 0, 46, 55, -22, -19};
        ArrayList<Integer> listInput2 = new ArrayList<Integer>();
        for(int next : input2){
            listInput2.add(next);
        }
        ArrayList<Integer> results2 = student.generateInRange(listInput2, -300, -1);
        if(!areListsSame(correctList2, results2)){
            verified = false;
        }
        
        if(verified){
            System.out.println("generateInRange works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("generateInRange does NOT work");
            System.out.println("====================================");
            return false;
        }
    }
    
    public static boolean testGenerateFirstMiddleLast(){
        System.out.println("====================================");
        boolean verified = true;
        ListPractice2 student = new ListPractice2();
        
        int [] correctValues = {5, -6, -19};
        ArrayList<Integer> correctList = new ArrayList<Integer>();
        for(int next : correctValues){
            correctList.add(next);
        }
        int [] input = {5, 23, 504, -307, -214, -3, -9, 0, 46, 55, -22, -19};
        ArrayList<Integer> listInput = new ArrayList<Integer>();
        for(int next : input){
            listInput.add(next);
        }
        ArrayList<Integer> results = student.generateFirstMiddleLast(listInput);
        if(!areListsSame(correctList, results)){
            verified = false;
        }
        
        int [] correctValues2 = {5, 5, 5};
        ArrayList<Integer> correctList2 = new ArrayList<Integer>();
        for(int next : correctValues2){
            correctList2.add(next);
        }
        int [] input2 = {5};
        ArrayList<Integer> listInput2 = new ArrayList<Integer>();
        for(int next : input2){
            listInput2.add(next);
        }
        ArrayList<Integer> results2 = student.generateFirstMiddleLast(listInput2);
        if(!areListsSame(correctList2, results2)){
            verified = false;
        }
        
        if(verified){
            System.out.println("generateFirstMiddleLast works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("generateFirstMiddleLast does NOT work");
            System.out.println("====================================");
            return false;
        }
    }
    
     public static boolean testGenerateFirstHalf(){
        System.out.println("====================================");
        boolean verified = true;
        ListPractice2 student = new ListPractice2();
        
        int [] correctValues = {5, 23, 504, -307, -214};
        ArrayList<Integer> correctList = new ArrayList<Integer>();
        for(int next : correctValues){
            correctList.add(next);
        }
        int [] input = {5, 23, 504, -307, -214, -3, 0, 46, 55, -22, -19};
        ArrayList<Integer> listInput = new ArrayList<Integer>();
        for(int next : input){
            listInput.add(next);
        }
        ArrayList<Integer> results = student.generateFirstHalf(listInput);
        if(!areListsSame(correctList, results)){
            verified = false;
        }
        
        int [] correctValues2 = {-88, 10};
        ArrayList<Integer> correctList2 = new ArrayList<Integer>();
        for(int next : correctValues2){
            correctList2.add(next);
        }
        int [] input2 = {-88, 10, 20, 38};
        ArrayList<Integer> listInput2 = new ArrayList<Integer>();
        for(int next : input2){
            listInput2.add(next);
        }
        ArrayList<Integer> results2 = student.generateFirstHalf(listInput2);
        if(!areListsSame(correctList2, results2)){
            verified = false;
        }
        
        if(verified){
            System.out.println("generateFirstHalf works");
            System.out.println("====================================");
            return true;
        }else{
            System.out.println("generateFirstHalf does NOT work");
            System.out.println("====================================");
            return false;
        }
    }
    
    public static boolean areListsSame(ArrayList<Integer> list1, ArrayList<Integer> list2){
        if(list1.size() != list2.size()){
            System.out.println("Results are a different size");
            return false;
        }
        for(int i = 0; i < list1.size(); i++){
            if((int)list1.get(i) != (int)list2.get(i)){
                System.out.println(list1.get(i) + " != " + list2.get(i));
                return false;
            }
        }
        return true;
    }
}
