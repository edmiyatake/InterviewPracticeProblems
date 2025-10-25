/*
    Given two strings, write a method to decide is one is a permutation of the other
 */
import java.util.*;

public class CheckPermutation {
    public static void main(String[] args) {
        String x = "yxz";
        String y = "xyz";

        // perm(x,y) should return true
        System.out.println(perm(x,y));
    }

    public static boolean perm(String x,String y){
        // use a HashMap to compare frequencies
        // first check is same length
        if (x.length()!=y.length()) {
            return false;
        }
        HashMap<Character,Integer> freqX = new HashMap<>();
        for (char letter : x.toCharArray()) {
            freqX.put(letter, freqX.getOrDefault(letter, 0) + 1);
        }
        HashMap<Character,Integer> freqY = new HashMap<>();
        for (char letter : y.toCharArray()) {
            freqY.put(letter, freqY.getOrDefault(letter, 0) + 1);
        }
        System.out.println(freqX);
        System.out.println(freqY);
        return freqX.equals(freqY);


    }


}
