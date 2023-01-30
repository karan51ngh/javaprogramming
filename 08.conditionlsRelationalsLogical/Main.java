public class Main {

    public static void main(String[] args) {
        /*
        if (condition-to-be-checked) {
	        statements-if-condition-true;
        }
        else {
            statements-if-condition-false;
        } 
        */


        int age = 21;
        if (age>18) {
            System.out.println("You can drive");
        }
        else{
                System.out.println("You are underage!");
        }

        /* if (condition1) {
                // Statements;
            else if {

                // Statements;

            }
            else {
                // Statements
            } 
        */

        System.out.println("For Logical AND...");
        boolean a = true;
        boolean b = false;
       if (a && b){
           System.out.println("Y");
       }
       else{
           System.out.println("N");
       }

        System.out.println("For Logical OR...");

       if (a || b){
           System.out.println("Y");
       }
       else{
           System.out.println("N");
       }

        System.out.println("For Logical NOT");
        System.out.print("Not(a) is ");
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);

    }
    
}
