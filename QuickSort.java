/*
 * QUICK SORT
 * *******************************************************************
 * The following class extends the Sort class to permit
 * the sorting of data utilizing the Quick Sort algorithm.
 * In this class, the sort and swap methods from the parent class
 * (Sort) are overridden to compliment the algorithm specifications.
 * This sorting algorithm has a worst case performance analysis of O(n^2).
 * However, this algorithm has a best case performance analysis of O(n log n). 
 *  
 * 
 * [@author - Arwain Giannini-Karlin(1541072)]
 * [last modified - 5/30/2016]
 */
public class QuickSort extends Sort{
	/*
	 * (non-Javadoc)
	 * @see Sort#sort(int[], int, int)
	 * The following method overrides the parent class's (Sort) sort
	 * method to accommodate a recursive Quick Sort algorithm. 
	 */
	@Override
	public void sort(int[] array, int start, int end) {
	    if (start < end) {
	    	super.incrementComparisons();// increments super class variable
	        int partition = partition(array, start, end);
	        sort(array, start, partition - 1);
	        sort(array, partition, end);
	    }
	}
	/*
	 * The following method initializes a pivot point within an array
	 * of integers. It then compares the values to the "left" and
	 * "right" of the pivot point swapping values if the left value is
	 * less than the right.  
	 */
	public int partition(int[] array, int left, int right) {
	    int pivotValue = array[left]; //Value of middle element in array
	    super.incrementComparisons();// increments super class variable
	    while (left <= right) {
	    	super.incrementComparisons();// increments super class variable
	        while (array[left] < pivotValue) {
	        	super.incrementComparisons();// increments super class variable
	            left++;
	        }
	        super.incrementComparisons();// increments super class variable
	        while (array[right] > pivotValue) {
	        	super.incrementComparisons();// increments super class variable
	            right--;
	        }
	        if (left <= right) {
	        	super.incrementComparisons();// increments super class variable
	        	swap(array,left,right);
	            left++;
	            right--;
	        }
	        
	    }
	    return left;
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
