import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };

        System.out.println("Original array: " + Arrays.toString(array));

        // Đảo ngược mảng
        reverse(array);

        System.out.println("Reversed array: " + Arrays.toString(array));
    }

    public static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            // Hoán đổi phần tử ở vị trí start và end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            // Di chuyển start về phía sau và end về phía trước
            start++;
            end--;
        }
    }
}
