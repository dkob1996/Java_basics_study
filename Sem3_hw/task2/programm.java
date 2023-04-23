package Sem3_hw.task2;

import java.util.*;

/*
 * Пусть дан произвольный список целых чисел, удалить из него чётные числа
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
            System.out.println(addElToArr(list, length, max));
            list = removeElFromArr(list);
            if (list.isEmpty()) {
                System.out.println("Elements doesn't exist");
            } else{
                System.out.println("New array:");
                System.out.println(list);
            }
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

    public static List<Integer> removeElFromArr(List<Integer> list) {
        Iterator<Integer> arrIterator = list.iterator();
        while (arrIterator.hasNext()) {
            Integer arrNext = arrIterator.next();
            if (arrNext % 2 != 0) {
                arrIterator.remove();
            }
        }
        return list;
    }

}
