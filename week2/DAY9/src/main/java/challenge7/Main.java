package challenge7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = new int[2][2];
        int[][] matrixInverse = new int[2][2];
        int s=0, k  = 0;
        matrix[0][0] = 5;
        matrix[0][1] = 2;
        matrix[1][0] = 4;
        matrix[1][1] = 6;

        System.out.println("matrix = " + "{ [" + matrix[0][0] + " , " + matrix[0][1] + "]" + "  ,  " + "[" + matrix[1][0] + " , " + matrix[1][1] + "] }");

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                s += matrix[i][j];

        System.out.println("sum of all elements in the matrix = " +s);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixInverse[j][k] = matrix[i][j];

            }
            k++;
        }

        System.out.println("matrix Inverse = " + "{ [" + matrixInverse[0][0] + " , " + matrixInverse[0][1] + "]" + "  ,  " + "[" + matrixInverse[1][0] + " , " + matrixInverse[1][1] + "] }");

    }
}
