import java.util.Scanner;

public class array_2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * i;
            System.out.print(arr[i] + " ");
        }
    }
}