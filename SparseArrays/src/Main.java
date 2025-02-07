package SparseArrays.src;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> solutionResult = solution.matchingStrings(List.of("13",
                "abcde",
                "sdaklfj",
                "asdjf",
                "na",
                "basdn",
                "sdaklfj",
                "asdjf",
                "na",
                "asdjf",
                "na",
                "basdn",
                "sdaklfj",
                "asdjf",
                "5",
                "abcde",
                "sdaklfj",
                "asdjf",
                "na",
                "basdn"), List.of("13",
                "abcde",
                "sdaklfj",
                "asdjf",
                "na",
                "basdn",
                "sdaklfj",
                "asdjf",
                "na",
                "asdjf",
                "na",
                "basdn",
                "sdaklfj",
                "asdjf",
                "5",
                "abcde",
                "sdaklfj",
                "asdjf",
                "na",
                "basdn"));
        solutionResult.forEach(s -> System.out.println(s));
    }
}
