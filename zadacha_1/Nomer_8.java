import java.util.Scanner;

public class Nomer_8 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double a, b, y, x;
        x = num.nextDouble();
        a = 3 * Math.pow(x, 6);
        b = 6 * Math.pow(x, 2);
        System.out.println("y = " + (a - b - 7));
    }
}
