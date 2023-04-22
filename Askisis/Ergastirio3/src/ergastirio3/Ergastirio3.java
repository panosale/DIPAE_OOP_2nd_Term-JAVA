package ergastirio3;

public class Ergastirio3 {

static int nParagontiko(int n) {
   if (n <= 1)
       return 1;
   else
       return n * (nParagontiko(n -1)); 
}

static int fibonacci(int f) {
    if (f == 0)
        return 0;
   if (f == 1 || f == 2)
       return 1;
   else
       return fibonacci(f - 1) + fibonacci(f - 2);
}
static int isReversed = 0; // Xrisi global metavlitis gia tin evresi tou palindromou Integer. Prepei na arxikopoieitai kathe fora prin tin klisi tis methodou.
static int palindromosArithmos(int n) {
    if (n > 0) {
        int tmp = n % 10;
        isReversed = isReversed * 10 + tmp;
        palindromosArithmos(n / 10);
    }
    return isReversed;
}
static Boolean palindromoString(String s) {
    if (s.length() == 0 || s.length() == 1)
        return true;
    if (s.charAt(0) == s.charAt(s.length()-1))
        return palindromoString(s.substring(1, s.length()-1));
    return false;
}
static boolean protosArithmos(int start, int end) {
    System.out.println("_ " + start + " - " + end);
    if (start % 2 == 0 && start > 2) {// || start % 3 == 0 || start % 5 == 0 ) {
        return false;
    }
    if (start == end) {
        System.out.println(start + " = " + end);
        return true;
    }
//    System.out.println(end + " % (" + start + "+1) = " + end % (start +1)); // Diorthosi edo
    if (end % (start) != 0) { // Diorthosi edo
//        System.out.println(start + ",, " + end);
        return protosArithmos(1, end - 1); // Diorthosi edo
    }
    return true;
}

public static void main(String[] args) {

    int nPar = 10;
    System.out.println(nPar + "!: " + nParagontiko(nPar) + "\n");
    int fibo = 10;
    System.out.println(fibo + " Fibonacci is: " + fibonacci(fibo) + "\n");
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
    String palStr = "anna";
    System.out.println(palStr + " einai palindromo: " + palindromoString(palStr) + "\n");
    palStr = "Anna";
    System.out.println(palStr + " einai palindromo: " + palindromoString(palStr) + "\n");
//    System.out.println("Protoi arithmoi.");
//    int prime = 21;
//    int i;
//    for (i = 1; i <= prime; i++)
//        if (protosArithmos(i, prime))
//            System.out.println("To " + i + " einai protos arithmos.\n");
//        System.out.println("Protoi: " + i + " is protos: " + protosArithmos(i, prime));// + "\n-----");
    }
}
