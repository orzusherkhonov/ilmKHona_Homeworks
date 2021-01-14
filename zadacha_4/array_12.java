import java.util.Scanner;

public class array_12 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = num.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = num.nextInt();
        }
        for (int i = 0; i < n;  i++)
        {
            arr3[i] = arr[i];
            arr[i]  = arr2[i];
            arr2[i] = arr3[i];
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        for (int i = 0; i < n; i++)
            System.out.print(arr2[i] + " ");
    }
}