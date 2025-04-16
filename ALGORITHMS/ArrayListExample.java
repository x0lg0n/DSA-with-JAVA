public class ArrayListExample {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        
        array.add("A");
        array.add("D");
        array.add("B");
        array.add("C");
        array.add("E");
        array.add("F");
        System.out.println(array.search("X"));
        
        System.out.println("Size: " + array.size);
        System.out.println("Empty: " + array.isEmpty());
        System.out.println("Capacity: " + array.capacity);
        System.out.println(array );
    }
}
