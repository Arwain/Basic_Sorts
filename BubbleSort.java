/*
 * BUBBLE SORT
 * *******************************************************************
 * The following class extends the Sort class to permit
 * the sorting of data utilizing the Bubble Sort algorithm.
 * In this class, the sort and swap methods from the parent class
 * (Sort) are overridden to compliment the algorithm specifications.
 * This sorting algorithm has a worst case performance analysis of O(n^2). 
 *  
 * 
 * [@author - Arwain Giannini-Karlin(1541072)]
 * [last modified - 5/30/2016]
 */
public class BubbleSort extends Sort {
	/*
	 * (non-Javadoc)
	 * @see Sort#sort(int[], int, int)
	 * The following method overrides the parent class's (Sort) sort
	 * method to accommodate a Selection Sort algorithm. A nested loop structure 
	 * is utilized to transverse an integer array while comparing
	 * neighboring values to find the maximum value. The minimum value is
	 * then placed in front of the last maximum value.
	 *  
	 */
	@Override
	public void sort(int[] data, int start, int end) {
		super.resetComparisons();
		int n = data.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {// -i makes this quicker?
				super.incrementComparisons();
				if (data[j] > data[j + 1])
					swap(data, j, j + 1);
			}
		}
	}
	/*
	 * (non-Javadoc)
	 * @see Sort#swap(int[], int, int)
	 * The following method overrides the parent class's (Sort) 
	 * swap method. This method sets a temporary variable to the
	 * value contained at the first given index then swaps that value
	 * within the array with the value at the second given index, utilizing
	 * the temporary variable to hold the initial value during the swap.  
	 */
	@Override
	public void swap(int[] in, int idx1, int idx2) {
		int temp = in[idx1];
		in[idx1] = in[idx2];
		in[idx2] = temp;
	}
}
