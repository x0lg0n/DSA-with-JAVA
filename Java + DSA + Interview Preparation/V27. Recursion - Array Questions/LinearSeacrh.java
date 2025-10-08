import java.util.ArrayList;
import java.util.Scanner;

public class LinearSeacrh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr =  new int[10];

        for (int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt(); 
        }

        System.out.println(findAllIndex(arr, 5, 0));
        ArrayList <Integer> list = findAllIndex(arr, 2, 0, new ArrayList<>());
        
        System.out.println(list);
        sc.close();
    }

    public static boolean search(int[] arr, int target, int index) {
        if (arr[index] == arr.length) {
            return false;
        }
        return arr[index] == target || search(arr, target, index + 1);
    }

    public static int findIndex(int[] arr, int target, int index) {
        if (arr[index] == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        else {
            return findIndex(arr, target, index + 1);
        }
    }

    static ArrayList <Integer> list = new ArrayList<>();
    public static ArrayList findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1);
    }

    public static ArrayList findAllIndex(int[] arr, int target, int index, ArrayList <Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    public static ArrayList findAllIndex2(int[] arr, int target, int index) {

        ArrayList <Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList <Integer> ans =  findAllIndex(arr, target, index + 1);

        list.addAll(ans);
        return list;
    }
}
