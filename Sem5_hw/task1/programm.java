package Sem5_hw.task1;

import java.util.*;
/*
 * Реализовать консольное приложение, которое:

Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти.
Если введено exit, завершаем программу
Пример:
java
python
c#
print > [c#, python, java]
revert
print > [python, java]
kotlin
print > [kotlin, python, java]
revert
revert
revert
print > []
revert > Ошибка!
exit -> (Программа завершилась)
 */

public class programm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<String> storage = new LinkedList<String>();
        while (true) {
            String command = sc.nextLine();
            if ("exit".equals(command)) {
                break;
            } else if ("print".equals(command)) {
                System.out.println(storage);
            } else if ("revert".equals(command)) {
                try {
                    storage.removeFirst();
                } catch (NoSuchElementException ex) {
                    System.out.println("Ошибка");
                    continue;
                }
            } else {
                storage.addFirst(command);
            }
        }
        sc.close();
    }
}
