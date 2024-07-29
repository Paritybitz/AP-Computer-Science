package COW8;

import java.util.*;
public class Intake
{
    private int [] expectedValues;
    private ArrayList<Integer> givenValues;

    public Intake(int [] expectedValues){
        this.expectedValues = expectedValues;
        givenValues = new ArrayList<Integer>();
    }

    public void give(int number){
        givenValues.add(number);
    }

    public boolean verify(){
        boolean match = true;
        if(expectedValues.length != givenValues.size()){
            match = false;
        }else{
            for(int i = 0; i < expectedValues.length; i++){
                if(expectedValues[i] != givenValues.get(i)){
                    match = false;
                }
            }
        }
        if(!match){
            System.out.print("Expected: ");
            for(int i = 0; i < expectedValues.length; i++){
                System.out.print(expectedValues[i] + ", ");
            }
            System.out.println();
            System.out.print("Recieved: ");
            for(int i = 0; i < givenValues.size(); i++){
                System.out.print(givenValues.get(i) + ", ");
            }
            System.out.println();
            System.out.println("Values do NOT match");
        }
        return match;
    }
}