import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer from the user
        int dayNumber = scanner.nextInt();

        // Use a switch statement to determine the day of the week
        switch (dayNumber) {
            // Add cases for each day of the week (1-7)
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid input");

            // Add a default case for invalid input

        }

        scanner.close();
    }
}