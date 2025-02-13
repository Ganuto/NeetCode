package arraysAndHashing.StringEncodeAndDecode.src;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String encodedString = solution.encode(List.of("I", "Love", "You", "entendedoresenentederao"));
        List<String> decodedString = solution.decode(encodedString);
        System.out.println(decodedString);
    }
}
