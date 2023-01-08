// Given an array A[] of n numbers and another number x, the task is to check 
// whether or not there exist two elements in A[] whose sum is exactly x. 
// Input: arr[] = {0, -1, 2, -3, 1}, x= -2
// Output: Yes
// Explanation:  If we calculate the sum of the output,1 + (-3) = -2

import java.util.*;

class FindPairs {
	static void printPairs(int a[], int n, int x) {
		int i;
		int[] rem = new int[x];
		for (i = 0; i < x; i++)
			rem[i] = 0;
		for (i = 0; i < n; i++)
			if (a[i] < x)
				rem[a[i] % x]++;

		for (i = 1; i < x / 2; i++) {
			if (rem[i] > 0 && rem[x - i] > 0) {
				System.out.println("Yes");
				break;
			}
		}
		if (i >= x / 2) {
			if (x % 2 == 0) {
				if (rem[x / 2] > 1)
					System.out.println("Yes");
				else
					System.out.println("No");
			}
			else {
				if (rem[x / 2] > 0 && rem[x - x / 2] > 0)
					System.out.println("Yes");
				else
					System.out.println("No");
			}
		}
	}
	public static void main(String[] args) {
		int A[] = { 1, 4, 45, 6, 10, 8 };
		int n = 16;
		int arr_size = A.length;
		printPairs(A, arr_size, n);
	}
}

