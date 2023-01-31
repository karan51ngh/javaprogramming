public class Main {

    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x +y) * 5;
        }
        return z;
    }


    public static void main(String[] args) {
        // static declaration implies, the method is bound t the Class and not to any object
        int a = 5;
        int b = 7;
        int c;
        c = logic(a, b);

        // Method invocation using Object creation when not static

        //Main obj = new Main();
        //c = obj.logic(a, b);
        
        System.out.println(a + " "+ b);
        int a1 = 2;
        int b1 = 1;
        int c1;     
        c1 = logic(a1, b1);
        
        System.out.println(c);
        System.out.println(c1);
    }
}
