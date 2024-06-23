package DAY_87;
/*
#Leetcode 74
*/

public class search2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length;
        int j = matrix[0].length;
        

        int lowi = 0;
        int highi = i - 1;
        int row = -1;

        while (lowi <= highi) {
            int midi = (lowi + highi) / 2;

            if (target >= matrix[midi][0] && target <= matrix[midi][j - 1]) {
                row = midi;
                break;
            } 
            else if (target < matrix[midi][0]) {
                highi = midi - 1;
            } 
            else {
                lowi = midi + 1;
            }
        }


        if (row == -1) {
            return false;
        }


        int left = 0;
        int right = j - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (matrix[row][mid] == target) {
                return true;
            } 
            else if (matrix[row][mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int matrix[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        boolean ans=searchMatrix(matrix, target);
        System.out.println(ans);
    }


    
}
