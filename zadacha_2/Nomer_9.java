import java.util.Scanner;

public class Nomer_9 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double x;
        x = num.nextDouble();
        if (x > 0) System.out.println(2 * Math.sin(x));
        else System.out.println((6 - x));
    }
}