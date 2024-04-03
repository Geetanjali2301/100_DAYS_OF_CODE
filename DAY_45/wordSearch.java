package DAY_45;
/*
# Leetcode 79
*/

public class wordSearch {

    public static boolean dfs(char[][] board,String word,int i,int j,int count)
    {
        if(count==word.length())
        {
            return true;
        }
        if(i==-1 || j==-1 || i==board.length || j==board[0].length || board[i][j]!=word.charAt(count))
        {
            return false;
        }
        char temp=board[i][j];
        board[i][j]='*';
        boolean found=dfs(board,word,i+1,j,count+1) || dfs(board,word,i-1,j,count+1) || dfs(board,word,i,j+1,count+1) || dfs(board,word,i,j-1,count+1) ;
        //backtrack step
        board[i][j]=temp;

        return found;

    }

    public static boolean exist(char[][] board, String word) {

        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0) && dfs(board,word,i,j,0))
                {
                    return true;
                }
            }
        }
        return false;
        
    }

    public static void main(String[] args) {
        char board[][]={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word="ABCCED";
        Boolean ans=exist(board, word);
        System.out.println(ans);
    }
    
}
