/* Sample Program #1 */
public class Hello {
public static void main (String[] arguments) {
System.out.println ("Hello, world!"); // Message + newline
}
}

//Compile the file with a Java compiler. A compiler is a translation program
//that converts a source program (our little sample program is a source program)
//into some form that is more easily executed. Java compilers typically translate
//each class into a class file. For example, if we use Sun Microsystems’s software,
//the command line
//javac Hello.java
//will translate class Hello into the file Hello.class.
//• Execute the program by invoking a Java interpreter. An interpreter is a
//program that executes programs. In the case of Sun’s software, the command
//java Hello
//runs our program, producing the output line
//Hello, world!