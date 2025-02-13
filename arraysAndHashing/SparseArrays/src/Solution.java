package arraysAndHashing.SparseArrays.src;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String string : stringList) {
            map.put(string, map.getOrDefault(string, 0) + 1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (String query : queries) {
            result.add(map.getOrDefault(query, 0));
        }
        return result;
    }

}


