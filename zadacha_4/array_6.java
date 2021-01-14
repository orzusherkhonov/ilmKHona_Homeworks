import java.util.Scanner;

public class array_6 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        double proz = 1;

        for (int i = 0; i < n; i++) {
            arr[i] = num.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            proz = proz * arr[i];
        }
        System.out.println(sum + "\n" + proz);
    }
}


