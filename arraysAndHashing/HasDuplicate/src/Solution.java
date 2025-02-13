package arraysAndHashing.HasDuplicate.src;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> noDuplicateList = new ArrayList<>();
        for (int num : nums) {
            if (noDuplicateList.contains(num)) {
                return true;
            }
            noDuplicateList.add(num);
        }
        return false;
    }
}

