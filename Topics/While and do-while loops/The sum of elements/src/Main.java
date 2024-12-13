import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number = -1;
        int sum = 0;
        while(number != 0) {
            number = scanner.nextInt();
            sum += number;
        }
        System.out.println(sum);
    }
}
