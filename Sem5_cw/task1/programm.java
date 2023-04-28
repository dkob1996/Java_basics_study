package Sem5_cw.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class programm {
    public static void main(String[] args) {
        // arrayVsLinkedLists();
        // string~2
        // java~5
        // print~5 -> java
        // print~2 -> string
        // python~6
        // print~6 -> python
        // print~6 -> (null или ошибка или какое-то информационное сообщение)

        // [null, null, string, null, null, java]
        // [["string", 2], ["java", 5]]

        // text~2
        // java~2
        // print~2 -> java
        Scanner sc = new Scanner(System.in);
        List<List<String>> storage = new ArrayList<>(); // LinkedList
        root: while (true) {
            String command = sc.nextLine();
            if ("exit".equals(command)) {
                break;
            }

            String[] arguments = command.split("~");
            if (arguments.length != 2) {
                System.err.println("Некорректный ввод");
                continue;
            }
            String text = arguments[0];
            String num;
            try {
                Integer.parseInt(arguments[1]);
                num = arguments[1];
            } catch (NumberFormatException e) {
                System.err.println("Некорректный ввод");
                continue;
            }

            if ("print".equals(text)) {
                Iterator<List<String>> iterator = storage.iterator();
                while (iterator.hasNext()) {
                    List<String> pair = iterator.next();
                    if (num.equals(pair.get(1))) { // num
                        System.out.println(pair.get(0)); // text
                        iterator.remove();
                        continue root;
                    }
                }
                System.err.println("Не найдено значение с индексом " + num);
            } else {
                // Пытаемся найти пару, у которой индекс равен num
                for (List<String> pair : storage) { // pair [text, index]
                    if (num.equals(pair.get(1))) {
                        pair.set(0, text); // нашли пару, меняем значение (text)
                        continue root;
                    }
                }

                storage.add(Arrays.asList(text, num));
            }
        }
    }
}
