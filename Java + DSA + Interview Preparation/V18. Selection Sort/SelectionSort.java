import java.util.Arrays;

/**
 * Selection Sort Implementation
 * 
 * Selection Sort is an in-place comparison sorting algorithm that divides the input
 * array into two parts: a sorted sublist and an unsorted sublist. Initially, the
 * sorted sublist is empty and the unsorted sublist is the entire input array.
 * The algorithm proceeds by finding the smallest (or largest, depending on sorting order)
 * element in the unsorted sublist, exchanging it with the leftmost unsorted element,
 * and moving the sublist boundaries one element to the right.
 * 
 * Algorithm:
 * 1. Find the minimum element in the unsorted array
 * 2. Swap it with the first element of the unsorted array
 * 3. Move the boundary of the sorted and unsorted subarrays one position to the right
 * 4. Repeat steps 1-3 for the remaining unsorted array
 * 
 * Time Complexity:
 * - Best Case: O(n²) - even if array is already sorted
 * - Average Case: O(n²)
 * - Worst Case: O(n²)
 * 
 * Space Complexity: O(1) - sorting happens in-place
 * 
 * Stability: Unstable (does not maintain relative order of equal elements)
 * 
 * Use Cases:
 * - When memory writes are costly (minimizes number of swaps)
 * - Educational purposes to understand sorting algorithms
 * - Small datasets
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 2, 0, 1, 6, 9, 3 };
        System.out.println("Original array: " + Arrays.toString(arr));
        selection(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    /**
     * Sorts an array using the selection sort algorithm
     * 
     * @param arr The array to be sorted
     * 
     * Approach:
     * - In each iteration, find the minimum element from the unsorted part
     * - Place it at the beginning of the unsorted part
     * - Continue until the entire array is sorted
     * 
     * Example:
     * Input: [5, 8, 2, 0, 1, 6, 9, 3]
     * Step 1: Find min (0) and swap with first element -> [0, 8, 2, 5, 1, 6, 9, 3]
     * Step 2: Find min from remaining (1) and swap -> [0, 1, 2, 5, 8, 6, 9, 3]
     * ...continues until sorted
     */
    public static void selection(int[] arr) {
        // Iterate through the array to divide it into sorted and unsorted parts
        for (int i = 0; i < arr.length; i++) {
            // Find the maximum element and swap it with the last element of unsorted part
            int last = arr.length - i - 1;
            int maxIndex = getMaxElement(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    /**
     * Finds the index of the maximum element in a subarray
     * 
     * @param arr The array to search in
     * @param start Starting index of the subarray
     * @param end Ending index of the subarray (inclusive)
     * @return Index of the maximum element in the subarray
     */
    public static int getMaxElement(int[] arr, int start, int end) {
        int maxIndex = start;
        // Traverse the subarray to find the maximum element
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    /**
     * Swaps two elements in an array
     * 
     * @param arr The array containing elements to swap
     * @param first Index of the first element
     * @param second Index of the second element
     */
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}