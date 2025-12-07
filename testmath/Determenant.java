package testmath;

public class Determenant {
        public static void findDet(String[] args) {
        int[][] matrix = new int[][]{
            {1,3,4},
            {5,6,1},
            {3,14,3}
        };
        int plus = matrix[0][0] * matrix[1][1] * matrix[2][2] + 
                   matrix[0][1] * matrix[1][2] * matrix[2][0] +
                   matrix[0][2] * matrix[1][0] * matrix[2][1];
        int minus = matrix[0][2] * matrix[1][1] * matrix[2][0] + 
                    matrix[0][0] * matrix[1][2] * matrix[2][1] +
                    matrix[0][1] * matrix[1][0] * matrix[2][2];
        int det = plus - minus;
        System.out.println("Determinant equals: " + det);
    }
}
