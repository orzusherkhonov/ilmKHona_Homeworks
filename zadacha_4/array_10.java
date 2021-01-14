import java.util.Scanner;

public class array_10 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                int[] arr = new int[n];
                int max = arr[0];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println(max);
        }
}