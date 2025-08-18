package gs;

import java.util.*;
//Write a Java program to form the longest uniqe string without duplicate chars from string arr:
//ex: {"ab","cd","a","xyz"}, output is : abcdxyz
public class LongestUniqueStringSimple {
    public static void main(String[] args) {
        String[] arr = {"ab", "cd", "a", "xyz"};
        String result = "";

        Set<Character> usedChars = new HashSet<>();

        for (String str : arr) {
            if (canAdd(str, usedChars)) {
                result += str;
                for (char c : str.toCharArray()) {
                    usedChars.add(c);
                }
            }
        }

        System.out.println("Longest unique string: " + result);
    }

    // Helper method to check if a string can be added without duplicates
    private static boolean canAdd(String str, Set<Character> usedChars) {
        for (char c : str.toCharArray()) {
            if (usedChars.contains(c)) {
                return false;
            }
        }
        return true;
    }
}
