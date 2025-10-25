/*

Implement an algorithm to determine if a string has all unique characters.
What if you cannot use additional data structures

 */

import java.util.*;

public class isUnique {
    public static void main(String[] args) {

        String[] exampleStrings = {
                "easadacadsda",
                "asdfghjkl",
                "skdjbfaksdbfklash",
                ""
        };
        // should an empty array return true?

        for (String example : exampleStrings) {
            System.out.println(isUnique(example));
        }

    }

    public static boolean isUnique(String str) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (char c: str.toCharArray()) {
            // the moment it is determined that a dupe is found, return false
            if (frequency.containsKey(c)) {
                return false;
            }
            // if the word isn't in frequency then add it
            else {
                frequency.put(c,1);
            }
        }
        return true;
    }
}