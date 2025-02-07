package HasDuplicate.src;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean solutionResult = solution.hasDuplicate(new int[]{1, 2, 3, 3});
        System.out.println(solutionResult);
    }
}
