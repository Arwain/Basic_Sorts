/*
 * SELECTION SORT
 * *******************************************************************
 * The following class extends the Sort class to permit
 * the sorting of data utilizing the Selection Sort algorithm.
 * In this class, the sort and swap methods from the parent class
 * (Sort) are overridden to compliment the algorithm specifications.
 * This sorting algorithm has a worst case performance analysis of O(n^2). 
 *  
 * 
 * [@author - Arwain Giannini-Karlin(1541072)]
 * [last modified - 5/30/2016]
 */
public class SelectionSort extends Sort {
	/*
	 * (non-Javadoc)
	 * @see Sort#sort(int[], int, int)
	 * The following method overrides the parent class's (Sort) sort
	 * method to accommodate a Selection Sort algorithm. A nested loop structure 
	 * is utilized to transverse an integer array while comparing
	 * neighboring values to find the minimum value. The minimum value is
	 * then placed in front of the last minimum value.
	 *  
	 */
	@Override
	public void sort(int[] input, int start, int end) {
		super.resetComparisons();
		for (int j = 0; j < input.length - 1; j++) {
			int minElement = j;
			for (int i = j + 1; i < input.length; i++) {
				super.incrementComparisons();
				if (input[i] < input[minElement]) {
					//super.incrementComparisons();
					minElement = i;
				}
			}
			//super.incrementComparisons();
			swap(input,j,minElement);
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
