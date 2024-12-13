import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int busHeight = scanner.nextInt();
        int passengers = scanner.nextInt();
        int i = 1;
        boolean notCrashed = false;
        while(i <= passengers) {
            int height = scanner.nextInt();
            if(busHeight >= height) {
                System.out.println("Will crash on bridge " + i);
                notCrashed = true;
                break;
            }
            i++;
        }
        if(!notCrashed) {
            System.out.println("Will not crash");
        }
    }
}