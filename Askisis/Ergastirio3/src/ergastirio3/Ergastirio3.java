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

static Boolean palindromos (String s) {
    if (s.length() == 0 || s.length() == 1)
        return true;
    if (s.charAt(0) == s.charAt(s.length()-1))
        return palindromos(s.substring(1, s.length()-1));
    return false;
}
static boolean protosArithmos(int start, int end) {
    System.out.print("_");
    if (start == end) {
        System.out.println(start + " = " + end);
        return true;
    }
    System.out.println(end + " % (" + start + ") = " + end % (start )); // Diorthosi edo
    if (end % (start) != 0) { // Diorthosi edo
        System.out.println(start + ",, " + end);
        return protosArithmos(2, start); // Diorthosi edo
    }
    return false;
}

public static void main(String[] args) {

    int nPar = 10;
    System.out.println(nPar + "!: " + nParagontiko(nPar) + "\n");
    int fibo = 10;
    System.out.println(fibo + " Fibonacci is: " + fibonacci(fibo) + "\n");
    String pal = "pasnsap";
    System.out.println(pal + " is palindromos: " + palindromos(pal) + "\n");
    pal = "pasnap";
    System.out.println(pal + " is palindromos: " + palindromos(pal) + "\n");
    System.out.println("Protoi arithmoi.");
    int prime = 20;
    int i = 4;
    for (i = 4; i < prime; i++)
        System.out.println("Protoi: " + i + " is protos: " + protosArithmos(i, prime) + "\n-----");
    }
}
