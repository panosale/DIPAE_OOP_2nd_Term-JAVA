package ergastirio3;

public class Ergastirio3 {

public static int nParagontiko(int n) {
   if (n <= 1)
       return 1;
   else
       return n * (nParagontiko(n -1));
}

public static int fibonacci(int f) {
    if (f == 0)
        return 0;
   if (f == 1 || f == 2)
       return 1;
   else
       return fibonacci(f - 1) + fibonacci(f - 2);
}
public static int palindromosArithmos(int n) {
    int tmp_reverse = 0;
    int reverse = 1;
    if (n < 10)
        return n;
    // reverse = (reverse * 10) + (n % 10);
    reverse = tmp_reverse;
    tmp_reverse = palindromosArithmos((n / 10));// ((reverse * 10) + (n % 10)) + palindromosArithmos((n / 10));
    System.out.println(n);
        //System.out.print(n % 10);
    return tmp_reverse * reverse;
}
    public static void showReversedNumber(int n) {
        if (n < 10)
            System.out.println(n);
        else {
            System.out.print(n % 10 + " ");
            showReversedNumber(n / 10);
        }
    }

public static Boolean palindromoString(String s) {
    if (s.length() == 0 || s.length() == 1)
        return true;
    if (s.charAt(0) == s.charAt(s.length()-1))
        return palindromoString(s.substring(1, s.length()-1));
    return false;
}
public static boolean protosArithmos(int start, int end) {
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
    int n = 3223;
    showReversedNumber(n);
    if (n == palindromosArithmos(n))
        System.out.println("O " + n + " einai palindromos (" + palindromosArithmos(n) + ").");
    else
        System.out.println("O " + n + " den einai palindromos (" + palindromosArithmos(n) + ").");
    String pal = "pasnsap";
    System.out.println("To " + pal + " einai palindromo: " + palindromoString(pal) + "\n");
    pal = "pasnap";
    System.out.println("To " + pal + " einai palindromo: " + palindromoString(pal) + "\n");
    System.out.println("Protoi arithmoi.");
    int prime = 21;
    int i;
//    for (i = 1; i <= prime; i++)
//        if (protosArithmos(i, prime))
//            System.out.println("To " + i + " einai protos arithmos.\n");
//        System.out.println("Protoi: " + i + " is protos: " + protosArithmos(i, prime));// + "\n-----");
    }
}
