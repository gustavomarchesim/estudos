package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;

public class App {

    /**
     * ? map aplica a função presente a cada elemento da lista, que depois é
     * ? convertida para uma lista novamente usando
     * ? collect(Collectors.toList())
     * 
     */

    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Function<Product, String> func = p -> p.getName().toUpperCase();

        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
