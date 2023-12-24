package task4;

public class Main {
    public static void main(String[] args) {
        DynamicArray<String> dynamicArray = new DynamicArray<>();
        dynamicArray.add("Element 1");
        dynamicArray.add("Element 2");
        dynamicArray.add("Element 3");

        System.out.println("Size of dynamic array: " + dynamicArray.size());
        System.out.println("Element at index 1: " + dynamicArray.get(1));

        dynamicArray.remove(0);
        System.out.println("Size after removal: " + dynamicArray.size());
        System.out.println("New element at index 0: " + dynamicArray.get(0));

        System.out.println("Contains 'Element 2': " + dynamicArray.contains("Element 2"));

        dynamicArray.clear();
        System.out.println("Size after clearing: " + dynamicArray.size());
    }
}
