package twoPointers.IsValidPalindrome.src;

class Solution {
    public boolean isPalindrome(String s) {
        String normalizedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int startPos = 0;
        int endPos = normalizedString.length() - 1;
        while (startPos < normalizedString.length()) {
            if (normalizedString.charAt(startPos) != normalizedString.charAt(endPos)) {
                return false;
            }
            startPos++;
            endPos--;
        }
        return true;
    }
}

