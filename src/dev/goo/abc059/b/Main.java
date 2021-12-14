package dev.goo.abc059.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();

        if(A.equals(B)) {
            System.out.println("EQUAL");
        } else if (A.length() != B.length()) {
            System.out.println(A.length() > B.length() ? "GREATER" : "LESS");
        } else {
            for (int i = 0; i < A.length(); i++) {
                if(A.charAt(i) != B.charAt(i)) {
                    System.out.println(A.charAt(i) > B.charAt(i) ? "GREATER" : "LESS");
                    break;
                }
            }
        }
    }
}
