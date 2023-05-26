package Sem7_hw.task1;

/*
Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.

Создать множество ноутбуков.

Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
Критерии фильтрации можно хранить в Map. Например:

“Введите цифру, соответствующую необходимому критерию:

1 - ОЗУ

2 - Объём ЖД

3 - Операционная система

4 - Цвет …

Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
Формат сдачи: файл с расширением java или ссылка на гит с подписанными ФИ и номером группы.
 */

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Создание объектов класса Laptop
        Laptop hp_1 = new Laptop(1, "HP", 500, "16", "Windows", "Black");
        Laptop hp_2 = new Laptop(2, "HP", 500, "8", "Windows", "White");
        Laptop samsung_1 = new Laptop(3, "Samsung", 300, "8", "Windows", "Black");
        Laptop samsung_2 = new Laptop(4, "Samsung", 1000, "16", "Linux", "Black");
        Laptop lenovo_1 = new Laptop(5, "Lenovo", 700, "8", "Windows", "White");
        Laptop macbook_1 = new Laptop(6, "Apple", 1000, "8", "iOS", "White");
        Laptop asus_1 = new Laptop(7, "Asus", 300, "4", "Windows", "Black");
        Laptop acer_1 = new Laptop(8, "Acer", 600, "8", "Windows", "Black");
        Laptop acer_2 = new Laptop(9, "Acer", 500, "16", "Windows", "Black");
        Laptop acer_3 = new Laptop(10, "Acer", 500, "8", "Windows", "Black");

        // Создание множества
        Set<Laptop> laptop = new HashSet<>();
        laptop.add(hp_1);
        laptop.add(hp_2);
        laptop.add(samsung_1);
        laptop.add(samsung_2);
        laptop.add(lenovo_1);
        laptop.add(macbook_1);
        laptop.add(asus_1);
        laptop.add(acer_1);
        laptop.add(acer_2);
        laptop.add(acer_3);
        // создание нового объекта вызова методов
        Laptop FilterLaptop = new Laptop();

        // вызод метода фильтрации по заданным пользователем критериям

        System.out.println(FilterLaptop.newFilter(laptop));

    }

}