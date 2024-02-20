package DAY_2;
import java.util.*;
/*
# Leetcode 1518
*/
public class waterBottles {

    public static int numWaterBottles(int numBottles, int numExchange) {
        
        int ans=numBottles;
        while(numBottles>=numExchange)
        {
            ans+=numBottles/numExchange;
            numBottles=numBottles/numExchange + numBottles%numExchange;
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int numBottles=9;
        int numExchange=3;
        System.out.println(numWaterBottles(numBottles,numExchange));
    }
    
}
