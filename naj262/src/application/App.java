package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {

                String[] fragment = line.split(",");
                list.add(new Employee(fragment[0], fragment[1], Double.parseDouble(fragment[2])));
                line = br.readLine();

            }

            System.out.println();
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            List<String> emails = list.stream()
                    .filter(p -> p.getSalary() > salary)
                    .map(p -> p.getEmail())
                    .collect(Collectors.toList());

            System.out.println();
            System.out.println("Email of people whose salary is more than: " + String.format("%.2f%n", salary));
            emails.forEach(System.out::println);

            double sum = list.stream()
                    .filter(p -> p.getName().charAt(0) == 'M')
                    .map(p -> p.getSalary())
                    .reduce(0.0, (x, y) -> x + y);

            System.out.println();
            System.out
                    .println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f%n", sum));

        } catch (IOException e) {
            System.out.println("Error reading: " + e.getMessage());
        }

        sc.close();
    }
}
