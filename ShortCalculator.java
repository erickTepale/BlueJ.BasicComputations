import java.util.Scanner; 
import java.lang.Math;

public class ShortCalculator {
    
    ShortCalculator(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input two numbers (0 - 65535)");
        Short firstNum = input.nextShort();
        while(firstNum < 0 || firstNum > 65535 )
        {
            System.out.println("Please input two numbers (0 - 65535)");
            firstNum = input.nextShort();
        }
        
        Short secondNum = input.nextShort();
        while(secondNum < 0 || secondNum > 65535 )
        {
            System.out.println("Please input one number (0 - 65535)");
            secondNum = input.nextShort();
        }
        
        validate(firstNum, secondNum);
        
    }
    
    private String validate (Short a, Short b){
        // sum 
        
        //diff
        
        //product
        
        //quotient
        
        // remainder
        
        
        
        return null;
    }
}
