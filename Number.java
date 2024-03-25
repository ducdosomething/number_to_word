import java.util.Scanner;

public class Number {
    private static final String[] ones = {
            "", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen"
    };
    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty",
            "sixty", "seventy", "eighty", "ninety"
    };

    public static String convert(int number) {
        if (number == 0) {
            return "zero";
        }

        if (number < 0) {
            return "minus " + convert(-number);
        }

        if (number < 20) {
            return ones[number];
        }

        if (number < 100) {
            return tens[number / 10] + ((number % 10 != 0) ? " " : "") + ones[number % 10];
        }

        if (number < 1000) {
            return ones[number / 100] + " hundred" + ((number % 100 != 0) ? " and " : "") + convert(number % 100);
        }

        return "number out of range";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (0 to 999): ");
        int number = scanner.nextInt();
        scanner.close();

        String words = convert(number);
        System.out.println("In words: " + words);
    }
}
