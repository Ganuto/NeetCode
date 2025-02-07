package ValidAnagram.src;

import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] firstStringArray = s.toCharArray();
        char[] secondStringArray = t.toCharArray();
        Arrays.sort(firstStringArray);
        Arrays.sort(secondStringArray);
        int sameChars = 0;
        for (int i = 0; i < firstStringArray.length; i++) {
            if (firstStringArray[i] == secondStringArray[i]) {
                sameChars++;
            }
        }
        return sameChars == firstStringArray.length;
    }
}

