package Sem7_cw.task1;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Queue, Deque, List -> Collection
        //Set<Integer> hashSet = new HashSet<>(); // порядок не гарантирован, но доступ за O(n)
        //Set<Integer> treeSet = new TreeSet<>(); // гарантирован порядок хранения: по возрастанию
        Set<Integer> linkedHashSet = new LinkedHashSet<>(); // гарантирован порядок добавления

        linkedHashSet.add(5);
        linkedHashSet.add(2);
        linkedHashSet.add(1);
        linkedHashSet.add(10);
        linkedHashSet.add(7);
//        System.out.println(linkedHashSet);

        List<Integer> integers = List.of(1, 2, 3, 4);
        System.out.println(nonUniqueCount(integers)); // 2

        System.out.println(anyOrNull(Set.of(1, 2, 3, 4))); // любой из 1 2 3 4
        System.out.println(anyOrNull(Set.of(5, 1, 2, 3, 4))); // любой из 5 1 2 3 4
        System.out.println(anyOrNull(Set.of(2))); // 2
        System.out.println(anyOrNull(Set.of())); // null

        System.out.println(containsExactly(Set.of(1), 1)); // true
        System.out.println(containsExactly(Set.of(1, 2), 1)); // false
        System.out.println(containsExactly(Set.of(), 1)); // false
        System.out.println(containsExactly(Set.of(2), 1)); // false

    }

    /**
     * Определить, содержит ли множество ровно 1 элемент, который равен value
     */
    private static boolean containsExactly(Set<Integer> integers, Integer value) {
        Iterator<Integer> iterator = integers.iterator();
        if (iterator.hasNext()) {
            Integer element = iterator.next();
            return Objects.equals(element, value) && !iterator.hasNext();

//            if (element == value) { // если первый элемент совпал
//                if (iterator.hasNext()) { // и есть еще элементы
//                    return false;
//                } else {
//                    return true;
//                }
//            }
        }
        return false; // set пустой
    }

    /**
     * Взять первый элемент множества. Если множество пустое - вернуть null
     */
    private static Integer anyOrNull(Set<Integer> integers) {
        Iterator<Integer> iterator = integers.iterator();
        if (iterator.hasNext()) {
            return iterator.next();
        }
        return null;
    }

    /**
     * Посчитать количество НЕуникальных элементов в списке
     * <p>
     * 1 1 1 1 1 1 1 1 2 3 -> 1
     * 1 1 1 1 1 1 1 1 2 3 4 4 -> 2
     * 1 2 3 4 5 -> 0
     */
    private static int nonUniqueCount(List<Integer> integers) {
        // set1 = [1, 2, 3]
        // set2 = [1]
        Set<Integer> unique = new HashSet<>();
        Set<Integer> nonUnique = new HashSet<>();
        for (Integer x : integers) {
            if (!unique.add(x)) {
                nonUnique.add(x);
            }

//            if (!unique.contains(x)) { // x in unique
//                unique.add(x);
//            } else {
//                nonUnique.add(x);
//            }
        }
        return nonUnique.size();
    }

    /**
     * Посчитать количество уникальных элементов в списке
     */
    private static int uniqueCount(List<Integer> integers) {
        Set<Integer> hashSet = new HashSet<>(integers);
        return hashSet.size();
//        for (Integer x : integers) {
//            hashSet.add(x);
//        }
//        return hashSet.size();
    }

}
