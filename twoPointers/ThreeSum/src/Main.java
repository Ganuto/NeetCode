package twoPointers.ThreeSum.src;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> result = solution.threeSum(new int[]{-1,0,1,2,-1,-4,-2,-3,3,0,4});
        System.out.println(result);
    }
}
