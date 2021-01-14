import java.util.Scanner;

public class array_9 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int[] arr = new int[n];
        int summ = 0;

        for (int i = 0; i < n; i ++)
            arr[i] = num.nextInt();

        //Если взять что индекс "0" это четное число

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                summ += arr[i];
        }
        System.out.println(summ);
    }
}