import java.util.Scanner;

public class Nomer_1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a;
        a = num.nextInt();
        if (a > 0) {
            System.out.println(a + 1);
        }
        else
        {
            System.out.println(a - 2);
        }
    }
}