import java.util.Scanner;

public class Nomer_4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double R;
        double Pi = 3.14;
        R = num.nextDouble();
        System.out.println("L = " + 2 * Pi * (R * R));
        System.out.println("S = " + Pi * R * R);
    }
}