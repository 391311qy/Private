public class Testjavastring {
    public static void main(String[] args) {
        System.out.println("Simple string.");
        System.out.println("");
        System.out.println("Saay \"Hello.\"");// \"......\" is a double quote
        System.out.println("Name:\tJohn");// \t is a tab
        System.out.println("\\FOO\\BAR");
        System.out.println("One thing\nThe other thing"); //change lane

        System.out.println("The value of "+
                           " 17+25 is"+(17+25)+"."); // + serves as the concatenate
        /*You might well protest at this point that (17+25) yields an integer, not a string.
    This is correct; conveniently, though, the + operator is smart enough that when one
    of its operands is a string, and the other isn’t, it converts the other operand to a
    string. In fact, underneath the hood, the println method ultimately prints strings,
    and the variations that work on other types first perform this same conversion.
    */
    System.out.println(("19-character string").length()); // length of a string
    System.out.println(("abcd").charAt(3)); // get a character (number from 0)
    System.out.println(("abcd").equals("abcd"));
    System.out.println(("Hello, world!").substring(7,12));//'world'
    System.out.println(("Hello, world!").substring (7));
    /*The .equals method here is interesting. You might think that == would work, but
    for reasons we’ll see later, that is not a reliable way to compare strings.*/
    }
}