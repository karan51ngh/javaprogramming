class Player{
    int id;
    String name;
    int games;

    public void printDetails(){
        System.out.println("ID is: " + id);
        System.out.println("My name is: "+ name);
        System.out.println("Number of Games played: "+ name);
    }

    public int getGames(){
        return games;
    }
}

public class Main{
    public static void main(String[] args) {
        System.out.println("This is our custom class");

        // Initializing Objects
        Player karan51ngh = new Player();
        Player carlsen = new Player();

        // Setting Attributes
        karan51ngh.id = 15082001;
        karan51ngh.name = "Karan Singh";
        karan51ngh.games = 64;

        carlsen.id = 30111990;
        carlsen.name = "Magnus Carlsen";
        carlsen.games = 960;

        // Printing the Attributes
        karan51ngh.printDetails();
        carlsen.printDetails();

        int num_games = karan51ngh.getGames();
        System.out.println("Number of Games played by karan51ngh: " + num_games);

    }
}
