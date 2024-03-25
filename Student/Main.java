package Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student("John", "CO2");
        System.out.println(student);
        student.setName("James");
        student.setClasses("BO3");
        System.out.println(student);
    }
}
