import java.util.List;

public class Algorithm {
    public static long countWaysToObtainIntegerNumberAsASumOfSmallerNumbers
            (int number, List<Integer> ignoredNumbers) {
        return count(number, number - 1, ignoredNumbers);
    }

    private static long count(int x, int k, List<Integer> ignored) {
        if (ignored.contains(x)) {
            return 0;
        }
        if (x == 0) {
            return 1;
        }
        long result = 0;
        for (int i = Math.min(x, k); i > 0; --i) {
            result += count(x - i, i, ignored);
        }
        return result;
    }
}
