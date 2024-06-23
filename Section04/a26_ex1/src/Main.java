import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // ex1
        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);

        // ex2
        int x2;
        x2 = sc.nextInt();
        System.out.println("Você digitou: " + x2);

        // ex3
        double x3;
        x3 = sc.nextDouble();
        System.out.println("Você digitou: " + x3);

        // ex4
        char x4;
        x4 = sc.next().charAt(0);
        System.out.println("Você digitou: " + x4);

        // ex5
        String x5;
        int y;
        double z;
        x5 = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Você digitou: ");
        System.out.println(x5);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}
