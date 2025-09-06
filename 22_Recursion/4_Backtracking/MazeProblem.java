import java.util.ArrayList;
import java.util.HashSet;

public class MazeProblem {
    public static void main(String[] args) {
        System.out.println(count(3, 3));

        path("", 3, 3);


        System.out.println(pathWithList("", 3, 3));

        System.out.println(pathInclueDiognal("", 3, 3));

        System.out.println(pathInclueDio("", 3, 3));

        boolean[][] maze={
            {true,true,true},
            {true,false,true},
            {true,true,true},
        };
        pathwithObstcles("", maze, 0, 0);

    }   
    
    //provide the number of paths to reach the from index[0][0] to index last[r][c]
    static int count(int row,int col){
        if(row==1 || col==1){
            return 1;
        }

        int down=count(row-1,col);
        int right=count(row, col-1);

        return down+right;
    }

    //provide the number of paths and also print it ,to reach the from index[0][0] to index last[r][c]
    static void path(String str,int row,int col){
        if(row==1 && col==1){
            System.out.println(str);
            return;
        }

        if(row>1){
            path(str+'D', row-1, col);
        }
        if(col>1){
            path(str+"R", row, col-1);
        }
    }


    
    static ArrayList<String> pathWithList(String str,int row,int col){
        if(row==1 && col==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(str);
            return list;
        }

        ArrayList<String> list=new ArrayList<>();
        
        if(row>1){
            list.addAll(pathWithList(str+'D', row-1, col));
        }
        if(col>1){
            list.addAll(pathWithList(str+"R", row, col-1));
        }

        return list;
    }


    static ArrayList<String> pathInclueDiognal(String str,int row,int col){
        if(row==1 && col==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(str);
            return list;
        }

        ArrayList<String> list=new ArrayList<>();

        if(row>1 && col>1){
            list.addAll(pathInclueDiognal(str+'D', row-1, col-1));
        }
        
        if(row>1){
            list.addAll(pathInclueDiognal(str+'D', row-1, col));
        }
        if(col>1){
            list.addAll(pathInclueDiognal(str+"R", row, col-1));
        }

        return list;
    }


    static HashSet<String> pathInclueDio(String str,int row,int col){
        if(row==1 && col==1){
            HashSet<String> list=new HashSet<>();
            list.add(str);
            return list;
        }

        HashSet<String> list=new HashSet<>();

        if(row>1 && col>1){
            list.addAll(pathInclueDiognal(str+'D', row-1, col-1));
        }
        
        if(row>1){
            list.addAll(pathInclueDiognal(str+'D', row-1, col));
        }
        if(col>1){
            list.addAll(pathInclueDiognal(str+"R", row, col-1));
        }

        return list;
    }


    static void pathwithObstcles(String str,boolean[][] maze,int row,int col){
        if(row==maze.length-1 && col==maze[0].length-1){
            System.out.println(str);
            return;
        }

        if(!maze[row][col]){
            return;
        }

        if(row<maze.length-1){
            pathwithObstcles(str+'D',maze, row+1, col);
        }
        if(col<maze[0].length-1){
            pathwithObstcles(str+"R",maze, row, col+1);
        }
    }
}
