package task2;

import java.util.LinkedList;

public class Task2 {
    public   LinkedList<String> list = new LinkedList<>();

    public void add(String element){
        list.addFirst(element);
    }
    public void remove(){
        if(list.isEmpty()){
            throw new RuntimeException("пустой лист");
        }
        list.removeLast();
    }
    public int size(){
        return list.size();
    }
}
