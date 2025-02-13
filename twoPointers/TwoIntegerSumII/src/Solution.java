package twoPointers.TwoIntegerSumII.src;

class Solution {

//    // Brute force first attempt
//    public int[] twoSum(int[] numbers, int target) {
//        int[] result = new int[2];
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 1; j < numbers.length; j++) {
//                System.out.println(numbers[i] + " + " + numbers[j]);
//                if ((numbers[i] != numbers[j]) && (numbers[i] + numbers[j] == target)) {
//                    System.out.println("enter");
//                    result[0] = i + 1;
//                    result[1] = j + 1;
//                    return result;
//                }
//            }
//        }
//        return result;
//    }
    // Best solution
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int initPos = 0;
        int endPos = numbers.length - 1;
        while (initPos < numbers.length) {
            int sum = numbers[initPos] + numbers[endPos];
            if (sum > target) {
                endPos--;
            } else if (sum < target) {
                initPos++;
            } else {
                result[0] = initPos + 1;
                result[1] = endPos + 1;
                break;
            }
        }
        return result;
    }
}

