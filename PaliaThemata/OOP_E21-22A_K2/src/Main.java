public class Main {
    // ΘΕΜΑ 1.3
    public static int f(int n) {
        if (n == 0) return 1;
        int num = n - m(f(n - 1));
        System.out.print("f(" + n + "): " + num + ",, ");
        return num;
    }
    public static int m(int n) {
        if (n == 0) return 0;
        int num = n - f(m(n - 1));
        System.out.print("m(" + n + "): " + num + "\n");
        return  num;
    }
    // ΘΕΜΑ 2.2
    public static int incArray(int[] pin, int pos, int offset) {
        //System.out.print(", pos: " + pos + ", ");
        if (pos == pin.length -1) {
            System.out.println("last pos: " + pos);
            return pin[pos] + offset;
        }
        else {
            //System.out.println("pos+1: " + (pos + 1) + ", offset: " + offset + ", ");
            pin[pos] = pin[pos] + offset;
            return incArray(pin, pos + 1, offset);
            //return pin[pos];// + offset;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!\nΠροσπάθεια λύσεων θεμάτων OOP_E21-22A_K2");
        // ΘΕΜΑ 1.1.IV
        TestWithStatic.testStatic();
        TestWithStatic tstStc = new TestWithStatic();
        tstStc.testNoStatic();
        tstStc.testStatic(); // Δεν χρειάζεται
        // ΘΕΜΑ 1.2.I
        //Strings[] ins2 = new Instrument[4]; // Λάθος
        //Strings str = {new Strings(), new Strings(), new Instrument()}; // Λάθος
        Instrument[] ins = {new Keyboards(), new Wind(), new Keyboards()}; // Σωστό
        Keyboards[] ins1 = new Keyboards[3];  // Σωστό
        // Wind[] com = {new Wind(), new Strings(), new Keyboards()}; // Λάθος
        // ΘΕΜΑ 1.3
        System.out.println("ΘΕΜΑ 1.3 (f): ");
        System.out.println(f(9));
//        System.out.println("ΘΕΜΑ 1.3 (m): " + m(4));
        // ΘΕΜΑ 2.2
        System.out.println("ΘΕΜΑ 2.2: ");
        int[] pin = {1, 2, 3, 4, 5, 6, 7, 8};
        incArray(pin, 3, 5);
        System.out.println();
        for (int i = 0; i < pin.length; i++)
            System.out.println(pin[i]);
    }
}