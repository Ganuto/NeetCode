package arraysAndHashing.StringEncodeAndDecode.src;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final String LOOKUP = "0123456789#";

    public String encode(List<String> strs) {
        String encodedString = "";
        for (String str : strs) {
            encodedString += str.length() + "#" + str;
        }
        return encodedString;
    }

//    // First successful attempt
//    public List<String> decode(String str) {
//        char[] chars = str.toCharArray();
//        List<String> decodedString = new ArrayList<>();
//        List<String> stringList = new ArrayList<>(chars.length);
//        for (char c : chars) {
//            stringList.add(String.valueOf(c));
//        }
//        String wordSize = "";
//        while (!stringList.isEmpty()) {
//            if (!Objects.equals(stringList.get(0), "#")) {
//                wordSize += stringList.remove(0);
//            } else {
//                int size = Integer.parseInt(wordSize);
//                stringList.remove("#");
//                String word = "";
//                for (int j = 0; j < size; j++) {
//                    word += stringList.remove(0);
//                }
//                wordSize = "";
//                decodedString.add(word);
//            }
//        }
//        return decodedString;
//    }

    // Fastest algo
    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j += 1;
            }
            int length = Integer.parseInt(str.substring(i, j));
            result.add(str.substring(j + 1, j + 1 + length));
            i = j + 1 + length;
        }
        return null;
    }

}


