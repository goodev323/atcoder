package dev.goo.abc058.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String O = scanner.next();
        String E = scanner.next();
        for(int i = 0; i < E.length(); i++) {
            System.out.print(O.charAt(i));
            System.out.print(E.charAt(i));
        }
        if(O.length() > E.length()) {
            System.out.println(O.charAt(O.length() - 1));
        }
    }
}
