/**This program is the big latin example in the AJR. */
class biglatin {

    /**start from buttom */
    private static boolean isVowel (char x) {
        return ("aeiou").indexOf(x) >= 0; //this is the same as 
        // return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'
    }

    /**actual translation */
    // translation of w, a sinhle word
    static String toPig (String w) {
        return w.substring(consonants (w)) + w.substring(0, consonants(w)) + "ay";
        // here .substring selects a piece of string and + concatenates it.
        // here consonants() returns number of consonants in a word, inclusive, to be written
    }

    static int consonants (String w) {
        /*{return the number of consonants starting at w.}*/ 
        if (w.length() == 0) 
            return 0;
        else if (isVowel (w.charAt (0))) 
            return 0;
        else 
            return 1 + consonants (w.substring(1)); // gives number of consecutive vowels .
    }

}