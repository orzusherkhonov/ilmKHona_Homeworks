import java.util.Scanner;

public class Nomer_1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a, b, i;
        int count = 0;
        a = num.nextInt();
        b = num.nextInt();
        for (i = b - 1; i > a; i--, count++)
        System.out.print(i + " ");
        System.out.println("\n" + count);
    }
}