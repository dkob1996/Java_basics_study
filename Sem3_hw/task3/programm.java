package Sem3_hw.task3;

import java.util.*;

/*
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
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
            int maxEl = FindMaxEl(list);
            System.out.println(maxEl);
            int minEl = FindMinEl(list);
            System.out.println(minEl);
            System.out.println("Average ariphmetic form array: ");
            System.out.println(FindMiddleAriphmeticEl(list));
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

    public static int FindMaxEl(List<Integer> list) {
        Iterator<Integer> arrIterator = list.iterator();
        int max = list.get(0);
        while (arrIterator.hasNext()) {
            Integer arrNext = arrIterator.next();
            if (arrNext > max) {
                max = arrNext;
            }
        }
        return max;
    }

    public static int FindMinEl(List<Integer> list) {
        Iterator<Integer> arrIterator = list.iterator();
        int min = list.get(0);
        while (arrIterator.hasNext()) {
            Integer arrNext = arrIterator.next();
            if (arrNext < min) {
                min = arrNext;
            }
        }
        return min;
    }

    public static float FindMiddleAriphmeticEl(List<Integer> list) {
        int sum = 0;
        for (int item : list) {
            sum += item;
        }
        float middle = (float) sum / list.size();
        return middle;
    }
}
