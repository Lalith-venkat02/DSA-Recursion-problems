import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Generates, sorts, and prints all valid combinations of n pairs of parentheses.
class ParenthesisGenerator {

    public static List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();

        generate(n, 0, 0, "", result);

        return result;

    }

    public static void generate(int n, int open, int close, String current, List<String> result) {

        if (open == n && close == n) {
            result.add(current);
            return;
        }

        if (open < n) {
            generate(n, open + 1, close, current + "(", result);
        }

        if (close < open) {
            generate(n, open, close + 1, current + ")", result);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> result = generateParenthesis(n);
        Collections.sort(result); // Sorting the result list
        for (String s : result) {
            System.out.println(s);
        }
    }
}