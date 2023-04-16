package Sem1_hw.task3;

import java.util.Scanner;

public class programm {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNum = iScanner.nextInt();
        System.out.println("Enter operation: ");
        char operation = iScanner.next().charAt(0);
        System.out.println("Enter second number: ");
        int secondNum = iScanner.nextInt();

        int result = 0;
        boolean completeFlag = false;

        switch (operation){
            case '+':
                result = firstNum + secondNum;
                completeFlag = true;
                break;
            case '-':
                result = firstNum - secondNum;
                completeFlag = true;
                break;
            case '*':
                result = firstNum * secondNum;
                completeFlag = true;
                break;
            case '/':
                result = firstNum / secondNum;
                completeFlag = true;
                break;
            default:
                completeFlag = false;
                break;        
        }
        if (completeFlag ==false){
            System.out.println("I don't know this operator yet");
        } else{
            System.out.printf("Result of %d %c %d: %d",firstNum,operation,secondNum,result);
        }

        iScanner.close();
    }
}
