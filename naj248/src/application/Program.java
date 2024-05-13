package application;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@email.com");
        cookies.put("phone", "123456789");

        // cookies.remove("email");

        cookies.put("phone", "82828282");

        System.out.println();
        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());
        System.out.println();

        System.out.println("ALL COOKIES");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }

        sc.close();

    }
}
