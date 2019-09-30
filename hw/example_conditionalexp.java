class example_conditionalexp {
    public static void main (String[] arg) {
        System.out.println (3 < 4 ? "Less" : "More"); // Prints Less
        System.out.println (4 < 3 ? "Less" : "More"); // Prints More
        // The next two mean the same, and print 3.1
        System.out.println (1 < 0 ? 1.1 : 1 > 2 ? 2.1 : 3.1);
        System.out.println (1 < 0 ? 1.1 : (1 > 2 ? 2.1 : 3.1));
    }
}

/**The expression C ? Et : Ef yields either the value of Et or Ef , depending on
* whether C evaluates to true or false. That is, ? means roughly 'then' and ':'
* means 'otherwise', with an invisible 'if' in front. This peculiar-looking ternary
* operator is not commonly used in C, C++, or Java, perhaps because it, well, looks
* peculiar. It is only your author's desire for balance that prompts its inclusion here. 

* The expressions after '?' and ':' must be the same type of thing; 3<4 ? 1 : 'Hello'
* is erroneous
*/