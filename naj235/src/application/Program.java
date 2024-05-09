package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int months;
        double amount, payment;

        System.out.print("Amount: ");
        amount = sc.nextInt();
        System.out.print("Months: ");
        months = sc.nextInt();

        BrazilInterestService is = new BrazilInterestService(2.0);
        payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.printf("%.2f%n", payment);

        sc.close();
    }
}
