class A{
    public int a;
    public int karan51ngh(){
        return 4;
    }
    public void zephyrus(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{
    // @Override
    // public void zephyrus(){
    //     System.out.println("I am method 2 of class B");
    // }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.zephyrus();

        B b = new B();
        b.zephyrus();
    }
}
