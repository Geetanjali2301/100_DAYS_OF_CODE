package DAY_81;

import java.util.Arrays;

public class heights {

    public static int heightChecker(int[] heights) {

        int expected[]=new int[heights.length];
        for(int i=0;i<heights.length;i++)
        {
            expected[i]=heights[i];
        }
        Arrays.sort(expected);

        int cnt=0;
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i]!=expected[i])
            {
                cnt++;
            }
        }

        return cnt;

        
    }

    public static void main(String[] args) {
        int heights[]={2,1,4,3,5};
        int ans=heightChecker(heights);
        System.out.println(ans);
    }
    
}
