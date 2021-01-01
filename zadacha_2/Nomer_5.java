import java.util.Scanner;

public class Nomer_5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double a, b, c;
        a = num.nextDouble();
        b = num.nextDouble();
        c = num.nextDouble();
        if (a < b && a < c) System.out.println(a);
        else if (b < c && b < a) System.out.println(b);
        else System.out.println(c);
    }
}