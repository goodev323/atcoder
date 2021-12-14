package dev.goo.abc058.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] result = new int[26];
        for(int i = 0; i < n; i++) {
            String s = scanner.next();
            if(i == 0) {
                for(char c: s.toCharArray()) {
                    result[(int)c - 97]++;
                }
            } else {
                int[] current = new int[26];
                for(int j = 0; j < s.length(); j++) {
                    char c = s.charAt(j);
                    current[(int)c - 97]++;
                }
                for(int j = 0; j < 26; j++) {
                    result[j] = Math.min(result[j], current[j]);
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            int index = result[i];
            while(index > 0) {
                System.out.print((char) (i + 97));
                index--;
            }
        }
    }
}
