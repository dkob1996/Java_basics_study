package Sem2_cw.task1;

import java.util.Scanner;

/**
 * Дано четное число N (>0) и символы c1 и c2.
 * Написать метод, который вернет строку длины N, которая состоит из
 * чередующихся символов c1 и c2, начиная с c1.
 */
public class programm {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter N: ");
        int n = iScanner.nextInt();
        System.out.printf("Enter c1: ");
        char c1 = iScanner.next().charAt(0);
        System.out.printf("Enter c2: ");
        char c2 = iScanner.next().charAt(0);
        System.out.println(returnStringN(n, c1, c2));
        iScanner.close();
    }

    private static String returnStringN(int n, char c1, char c2) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < n / 2; i++) {
            stringBuilder.append(String.format("%c%c", c1, c2));
            /*
             * if (i % 2 == 0) {
             * stringBuilder.append(c1);
             * } else {
             * stringBuilder.append(c2);
             * }
             */
        }
        return stringBuilder.toString();
    }
}
