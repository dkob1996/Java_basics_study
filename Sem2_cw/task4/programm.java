package Sem2_cw.task4;
import java.util.Scanner;

import java.io.*;

/*
 * Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, 
 * который запишет эту строку в простой текстовый файл, обработайте исключения.
 */

public class programm {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter string: ");
        String str = iScanner.next().toString();
        System.out.println("Результат операции:");
        System.out.printf("%s",writeLine(createLine(str)));

        iScanner.close();
        
    }
    public static String createLine(String str){
        StringBuilder tmp  = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            tmp.append(str);
            tmp.append("\n");
        }
        tmp.append("\n");
        return tmp.toString();
    }
    public static String writeLine(String tmp){
        try(FileWriter fw = new FileWriter("Sem2_cw/task4/file.txt", false)){
            fw.write(tmp);
            String one = "Запись прошла успешно";
            return one;
        }
        catch (IOException ex){
            String message1 = "Запись прервалась" + ex.getMessage();
            return message1;
        }
    }
}
