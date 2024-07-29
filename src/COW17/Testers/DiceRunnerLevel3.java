package COW17.Testers;

import COW17.Dice;
import COW17.MultiSidedDice;
import COW17.MultiValueDice;

public class DiceRunnerLevel3
{
    public static void main(String[] args){
        run();
    }
    
    public static void run(){
        Dice dice1 = new Dice();
        int[] frequency1 = new int[6];
        for(int i = 0; i < frequency1.length; i++){
            frequency1[i] = 0;
        }
        for(int n = 1; n <= 10000; n++){
            int result = dice1.roll();
            frequency1[result-1] += 1;
        }
        System.out.println("====================================================");
        System.out.println("Frequency for Dice.  Each should be around 1666");
        for(int i = 0; i < frequency1.length; i++){
            System.out.print((i+1) + "-" + frequency1[i] + ", ");
        }
        System.out.println();
        
        Dice dice2 = new MultiSidedDice(12);
        int[] frequency2 = new int[12];
        for(int i = 0; i < frequency2.length; i++){
            frequency2[i] = 0;
        }
        for(int n = 1; n <= 10000; n++){
            int result = dice2.roll();
            frequency2[result-1] += 1;
        }
        System.out.println("====================================================");
        System.out.println("Frequency for 12 sided MultiSidedDice.  Each should be around 833");
        for(int i = 0; i < frequency2.length; i++){
            System.out.print((i+1) + "-" + frequency2[i] + ", ");
        }
        System.out.println();
        
        Dice dice3 = new MultiSidedDice(16);
        int[] frequency3 = new int[16];
        for(int i = 0; i < frequency3.length; i++){
            frequency3[i] = 0;
        }
        for(int n = 1; n <= 10000; n++){
            int result = dice3.roll();
            frequency3[result-1] += 1;
        }
        System.out.println("====================================================");
        System.out.println("Frequency for 15 sided MultiSidedDice.  Each should be around 625");
        for(int i = 0; i < frequency3.length; i++){
            System.out.print((i+1) + "-" + frequency3[i] + ", ");
        }
        System.out.println();
        
        int[] values4 = {1, 13, 49, 2001};
        Dice dice4 = new MultiValueDice(values4);
        int[] frequency4 = new int[4];
        for(int i = 0; i < frequency4.length; i++){
            frequency4[i] = 0;
        }
        for(int n = 1; n <= 10000; n++){
            int result = dice4.roll();
            for(int i = 0; i < values4.length; i++){
                if(values4[i] == result){
                    frequency4[i] += 1;
                }
            }
        }
        System.out.println("====================================================");
        System.out.println("Frequency for MultiSidedDice with values {1, 13, 49, 2001}.  Each should be around 2500");
        for(int i = 0; i < frequency4.length; i++){
            System.out.print(values4[i] + "-" + frequency4[i] + ", ");
        }
        System.out.println();
    }
}
