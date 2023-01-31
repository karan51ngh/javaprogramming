public class Main {
    public static void main(String[] args) {
        int [] marks; // 1-D Array
        int [][] flats; // 2-D Array

        // flats = new int [2][3];
        // flats[0][0] = 101;
        // flats[0][1] = 102;
        // flats[0][2] = 103;
        // flats[1][0] = 201;
        // flats[1][1] = 202;
        // flats[1][2] = 203;

        marks = new int[3];
        
        marks[0] = 1;
        marks[1] = 2;
        marks[2] = 3;
        
        flats = new int[2][2]; // 2x2 array declared
        flats[0] = marks; // stroes reference

        marks[0] = 4;
        marks[1] = 5;
        marks[2] = 6;

        flats[1] = marks;

        // Displaying the 2-D Array (for loop)
        System.out.println("Printing a 2-D array using for loop");
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
