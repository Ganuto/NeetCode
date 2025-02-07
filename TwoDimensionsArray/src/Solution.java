package TwoDimensionsArray.src;

import java.util.List;

class Solution {
    public int hourglassSum(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int topSum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
                int middleSum = arr.get(i + 1).get(j + 1);
                int bottomSum = arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                int totalSum = topSum + middleSum + bottomSum;
                if (maxSum < totalSum) {
                    maxSum = totalSum;
                }
            }
        }
        return maxSum;
    }
}

