package ergastirio3;

public class Ergastirio3 {

static int nParagontiko(int n) {
   if (n <= 1)
       return 1;
   else
       return n * (nParagontiko(n -1)); 
}

static int fibonacci(int f) {
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
    if (end % 2 ==0)
        end--;
    if (start % 2 == 0)
        return protosArithmos(start + 1, end);
    if (end % start == 0)
        return protosArithmos(start +1, end);
    else {
        System.out.println("start: " + start + ", end: " + end);
        return protosArithmos(1, start + 1);
    }
}

public static void main(String[] args) {
        int nPar = 4;
        System.out.println(nPar + "!: " + nParagontiko(nPar));
        int fibo = 4;
        System.out.println(fibo + " Fibonacci is: " + fibonacci(fibo));
        String pal = "pasnap";
        System.out.println(pal + " is palindromos: " + palindromos(pal));
        System.out.println("Protoi arithmoi.");
        //protoiNoRecursion(16);
        System.out.println("Protoi: " + protosArithmos(1, 19));
    }
}
