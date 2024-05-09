import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codPeca, codPeca2, numeroPecas, numeroPecas2;
        double valorUnidPeca, valorUnidPeca2, valorTotal;

        codPeca = sc.nextInt();
        numeroPecas = sc.nextInt();
        valorUnidPeca = sc.nextDouble();

        codPeca2 = sc.nextInt();
        numeroPecas2 = sc.nextInt();
        valorUnidPeca2 = sc.nextDouble();

        valorTotal = (numeroPecas * valorUnidPeca) + (numeroPecas2 * valorUnidPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);

        sc.close();
    }

}
