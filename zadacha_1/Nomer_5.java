import java.util.Scanner;

public class Nomer_5 {
    public static void main(String [] args) {
        Scanner num = new Scanner(System.in);
        double a,b,c;
        a = num.nextDouble();
        b = num.nextDouble();
        c = (a + b ) / 2;
        System.out.println("Среднее арифметическое a и b : " + c);
    }
}
