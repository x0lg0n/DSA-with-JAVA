import java.util.Arrays;

public class AllPath {
    public static void main(String[] args) {    
        boolean[][] borad = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };

        int[][] path = new int[borad.length][borad[0].length];

        allPathPrint("", borad, 0, 0, path, 1);
    }

    public static void allPath(String p, boolean[][] maze, int row, int col) {
        
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        maze[row][col] = false;

        if (row < maze.length - 1 ) {
            allPath(p + "D", maze, row + 1, col);
        }

        if (col < maze[0].length - 1) {
            allPath(p + "R", maze, row, col + 1);
        }

        if (row > 0) {
            allPath(p + "U", maze, row - 1, col);
        }
        if (col > 0) {
            allPath(p + "L", maze, row, col - 1);
        }

        maze[row][col] = true;
    }

    public static void allPathPrint(String p, boolean[][] maze, int row, int col, int[][] path, int step) {
        
        // base case: reached destination
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] = step;
            for (int[] is : path) {
                System.out.println(Arrays.toString(is));
            }
            System.out.println("Path: " + p);
            System.out.println();
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        maze[row][col] = false;
        path[row][col] = step;

        if (row < maze.length - 1) {
            allPathPrint(p + "D", maze, row + 1, col, path, step + 1);
        }

        if (col < maze[0].length - 1) {
            allPathPrint(p + "R", maze, row, col + 1, path, step + 1);
        }

        if (row > 0) {
            allPathPrint(p + "U", maze, row - 1, col, path, step + 1);
        }
        if (col > 0) {
            allPathPrint(p + "L", maze, row, col - 1, path, step + 1);
        }

        maze[row][col] = true;
        path[row][col] = 0;
    }
}
