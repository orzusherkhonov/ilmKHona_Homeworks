import java.util.Scanner;

public class Nomer_2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double a;
        a = num.nextDouble();
        for (int i = 1; i <= 10; i++)
            System.out.println(i * a);
    }
}