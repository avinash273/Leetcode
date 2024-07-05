package org.code.Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10000);

        Random random = new Random();

        for(double i = 0; i < 200000000; i++) {
            list.add(random.nextInt(101));
        }
        //System.out.println(list);

        long start1 = System.currentTimeMillis();
        int sum = list.stream().reduce(0, (a, b) -> (a + b) * 2);
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        int sum2 = list.stream().mapToInt(a -> a * 2).sum();
        long end2 = System.currentTimeMillis();

        long start3 = System.currentTimeMillis();
        int sum3 = list.parallelStream().mapToInt(a -> a * 2).sum();
        long end3 = System.currentTimeMillis();

        System.out.println(sum + " " +  (end1 - start1));
        System.out.println(sum2 + " " +  (end2 - start2));
        System.out.println(sum3 + " " +  (end3 - start3));
    }
}
