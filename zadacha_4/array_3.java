import java.util.Scanner;

public class array_3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("x = ");
        int x = num.nextInt();
        int n = num.nextInt();
        int[] arr = new int[n];
        int b = -1;
        for (int i = 0; i < n; i++) {
            arr[i] = num.nextInt();
        }
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == x) { b = i; }
        if (b == -1) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
}