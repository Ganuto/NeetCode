package twoPointers.ThreeSum.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int initPos = 0;
        int middlePos = 1;
        int endPos = nums.length - 1;
        while (initPos < nums.length) {
            if (nums[initPos] > 0) {
                break;
            }
            if (initPos > 0 && nums[initPos - 1] == nums[initPos]) {
                initPos++;
                middlePos = initPos + 1;
                endPos = nums.length - 1;
                continue;
            }
            while (middlePos < endPos) {
                int sum = nums[initPos] + nums[middlePos] + nums[endPos];
                if (sum > 0) {
                    endPos--;
                } else if (sum < 0) {
                    middlePos++;
                } else {
                    result.add(List.of(nums[initPos], nums[middlePos], nums[endPos]));
                    middlePos++;
                    endPos--;
                    while (middlePos < endPos && nums[middlePos] == nums[middlePos - 1]) {
                        middlePos++;
                    }
                }
            }
            initPos++;
            middlePos = initPos + 1;
            endPos = nums.length - 1;

        }
        return result.stream().toList();
    }
}

