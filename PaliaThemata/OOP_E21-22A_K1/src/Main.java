public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!\nΛύσεις θεμάτων OOP_E21-22A_K1");
        TestClass x = new TestClass(454);
        System.out.println(x.getNum());

        // Θέμα 1
        // 1.I
        System.out.println(x instanceof Object);
        // 1.II
        boolean b = false;
        System.out.println(b);

        // 2.I
/*
        Sedan[] c1 = {new Sedan(), new Sedan(), new Car()}; // ΛΑΘΟΣ
        Coupe[] cars = {new Car(), new Coupe(), new Sedan()}; // ΛΑΘΟΣ
        Car[] car1 = new Sedan[3]; // ΣΩΣΤΟ
        Suv[] c2 = {new Sedan(), new Suv(), new Coupe()}; // ΛΑΘΟΣ
        Car[] car2 = {new Sedan(), new Suv(), new Coupe()}; // ΣΩΣΤΟ

*/
/*
        Car car = new Car();
        Sedan sedan = new Sedan();
        Suv suv = new Suv();
        Coupe coupe = new Coupe();
        System.out.println("car: toString= " + car + ", getType= " + car.getType());
        System.out.println("sedna: toString= " + sedan + ", getType= " + sedan.getType());
        System.out.println("suv: toString= " + suv + ", getType= " + suv.getType());
        System.out.println("coupe: toString= " + coupe + ", getType= " + coupe.getType());
*/
        // 3
        int line = 1;
        try {
            Instrument m = new Instrument(); // 1
            line = 2;
            Strings str1 = new Strings(); // 2
            line = 3;
            Strings str2 = new Strings(); // 3
            line = 4;
            Wind w1 = new Wind(); // 4
            line = 5;
            //Wind w2 = new Strings(); // 5
            line = 6;
            str1 = (Strings) m; // 6
            line = 7;
            m = str1; // 7
            line = 8;
            //w1 = str1; // 8
            line = 9;
            //str2 = (Strings) w1; // 9
            line = 10;
            str2 = (Strings) m; // 10
            line = 11;
            w1 = (Wind) m; // 11
            line = 12;
            Wind w2 = w1;
        } catch (Exception e) {
            System.out.println("Εξαίρεση στη γραμμή: " + line + ": " + e);
        }
        int s = 0;
        A[][] a = new A[Constants.X][Constants.Y];
        for (int i  = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("i=" + i + " j=" + j + ", ");
                s++;
            }
            System.out.println();
        }
        System.out.println("Sum = " + s);
        System.out.println("******************************* Hotel *******************************");
        Hotel h = new Hotel();
        System.out.println("Hotel.dailyFullRentAmmoun: " +  h.dailyFullRentAmmoun());
        System.out.println("Hotel.totalRoomArea: " + h.totalRoomArea());
        System.out.println("Hotel.totalSuiteHallSpace: " + h.totalSuiteHallSpace());
    }
}