class Primes {
    /** print all primes till ARGS[0], interped as an integer, 10 to a line */
    //basically input.
    public static void main (String[] args) {
        printPrimes (Integer.parseInt(args[0]));
    }// run the "program" print primes(#), which is to be written

    /** Print all primes up to an including LIMIT, 10 to a line */
    private static void printPrimes(int limit) {
        /* For every intege, x, between 2 and LIMIT, promnt it if isPrime(x), 10 to a line */
        printPrimes(2,limit,0);// this jumps to the next method.
        System.out.println();
    }

/**This illustrates a small point I hadn’t previously mentioned: it’s perfectly legal to
have several methods with the same name, as long as the number and types of the
arguments distinguish which you intend to call. We say that the name printPrimes
here is overloaded. */

    /** Print all primes from L to U, inclusive, 10 to a line, given 
    that there are initially M primes printed on the current 
    line. */
    private static void printPrimes (int L, int U, int M) {
        if (L <= U) {
            if (! isPrime(L))// which is to be written.
                printPrimes(L+1, U, M);// if L is not prime, do nothing and rerun the func.
            else if ( M != 10) {// in this case L is prime.
                System.out.print (L + " "); //here use out.print because it does not terminates
                printPrimes (L+1, U, M+1);// rerun this func. (recursion)
            } else {// in this case L>U
                System.out.println ();// end of line
                System.out.print (L + " ");// start next
                printPrimes (L+1, U, 1);
            }
        }
    }

    /** true iff X is a prime number */
    private static boolean isPrime (int x) {
        if (x <= 1)
            return false;// when x is smaller or equal to 1, not a prime number.
        else 
            return !isDivisible(x,2); // to be written.
    }

    private static boolean isDivisible(int x, int k) {
        if (k >= x)
            return false;
        else if (x % k == 0)
            return true;
        else // if (k < x && x % k != 0)
            return isDivisible(x, k+1);

    // here the is divisible is a reccursive construct
    }
}