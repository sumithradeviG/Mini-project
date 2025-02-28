package MazeGame;

import java.util.Scanner;

class stepCalculation{
    int [][] mazeBoard;
    boolean [][] visited;
    
    stepCalculation(int [][] mazeBoard){
        this.mazeBoard = mazeBoard;
        this.visited = initVisitedNodes();
    }

    public boolean[][] initVisitedNodes(){
        visited = new boolean[mazeBoard.length][mazeBoard[0].length];
        for(int i=0; i<mazeBoard.length; i++){
            for(int j=0; j<mazeBoard[i].length; j++){
                visited[i][j] = false;
            }
        }
        return visited;
    }


    public int solve(int[] start,int steps)
    {
        
        if(start[0] < 0 || start[0] >= mazeBoard.length || start[1] < 0 || start[1] >= mazeBoard[0].length)
        {
            return mazeBoard.length*mazeBoard[0].length+1;
        }

        if(mazeBoard[start[0]][start[1]] == 2)
        {
            return steps;
        }

        if(visited[start[0]][start[1]])
        {
            return mazeBoard.length*mazeBoard[0].length+1;
        }

        // setVisited(start, true);
        visited[start[0]][start[1]] = true;

        int path1Steps = solve(new int[]{start[0]-1, start[1]}, steps+1);

        int path2Steps = solve(new int[]{start[0]+1, start[1]}, steps+1);

        int path3Steps = solve(new int[]{start[0], start[1]-1}, steps+1);

        int path4Steps = solve(new int[]{start[0], start[1]+1}, steps+1);

        visited[start[0]][start[1]] = false;

        int result = path1Steps < path2Steps ? path1Steps : path2Steps;
        result = result < path3Steps ? result : path3Steps; 
        result = result < path4Steps ? result : path4Steps;

        return result;
    }

    public void setVisited(int[] box, boolean value)
    {
        if(box[0] < 0 || box[0] >= visited.length || box[1] < 0 || box[1] >= visited[0].length)
        {
            return;
        }
        visited[box[0]][box[1]] = value;
    }

}

public class Maze {
    public static void main(String[] args) {
        int [][] mazeBoard = {
            {0,0,0,0},
            {0,0,0,2},
            {0,0,0,0},
            {0,0,0,0}
        };
        int startPos[] = new int[2];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter starting position (row): ");
        startPos[0] = scanner.nextInt();
        System.out.println("Enter start position (column): ");
        startPos[1] = scanner.nextInt();
        
        stepCalculation sc = new stepCalculation(mazeBoard);
        int result = sc.solve(startPos, 0);
        System.out.println("Steps: "+result);
    }
    
}
