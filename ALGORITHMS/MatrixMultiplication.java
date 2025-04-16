
public class MatrixMultiplication {
    public static void main(String[] args) {
        int A[][] = { { 1, 4, 5 }, { 4, 8, 9 }, { 9, 0, 1 } };
        int B[][] = { { 4, 5, 8 }, { 7, 9, 6 }, { 3, 6, 9 } };
        MatrixMultiply(A, 3, 3, B, 3, 3);
    }

    //Printing Matrix
    private static void printMatrix(int A[][], int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Multipying Two Matrices
    private static void MatrixMultiply(int[][] A, int row1, int col1, int[][] B, int row2, int col2) {
        int i, j, k;
        System.out.println("Matrix A: ");
        printMatrix(A, row1, col1);
        System.out.println("Matrix B: ");
        printMatrix(B, row2, col2);

        if(row2 != col1){
            System.out.println("\n Multiplication not possible!");
            return;
        }

        int C[][] = new int[row1][col2];
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col2; j++) {
                for(k = 0; k < row2; k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
            }   
        }
        System.out.println("Resultant Matrix: ");
        printMatrix(C, row1, col2);
    }


}
