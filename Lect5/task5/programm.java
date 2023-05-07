package Lect5.task5;

import java.util.*;

public class programm {
    public static void main(String[] args) {
        Map<Integer, String> table = new Hashtable<>();
        table.put(1, "Two");
        table.put(11, "One one");
        table.put(2, "One");
        System.out.println(table); //{2=One, 1=Two, 11=One one}
        //table.put(null, "One"); //java.lang.NullPointerExeption
    }
}
