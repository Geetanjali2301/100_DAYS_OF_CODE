package DAY_12;
/*
# Leetcode 34
# Approach O(n)
*/

public class startEndIndex2 {
    public static void main(String[] args) {
        int arr[]={2,7,7,8,8,9,10};
        int target=8;
        int ans[]={-1,-1};

        int i=0;
        while(i<arr.length)
        {
            if(arr[i]==target)
            {
                int j=i+1;
                while(j==target)
                {
                    j++;
                }

                ans[0]=i;
                ans[1]=j;
                break;
            }
            else{

                i++;
            }
        }

        for(int k=0;k<ans.length;k++)
        {
            System.out.print(ans[k]+" ");
        }

       
    }
    
}
