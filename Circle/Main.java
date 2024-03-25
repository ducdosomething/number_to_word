package Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        scanner.close(); // Đóng Scanner sau khi đã nhập xong để tránh lãng phí tài nguyên

        Circle circle = new Circle(radius, "red"); // Tạo đối tượng Circle với bán kính đã nhập và màu sắc mặc định là
                                                   // "red"
        System.out.println("Area of the circle: " + circle.getArea());
    }
}
