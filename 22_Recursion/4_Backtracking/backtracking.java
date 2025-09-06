
public class backtracking {
    public static void main(String[] args) {
        boolean[][] maze={
            {true,true,true},
            {true,true,true},
            {true,true,true},
        };
        allPaths("", maze, 0, 0);
    }


    static void allPaths(String str,boolean maze[][],int row,int col){
        if(row==maze.length-1 && col==maze[0].length-1){
            System.out.println(str);
            return;
        }

        if(!maze[row][col]){
            return;
        }

        maze[row][col]=false;

        if(row<maze.length-1){
            allPaths(str+'D', maze, row+1, col);
        }
        if(col<maze[0].length-1){
            allPaths(str+'R', maze, row, col+1);
        }
        if(row>0){
            allPaths(str+'U', maze, row-1, col);
        }
        if(col>0){
            allPaths(str+'L', maze, row, col-1);
        }

        maze[row][col]=true;
    }
}
