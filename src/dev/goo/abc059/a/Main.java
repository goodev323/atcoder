package dev.goo.abc059.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        String s3 = scanner.next();
        System.out.print(topAsUpperCase(s1));
        System.out.print(topAsUpperCase(s2));
        System.out.println(topAsUpperCase(s3));
    }
    private static char topAsUpperCase(String s) {
        char c = s.charAt(0);
        return (char) (c - 32);
    }
}
