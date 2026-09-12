import java.util.Scanner;

// Recursively finds and prints a specified element from Pascal's Triangle.
public class PascalsTriangleElement {

    // Recursive function to get element at row n, column m in Pascal's Triangle
    static int getPascalElement(int n, int m) {
        if (m == 0 || m == n) {
            return 1;
        }
        return getPascalElement(n - 1, m - 1) + getPascalElement(n - 1, m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: row and column
        System.out.print("Enter row (n): ");
        int n = sc.nextInt();
        System.out.print("Enter column (m): ");
        int m = sc.nextInt();

        // Output: Pascal element
        System.out.println("Pascal Element at (" + n + "," + m + ") = " + getPascalElement(n, m));

        sc.close();
    }
}
