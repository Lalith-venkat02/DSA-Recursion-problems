import java.lang.*;
import java.util.*;

class SumOfArrayElements
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);

		// Read the input size
		if (!sc.hasNextInt()) return;
		int n = sc.nextInt();

		// Create an array to hold the elements
		int[] arr = new int[n];

		// Read the array elements
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Calculate the sum using long to prevent overflow
		long totalSum = calculateSumRecursive(arr, 0);

		// Print the sum
		System.out.println(totalSum);

		// Close the scanner
		sc.close();
	}

	// Helper method to compute the sum using recursion
	public static long calculateSumRecursive(int[] arr, int index) {
		
		if(index==arr.length)
		return 0;
	
	return arr[index]+calculateSumRecursive(arr,index+1);
		
	}
}