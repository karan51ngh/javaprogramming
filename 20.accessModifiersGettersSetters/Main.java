class Player{
    private int id;
    private String name;
    public void setData(int i, String n)
    {
        this.id = i;
        this.name = n;
    }
    public void getData()
    {
        System.out.println("The is is: " + id);
        System.out.println("The Name is: " + name);
    }
}

public class Main{
    public static void main(String[] args) {

        Player karan51ngh = new Player();

        // not possible since private
        // karan51ngh.name = "Karan Singh";
        // karan51ngh.id = 15082001;
        
        karan51ngh.setData(15082001,"Karan Singh");
        karan51ngh.getData();
    }

}