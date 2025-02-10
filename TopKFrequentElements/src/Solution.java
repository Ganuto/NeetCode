package TopKFrequentElements.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    // Best solution
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<List<Integer>> arr = new ArrayList<>();
        map.forEach((key, value) -> {
            arr.add(List.of(value, key));
        });
        arr.sort((a, b) -> b.get(0) - a.get(0));
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr.get(i).get(1);
        }
        return result;
    }
}


