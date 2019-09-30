class Arithmetic { //记得这里的名字一定要和文件名一样
    public static void main (String[] args) {
        // A. Prints 3
        System.out.println((3+7+10)*(1000-8)/992-17);
        // B. Prints 2.716666666666663
        System.out.println(2.0+1.0/2+1.0/6+1.0/24+1.0/120);
        // C. Prints 2
        System.out.println(2+1/2+1/6+1/24+1/120);
        // D. Prints -3
        System.out.println(1-2-2);
        // E. Prints 17
        System.out.println(117 % 20);
        // F. Prints Infinity
        System.out.println(1.0/0.0);
        // G. Prints -2147483648
        System.out.println(2147483647 + 1);
        // H. Prints NaN
        System.out.println(0.0/0.0);
        // I. Halrs the program with an exception
        System.out.println(1/0);

}}

/*• Operators have precedences. Example B illustrates grouping: the subexpression
2.0 + 1.0/2 is interpreted as 2.0+(1.0/2), not (2.0+1.0)/2, because
the division operator groups more tightly (or has higher precedence than) the
addition operator. Example A uses parentheses to control grouping.

• Operators associate. Example D illustrates grouping when the operators
have the same precedence. It is interpreted as (1 − 2) − 2, not 1 − (2 − 2),
because subtraction (like most operators) associates left (or groups left) with
operators of the same precedence.

• Integer quantities and floating-point quantities are distinct. In mathematics,
the quantity written ‘1’ can be interpreted as either an integer or a
real number, and the expression 1/2 always means the same as 0.5. In Java (as
in most programming languages), a number written without a decimal point
(an integral quantity) is of a different type from one written with a decimal
point (a floating-point quantity), and the rules of arithmetic differ markedly.
Division of two integers throws away the fractional part of the answer to yield
an integer, whereas division of floating-point numbers behaves more like regular
mathematics. Thus 1/2 yields 0, while 1.0/2.0 yields 0.5. When the two
types are mixed, Java first converts the integer quantities to floating point.

• Floating-point arithmetic approximates real arithmetic. If you work
out the mathematical value you’d normally expect from example B, you’ll
see it differs slightly from the one printed, which appears to be off by about
3.7×10−16. Floating-point arithmetic is a compromise between computational
speed and mathematical truth. The results of each operation are computed,
correctly rounded, to a certain number of binary digits (in this case, 52).

• Arithmetic has limited range. Example G illustrates that when an integer
value becomes too large, the result “wraps around” to the smallest number.
There are special values (which print as Infinity and -Infinity to represent
numbers that are too large in floating point, which are also used when non-zero
floating-point numbers are divided by 0 (Example F).

• Arithmetic nonsense has predictable effects. Example H shows that a
floating-point operation with an undefined value (there’s no sensible definition
one can give to 0.0/0.0) yields a strange special value called NaN (for “Not A
Number”). The analogous integer operation causes an error (what Java calls
an exception), since for various reasons, there is no available integer to use as
NaN.
*/