package DAY_74;

public class floodFill {

    public static void dfs(int[][] image, int i, int j, int color, int initial, boolean[][] visited) {
        if(i >= image.length || j >= image[0].length || i < 0 || j < 0 || image[i][j] != initial || visited[i][j]) return;
     
        visited[i][j] = true;
        image[i][j] = color;

        dfs(image, i, j + 1, color, initial, visited); // right -> column
        dfs(image, i, j - 1, color, initial, visited); // left -> column
        dfs(image, i - 1, j, color, initial, visited); // up -> row
        dfs(image, i + 1, j, color, initial, visited); // down -> row
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {

        boolean[][] visited = new boolean[image.length][image[0].length];
        dfs(image, sr, sc, color, image[sr][sc], visited);
        return image;
    }

    public static void main(String[] args) {
        int[][] arr={{1,1,1},{1,1,0},{1,0,1}};
        int[][] ans=floodFill(arr, 1, 1, 2);

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
