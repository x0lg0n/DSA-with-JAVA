
public class BinarySearch {
    public static void main(String[] args) {
        int array[] = new int[100];
        int target = 42;

        for(int i=0; i<array.length; i++){
            array[i] = i;
        }

        int index = binarySearch(array, target);

        if(index == -1){
            System.out.println(target + " not found!");
        }
        else{
            System.out.println("Element found at index: " + index);
        }

    }

    private static int binarySearch(int[] array, int target) {
        
        int low = 0;
        int high = array.length - 1;

        while(low <= high){
            int mid  = low + (high - low) / 2;
            int value = array[mid];
            System.out.println(value);
            if(value  < target) low = mid + 1;
            else if(value > target) high = mid -1;
            else return mid; //target found
        }
        return -1;
    }
}
