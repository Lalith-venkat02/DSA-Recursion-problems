import java.util.Scanner;
/*
 * Program: CoinFlips
 * Description:
 * This program uses recursion to find the number of ways to reach a given
 * step when we can move either 1 step or 2 steps at a time.
 *
 * For each step, the number of ways is calculated as:
 * countWays(s) = countWays(s-1) + countWays(s-2)
 */
class CoinFlips {

    public static int countWays(int s) {

        if (s == 1)
            return 1;

        if (s == 2)
            return 2;

        if (s == 3)
            return 3;

        return countWays(s - 1) + countWays(s - 2);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int S = scanner.nextInt();

        System.out.println(countWays(S));

        scanner.close();
    }
}