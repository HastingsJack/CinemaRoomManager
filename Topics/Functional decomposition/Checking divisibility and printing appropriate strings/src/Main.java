import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        // function calls of isDivByThree, isDivByFive, isDivByThreeAndFive will be here
        String output="None";
        if (isDivByThreeAndFive(num)){
            output = "FizzBuzz";
        } else
        if(isDivByThree(num)){
            output = "Fizz";
        } else if(isDivByFive(num)){
            output = "Buzz";
        }

        System.out.println(output);
    }
    // function isDivByThree will be here
    public static boolean isDivByThree(int num) {
        return num % 3 == 0;
    }

    // function isDivByFive will be here
    public static boolean isDivByFive(int num) {
        return num % 5 == 0;
    }

    // function isDivByThreeAndFive will be here
    public static boolean isDivByThreeAndFive(int num) {
        return isDivByThree(num) && isDivByFive(num);
    }
}