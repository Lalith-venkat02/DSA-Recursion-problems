import java.util.*;

public class UniquePermutations {

    public static List<List<Integer>> uniquePermutations(List<Integer> multiset) {
        List<List<Integer>> result = new ArrayList<>();
        Collections.sort(multiset); // sort to handle duplicates
        boolean[] used = new boolean[multiset.size()];
        backtrack(result, new ArrayList<>(), multiset, used);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> current,
                                  List<Integer> multiset, boolean[] used) {
        if (current.size() == multiset.size()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < multiset.size(); i++) {
            if (used[i]) continue;

            // skip duplicates
            if (i > 0 && multiset.get(i).equals(multiset.get(i - 1)) && !used[i - 1]) {
                continue;
            }

            used[i] = true;
            current.add(multiset.get(i));

            backtrack(result, current, multiset, used); // recursive call

            current.remove(current.size() - 1); // backtrack
            used[i] = false;
        }
    }

    public static void printPermutations(List<List<Integer>> permutations) {
        for (List<Integer> permutation : permutations) {
            System.out.print("[");
            for (int i = 0; i < permutation.size(); ++i) {
                System.out.print(permutation.get(i));
                if (i < permutation.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> multiset = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            multiset.add(scanner.nextInt());
        }
        List<List<Integer>> result = uniquePermutations(multiset);
        printPermutations(result);
    }
}
