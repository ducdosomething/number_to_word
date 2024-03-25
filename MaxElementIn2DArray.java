public class MaxElementIn2DArray {
    public static void main(String[] args) {
        int[][] array = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int maxElement = findMaxElement(array);
        System.out.println("Max element in the 2D array: " + maxElement);
    }

    public static int findMaxElement(int[][] array) {
        int maxElement = Integer.MIN_VALUE; // Khởi tạo giá trị maxElement là giá trị nhỏ nhất của kiểu int
        for (int[] row : array) {
            for (int element : row) {
                if (element > maxElement) {
                    maxElement = element;
                }
            }
        }
        return maxElement;
    }
}
