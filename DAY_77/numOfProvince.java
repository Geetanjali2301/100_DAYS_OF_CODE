package DAY_77;

public class numOfProvince {

    public static void dfs(int c[][],int ind,int n,int visited[]){
        visited[ind]=1;
        for(int i=0;i<n;i++){
            if(visited[i]!=1 && c[ind][i]==1 && ind!=i)
            dfs(c,i,n,visited);
        }
    }
    public static int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int ans=0;
        int visited[]=new int[n];
        for(int i=0;i<n;i++){
           if(visited[i]==0){
            dfs(isConnected,i,n,visited);
            ans++;
           }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr={{1,0,1},{0,1,0},{1,0,1}};
        int ans=findCircleNum(arr);
        System.out.println(ans);
    }
    
}
