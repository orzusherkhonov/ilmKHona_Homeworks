import java.util.Scanner;

public class Nomer_3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a, b;
        a = num.nextInt();
        b = num.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++)
            sum = i + sum;
            System.out.println(sum);
    }
}