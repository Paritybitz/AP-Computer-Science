/*
package COW17.Testers;

import COW17.Dice;
import COW17.MultiSidedDice;

import java.util.*;

public class DiceRunnerLevel5
{
    public static void main(String[] args){
        run();
    }
    
    public static void run(){
        ArrayList<Dice> theDice1 = new ArrayList<Dice>();
        theDice1.add(new Dice());
        theDice1.add(new Dice());
        Dice dice1 = new MultiDice(theDice1);
        int[] frequency1 = new int[11];
        for(int i = 0; i < frequency1.length; i++){
            frequency1[i] = 0;
        }
        for(int n = 1; n <= 10000; n++){
            int result = dice1.roll();
            frequency1[result-2] += 1;
        }
        System.out.println("====================================================");
        System.out.println("Frequency for MultiDice (2xDice).  It should max out around 1666 in the middle and tail off to 250 at the ends");
        for(int i = 0; i < frequency1.length; i++){
            System.out.print((i+2) + "-" + frequency1[i] + ", ");
        }
        System.out.println();
        
        ArrayList<Dice> theDice2 = new ArrayList<Dice>();
        theDice2.add(new Dice());
        theDice2.add(new MultiSidedDice(12));
        theDice2.add(new MultiSidedDice(18));
        Dice dice2 = new MultiDice(theDice2);
        int[] frequency2 = new int[41];
        for(int i = 0; i < frequency2.length; i++){
            frequency2[i] = 0;
        }
        for(int n = 1; n <= 10000; n++){
            int result = dice2.roll();
            frequency2[result] += 1;
        }
        System.out.println("====================================================");
        System.out.println("Frequency for MultiDice (Dice, 12 Sided Dice, 18 Sided Dice).  It should start at 3, end at 36, and max out between 19 and 20");
        for(int i = 0; i < frequency2.length; i++){
            System.out.print((i) + "-" + frequency2[i] + ", ");
        }
        System.out.println();
        
        int[] values3 = {10, 20, 30, 40, 50, 60};
        double[] weights3 = {100, 90, 30, 10, 70, 200}; 
        Dice dice3 = new WeightedDice(values3, weights3);
        int[] frequency3 = new int[6];
        for(int i = 0; i < frequency3.length; i++){
            frequency3[i] = 0;
        }
        for(int n = 1; n <= 10000; n++){
            int result = dice3.roll();
            for(int i = 0; i < values3.length; i++){
                if(values3[i] == result){
                    frequency3[i] += 1;
                }
            }
        }
        System.out.println("====================================================");
        System.out.println("Frequency for WeightedDice with values {10, 20, 30, 40, 50, 60}.  The Distribution should be close to 2000, 1800, 600, 200, 1400, 4000");
        for(int i = 0; i < frequency3.length; i++){
            System.out.print(values3[i] + "-" + frequency3[i] + ", ");
        }
        System.out.println();
        
        ArrayList<Dice> theDice4 = new ArrayList<Dice>();
        theDice4.add(new Dice());
        theDice4.add(new Dice());
        theDice4.add(new Dice());
        Dice dice4 = new HighValueMultiDice(theDice4);
        int[] frequency4 = new int[6];
        for(int i = 0; i < frequency4.length; i++){
            frequency4[i] = 0;
        }
        for(int n = 1; n <= 10000; n++){
            int result = dice4.roll();
            frequency4[result-1] += 1;
        }
        System.out.println("====================================================");
        System.out.println("Frequency for HighValueMultiDice (3xDice).  It should be around 1-50, 2-350, 3-900, 4-1700, 5-2900, 6-4100,");
        for(int i = 0; i < frequency4.length; i++){
            System.out.print((i+1) + "-" + frequency4[i] + ", ");
        }
        System.out.println();
        
    }
}
*/
