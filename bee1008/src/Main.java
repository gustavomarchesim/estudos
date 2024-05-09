import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero, horasTrabalhadas;
        double valorPorHorasTrabalhadas, salario;

        numero = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        valorPorHorasTrabalhadas = sc.nextDouble();

        salario = valorPorHorasTrabalhadas * horasTrabalhadas;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();
    }
}
