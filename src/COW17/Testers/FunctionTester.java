package COW17.Testers;
import COW17.*;

public class FunctionTester
{
    public static void main(String[] args){
        System.out.println("Do functions work: " + testFunctions());
    }
    
    public static boolean testFunctions(){
        boolean success = true;
        
        Function1 function1 = new Function1(5);
        Function1 function2 = new Function1(-3);
        if(function1.getValueAt(10) != 5 || function2.getValueAt(10) != 13){
            success = false;
            System.out.println("Shape does is not working");
        }
        
        Function1 function3 = new Function2(5, 3);
        Function1 function4 = new Function2(-3, 2);
        if(function3.getValueAt(10) != 125 || function4.getValueAt(10) != 169){
            success = false;
            System.out.println("Function2 does is not working");
        }
        
        Function1 function5 = new Function3(5, 3, 4);
        Function1 function6 = new Function3(-3, 2, 7);
        if(function5.getValueAt(10) != 500 || function6.getValueAt(10) != 1183){
            success = false;
            System.out.println("Function3 does is not working");
        }
        
        Function1 function7 = new Function4(5, 3, 4, 253);
        Function1 function8 = new Function4(-3, 2, 7, -183);
        if(function7.getValueAt(10) != 753 || function8.getValueAt(10) != 1000){
            success = false;
            System.out.println("Function3 does is not working");
        }
        return success;
    }
}

