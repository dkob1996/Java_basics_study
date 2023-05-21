package Sem7_cw.task1;


import java.util.HashSet;

public class OOPMain {

    public static void main(String[] args) {
        // Наследование, Инкапсуляция, Полиморфизм
//        cats();

        cats();

        System.out.println(Person.count);

        Person p1 = new Person("Igor", 100);
        Person p2 = new Person("Igor", 100);
        Person p3 = new Person("Vasya", 100);

        System.out.println(Person.count);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());

        HashSet<Person> persons = new HashSet<>();
        persons.add(p1);
        persons.add(p2);

        System.out.println(persons.size());
        System.out.println(persons);


    }

    private static void cats() {
        Cat cat = new Cat("Murzik", 20);
        Cat gav = new Cat("Gav", 90);
        ВечноГолодныйКот вечноГолодныйКот = new ВечноГолодныйКот("обжора");
        Plate bigPlate = new Plate(Integer.MAX_VALUE);
        вечноГолодныйКот.eat(bigPlate);

        System.out.println(вечноГолодныйКот.isHungry());


        Plate plate = new Plate(1_000_000);
        вечноГолодныйКот.eat(plate);
        System.out.println(вечноГолодныйКот.isHungry());

        cat.eat(plate);
        System.out.println(cat.isHungry()); // false
        System.out.println(plate.getFood());
        gav.eat(plate);
        System.out.println(gav.isHungry()); // true
        System.out.println(plate.getFood());
        gav.eat(plate);
        System.out.println(gav.isHungry()); // true
        System.out.println(plate.getFood());
    }

}
