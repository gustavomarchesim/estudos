package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter file path: ");
        String path = "/home/gdam/tmp/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Set<LogEntry> set = new HashSet<>(); // O mais rápido de todos. Conta a quantidade sem se importar com a
                                                 // ordem.
            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(" ");

                if (fields.length >= 2) {
                    String username = fields[0];
                    Instant moment = Instant.parse(fields[1]);

                    set.add(new LogEntry(username, moment));
                } else {
                    System.out.println("Invalid log entry: " + line);
                }
                line = br.readLine();
            }
            System.out.println("Total users: " + set.size());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
