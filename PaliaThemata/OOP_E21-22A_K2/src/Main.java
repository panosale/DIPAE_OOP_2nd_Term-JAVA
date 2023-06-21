import java.util.Random;

public class Main {
    // ΘΕΜΑ 1.3
    public static void newLine(String s) {
        System.out.println(s);
    }
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
    public static void bubbleSort(int[] pin) {
        int temp;
        boolean sorted;
        for (int i = 1; i < pin.length; i++) {
            sorted = true;
            for (int j = 0; j < pin.length - i; j++) {
                if (pin[j] > pin[j + 1]) {
                    temp = pin[j];
                    pin[j] = pin[j + 1];
                    pin[j + 1] = temp;
                    sorted = false;
                }
                System.out.println("After pass no" + i + ", ");
                showPin(pin);
            }
            if (sorted) return;
        }
    }
    public static void insertionSort(int[] pin) {
        for (int i = 1; i < pin.length; i++) {
            int current = pin[i];
            int position = i;
            while (position > 0 && pin[position - 1] > current) {
                pin[position] = pin[position - 1];
                position--;
            }
            pin[position] = current;
            System.out.println("After pass no" + i + ", current was: " + current);
            showPin(pin);
        }
    }
    public static void mergeSort(int[] pin) {
        mSort(pin, 0, pin.length - 1);
    } // method mergeSort form mergeSort
    public static void mSort(int[] pin, int f, int l) {
        if (f == l) return;
        int mid = (f + l) / 2; // Διαίρεση στη μέση
        mSort(pin, f, mid);
        mSort(pin, mid + 1, l);
        merge(pin, f, l, mid);
    } // method mSort from mergeSort
    public static void merge(int[] pin, int f, int l, int mid) {
        int n = l - f + 1; // Συνολικό μέγεθος για συγχώνευση
        int[] b = new int[n]; // Προσωρινός πίνακας b
        int i1 = f, i2 = mid + 1;
        int j = 0; // Επόμενη ελεύθερη θέση στον πίνακα b
        // Συγχώνευση των 2 μισών πινάκων στον προσωρινό πίνακα b
        while (i1 <= mid && i2 <= l) {
            if (pin[i1] < pin[i2]) {
                b[j] = pin[i1];
                i1++;
            }
            else {
                b[j] = pin[i2];
                i2++;
            }
            j++;
        }
        // Αντιγραφή των υπόλοιπων στοιχείων του πρώτου μισού πίνακα
        while (i1 <= mid) {
            b[j] = pin[i1];
            i1++;
            j++;
        }
        // Αντιγραφή των υπόλοιπων στοιχείων του δεύτερου μισού πίνακα
        while (i2 <= l) {
            b[j] = pin[i2];
            i2++;
            j++;
        }
        // Αντιγραφή στον αρχικό πίνακα των στοιχείων του προσωρινού
        newLine("Προσωρινός πίνακας b: ");
        showPin(b);
        newLine("Τέλος προσωρινού πίνακα b: ");
        for (j = 0; j < n; j++)
            pin[f + j] = b[j];
/*
        newLine("");
        showPin(b);
        newLine("");
*/
    } // method merge from mergeSort
    public static void showPin(int[] pin) {
        for (int i = 0; i < pin.length; i++)
            System.out.println("pin[" + i + "]: " + pin[i]);
    } // method showPin
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
/*
        System.out.println("ΘΕΜΑ 1.3 (f): ");
        System.out.println(f(4));
*/
//        System.out.println("ΘΕΜΑ 1.3 (m): " + m(4));
/*
        // ΘΕΜΑ 2.1
        System.out.println("ΘΕΜΑ 2.1 (bubbleSort): ");
        int[] pinakas1 = {15, 11, 7, 2, 19, 13, 12};
        System.out.println("Before bubbleSort: ");
        showPin(pinakas1);
        bubbleSort(pinakas1);
        System.out.println("\nAfter bubbleSort: ");
        showPin(pinakas1);

        System.out.println("\n\nΘΕΜΑ 2.1 (insertionSort): ");
        int[] pinakas2 = {15, 11, 7, 2, 19, 13, 12};
        System.out.println("Before insertionSort: ");
        showPin(pinakas2);
        System.out.println("...");
        insertionSort(pinakas2);
        System.out.println("\nAfter insertionSort: ");
        showPin(pinakas2);

        System.out.println("\n\nΘΕΜΑ 2.1 (mergeSort): ");
        int[] pinakas3 = {15, 11, 7, 2, 19, 13, 12};
        System.out.println("Before mergeSort: ");
        showPin(pinakas3);
        mergeSort(pinakas3);
        System.out.println("After mergeSort: ");
        showPin(pinakas3);
*/
        // ΘΕΜΑ 2.2
/*
        System.out.println("ΘΕΜΑ 2.2: ");
        int[] pin = {1, 2, 3, 4, 5, 6, 7, 8};
        incArray(pin, 3, 5);
        System.out.println();
        for (int i = 0; i < pin.length; i++)
            System.out.println(pin[i]);
*/
        // ΘΕΜΑ 3
        long r;
        for (int i = 0; i < 25; i++) {
            r = Math.round(Math.random() * 3);
            System.out.println(r);
        }
    }
}