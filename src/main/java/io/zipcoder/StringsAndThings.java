package io.zipcoder;


import java.util.Arrays;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        int yzCount = 0;
        String[] words = input.split(" ");
        for (int x = 0; x < words.length; x++) {
            char v = words[x].charAt(words[x].length()-1);
            v =  Character.toLowerCase(v);
            if (v == 'y' || v == 'z') {
                yzCount++;
            }
        }
        return yzCount;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
//        String x = base;
//        x = x.replace(remove, "");
//        return x;
        base = base.replace(remove, "");
        return base;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        int findIs = 0;
        int findNot = 0;
        for (int x = 0; x <= input.length()-1; x++) {
            if (x < input.length()-1 && input.charAt(x) == 'i' && input.charAt(x + 1) == 's')
            {findIs++;}
            if (x < input.length()-2 && input.charAt(x) == 'n' && input.charAt(x + 1) == 'o' && input.charAt(x + 2) == 't')
            {findNot++;}
        }
//        System.out.println("is: " + findIs + "  " + "not: " + findNot);

        if (findIs == findNot) {return true;}
        else return false;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        for (int x = 0; x <= input.length()-1; x++) {
            if (x < input.length()-1 && input.charAt(x) == 'g' && (input.charAt(x+1) == 'g'))
            {return true;}}
        return false;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int triple = 0;
        for (int x = 0; x <= input.length()-1; x++) {
            if (x < input.length()-2)
            if ((input.charAt(x) == input.charAt(x+1)) && (input.charAt(x) == input.charAt(x+2))) {triple++;}
        }
//        System.out.println(triple);
        return triple;
    }
}
