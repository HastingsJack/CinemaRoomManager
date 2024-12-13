import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String room = scanner.nextLine();
        switch(room) {
            case "triangle" -> System.out.println(triangle(scanner));
            case "rectangle" -> System.out.println(rectangle(scanner));
            case "circle" -> System.out.println(circle(scanner));
        }
    }

    public static double rectangle(Scanner scanner) {
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        return a * b;
    }

    public static double circle(Scanner scanner) {
        double r = scanner.nextDouble();
        return 3.14 * r * r;
    }

    public static double triangle(Scanner scanner) {
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}