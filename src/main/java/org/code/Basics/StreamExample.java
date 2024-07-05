package org.code.Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list1 = list.stream().filter(x -> x % 2 == 0).map(x -> x * 2).collect(Collectors.toList());
        int list3 = list.stream().filter(x -> x % 2 == 0).map(x -> x * 2).reduce(0, (c,e) -> c + e);

        list1.forEach(x -> System.out.print(x + " "));
        System.out.println("list 3" + list3);

        //Map reduce example
        List<String> letters = Arrays.asList("a", "b", "c", "d", "e", "f");
        String answer = letters.stream().map(x -> x.toUpperCase()).reduce("",(a, b) -> a + b);
        String name = letters.stream().reduce("", (a,b) -> a + b + "hello");
        System.out.println(answer);

    }
}
