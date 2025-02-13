package arraysAndHashing.AnagramGroups.src;

import java.util.*;

class Solution {
//    First Submission (brute force)
//    public List<List<String>> groupAnagrams(String[] strs) {
//        List<List<String>> result = new ArrayList<>();
//        for (int i = 0; i < strs.length; i++) {
//            List<String> similarWords = new ArrayList<>();
//            if (strs[i] != null) {
//                similarWords.add(strs[i]);
//                for (int j = i + 1; j < strs.length; j++) {
//                    if (strs[j] != null && strs[i].length() == strs[j].length()) {
//                        char[] strsI = strs[i].toCharArray();
//                        char[] strsJ = strs[j].toCharArray();
//                        Arrays.sort(strsI);
//                        Arrays.sort(strsJ);
//                        if (Arrays.equals(strsI, strsJ)) {
//                            similarWords.add(strs[j]);
//                            strs[j] = null;
//                        }
//                    }
//                }
//            }
//            if (!similarWords.isEmpty()) {
//                result.add(similarWords);
//            }
//        }
//        return result;
//    }

    // Optimal solution
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }

}

