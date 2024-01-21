/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testinglab;

public class StringAnalyzer {

    /**
     * Constructs a string analyzer
     */
    public StringAnalyzer() {
    }

    /**
     * Gets the first repeated character.A character is "repeated" if it occurs
     * at least twice in adjacent positions. For example, 'l' is repeated in
     * "hollow", but 'o' is not.
     *
     * @param aString the string to be analyzed
     * @return the first repeated character, or 0 if none found
     */
    public char firstRepeatedCharacter(String aString) {

        assert aString != null;

        for (int i = 0; i < aString.length()-1; i++) {
            char ch = aString.charAt(i);
            if (ch == aString.charAt(i+1)) {
                return ch;
            }
        }
        return '0';
    }

    /**
     * Gets the first multiple occurring character. A character is "multiple" if
     * it occurs at least twice in the word, not necessarily in adjacent
     * positions. For example, both 'o' and 'l' are multiple in "hollow", but
     * 'h' is not and 'o' is the first multiple character.
     *
     * @param aString
     * @return the first repeated character, or 0 if none found
     */
    public char firstMultipleCharacter(String aString) {
        for (int i = 0; i < aString.length(); i++) {
            char ch = aString.charAt(i);
            if (find(aString, ch, i+1) > 0) {
                return ch;
            }
        }
        return '0';
    }

    private int find(String aString, char c, int pos) {
        for (int i = pos; i < aString.length(); i++) {
            if (aString.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Counts the groups of repeated characters.For example, "mississippi!!!"
     * has four such groups: ss, ss, pp and !!!.
     *
     * @param aString
     * @return the number of repeated character groups
     */
    public int countRepeatedCharacters(String aString) {
        int c = 0;
        aString = '0' + aString;
        for (int i = 1; i < aString.length()-1; i++) {
            if (aString.charAt(i) == aString.charAt(i+1)) // found a repetition
            {
                if (aString.charAt(i - 1) != aString.charAt(i)) // it's the start
                {
                    c++;
                }
            }
        }
        return c;
    }

}
