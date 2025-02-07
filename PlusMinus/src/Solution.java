package PlusMinus.src;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

class Solution {
    public void plusMinus(List<Integer> arr) {
        double positive = 0;
        double negative = 0;
        double neutral = 0;
        for (Integer value : arr) {
            if (value > 0) {
                positive++;
            } else if (value < 0) {
                negative++;
            } else {
                neutral++;
            }
        }
        System.out.println(new BigDecimal(positive / arr.size()).setScale(6, RoundingMode.HALF_EVEN));
        System.out.println(new BigDecimal(negative / arr.size()).setScale(6, RoundingMode.HALF_EVEN));
        System.out.println(new BigDecimal(neutral / arr.size()).setScale(6, RoundingMode.HALF_EVEN));
    }
}

