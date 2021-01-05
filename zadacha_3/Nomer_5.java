import java.util.Scanner;

public class Nomer_5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double a, count, sum = 0, i;
        a = num.nextDouble();
        for (i = 1; i <= a; i++)
        {
            count = 1 / i;
            sum = sum + count;
        }
        System.out.println(sum);
    }
}