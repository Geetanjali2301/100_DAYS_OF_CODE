package DAY_62;
/*
# Leetcode 1971
*/

import java.util.*;
public class hasPath {

    public static boolean dfs(int[][] edges,int source,int destination,boolean[] vis,ArrayList<ArrayList<Integer>> graph)
    {
        vis[source]=true;
        if(destination==source)
        {
            return true;
        }
        for(int e:graph.get(source))
        {
            if(!vis[e])
            {
                if(dfs(edges,e,destination,vis,graph))
                {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            graph.add(new ArrayList());
        }

        for(int i=0;i<edges.length;i++)
        {
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }

        boolean[] vis=new boolean[n];
        return dfs(edges,source,destination,vis,graph);
        
    }

    public static void main(String[] args) {
        int edges[][]={{0,1},{1,2},{2,0}};
        boolean ans=validPath(3, edges, 0, 2);
        System.out.println(ans);
    }
    
}
