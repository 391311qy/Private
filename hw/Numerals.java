public class Numerals {
public static void main (String[] args) {
        // A. all print 42
        System.out.println(42);  //Base 10
        System.out.println(052); //Base 8(starts with 0)
        System.out.println(0x2a); //Base 16 (a=10,b=11,...f=16)
        // B. all print 31.45 which is a floating point
        System.out.println(31.45);
        System.out.println(3.145e1); // en or En means x10^n
        System.out.println(3145e-2);
        // C. Prints 12345678901
        System.out.println(12345678901L);
}
}