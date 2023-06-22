public class Main {
    public static int dispSquares(int n) {
        System.out.println(n * n);
        if (n == 1) return 1;
        return dispSquares(n-1);
    } // method dispSquares. Τα εμφανίζει σε ανάποδη σειρά. Θέλει έλεγχο
    public static void main(String[] args) {
        System.out.println("Hello world!\nΘέματα OOP_E20-21A_K2.");
        // ΘΕΜΑ 1.1.i
        Bike[] bikes = {new Bike(), new TandemBike(), new TandemBike()}; // Σωστό
        //MountainBike[] bike2 = new RoadBike[3]; // Λάθος
        //RoadBike[] bike1 = {new RoadBike(), new TandemBike(), new Bike()}; // Λάθος
        Bike[] rb = new RoadBike[10]; // Σωστό
        // ΘΕΜΑ 1.1.ii
        // ΘΕΜΑ 2.2
        dispSquares(5);
    }
}