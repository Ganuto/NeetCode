package arraysAndHashing.TopKFrequentElements.src;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.topKFrequent(new int[]{1, 2, 2, 3, 3, 3}, 2);
        System.out.println(Arrays.toString(result));
    }
}
