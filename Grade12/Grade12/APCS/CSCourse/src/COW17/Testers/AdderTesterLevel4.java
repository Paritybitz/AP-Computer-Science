package COW17.Testers;
import COW17.*;

public class AdderTesterLevel4
{
    public static void main(String[] args){
        System.out.println("Does the Adder Work: " + testAdder());
    }
    
    public static boolean testAdder(){
        boolean success = true;
        
        Character a = 'Y';
        Character b = 'M';
        Object result1 = Adder.add(a, b);
        if(result1 == null || !(result1 instanceof String) || !((String)result1).equals("YM")){
            System.out.println("Character addition does NOT appear to work");
            success = false;
        }else{
            System.out.println("Character addition does appear to work");
        }
        
        Integer c = 13;
        Integer d = 4;
        Object result2 = Adder.add(13, 4);
        if(result2 == null || !(result2 instanceof Integer) || !((Integer)result2 == 17)){
            System.out.println("Integer addition does NOT appear to work");
            success = false;
        }else{
            System.out.println("Integer addition does appear to work");
        }
        
        String e = "Yaro";
        String f = "Mayewsky";
        Object result3 = Adder.add(e, f);
        if(result3 == null || !(result3 instanceof String) || !((String)result3).equals("Yaro Mayewsky")){
            System.out.println("String addition does NOT appear to work");
            success = false;
        }else{
            System.out.println("String addition does appear to work");
        }
        
        Boolean g = true;
        Boolean h = true;
        Boolean i = false;
        Boolean j = false;
        Object result4 = Adder.add(g, h);
        Object result5 = Adder.add(g, i);
        Object result6 = Adder.add(j, h);
        Object result7 = Adder.add(j, i);
        if(result4 == null || result5 == null || result6 == null || result7 == null || !(result4 instanceof Boolean) || !(result5 instanceof Boolean) || !(result6 instanceof Boolean) || !(result7 instanceof Boolean) || !((Boolean)result4 == false)|| !((Boolean)result5 == true)|| !((Boolean)result6 == true)|| !((Boolean)result7 == false)){
            System.out.println("Boolean addition does NOT appear to work");
            success = false;
        }else{
            System.out.println("Boolean addition does appear to work");
        }
        return success;
    }
}
