package ContainsDuplicate.src;

import java.util.HashSet;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> existent = new HashSet<>();
        for (int num : nums) {
            if (existent.contains(num)) { // It could be changed to if(!existent.add(num))
                return true;
            } else {
                existent.add(num);
            }
        }
        return false;
    }
}

