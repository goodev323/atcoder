package dev.goo.abc059.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        long firstNegative = countMinOperation(a, -1);
        long firstPositive = countMinOperation(a, 1);
        System.out.println(Math.min(firstNegative, firstPositive));
    }

    public static long countMinOperation(int[] a, int sign) {
        long operationCount = 0;
        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if(sum * sign <= 0) {
                operationCount += Math.abs(sum) + 1;
                sum = sign;
            }
            sign *= - 1;
        }
        return operationCount;
    }
}
