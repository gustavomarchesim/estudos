import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B, C, MAIOR;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        MAIOR = (A + B + Math.abs(A - B)) / 2;

        if (MAIOR < C) {
            MAIOR = C;
        }

        System.out.println(MAIOR + " eh o maior");

        sc.close();
    }
}
