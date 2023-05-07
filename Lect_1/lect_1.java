import java.io.*;
import java.util.Scanner;

/**
 *  comment 1
 */
// comment 2

public class lect_1 {
    public static void main(String[] args) {
        
        System.out.println("Hello");

        String s;
        s= "yo";
        System.out.println(s);

        short age =10;
        int salary = 123456;
        System.out.println(age); //10
        System.out.println(salary);  //123456

        float e = 2.7f;
        double pi = 3.1415;
        System.out.println(e); //2.7
        System.out.println(pi); //3.1415

        char ch='1';
        System.out.println(Character.isDigit(ch)); //true
        ch ='a';
        System.out.println(Character.isDigit(ch)); //false

        boolean flag1 = 123 <= 234;
        System.out.println(flag1); //true
        boolean flag2 = 123 >= 234;
        System.out.println(flag2); //false
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3); //false

        var a = 123;
        System.out.println(a);
        var d = 123.456;
        System.out.println(d);
        System.out.println(getType(a)); //Integer
        System.out.println(getType(d)); //Double
        d = 1022;
        System.out.println(d);

        String s1 ="qwer";
        System.out.println(s1.charAt(1));
        
        // one massive value
        
        int[] arr = new int[10];
        System.out.println(arr.length); //10

        arr = new int[] {1,2,3,4,5,6,};
        System.out.println(arr.length); //6
        
        // two massive value
        
        int[] arr2[] = new int[3][5];
        for (int[] line : arr2) {
            for (int item : line) {
                System.out.printf("%d", item);
            }
            System.out.println();
        }

        System.out.println();

        int[][] arr1 = new int[3][5];
        for (int i=0; i<arr1.length; i++){
            for (int j=0; j<arr1[i].length;j++){
                System.out.printf("%d",arr1[i][j]);
            }
            System.out.println();
        }
         
        // get info from terminal
        
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Hello, %s!\n ", name);
        iScanner.close();
         
        
        Scanner iScanner1 = new Scanner(System.in);
        System.out.printf("int a: ");
        int x = iScanner1.nextInt();
        System.out.printf("double a: ");
        double y = iScanner1.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x+y);
        iScanner1.close();
         
        
        Scanner iScanner2 = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag = iScanner2.hasNextInt();
        System.out.println(flag);
        int i = iScanner2.nextInt();
        System.out.println(i);
        iScanner2.close();
        
        sayHi(); //Hi!
        System.out.println(sum(1,3)); //4
        System.out.println(factor(5)); //120

        
        Scanner iScanner3 = new Scanner(System.in);
        System.out.printf("Enter value: ");
        int mounth = iScanner3.nextInt();
        String text = "";
        switch (mounth) {
            case 1:
                text = "Autumn";
                break;
            case 2:
                text = "Winter";
                break;
            default:
                text = "mistake";
                break;
        }
        System.out.println(text);
        iScanner3.close();
    
    
        int value = 321;
        int count = 0;

        while (value!=0){
            value /=10;
            count++;
        }
        System.out.println(count);
    
        int value1 = 321;
        int count1=0;

        do {
            value1 /=10;
            count1++;
        } while (value1 !=0);

        System.out.println(count1);
    
    int[] arr3 = new  int[] {1,2,3,4,5,77};
    for (int j = 0; j < arr3.length; j++){
        arr3[j] = 10;
    }
    for (int item : arr3) {
        System.out.println(item);
    }
    
    //write
    try(FileWriter fw = new FileWriter("file.txt", false)){
        fw.write("line1");
        fw.append('\n');
        fw.append('2');
        fw.append('\n');
        fw.write("line3");
        fw.flush();
    }
    catch (IOException ex){
        System.out.println(ex.getMessage());
    }
    
     // work with char to char
        try(FileReader fr = new FileReader("file.txt")) {
            int c;
            while ((c = fr.read()) != -1) {
                char ch1 = (char) c;
                if (ch1 == '\n') {
                    System.out.println(ch1);
                } else {
                    System.out.println(ch1);
                }
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    
    // work with string to string
    try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))){
        String str;
        while ((str = br.readLine()) != null){
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }
    catch (IOException ex){
        System.out.println(ex.getMessage());
    }
   
    }
    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
    static void sayHi(){
        System.out.println("Hi!");
    }
    static int sum (int a, int b){
        return a+ b;
    }
    static double factor(int n){
        if (n==1) return 1;
        return n*factor(n-1);
    }

}
