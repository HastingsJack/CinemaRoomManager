import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int sum = 0;
        for(Integer ar : arr) {
            if(ar > n) {
                sum += ar;
            }
        }
        System.out.println(sum);

    }
}