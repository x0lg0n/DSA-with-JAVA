public class L17 {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 8, 5, 9, 3, 7};
        linearSearch(arr, 2);
        int ans = binarySearch(arr, 9);
        if(ans == -1){
            System.out.println("Element not found in array");
        }
        else{
            System.out.println("Element found at index: " + ans);
        }
        print(arr);
    }

    private static int binarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(target == arr[mid]){
                System.out.println("Element found at index " + mid);
            }
            if (target > arr[mid]) {
                s = mid + 1;
            }
           else{
                e = mid - 1;
           }
        }
        return 0;
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("");
        }
    }

    private static void linearSearch(int[] arr, int target) {          
        for (int i = 0; i < arr.length; i++) {                         
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
            }  
        }
    //Time complexity : O(n)
    //Space complexity : O(1)
    }

}
