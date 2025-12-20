import java.util.Arrays;

/**
 * Bubble Sort Implementation
 * 
 * Bubble Sort is a simple sorting algorithm that repeatedly steps through the list,
 * compares adjacent elements and swaps them if they are in the wrong order.
 * The pass through the list is repeated until the list is sorted.
 * 
 * Algorithm:
 * 1. Start from the first element and compare it with the next element
 * 2. If the first element is greater than the next element, swap them
 * 3. Move to the next pair of elements and repeat step 2
 * 4. Continue until the end of the array
 * 5. After each complete pass, the largest element "bubbles up" to its correct position
 * 6. Repeat the process for the remaining unsorted portion
 * 7. Stop when no swaps are needed in a complete pass
 * 
 * Time Complexity:
 * - Best Case: O(n) - when array is already sorted
 * - Average Case: O(n²)
 * - Worst Case: O(n²) - when array is reverse sorted
 * 
 * Space Complexity: O(1) - sorting happens in-place
 * 
 * Stability: Stable (maintains relative order of equal elements)
 * 
 * Use Cases:
 * - Educational purposes to understand sorting algorithms
 * - Small datasets (not recommended for large datasets due to O(n²) complexity)
 * - When simplicity is more important than efficiency
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 2, 0, 1, 6, 9, 3 };
        System.out.println("Original array: " + Arrays.toString(arr));
        bubble(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    /**
     * Sorts an array using the bubble sort algorithm
     * 
     * @param arr The array to be sorted
     * 
     * Optimization:
     * - Uses a 'swapped' flag to detect if the array is already sorted
     * - Reduces unnecessary passes when array becomes sorted before all passes
     * 
     * Example:
     * Input: [5, 8, 2, 0, 1, 6, 9, 3]
     * Pass 1: [5, 2, 0, 1, 6, 8, 3, 9] (9 bubbles to end)
     * Pass 2: [2, 0, 1, 5, 6, 3, 8, 9] (8 bubbles to correct position)
     * ...continues until sorted
     */
    public static void bubble(int[] arr) {
        boolean swapped;
        // Outer loop for passes - runs n-1 times in worst case
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // Inner loop for comparisons - reduces by i each pass as last i elements are sorted
            for (int j = 1; j < arr.length - i; j++) {
                // Compare adjacent elements
                if (arr[j] < arr[j - 1]) {
                    // Swap if they are in wrong order
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            // Optimization: If no elements were swapped, array is sorted
            if (!swapped) {
                break;
            }
        }
    }
}