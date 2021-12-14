package dev.goo.abc060.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int T = scanner.nextInt();
        int prevStart = scanner.nextInt();
        int prevStop = prevStart + T;
        long total = 0;
        for(int i = 0; i < N - 1; i++) {
            int t = scanner.nextInt();
            if(prevStop < t) {
                total += prevStop - prevStart;
                prevStart = t;
            }
            prevStop = t + T;
        }
        total += prevStop - prevStart;
        System.out.println(total);
    }
}
