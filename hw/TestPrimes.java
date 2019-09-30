class TestPrimes {
    private static boolean isPrime (int x) {
        if (x <= 1)
        return false
        else 
        return !isDivisible(x,2); // ! means not
    }

    private static boolean isDivisible(int x, int k) {
        if (k >= x)
        return false;
        else if (x % k == 0)
        return true;
        else // if (k < x && x % k != 0)
        return isDivisible(x, k+1);
    }
}