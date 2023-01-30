import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // String is a Class in java
        String name = new String("karan51ngh");
        // String name = "karan51ngh";
        System.out.print("The name is: ");
        System.out.print(name);

        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %f\n", a, b);
        //System.out.format("The value of a is %d and value of b is %f", a, b);

        // user input in string
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        System.out.println(st);
        sc.close();
    }   
}