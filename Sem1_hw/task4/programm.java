package Sem1_hw.task4;

import java.util.Scanner;

public class programm {
    public static void main(String[] args) {
        System.out.println("\n\nThe expression is set: x? + ?y = z . Restore the expression to the correct equality.");
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNum = iScanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = iScanner.nextInt();
        System.out.println("Enter result: ");
        int result = iScanner.nextInt();


        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((firstNum*10) + i + j * 10 + secondNum == result) {
                    count += 1;
                    System.out.printf(count + ") %d" + i + " + " + j + "%d" + " = %d",firstNum,secondNum,result);
                }
            }
        }
        System.out.println("\n");
        if (count == 0) {
            System.out.println("There are no solutions\n");
        }
        iScanner.close();
    }
}
