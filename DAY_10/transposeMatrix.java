package DAY_10;
/*

*/

public class transposeMatrix {

    public static int[][] transpose(int[][] matrix) {

        int ans[][]=new int[matrix[0].length][matrix.length];

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                ans[j][i]=matrix[i][j];
            }
        }

        return ans;
        
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int ans[][]=transpose(arr);

        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans[0].length;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}

