package Lect5.task1;

import java.util.HashMap;
import java.util.Map;

public class programm {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "One");
        db.put(2, "Two");
        db.put(null, "!null");
        System.out.println(db);  // {null=!null, 1=One, 2=Two}
        System.out.println(db.get(44));  // null
        db.remove(null);
        System.out.println(db); // {1=One, 2=Two}
        System.out.println(db.containsValue("One")); //true
        System.err.println(db.containsKey(1)); //true
        System.out.println(db.keySet()); //[1, 2]
        System.out.println(db.values()); //[One, Two]

    }
}
