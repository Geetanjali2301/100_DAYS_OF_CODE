package DAY_6;
/*
#Leetcode 54
*/

import java.util.ArrayList;
import java.util.List;

public class spiral_Matrix {

     public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans=new ArrayList<>();
        int m=matrix.length; //row
        int n=matrix[0].length; //column

        int left=0;
        int right=n-1;
        int top=0;
        int bottom=m-1;


        while(top<=bottom && left<=right){
        //left to rigth
        for(int i=left;i<=right;i++){
              ans.add(matrix[top][i]);
        }
        top++;
        //top to bottom
        for(int i=top;i<=bottom;i++){
            ans.add(matrix[i][right]);
        }
        right--;
        if(top<=bottom){
        //right to left
        for(int i=right;i>=left;i--){
            ans.add(matrix[bottom][i]);
        }
        bottom--;
        }
        // bottom to top
        if(left<=right){
        for(int i=bottom;i>=top;i--){
            ans.add(matrix[i][left]);
        }
        left++;
        }
        }

    return ans;
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> ans=spiralOrder(arr);

        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }
        
    }
    
}
