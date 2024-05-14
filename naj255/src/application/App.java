package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 90.50));

       // Predicate<Product> pred = p -> p.getPrice() >= 100.0;

        list.removeIf(p -> p.getPrice() >= 100.0); // Versão 6 Final

        for (Product product : list) {
            System.out.println(product);
        }

    }
}
