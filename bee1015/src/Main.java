import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x1, y1, x2, y2, distancia;

        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        double A = x2 - x1;
        double B = y2 - y1;

        distancia = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));

        System.out.printf("%.4f%n", distancia);

        sc.close();
    }

}
