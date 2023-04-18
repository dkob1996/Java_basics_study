package Sem2_cw.task3;

import java.util.Scanner;
/*
 * Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
 */

public class programm {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter string: ");
        String str = iScanner.next().toString();
        System.out.println(printPolindrom(polindrom(str)));
        iScanner.close();
    }

    public static boolean polindrom(String str) {
        str = str.toLowerCase().replace(" ", "");
        boolean pol = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                pol = false;
            }
        }
        return pol;
    }

    public static String printPolindrom(boolean flag) {
        String message = null;
        if (flag == true) {
            message = "Полиндром";
        } else {
            message = "Не полиндром";
        }
        return message;

    }
}