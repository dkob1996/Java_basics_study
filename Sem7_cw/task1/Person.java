package Sem7_cw.task1;


import java.util.Objects;

public class Person {

    public static int count = 0;

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person p) {
            return Objects.equals(name, p.name) && age == p.age;
        }
        // obj не является Person'ом
        return false;
    }

    @Override
    public int hashCode() {
        // f1, f2, f3, f4, ..
        // hash(f1) + hash(f2) + hash(f3) + ...
        return Objects.hash(name, age);
    }

    // if o1.equals(o2) => o1.hashcode == o2.hashcode

    @Override
    public String toString() {
        return name + " [" + age + "]";
    }
}
