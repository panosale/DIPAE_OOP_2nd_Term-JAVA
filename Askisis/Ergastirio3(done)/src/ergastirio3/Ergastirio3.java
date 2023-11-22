package ergastirio3;
public class Ergastirio3 {
// Ypologismos n paragotnikou
static int nParagontiko(int n) {
   if (n <= 1)
       return 1;
   else
       return n * (nParagontiko(n -1)); 
}
// Ypologismos akolouthias Fibonacci
static int fibonacci(int f) {
    if (f == 0)
        return 0;
   if (f == 1 || f == 2)
       return 1;
   else
       return fibonacci(f - 1) + fibonacci(f - 2);
}
// Ypologismos palindromou Integer
static int isReversed = 0; // Xrisi global metavlitis gia tin evresi tou palindromou Integer. Prepei na arxikopoieitai kathe fora prin tin klisi tis methodou.
static int palindromosArithmos(int n) {
    if (n > 0) {
        int tmp = n % 10;
        isReversed = isReversed * 10 + tmp;
        palindromosArithmos(n / 10);
    }
    return isReversed;
}
// Ypologismos palindromou String
static Boolean palindromoString(String s) {
    if (s.length() == 0 || s.length() == 1)
        return true;
    if (s.charAt(0) == s.charAt(s.length()-1))
        return palindromoString(s.substring(1, s.length()-1));
    return false;
}
static boolean protosArithmos(int n, int d) {
    if (d <= 1)
        return true;
    if (n % d == 0)
        return false;
    return protosArithmos(n, d - 1);
}
public static void main(String[] args) {
    // Ypologismos n paragotnikou
    System.out.println("***** Ypologismos n paragotnikou *****");
    int nPar = 10;
    System.out.println(nPar + "!: " + nParagontiko(nPar));
    // Ypologismos akolouthias Fibonacci
    System.out.println("\n***** Ypologismos akolouthias Fibonacci *****");
    int fibo = 10;
    System.out.println(fibo + " Fibonacci is: " + fibonacci(fibo));
    // Ypologismos palindromou Integer
    System.out.println("\n***** Ypologismos  palindromou Integer *****");
    int palInt1 = 87362;
    isReversed = 0; // Arxikopoiisi tis global metavlitis prin ti xrisi tiw methodou gia tin evresi tou palindromou Integer
    if (palInt1 == palindromosArithmos(palInt1))
        System.out.println("O "+ palInt1 + " einai Palindromos.");
    else
        System.out.println("O "+ palInt1 + " den einai Palindromos.");
    int palInt2 = 87378;
    isReversed = 0; // Arxikopoiisi tis global metavlitis prin ti xrisi tiw methodou gia tin evresi tou palindromou Integer
    if (palInt2 == palindromosArithmos(palInt2))
        System.out.println("O "+ palInt2 + " einai Palindromos.");
    else
        System.out.println("O "+ palInt2 + " den einai Palindromos.");
    // Ypologismos palindromou String
    System.out.println("\n***** Ypologismos  palindromou String *****");
    String palStr = "anna";
    System.out.println(palStr + " einai palindromo: " + palindromoString(palStr));
    palStr = "Anna";
    System.out.println(palStr + " einai palindromo: " + palindromoString(palStr));
    System.out.println("\n***** Emfanisi proton arithmon *****");
    int primeTo = 10000;
    int i, j = 0;
    System.out.println("Apo to " + 1 + " eos to " + primeTo + " oi parakato arithmoi einai Protoi:");
    for (i = 1; i <= primeTo; i++)
        if (protosArithmos(i, i - 1)) {
            System.out.print(i + ", ");
            if (j == 40) { // Gia emfanisi se grammes ton 40 arithmon
                System.out.println();
                j = 0;
            }
            else
                j++;
        }
    }
}
