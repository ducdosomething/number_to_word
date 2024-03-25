public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int sum = sumOfMainDiagonal(matrix);
        System.out.println("Sum of main diagonal: " + sum);
    }

    public static int sumOfMainDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i]; // Cộng các phần tử ở vị trí (i, i) trên đường chéo chính
        }
        return sum;
    }
}
