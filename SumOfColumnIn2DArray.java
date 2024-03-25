public class SumOfColumnIn2DArray {
    public static void main(String[] args) {
        int[][] array = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int columnToSum = 1; // Cột cần tính tổng (chỉ số cột đếm từ 0)

        int sum = sumOfColumn(array, columnToSum);
        System.out.println("Sum of column " + columnToSum + ": " + sum);
    }

    public static int sumOfColumn(int[][] array, int columnIndex) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (columnIndex >= 0 && columnIndex < array[i].length) { // Đảm bảo chỉ tính tổng cho các cột có tồn tại
                sum += array[i][columnIndex];
            } else {
                System.out.println("Invalid column index");
                return -1; // Trả về -1 nếu chỉ số cột không hợp lệ
            }
        }
        return sum;
    }
}
