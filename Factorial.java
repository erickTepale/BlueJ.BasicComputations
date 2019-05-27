 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        BigInteger solution = new BigInteger("1"); 
        BigInteger holder;
        for (int i = 1 ; i <= value; i++){
            solution = solution.multiply(BigInteger.valueOf(i));
        }
        return solution;
    }

}
