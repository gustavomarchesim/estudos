package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        Map<String, Integer> cookies = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");

                String name = fields[0];
                Integer number = Integer.parseInt(fields[1]);

                if (cookies.containsKey(name)) {
                    int votesSoFar = cookies.get(name);
                    cookies.put(name, number + votesSoFar);
                } else {
                    cookies.put(name, number);
                }

                line = br.readLine();

            }

            for (String key : cookies.keySet()) {
                System.out.println(key + ": " + cookies.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}