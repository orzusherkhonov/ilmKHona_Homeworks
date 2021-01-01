import java.util.Scanner;

public class Nomer_3 {
    public static void main(String[] args) {
        Scanner num_1 = new Scanner(System.in);
        int a, b, c;
        a = num_1.nextInt();
        b = num_1.nextInt();
        c = num_1.nextInt();
        System.out.println("V = " + a * b * c);
        System.out.println("S = " + 2 * (a * b + b * c + a * c));
    }
}
