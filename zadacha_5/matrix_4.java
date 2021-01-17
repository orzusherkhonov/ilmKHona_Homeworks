import java.util.Scanner;

public class matrix_4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int m, n;
        m = num.nextInt();
        n = num.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = num.nextInt();
            }
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++) {
               if (arr[i][j] == 7) count++;
            }
        }
        System.out.println(count);
    }
}