public class LinearSearch {
    public static void main(String[] args) {
        
        int array[] = {1,5,54,8,2,8,1,69,9,1,8,296,8,1,9,4,1};

        int index = linearSearch(array, 69);

        if(index != -1){
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Element not found ");   
        }
        

    }

    private static int linearSearch(int[] array, int i) {
        for (int j = 0; j < array.length; j++) {
            if(array[j] == i){
                return j;
            }
        }
        return -1;
    }
}
