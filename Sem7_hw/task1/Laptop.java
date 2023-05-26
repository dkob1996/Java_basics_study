package Sem7_hw.task1;

import java.util.*;

public class Laptop {
    // Создание полей
    private int Article;
    private String Mark;
    private int HDValue;
    private String RAM;
    private String OS;
    private String colour;

    // Создание пустого конструктора для работы с методами
    public Laptop() {
    }

    // Создание конструктора для создания экземпляров класса
    public Laptop(int Article, String Mark, int HDValue, String RAM, String OS,
            String colour) {
        this.Article = Article;
        this.Mark = Mark;
        this.HDValue = HDValue;
        this.RAM = RAM;
        this.OS = OS;
        this.colour = colour;
    }

    // Создание методов get\set Для работы с private полями
    public String getMark() {
        return Mark;
    }

    public int getHDValue() {
        return HDValue;
    }

    public String getRAM() {
        return RAM;
    }

    public String getOS() {
        return OS;
    }

    public String getColour() {
        return colour;
    }

    public void setArticle(int Article) {
        this.Article = Article;
    }

    public void setMark(String Mark) {
        this.Mark = Mark;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setHDValue(int HDValue) {
        this.HDValue = HDValue;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    // создание метода фильтрации ноутбуков по выборочной критериям
    public Set<Laptop> newFilter(Set<Laptop> laptop) {
        Scanner scan = new Scanner(System.in);
        Set<Laptop> listLaptop = new HashSet<>(laptop);
        System.out.println("Enter the necessary parameters and their values from the suggested ones, or press Enter");
        System.out.println(
                "Available parameters: Mark, Opeartion System, Hard Drive Value, Colour, Random Access Memory(RAM)");
        System.out.println();
        System.out
                .println("\n1. Mark \n2. Operation System\n3. Hard Drive Value\n4. Color\5. Random Access Memory(RAM)");
        System.out.println();
        System.out.println("Do it like this: 1,2,3 or 123");
        String userRequest = scan.nextLine();

        for (int i = 0; i < userRequest.length(); i++) {
            if (1 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Mark: Available parameters: Lenovo, Apple, HP, Samsung, Asus, Acer");
                System.out.println("Enter Mark like - \"Lenovo\":");
                String enterMark = scan.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterMark.equals(tempLaptop.Mark)) == false) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }

            if (2 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("OS: Available parameters: Windows, iOS, Linux");
                System.out.println("Enter OS like - \"Windows\":");
                String enterOperatingSystem = scan.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterOperatingSystem.equals(tempLaptop.OS) == false)) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }

            if (3 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Hard Drive Value: Available parameters, GB: 300, 500, 600, 700, 1000");
                System.out.println("Enter Hard Drive Value like - \"300\":");
                String enterHDValue = scan.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if (Integer.parseInt(enterHDValue) != tempLaptop.HDValue) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }

            if (4 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Coulour: Available parameters: Black, White");
                System.out.println("Enter Colour like - \"Black\":");
                String enterColour = scan.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterColour.equals(tempLaptop.colour)) == false) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }

            if (5 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Random Access Memory(RAM): Available parameters, GB: 4, 8, 16");
                System.out.println("Enter Random Access Memory(RAM) like - \"4\":");
                String enterOperativeMemory = scan.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterOperativeMemory.equals(tempLaptop.RAM)) == false) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }
        }
        scan.close();
        return listLaptop;
    }

    // метод toString, выводит на экран данные объекта
    @Override
    public String toString() {
        return String.format(
                "\n Article for buy = %d \n Mark -> %s \n Hard Drive Value = %d \n RAM = %s \n Operation System = %s \n Colour = %s \n",
                Article, Mark, HDValue, RAM, OS, colour);
    }

}