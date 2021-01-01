import java.util.Scanner;

public class Nomer_2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a, b, c, count = 0;
        a = num.nextInt();
        b = num.nextInt();
        c = num.nextInt();
        if (a > 0)  count++;
        if (b > 0)  count++;
        if (c > 0)  count++;
        System.out.println(count);
    }
}
