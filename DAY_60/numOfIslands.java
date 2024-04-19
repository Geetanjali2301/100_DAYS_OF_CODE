package DAY_60;
/*
# Leetcode 200
*/

public class numOfIslands {

    public static void dfs(char[][] grid,int i,int j,int n,int m)
    {
        if(i<0 || j<0 || i==n || j==m)
        {
            return;
        }

        if(grid[i][j]=='0')
        {
            return;
        }

        //set to 0 once visited
        grid[i][j]='0';

        //call the same function for tracking all its neighbour 1s
        dfs(grid,i-1,j,n,m);
        dfs(grid,i+1,j,n,m);
        dfs(grid,i,j-1,n,m);
        dfs(grid,i,j+1,n,m);
    }

    public static int numIslands(char[][] grid) {

        int ans=0;
        int n=grid.length;
        int m=grid[0].length;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                {
                    //if it is 1 then track nearby 1s
                    ans++;
                    dfs(grid,i,j,n,m);
                }
            }
        }

        return ans;
        
    }

    public static void main(String[] args) {
        char grid[][]={{'1','1','0'},{'0','0','1'},{'0','1','1'}};
        int ans=numIslands(grid);
        System.out.println(ans);
    }
    
}
