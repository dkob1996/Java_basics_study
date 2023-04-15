package Sem1_hw.task1;

import java.util.Scanner;

/**
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n),
 * n! (произведение чисел от 1 до n)
 */

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter n: ");
        int n = iScanner.nextInt();
        System.out.printf("Sum of all numbers of %d = %d", n, sumN(n));
        System.out.println();
        System.out.printf("Factorial of %d = %d", n, factor(n));
        iScanner.close();
    }

    static int sumN(int n) {
        int sum = 0;
        do {
            sum += n;
            n--;
        } while (n > 0);
        return sum;
    }

    static int factor(int n) {
        if (n == 1)
            return 1;
        return n * factor(n - 1);
    }
}
