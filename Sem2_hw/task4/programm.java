package Sem2_hw.task4;

import java.io.*;
import java.util.*;
import java.util.logging.*;

/*
 * К калькулятору из предыдущего дз добавить логирование.
 * Вводится первое число, второе число, оператор.
 */

public class programm {

    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger(programm.class.getName());
        try {
            FileHandler fhInfo = new FileHandler("Sem2_hw/task4/logs/logCalculatorInfo.txt");
            SimpleFormatter sFormat = new SimpleFormatter();
            logger1.setLevel(Level.INFO);
            logger1.addHandler(fhInfo);
            fhInfo.setFormatter(sFormat);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            logger1.info(ex.getMessage());
        }
        Scanner iScanner = new Scanner(System.in);
        logger1.info("Scanner opened");
        boolean flagInput = false;
        int firstNum = -1;
        int secondNum = -1;
        try {

            System.out.println("Enter first number: ");
            firstNum = iScanner.nextInt();
            logger1.info("First number entered: " + firstNum);

            System.out.println("Enter second number: ");
            secondNum = iScanner.nextInt();
            logger1.info("Second number entered: " + secondNum);
            flagInput = true;

        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
            logger1.severe("InputMismatchException " + ex.getMessage());
        }
        System.out.println("Enter operation: ");
        char operation = iScanner.next().charAt(0);
        logger1.info("Operator entered: " + operation);

        int result = 0;
        boolean completeFlag = false;

        if (flagInput == true) {
            switch (operation) {
                case '+':
                    logger1.info("Case + opened: ");
                    result = firstNum + secondNum;
                    logger1.info("Result + case: " + result);
                    completeFlag = true;
                    break;
                case '-':
                    logger1.info("Case - opened: ");
                    result = firstNum - secondNum;
                    logger1.info("Result - case: " + result);
                    completeFlag = true;
                    break;
                case '*':
                    logger1.info("Case * opened: ");
                    result = firstNum * secondNum;
                    logger1.info("Result * case: " + result);
                    completeFlag = true;
                    break;
                case '/':
                    logger1.info("Case / opened: ");
                    result = firstNum / secondNum;
                    logger1.info("Result / case: " + result);
                    completeFlag = true;
                    break;
                default:
                    logger1.info("Default worked: ");
                    completeFlag = false;
                    break;
            }
        } else{
            System.out.println("Input incorrect");
            logger1.severe("Input incorrect");
        }

        if (flagInput == true) {
            if (completeFlag == false) {
                System.out.println("I don't know this operator yet");
                logger1.info("Operator does not exist: " + operation);
            } else {
                System.out.printf("Result of %d %c %d: %d", firstNum, operation, secondNum, result);
                logger1.info("Result printed: " + result);
            }
        } else {
            System.out.println("Wrong types of arguments");
            logger1.severe("Wrong types of arguments");
        }

        iScanner.close();
        logger1.info("Scanner closed");
    }
}
