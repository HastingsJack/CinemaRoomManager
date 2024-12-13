import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int elements = sc.nextInt();
        int[] array = new int[elements];
        for (int i = 0; i < elements; i++) {
            array[i] = sc.nextInt();
        }
        int max = 0;
        int index = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i]  > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}