package Sem2_cw.task2;

import java.util.Scanner;

public class programm {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter string: ");
        String str = iScanner.next().toString();
        System.out.println(countingString(str));
        iScanner.close();
    }

    private static String countingString(String str) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                if (count == 1) {
                    sb.append(str.charAt(i));
                } else {
                    sb.append(str.charAt(i) + Integer.toString(count));
                    count = 1;
                }
            }
        }
        if (count == 1) {
            sb.append(str.substring(str.length() - 1));
        } else {
            sb.append(str.substring(str.length() - 1) + Integer.toString(count));
        }
        return sb.toString();
    }
}