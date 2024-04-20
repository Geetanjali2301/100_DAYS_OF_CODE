package DAY_61;
/*
# Leetcode 1992
*/

import java.util.*;

public class farmersLand {

    public static void dfs(int[][] land,boolean[][] vis,int i,int j,int[] arr)
    {
        if(i<0 || i>=land.length || j<0 || j>=land[0].length || vis[i][j]==true || land[i][j]==0)
        {
            return;
        }

        vis[i][j]=true;
        //call for top left coordinates
        arr[0]=Math.min(arr[0],i);
        arr[1]=Math.min(arr[1],j);

        //call for bottom right coordinates
        arr[2]=Math.max(arr[2],i);
        arr[3]=Math.max(arr[3],j);

        dfs(land,vis,i+1,j,arr);
        dfs(land,vis,i-1,j,arr);
        dfs(land,vis,i,j+1,arr);
        dfs(land,vis,i,j-1,arr);

    }

    public static int[][] findFarmland(int[][] land) {

        int n=land.length;
        int m=land[0].length;

        boolean[][] vis=new boolean[n][m];
        ArrayList<int[]> ans=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(land[i][j]== 1 && vis[i][j]==false)
                {
                    int[] arr={i,j,i,j};
                    dfs(land,vis,i,j,arr);
                    ans.add(arr);
                }
            }
        }

        int size=ans.size();
        int i=0;
        int[][] finalans=new int[size][4];
        for(int[] ar:ans)
        {
            finalans[i++]=ar;
        }
        return finalans;
        
    }

    public static void main(String[] args) {

        int[][] land={{1,0,0},{0,1,1},{0,1,1}};
        int[][] ans=findFarmland(land);
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
