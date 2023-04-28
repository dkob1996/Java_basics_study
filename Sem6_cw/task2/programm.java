package Sem6_cw.task2;

/*
 * собственные кортежи
 */

public class programm {
    public static void main(String[] args) {
        
    }
    static MyPair getMyPair() {
        return new MyPair(1, "abc");
    }

    static class MyPair {
        int integer;
        String string;

        public MyPair(int integer, String string) {
            this.integer = integer;
            this.string = string;
        }
    }
    static record MyPair1(int integer, String string) {
        
    }
}
