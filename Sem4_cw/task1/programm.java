package Sem4_cw.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
 * Заполнить список десятью случайными числами. 
Отсортировать список методом sort() и вывести его на экран.
 */

public class programm {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int length = 0;
        int max = 0;
        boolean flagEx = false;
        try {
            System.out.println("Enter length of array: ");
            length = iScanner.nextInt();
            System.out.println("Enter max value of element in array: ");
            max = iScanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
            flagEx = true;
        }
        if (flagEx == false) {
            List<Integer> list = new ArrayList<Integer>();
            System.out.println("Old array:");
            List<Integer> newarr = addElToArr(list, length, max);
            System.out.println(newarr);
            Collections.sort(newarr);
            System.out.println("New array:");
            System.out.println(newarr);
        }
        iScanner.close();
    }

    public static int randomToArr(int max) {
        Random r = new Random();
        int x = r.nextInt(max) + 1;
        return x;
    }

    public static List<Integer> addElToArr(List<Integer> list, int length, int max) {
        for (int i = 0; i < length; i++) {
            list.add(i, randomToArr(max));
        }
        return list;
    }
}
