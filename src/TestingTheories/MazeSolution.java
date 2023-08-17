package TestingTheories;

public class MazeSolution {
    public static void main(String[] args) {
       int[][] maze = {{1, 1, 1, 1, 1, 0, 1, 0},
                {0, 0, 0, 1, 1, 0, 1, 0},
                {0, 1, 0, 1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 0, 1},
                {0, 1, 1, 0, 1, 1, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 1, 1, 1, 0},
                {1, 1, 1, 0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 1, 1, 1}
        };

        int[][] solution = new int[maze.length][maze[0].length];

        int startRow = 8;
        int startCol = 0;

        int endRow = 0;
        int endCol = 5;

        solveMaze(maze, startRow, startCol, endRow, endCol, solution);
        printSolution(solution);
    }

    private static void printSolution(int[][] solution) {
        if (solution != null) {
            for (int i = 0; i < solution.length; i++) {
                for (int j = 0; j < solution[0].length; j++) {
                    if (solution[i][j] == 1) {
                        System.out.print(solution[i][j]);
                    }
                    System.out.print("\t");
                }
                System.out.print("\n\n");
            }
        } else {
            System.out.println("no solution");
        }
    }

    private static int[][] solveMaze(int[][] maze, int r, int c, int x, int y, int[][] solution) {
        //if destination is reached, maze is solved
        //destination is the last cell(maze[SIZE-1][SIZE-1])
        if ((r == x) && (c == y)) {
            solution[r][c] = 1;
            return solution;
        }
        //checking if we can visit in this cell or not
        //the indices of the cell must be in (0,SIZE-1)
        //and solution[r][c] == 0 is making sure that the cell is not already visited
        //maze[r][c] == 0 is making sure that the cell is not blocked
        if (r >= 0 && c >= 0 && r < maze.length && c < maze[0].length && solution[r][c] == 0 && maze[r][c] == 0) {
            //if safe to visit then visit the cell
            solution[r][c] = 1;
            //going down
            if (solveMaze(maze, r + 1, c, x, y, solution) != null) return solution;

            //going right
            if (solveMaze(maze, r, c + 1, x, y, solution) != null) return solution;

            //going up
            if (solveMaze(maze, r - 1, c, x, y, solution) != null) return solution;

            //going left
            if (solveMaze(maze, r, c - 1, x, y, solution) != null) return solution;

            //backtracking
            solution[r][c] = 0;
            return null;
        }
        return null;
    }
}