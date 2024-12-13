import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentState = scanner.nextInt();
        scanner.close();

        String nextState = getNextState(currentState);
        String action = getAction(currentState);

        System.out.println(nextState);
        System.out.println(action);
    }

    public static String getNextState(int currentState) {
        switch (currentState) {
            case 0 -> {
                return "1";
            }
            case 1 -> {
                return "2";
            }
            case 2 -> {
                return "0";
            }
        }
        return null;
    }

    public static String getAction(int currentState) {
        switch (currentState) {
            case 0 -> {
                return "Change to Yellow";
            }
            case 1 -> {
                return "Change to Green";
            }
            case 2 -> {
                return "Change to Red";
            }
        }
        return null;
    }
}