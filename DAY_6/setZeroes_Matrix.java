package DAY_6;
/*
#Leetcode 73
*/

import java.util.ArrayList;

public class setZeroes_Matrix {

    public static int[][] setZeroes(int[][] matrix) {

        ArrayList<Integer> rows=new ArrayList<>();
        ArrayList<Integer> cols=new ArrayList<>();

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        while(rows.size()>0)
        {
            int row=rows.remove(rows.size()-1);
            for(int i=0;i<matrix[0].length;i++)
            {
                matrix[row][i]=0;
            }
        }

        while(cols.size()>0)
        {
            int col=cols.remove(cols.size()-1);
            for(int i=0;i<matrix.length;i++)
            {
                matrix[i][col]=0;
            }
        }

       return matrix;
    }

    public static void main(String[] args) {
        int matrix[][]={{1,0,1},{1,1,1},{1,1,1}};
        int ans[][]=setZeroes(matrix);

        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
