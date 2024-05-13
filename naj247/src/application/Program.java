package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.User;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<User> set = new HashSet<>();

        System.out.print("How many students for course A? ");
        int A = sc.nextInt();

        for (int i = 0; i < A; i++) {
            int studentA = sc.nextInt();
            set.add(new User(studentA));
        }

        System.out.print("How many students for course B? ");
        int B = sc.nextInt();

        for (int i = 0; i < B; i++) {
            int studentB = sc.nextInt();
            set.add(new User(studentB));
        }

        System.out.print("How many students for course C? ");
        int C = sc.nextInt();

        for (int i = 0; i < C; i++) {
            int studentC = sc.nextInt();
            set.add(new User(studentC));
        }

        System.out.println("Total students: " + set.size());

        sc.close();
    }

}
