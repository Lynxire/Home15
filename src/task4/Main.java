package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DynamicArray<String> dynamicArray = new DynamicArray<>(15);
        dynamicArray.add("1");
        dynamicArray.add("2");
        dynamicArray.add("3");
        System.out.println(dynamicArray.get(2));
        System.out.println("Size "+ dynamicArray.size());

        dynamicArray.remove(0);
        System.out.println("Size after remove " + dynamicArray.size());
        System.out.println(dynamicArray.contains("2"));

        dynamicArray.clear();
        System.out.println("Size after clearing: " + dynamicArray.size());
    }
}
