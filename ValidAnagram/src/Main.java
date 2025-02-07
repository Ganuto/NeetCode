import ValidAnagram.src.Solution;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean solutionResult = solution.isAnagram("racecar", "carrace");
        System.out.println(solutionResult);
    }
}
