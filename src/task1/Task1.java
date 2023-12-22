package task1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Task1 {
    public static void noRepeat(){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] splits = string.split(" ");
        LinkedHashSet<String> strings = new LinkedHashSet<String>();
        for (int i = 0; i < splits.length; i++) {
            strings.add(splits[i]);
        }
        strings.forEach(System.out::println);


    }


}
