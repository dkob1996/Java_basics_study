package Lect5.task2;

import java.util.*;

public class programm {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "One");
        db.put(2, "Two");
        db.put(3, "Three");
        System.out.println(db);  //{1=One, 2=Two, 3=Three}

        for (var item : db.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
            /*
             * [1: One]
               [2: Two]
               [3: Three]
             */
        }
    }
}
