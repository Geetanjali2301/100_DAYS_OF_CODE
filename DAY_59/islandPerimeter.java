package DAY_59;
/*
# Leetcode 463
*/

public class islandPerimeter {

    public static int islandPerimeter(int[][] grid) {

        if(grid == null || grid.length == 0 || grid[0].length == 0)return 0;

        int res = 0;
        for(int i=0; i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j] == 1)
                {
                   res += 4;

                   if(i > 0 && grid[i-1][j] == 1)
                   {
                    res -= 2;
                   }

                   if(j > 0 && grid[i][j-1] == 1)
                   {
                    res -= 2;
                   }
                }
            }
        }
        
        return res;      
    }

    public static void main(String[] args) {
        int arr[][]={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        int ans=islandPerimeter(arr);
        System.out.println(ans);

    }
        
    
    
}
