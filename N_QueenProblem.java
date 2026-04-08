import java.util.*;
// import java.lang.*;
// import java.io.*;

public class N_QueenProblem 
{
    static boolean isSafe(int i,int j,String board[][]){
        for(int k=0;k<i;k++){
            if(board[k][j].equals("Q")) return false;
        }
        
        int x=i-1;int y=j+1;
        while(x>=0 && y<board.length){
            if(board[x][y].equals("Q")) return false;
            
            x--;
            y++;
        }
        
        x=i-1;y=j-1;
        while(x>=0 && y>=0){
            if(board[x][y].equals("Q")) return false;
            
            x--;
            y--;
        }
        
        return true;
    }
    
    static boolean solve(int i,int n,String board[][]){
        if(i==n) return true;
        
        for(int j=0;j<n;j++){
            if(isSafe(i,j,board)){
                board[i][j]="Q";
                
                if(solve(i+1,n,board)) return true;
                else board[i][j]=".";
            }
        }
        
        return false;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        String board[][]=new String[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]=".";
            }
        }
        
        solve(0,n,board);
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println("");
        }
	}
}

