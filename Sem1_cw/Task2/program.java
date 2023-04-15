package Sem1_cw.Task2;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        /*
         * 
        Написать программу, которая запросит пользователя ввести <Имя> в консоли.
        Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
         */

         Scanner iScanner = new Scanner(System.in);
         System.out.println("name: ");
         String name = iScanner.nextLine();
         System.out.printf("Hello, %s! \n", name);
         iScanner.close();
    }
}
