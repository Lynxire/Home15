package task2;

public class Main {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.add("Dog");
        task2.add("Cat");
        task2.add("Pop");
        System.out.println(task2.list);
        task2.remove();
        System.out.println(task2.list);
    }
}
