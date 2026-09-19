import java.util.*;

public class CombinationSum {

    public List<List<Integer>> findCombinations(int combinationCount, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), combinationCount, targetSum, 1);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> current,
                           int combinationCount, int targetSum, int start) {
        // Base case: if we have exactly combinationCount numbers
        if (current.size() == combinationCount) {
            if (targetSum == 0) {
                result.add(new ArrayList<>(current));
            }
            return;
        }

        // Try numbers from 'start' to 9
        for (int i = start; i <= 9; i++) {
            if (i > targetSum) break; // pruning
            current.add(i);
            backtrack(result, current, combinationCount, targetSum - i, i + 1);
            current.remove(current.size() - 1); // backtrack
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of test cases
        Solution sol = new Solution();

        while (T-- > 0) {
            int combinationCount = sc.nextInt();
            int targetSum = sc.nextInt();

            List<List<Integer>> combinations = sol.findCombinations(combinationCount, targetSum);

            if (combinations.isEmpty()) {
                System.out.println();
            } else {
                for (List<Integer> combo : combinations) {
                    // Print in format [1 5 9] instead of [1, 5, 9]
                    System.out.print("[");
                    for (int j = 0; j < combo.size(); j++) {
                        System.out.print(combo.get(j));
                        if (j < combo.size() - 1) System.out.print(" ");
                    }
                    System.out.println("]");
                }
            }
        }
        sc.close();
    }
}
