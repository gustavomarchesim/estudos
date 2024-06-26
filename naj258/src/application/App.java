package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import model.services.ProductService;

public class App {

    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getPrice() < 100.00);

        System.out.println("Total sum: " + String.format("%.2f", sum));
    }
}
