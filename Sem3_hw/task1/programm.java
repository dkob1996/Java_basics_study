package Sem3_hw.task1;

import java.util.*;
import java.util.Arrays;
/*
 * Реализовать алгоритм сортировки слиянием
 */

public class programm {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        try {
            System.out.println("Enter length of array: ");
            int lengthArr = iScanner.nextInt();
            int[] array1 = new int[lengthArr];
            System.out.println("Enter value of elements in array: ");
            for (int i = 0; i < lengthArr; i++) {
                array1[i] = iScanner.nextInt();
            }
            int[] result = mergesort(array1);
            System.out.println(Arrays.toString(result));

        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
        }
        
        iScanner.close();
    }

    public static int[] mergesort(int[] array1) {
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer2 = new int[array1.length];
        int[] result = mergesortInner(buffer1, buffer2, 0, array1.length);
        return result;
    }

    public static int[] mergesortInner(int[] buffer1, int[] buffer2,
            int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++]
                    : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}
