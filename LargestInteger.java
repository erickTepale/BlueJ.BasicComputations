 
import java.lang.Math;

public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        Integer winner = integers[0];
        for(Integer unit : integers){
            System.out.println(unit);
            if (unit > winner)
                winner = unit;
        }
        
        return winner;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        
        return Math.max(Math.max(integers[0],integers[1]), integers[2]);
    }
}
