public class Main {
    static int findMax(int m[]) {
        int max_pos = 0, max = m[max_pos];
        for (int i = 1; i < m.length; i++) {
            if (m[i] > max) {
                max = m[i];
                max_pos = i;
            }
        }
        return max_pos;
    }

    static double findAvg(int m[]) {
        int sum = 0;
        double avg;
        for (int i = 0; i < m.length; i++)
            sum = sum + m[i];
        avg = (double) sum / m.length;
        return avg;
    }
    static void display(int m[]) {
        for (int i = 0; i < m.length; i++)
            System.out.print(m[i] + "  ");
    }
    static void swap(int m[], int i, int j) {
        int temp;
        temp = m[i];
        m[i] = m[j];
        m[j] = temp;
    }
    public static void main(String[] args) {
        int n, i;
        System.out.print("Dose to megethos tou pinaka: ");
        n = UserInput.getInteger();
        int[] pin = new int[n];

        for (i = 0; i < n; i++) {
            System.out.print("Dose tin tis thesis " + i + " tou pinaka: ");
            pin[i] = UserInput.getInteger();
        }
        // Gia dokimastikous logous mporoun na xrisimopoiithoun oi parakto grammes
//        int n = 5;
//        int[] pin = {5, 7, 2, 1, 8};
        System.out.println("Max position is : " + findMax(pin));
        System.out.println("Average is : " + findAvg(pin));
        System.out.println("Display array.");
        display(pin);
//        System.out.println("\n");
        System.out.println("\nSwap array values.");
        swap(pin, 1, 3);
        System.out.println("Display array.");
        display(pin);
    }
}