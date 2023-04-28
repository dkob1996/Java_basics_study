package Sem6_cw.task3;

import java.util.*;

public class programm {
    public static void main(String[] args) {
        String str = "sql react java python python sql selenium";
        printStringLengthStats(str);
    }
    private static void printStringLengthStats(String text) {
        Map<Integer, Set<String>> stats = new TreeMap<>();
        List<String> words = Arrays.asList(text.split("\\s++"));
        for (String word : words) {
            int length = word.length();
            if (!stats.containsKey(length)) {
                Set<String> value = new HashSet<>(); // HashSet, TreeSet, LinkedHashSet, ...
                value.add(word);
                stats.put(length, value);
            } else {
                Set<String> value = stats.get(length);
                value.add(word);
            }
        }

        for (Map.Entry<Integer, Set<String>> pairs : stats.entrySet()) { // итерируемся по всем парам <key value>
            Integer key = pairs.getKey();
            Set<String> value = pairs.getValue();
            System.out.println(key + " -> " + value);
        }
    }
}
