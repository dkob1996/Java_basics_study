package Sem6_cw.task1;

import java.util.*;

public class programm {
    public static void main(String[] args) {
        String str = "sql react java python python sql selenium";
        printStringCount(str);
    }
    private static void printStringCount(String text) {
        Map<Integer, List<String>> stats = new LinkedHashMap<>();
        List<String> words = Arrays.asList(text.split("\\s++"));
        for (String word: words) {
            int freq = Collections.frequency(words, word);
            List<String> toAdd = stats.getOrDefault(freq, new ArrayList<>());
            toAdd.add(word);
            stats.put(freq, toAdd);
        }

        for (Map.Entry<Integer, List<String>> entry : stats.entrySet()) {
            Integer key = entry.getKey();
            List<String> value = entry.getValue();
            System.out.println(key + " -> " + value);
        }
    }
}
