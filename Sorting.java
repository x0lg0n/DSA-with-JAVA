import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        List <Integer> list = new ArrayList<>();
        list = Arrays.asList(new Integer[] {4, 6, 2, 5, 7, 9, 1, 3});
        int n = arr.length;
        System.out.println(n);
        int i = list.size();
        QuickSort(list, 0, i - 1);
        print(list);
    }

    static void print(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void print(List <Integer> arr){
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

    // Selection Sort
    static void selection_sort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    // Time Complexity:
    // Best Case :- O(N^2)
    // Average Case :- O(N^2)
    // Worst Case :- O(N^2)
    // Space Complexity: O(1)

    // Insertion Sort
    static void insertion_sort(int arr[], int n) {
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
            System.out.println("Run");
        }
    }
    // Time Complexity:
    // Best Case :- O(N^2)
    // Average Case :- O(N^2)
    // Worst Case :- O(N^2)
    // Space Complexity: O(1)

    // Bubble Sort
    static void bubble_sort(int arr[], int n) {
        for (int i = n - 1; i >= 1; i--) {
            int didswap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
                didswap = 1;
            }
            System.out.println("Run");
            if (didswap == 0) {
                break;
            }
        }
    }
    // Time Complexity:
    // Best Case :- O(N)
    // Average Case :- O(N^2)
    // Worst Case :- O(N^2)
    // Space Complexity: O(1)

    // Merge Sort
    static void MergeSort(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int mid = low + high / 2;
        MergeSort(arr, low, mid);
        System.out.println("run");
        MergeSort(arr, mid + 1, high);
        System.out.println("run");
        Merge(arr, low, mid, high);
        System.out.println("run");
    }

    static void Merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        System.out.println("Run");

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
    // Time Complexity:
    // Best Case :- O(NlogN)
    // Average Case :- O(NlogN)
    // Worst Case :- O(NlogN)
    // Space Complexity: O(N)

    // Recursive Bubble Sort
    static void BubbleSort(int arr[], int n) {
        // Base Case: range == 1
        if (n == 1)
            return;

        int didswap = 0;
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                didswap = 1;
            }
        }
        // if no swapping happens
        if (didswap == 0)
            return;

        BubbleSort(arr, n - 1);
    }
    // Time Complexity:
    // Best Case :- O(N)
    // Average Case :- O(N^2)
    // Worst Case :- O(N^2)
    // Space Complexity: O(N)

    // Insertion Sort
    static void InsertionSort(int arr[], int n, int i) {
        // Base Case: i == n
        if (n == i) return;

        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
        InsertionSort(arr, n, i + 1);
    }
    // Time Complexity:
    // Best Case :- O(N)
    // Average Case :- O(N^2)
    // Worst Case :- O(N^2)
    // Space Complexity: O(N)

    // Quick Sort
    static void QuickSort(List<Integer> arr, int low, int high){
        if (low < high) {
            int pIndex = partition(arr, low, high);
            QuickSort(arr, low, pIndex - 1);
            QuickSort(arr, pIndex + 1, high); 
        }
    }

    static int partition(List<Integer> arr, int low, int high){
        int pivot = arr.get(low);
        int  i = low;
        int j = high;
        while(i < j){
            
            while (arr.get(i) <= arr.get(pivot) && i <= high) {
                i++;
            }
             
            while (arr.get(j) <= arr.get(pivot) && j >= low) {
                j--;
            }
            if (i < j) {
                int temp = arr.get(i); 
                arr.set(i, arr.get(j));
                arr.set(j, temp);

                
            }
        }
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j,temp);

        return j;
    }
     // Time Complexity:
    // Best Case :- O(N)
    // Average Case :- O(N^2)
    // Worst Case :- O(N^2)
    // Space Complexity: O(N)
}
