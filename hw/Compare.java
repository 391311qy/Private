class compare {
    public static void main (String[] args) {
        // A. all print true
        System.out.println(true);
        System.out.println(3 < 4);
        System.out.println(3 <= 4);System.out.println(3 <= 3);
        System.out.println(4 > 3);
        System.out.println(4 >= 3);System.out.println(3 >= 3);
        System.out.println(4 != 3);System.out.println(3 == 3);
        // B. all print false
        System.out.println(false);
        System.out.println(3 < 3);System.out.println(3 != 3);// not equal
        // C. all print true
        System.out.println(3 < 4 && 4 < 5);// and
        System.out.println(3 > 4 || 4 < 5);// or
        System.out.println(! (3 < 4 && 4 < 3));// ! means not
        // D. all print true
        System.out.println(3 < 4 || 1/0 ==0);
        System.out.println(! (3>4 && 1/0 ==0));
    }
}