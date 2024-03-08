package DAY_19;
/*
# Leetcode 1572
*/

public class diagonalSum {

    public static int diagonal(int[][] mat) {

        int sum=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
                if(i==j)
                {
                    sum+=mat[i][j];
                }
                else if(i+j==(mat.length-1) && i!=j )
                {
                    sum+=mat[i][j];

                }
            }
        }

        return sum;   
    }

    public static void main(String[] args) {
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        int ans=diagonal(mat);
        System.out.println(ans);
    }
    
}
