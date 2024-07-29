/*
package COW17.Testers;

import COW17.Adder;
import COW17.Dice;
import COW17.MultiSidedDice;
import COW17.Person;

public class AdderLevel6Tester
{
    public static void main(String[] args){
        System.out.println("Does the Adder Work: " + testAdder());
    }

    public static boolean testAdder(){
        boolean success = true;

        Dice a = new Dice();
        Dice b = new MultiSidedDice(3);
        Object result1 = Adder.add(a, b);
        if(result1 == null || !(result1 instanceof MultiDice)){
            System.out.println("Dice addition does NOT appear to work");
            success = false;
        }else{
            Dice dice1 = (MultiDice)Adder.add(a, b);
            int[] frequency = new int[8];
            for(int i = 0; i < frequency.length; i++){
                frequency[i] = 0;
            }
            for(int n = 1; n <= 10000; n++){
                int value = dice1.roll();
                if(value < 2 || value > 9){
                    success = false;
                }else{
                    frequency[value-2] += 1;
                }
            }
            for(int i = 0; i < frequency.length; i++){
                if(frequency[i] == 0){
                    success = false;
                }   
            }
            if(!success){
                System.out.println("Dice addition does NOT appear to work");
            }else{
                System.out.println("Dice addition does appear to work");
            }
        }

        Person c = new Person("Sing", 30, true);
        Person d = new Person("Song", 25, false);
        Object result2 = Adder.add(c, d);
        if(result2 == null || !(result2 instanceof Person) || !( ( (Person)result2 ).getName().equals("Sing-Song") ) || !( ( (Person)result2).getAge() == 0)){
            System.out.println("Person addition does NOT appear to work");
            success = false;
        }else{
            System.out.println("Person addition does appear to work");
        }
        return success;
    }
}
*/
