package DAY_13;
/*
# Leetcode 66
*/

public class plusone {

    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            else{
                digits[i]=0;
            }
        }
        int[] result=new int[digits.length+1];
        result[0]=1;
        return result;
        
    }

    public static void main(String[] args) {
        int arr[]={1,2,3};
        int ans[]=plusOne(arr);

        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }

    }
    
}
