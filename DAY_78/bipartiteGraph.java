package DAY_78;

import java.util.LinkedList;
import java.util.Queue;

public class bipartiteGraph {

        public static boolean isBipartite(int[][] graph) {

        int col[] = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            col[i] = -1;
        }

        for (int i = 0; i < graph.length; i++) {
            if (col[i] == -1) {
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                col[i] = 0;

                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].length; j++) {
                        int dest = graph[curr][j];
                        if (col[dest] == -1) {
                            int nextcol = col[curr] == 0 ? 1 : 0;
                            col[dest] = nextcol;
                            q.add(dest);
                        }

                        else if (col[dest] == col[curr]) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;

    }

    public static void main(String[] args) {
        int[][] arr={{1,2,3},{0,2},{0,1,3},{0,2}};
        boolean ans=isBipartite(arr);
        System.out.println(ans);
    }
    
}
