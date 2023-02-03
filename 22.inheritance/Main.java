class Base {
    int x;

    public void setx (int x) {
        System.out.println("Setting x now! in Base rn!");
        this.x = x;
    }

    public int getx () {
        return x;
    }
    void printMe() {
        System.out.println("I am Base Constructor");
    }
}

class Derived extends Base{
    int y;

    public void sety (int y) {
        this.y = y;
    }

    public int gety () {
        return y;
    }
}

public class Main {
    public static void main(String[] args) {
        // Base Class
        Base b = new Base();
        b.setx(64);
        System.out.println(b.getx());

        // Derived Class
        Derived d = new Derived();
        d.setx(960);
        System.out.println(d.getx());


        
    }
}
