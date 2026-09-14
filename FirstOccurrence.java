/*
 * Program: Recursive Binary Search to Find First Occurrence
 * ---------------------------------------------------------
 * This program demonstrates how to use recursion to find the 
 * minimum index (first occurrence) of a given element X in a 
 * sorted array. If the element is present multiple times, 
 * the function ensures that the leftmost index is returned.
 * If the element is not found, -1 is returned.
 */

public class FirstOccurrence {

    // Recursive function to find the minimum index of X
    public static int findFirstOccurrence(int[] a, int low, int high, int x, int res) {
        // Base case: when search space is invalid
        if (low > high) {
            return res;
        }

        int mid = (low + high) / 2;

        if (x == a[mid]) {
            res = mid; // update result when found
            // continue searching left side for first occurrence
            return findFirstOccurrence(a, low, mid - 1, x, res);
        }

        if (x > a[mid]) {
            // search right half
            return findFirstOccurrence(a, mid + 1, high, x, res);
        } else {
            // search left half
            return findFirstOccurrence(a, low, mid - 1, x, res);
        }
    }

    // Driver method
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int x = 2;

        int index = findFirstOccurrence(arr, 0, arr.length - 1, x, -1);

        if (index != -1) {
            System.out.println("First occurrence of " + x + " is at index: " + index);
        } else {
            System.out.println(x + " not found in array.");
        }
    }
}
