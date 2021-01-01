import java.util.Scanner;

public class Nomer_7 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Double A, B, C, D;
        A = num.nextDouble();
        B = num.nextDouble();
        C = num.nextDouble();
        D = B;
        B = A;
        A = C;
        C = D;
        System.out.println("A = " + A + " B = " + B + " C = " + C);
    }
}
