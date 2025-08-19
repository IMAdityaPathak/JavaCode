package gs;

import java.util.*;

public class LongestUniqueString {
    public static void main(String[] args) {
        String[] arr = {"ab", "cd", "a", "xyz"};
        String result = buildLongestUniqueString(arr);
        System.out.println("Longest unique string: " + result);
    }

    public static String buildLongestUniqueString(String[] arr) {
        Set<Character> usedChars = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (String str : arr) {
            boolean isUnique = true;
            for (char c : str.toCharArray()) {
                if (usedChars.contains(c)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                result.append(str);
                for (char c : str.toCharArray()) {
                    usedChars.add(c);
                }
            }
        }

        return result.toString();
    }
}
