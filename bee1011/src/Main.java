import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        int raio = sc.nextInt();

        double VOLUME = (4 / 3.0) * pi * raio * raio * raio;

        System.out.printf("VOLUME = %.3f%n", VOLUME);

        sc.close();
    }
}
