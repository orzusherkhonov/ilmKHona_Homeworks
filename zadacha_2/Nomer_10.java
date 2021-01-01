import java.util.Scanner;

public class Nomer_10 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a, b, c;
        System.out.print("a = ");
        a = num.nextInt();
        System.out.print("b = ");
        b = num.nextInt();
        System.out.print("Способ номер 1 или способ номер 2? : ");
        int s = num.nextInt();
        switch (s) {
            case 1:
                //`````````````````````````````````````````````\\
            if (a == b) {
                a = 0;
                b = 0;
                System.out.println(a + "  " + b);
            } else {
                c = a + b;
                a = c;
                b = c;
                System.out.println(a + "  " + b);
                //`````````````````````````````````````````````\\
            }
            break;
            case 2:
                //`````````````````````````````````````````````\\
              int c;
              if (a == b) c = 0;
              else c = a + b;
              a = c;
              b = c;
              System.out.println(a + "  " + b);
                //`````````````````````````````````````````````\\
            break;
            default: break;
        }
    }
}