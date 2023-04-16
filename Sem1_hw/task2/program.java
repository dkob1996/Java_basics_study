package Sem1_hw.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Вывести все простые числа от 1 до 1000
 */

public class program {
    public static void main(String[] args) {
        int startNum = 2;
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter max number: ");
        int endNum = iScanner.nextInt();
        iScanner.close();
        List<Integer> arr = new ArrayList<>();

        for (int i = startNum; i <= endNum; i++) {
            boolean isPrimeNumber = true;

            for (int j = startNum; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                arr.add(i);
            }
        }
        System.out.printf("Simple numbers from %d to %d: ",startNum,endNum);
        System.out.println();
        System.out.println(arr);
    }
}
