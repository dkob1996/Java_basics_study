package Sem2_hw.task2;

import java.io.*;
import java.util.*;
import java.util.logging.*;

/*
 * Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */

public class programm {

    public static void main(String[] args) {
        Logger loggerErr = Logger.getLogger(programm.class.getName());
        Logger loggerInfo = Logger.getLogger(programm.class.getName());
        try {
            FileHandler fhErr = new FileHandler("Sem2_hw/task2/logs/logMainErr.txt");
            FileHandler fhInfo = new FileHandler("Sem2_hw/task2/logs/logMainInfo.txt");
            SimpleFormatter sFormat = new SimpleFormatter();
            loggerInfo.setLevel(Level.INFO);
            loggerInfo.addHandler(fhInfo);
            fhInfo.setFormatter(sFormat);

            loggerErr.setLevel(Level.SEVERE);
            loggerErr.addHandler(fhErr);
            fhErr.setFormatter(sFormat);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            loggerErr.severe(ex.getMessage());
        }

        Scanner iScanner = new Scanner(System.in);
        loggerInfo.info("Scanner opened");
        System.out.println("Enter length of array: ");
        try {
            int arrlength = iScanner.nextInt();
            ArrayBubble array = new ArrayBubble(arrlength);

            System.out.println("Enter value of elements in array: ");
            for (int i = 0; i < arrlength; i++) {
                array.into(iScanner.nextInt());
            }
            System.out.println();

            array.printer();
            array.bubbleSorter();
            array.printer();

        } catch (InputMismatchException ex) {
            System.out.println("Incorrect types of date in a array");
            System.out.printf("Error message: %s", ex.getMessage());
            loggerErr.severe(ex.getMessage());
        } finally {
            iScanner.close();
            loggerInfo.info("Scanner closed");
        }
    }
}

class ArrayBubble {
    public static final Logger logger1 = Logger.getLogger(ArrayBubble.class.getName());
    {
        try {
            FileHandler fhInfo = new FileHandler("Sem2_hw/task2/logs/logArrayBubbleInfo.txt");
            SimpleFormatter sFormat = new SimpleFormatter();
            logger1.setLevel(Level.INFO);
            logger1.addHandler(fhInfo);
            fhInfo.setFormatter(sFormat);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            logger1.info(ex.getMessage());
        }
    }

    private long[] a;
    private int elems;

    public ArrayBubble(int max) {
        a = new long[max];
        elems = 0;
        logger1.info("Array created: " + Arrays.toString(a));
    }

    public void into(long value) {

        a[elems] = value;
        elems++;

        logger1.info("Element added to array: " + value);
    }

    public void printer() {
        for (int i = 0; i < elems; i++) {
            System.out.print(a[i] + " ");
            System.out.println("");
        }
        logger1.info("Print current array: " + Arrays.toString(a));
    }

    private void toSwap(int first, int second) {
        logger1.info("Swap " + a[first] + " to " + a[second]);
        long dummy = a[first];
        a[first] = a[second];
        a[second] = dummy;

    }

    public void bubbleSorter() {
        for (int out = elems - 1; out >= 1; out--) {
            logger1.info("Itteration Sort: " + Arrays.toString(a));
            for (int in = 0; in < out; in++) {
                if (a[in] > a[in + 1])
                    toSwap(in, in + 1);
            }
        }
    }
}