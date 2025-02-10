package StringEncodeAndDecode.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Solution {
    private static final String LOOKUP = "0123456789#";

    public String encode(List<String> strs) {
        String encodedString = "";
        for (String str : strs) {
            encodedString += str.length() + "#" + str;
        }
        return encodedString;
    }

    // First successful attempt
    public List<String> decode(String str) {
        char[] chars = str.toCharArray();
        List<String> decodedString = new ArrayList<>();
        List<String> stringList = new ArrayList<>(chars.length);
        for (char c : chars) {
            stringList.add(String.valueOf(c));
        }
        String wordSize = "";
        while (!stringList.isEmpty()) {
            if (!Objects.equals(stringList.get(0), "#")) {
                wordSize += stringList.remove(0);
            } else {
                int size = Integer.parseInt(wordSize);
                stringList.remove("#");
                String word = "";
                for (int j = 0; j < size; j++) {
                    word += stringList.remove(0);
                }
                wordSize = "";
                decodedString.add(word);
            }
        }
        return decodedString;
    }

}


