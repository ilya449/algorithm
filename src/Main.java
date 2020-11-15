import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("#1: " + Algorithm
                .countWaysToObtainIntegerNumberAsASumOfSmallerNumbers(3, List.of(1)));
        //Output: "#1: 0"
        System.out.println("#2: " + Algorithm
                .countWaysToObtainIntegerNumberAsASumOfSmallerNumbers(6, List.of(1, 3)));
        //Output: #2: 2
        System.out.println("#3: " + Algorithm
                .countWaysToObtainIntegerNumberAsASumOfSmallerNumbers(5, List.of()));
        //Output: #3: 6
    }
}
