package Sem2_hw.task3;

import java.io.*;
import java.util.*;

/*
 * (Для преподавателя: если не успели выполнить задание 7, дать наводку из этого задания) Дана json-строка (можно сохранить в файл и читать из файла)

[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода:

Студент Иванов получил 5 по предмету Математика.

Студент Петрова получил 4 по предмету Информатика.

Студент Краснов получил 5 по предмету Физика.
 */


public class programm {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter path of file: ");
        System.out.println();
        String path = iScanner.next().toString();

        // String path = "Sem2_hw/task3/file.json";
        String pars = readJSONFile(path);

        if (pars.substring(0, 13).equals("Ошибка чтения")) {
            System.out.println(pars.substring(14));
        } else {
            System.out.println(writeOutputFile(convertJsonToOutput(pars)));
        }

        iScanner.close();
    }

    public static String readJSONFile(String tmp) {
        try (FileReader fr = new FileReader(tmp)) {
            StringBuilder resultStr = new StringBuilder();
            int count;
            while ((count = fr.read()) != -1) {
                resultStr.append((char) count);
            }
            return resultStr.toString();
        } catch (IOException ex) {
            String message1 = "Ошибка чтения" + "\n" + ex.getMessage();
            return message1;
        }
    }

    public static String writeOutputFile(String tmp) {
        try (FileWriter fw = new FileWriter("Sem2_hw/task3/output.txt", false)) {
            fw.write(tmp);
            String one = "Запись прошла успешно";
            return one;
        } catch (IOException ex) {
            String message1 = "Ошибка записи" + "\n" + ex.getMessage();
            return message1;
        }
    }

    public static String convertJsonToOutput(String tmp) {
        tmp = tmp.replaceAll("фамилия", "Студент ");
        tmp = tmp.replaceAll("оценка", " получил ");
        tmp = tmp.replaceAll("предмет", " по предмету ");
        int tmpLength = tmp.length();
        StringBuilder tmpOut = new StringBuilder();
        for (int i = 0; i < tmpLength; i++) {
            if ((tmp.charAt(i) == '}') && (tmp.charAt(i + 1) == ',') && (tmp.charAt(i + 2) == '{')) {
                tmpOut.append(".\n");
            } else if ((tmp.charAt(i) == '\"') || (tmp.charAt(i) == ':') || (tmp.charAt(i) == ',')
                    || (tmp.charAt(i) == '[') || (tmp.charAt(i) == ']') || (tmp.charAt(i) == '{')
                    || (tmp.charAt(i) == '}')) {
                tmpOut.append("");
            } else {
                tmpOut.append(tmp.charAt(i));
            }
        }

        return tmpOut.toString();
    }
}
