import java.util.ArrayList;

public class maze {
    public static void main(final String[] args) {
        System.out.println(pathDiagonal(" ", 3, 3));
    }

    static int count(final int row, final int col) {
        if (row == 1 || col == 1) {
            return 1;
        }
        final int left = count(row - 1, col);
        final int right = count(row, col - 1);
        return left + right;
    }

    static void path(final String p, final int row, final int col) {
        if (row == 1 && col == 1) {
            System.out.println(p);
            return;
        }

        if (row > 1) {
            path(p + "D", row - 1, col);
        }
        if (col > 1) {
            path(p + "R", row, col - 1);
        }
    }

    static ArrayList<String> pathRet(final String p, final int row, final int col) {
        if (row == 1 && col == 1) {
            final ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        final ArrayList<String> list = new ArrayList<>();
        if (row > 1) {
            list.addAll(pathRet(p + "D", row - 1, col));
        }
        if (col > 1) {
            list.addAll(pathRet(p + "R", row, col - 1));
        }
        return list;
    }

    static ArrayList<String> pathDiagonal(final String p, final int row, final int col) {
        if (row == 1 && col == 1) {
            final ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        final ArrayList<String> list = new ArrayList<>();
        if (row > 1) {
            list.addAll(pathRet(p + "V", row - 1, col));
        }
        if (col > 1) {
            list.addAll(pathRet(p + "H", row, col - 1));
        }
        if (row > 1 && col > 1) {
            list.addAll(pathRet(p + "D", row - 1, col - 1));
        }
        return list;
    }

    static void pathWithObsticles(final String p, final boolean[][] maze, final int row, final int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (maze[row][col] == false) {
            return;
        }

        if (row > 1) {
            pathWithObsticles(p + "D", maze, row - 1, col);
        }
        if (col > 1) {
            pathWithObsticles( p + "R", maze, row, col - 1);
        }
    }
}
