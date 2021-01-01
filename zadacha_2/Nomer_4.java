import java.util.Scanner;

public class Nomer_4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double a, b;
        a = num.nextDouble();
        b = num.nextDouble();
        if (a > b) System.out.println(a + " " + b);
        else System.out.println(b + " " + a);
    }
}