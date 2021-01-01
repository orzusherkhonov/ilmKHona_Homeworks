import java.util.Scanner;

public class Nomer_7 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Double a, b, c;
        a = num.nextDouble();
        b = num.nextDouble();
        c = num.nextDouble();
        if (a < b && a < c) System.out.println(b + c);
        else if (b < c && b < a) System.out.println(a + c);
        else System.out.println(a + b);
    }
}