import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import dsa.BinarySearch;

public class BinarySearchTest {

    @Test
    public void testElementFound() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int expected = 4;
        int actual = BinarySearch.binarySearch(arr, target);
        assertEquals(expected, actual, "Element should be found at index 4");
    }

    @Test
    public void testElementNotFound() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 15;
        int expected = -1;
        int actual = BinarySearch.binarySearch(arr, target);
        assertEquals(expected, actual, "Element should not be found, return -1");
    }

    @Test
    public void testFirstElement() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 1;
        int expected = 0;
        int actual = BinarySearch.binarySearch(arr, target);
        assertEquals(expected, actual, "First element should be found at index 0");
    }

    @Test
    public void testLastElement() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 10;
        int expected = 9;
        int actual = BinarySearch.binarySearch(arr, target);
        assertEquals(expected, actual, "Last element should be found at index 9");
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int target = 5;
        int expected = -1;
        int actual = BinarySearch.binarySearch(arr, target);
        assertEquals(expected, actual, "Should return -1 for empty array");
    }

    @Test
    public void testSingleElementFound() {
        int[] arr = {5};
        int target = 5;
        int expected = 0;
        int actual = BinarySearch.binarySearch(arr, target);
        assertEquals(expected, actual, "Single element should be found at index 0");
    }

    @Test
    public void testSingleElementNotFound() {
        int[] arr = {5};
        int target = 3;
        int expected = -1;
        int actual = BinarySearch.binarySearch(arr, target);
        assertEquals(expected, actual, "Should return -1 for single element array with non-matching element");
    }
}