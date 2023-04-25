package Sem4_cw.task3;

import java.util.ArrayList;
import java.util.List;

import java.util.*;

/*
 * Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа. 
Пройти по списку, найти и удалить целые числа.
 */

public class programm {
    public static void main(String[] args) {
        ArrayList<String> some_list = new ArrayList<>();
        some_list.add("str");
        some_list.add("1");
        some_list.add("ghjgjhk");
        some_list.add("4");
        some_list.add("str");
        some_list.add("3");
        some_list.add("rtuyi");
        some_list.add("tyui");
        System.out.println(some_list);

        some_list.removeIf(programm::parseIntOrNull);

        System.out.println(some_list);
    }

    public static boolean parseIntOrNull(String string) {
        int test;
        try {
            test = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

}
