import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String var;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter a name");
        
        var = sc.next();
        sc.close();

        switch (var) {
            case "zephyrus": {
                System.out.println("Name of my Linux Machine");
                break;
            }
            case "karan51ngh" :{ 
                System.out.println("Name of the user");
                break;
            }
            case "artios" :{
                System.out.println("Name of my windows machine");
                break;
            }
            default : System.out.println("Linux for Work, Windows is my Gaming Partition");
        }
        System.out.println("Out of the Switch Case");

        // Arrow supported from java-14 onwards
    }
}
/*
Terminal:

karan51ngh@zephyrus:~/programming/github/javaprogramming/09.switch$ javac Main.java 
karan51ngh@zephyrus:~/programming/github/javaprogramming/09.switch$ java Main 
enter a name
karan51ngh
Name of the user
Out of the Switch Case
karan51ngh@zephyrus:~/programming/github/javaprogramming/09.switch$ java Main 
enter a name
zephyrus
Name of my Linux Machine
Out of the Switch Case
karan51ngh@zephyrus:~/programming/github/javaprogramming/09.switch$ java Main 
enter a name
artios
Name of my windows machine
Out of the Switch Case
karan51ngh@zephyrus:~/programming/github/javaprogramming/09.switch$ java Main 
enter a name
atom
Linux for Work, Windows is my Gaming Partition
Out of the Switch Case
karan51ngh@zephyrus:~/programming/github/javaprogramming/09.switch$ 
*/
