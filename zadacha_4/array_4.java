import java.util.Scanner;

public class array_4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int[] arr = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = num.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int b = arr[i] % 2;
            if (b == 0) count ++;
        }
        System.out.println(count);
    }
}

