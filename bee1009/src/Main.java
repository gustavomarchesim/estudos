import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nomeFuncionario;
        double salarioFixo, valorTotalDeVendas, porcentagem, valorTotal;

        nomeFuncionario = sc.next();
        salarioFixo = sc.nextDouble();
        valorTotalDeVendas = sc.nextDouble();

        porcentagem = valorTotalDeVendas * 0.15;

        valorTotal = salarioFixo + porcentagem;

        System.out.printf("TOTAL = R$ %.2f%n", valorTotal);

        sc.close();
    }

}
