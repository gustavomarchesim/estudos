package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class App {

    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();

            }

            double avg = list.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (x, y) -> x + y) / list.size();

            System.out.println("Average price: " + String.format("%.2f%n", avg));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
         
            /**
             * Este método filtra produtos com preço menor que a média,
             * mapeia seus nomes, os classifica em ordem alfabética reversa e os coleta em
             * uma lista.
             *
             * @return uma lista de nomes de produtos classificados em ordem alfabética
             *         reversa e com preço menor que a média.
             */
            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < avg) // filtra produtos com preço menor que a média
                    .map(p -> p.getName()) // pega o nome desses produtos filtrados
                    .sorted(comp.reversed()) // classifica nomes em ordem alfabética reversa
                    .collect(Collectors.toList()); // coleta nomes em uma lista

            names.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error reading: " + e.getMessage());
        }

        sc.close();
    }
}
