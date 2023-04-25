package Sem4_cw.task2;

/*
 * Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
Вывести название каждой планеты и количество его повторений в списке.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class programm {
    public static void main(String[] args) {
        String[] array = new String[] { "Земля", "Сатурн", "Марс", "Венера", "Нептун", "Уран", "Меркурий", "Юпитер",
                "Плутон" };
        List<String> planets = new ArrayList<String>();
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            planets.add(array[rnd.nextInt(array.length)]);
        }
        System.out.println(planets);
        Map<String, Integer> dictionary = new HashMap<String, Integer>();
        for (int i = 0; i < planets.size(); i++) {
            if (dictionary.containsKey(planets.get(i))) {
                dictionary.put(planets.get(i), dictionary.get(planets.get(i)) + 1);
            } else {
                dictionary.put(planets.get(i), 1);
            }
        }
        System.out.println(dictionary);

    }
}