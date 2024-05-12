package DAY_69;

import java.util.Stack;

public class largestHistogram {

    public static int largestRectangleArea(int[] heights) {
        int maxArea=0;
        int nsr[]=new int[heights.length];
        int nsl[]=new int[heights.length];

        Stack<Integer> s=new Stack<>();

        //nsr

        for(int i=heights.length-1;i>=0;i--)
        {
            while(!s.isEmpty() && heights[s.peek()]>=heights[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nsr[i]=heights.length;
            }
            else
            {
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        //nsl

        while(!s.isEmpty())
        {
            s.pop();
        }

        for(int i=0;i<heights.length;i++)
        {
            while(!s.isEmpty() && heights[s.peek()]>=heights[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nsl[i]=-1;
            }
            else
            {
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        //currentArea

        for(int k=0;k<heights.length;k++)
        {
          
            int height=heights[k];
            System.out.println(height);
            int width=(nsr[k]-nsl[k])-1;
            System.out.println(width);
            int curr=height*width;
            maxArea=Math.max(curr,maxArea);
           
        }
        return maxArea;
        
    }

    public static void main(String[] args) {
        int arr[]={9,0};
        int a=largestRectangleArea(arr);
        System.out.println(a);
    }
    
}
