import java.util.Scanner;

public class Nomer_6 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a, b, c;
        System.out.print("Способ номер 1 или способ номер 2? : ");
        int s = num.nextInt();
        switch (s) {
            case 1:
                //`````````````````````````````````````````````\\
                a = num.nextInt();
                b = 0;
                c = 1;
                while (a > 0)
                {
                    b = b + (a % 10);
                    c = c * (a % 10);
                    a = a / 10;
                }
                System.out.println(b + "\n" + c);
                //`````````````````````````````````````````````\\
                break;
            case 2:
                //`````````````````````````````````````````````\\
                a = num.nextInt();
                int c1 = a;
                b = 0;
                while (a != 0)
                {
                    b = b + (a % 10);
                    a = a / 10;
                }
                System.out.println(b);
                c = 1;
                while (c1 != 0)
                {
                    c = c * (c1 % 10);
                    c1 = c1 / 10;
                }
                System.out.println(c);
                //`````````````````````````````````````````````\\
                break;
            default: break;
        }
    }
}