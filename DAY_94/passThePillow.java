package DAY_94;
/*
#Leetcode 2582
*/

public class passThePillow {

    public static int passThePillow(int n, int time) {
        int index = 1;
        boolean reverse = false;
        while(time-->0){
            if(!reverse)
                index++;
            else
                index--;
            if(index == n)
                reverse = true;
            if(index == 1)
                reverse = false;
        }
        return index;
        
    }

    public static void main(String[] args) {
        int n=4;
        int time=5;
        int ans=passThePillow(n, time);
        System.out.println(ans);
    }
    
}
