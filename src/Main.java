import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r, sub;
        double komb, fac1 = 1, fac2 = 1, fac3 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kombinasyonun birinci değerini giriniz: ");
        n = scanner.nextInt();
        System.out.print("Kombinasyonun ikinci değerini giriniz: ");
        r = scanner.nextInt();

        for (int i = 1; i <= n; i ++){
            fac1 = fac1 * i;
        }

        for (int j = 1; j <= r; j ++){
            fac2 = fac2 * j;
        }

        sub = ( n - r);
        for (int k = 1; k <= sub; k ++){
            fac3 = fac3 * k;
        }

        komb = fac1 / (fac2 * fac3);

        System.out.println("Faktöriyel değeri:" + komb);
    }
}