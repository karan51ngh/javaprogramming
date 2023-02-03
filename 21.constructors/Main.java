class Player {
    private int id;
    private String name;
    private int games;

    // CONSTRUCTOR -> Invoked Automatically
    public Player (int i, String n) {
        this.id = i;
        this.name = n;
    }

    // Constructor overloaded
    public Player (int i, String n, int g) {
        this.id = i;
        this.name = n;
        this.games = g;
    }

    public void setId (int i) {
        this.id = i;
    }

    public void setName (String n) {
        this.name = n;
    }

    public int getId () {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getGames() {
        return this.games;
    }
}

public class Main {
    public static void main(String[] args) {

        Player karan51ngh = new Player(21,"Karan Singh");
        System.out.println("Name is: " + karan51ngh.getName() + " and the id is: " + karan51ngh.getId());

        Player carlsen = new Player(21,"Magnus Carlsen",30111900);
        System.out.println("Name is: " + carlsen.getName() + " and the id is: " + carlsen.getId() + " and the # of games played is: " + carlsen.getGames());
    }
}
