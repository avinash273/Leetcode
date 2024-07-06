package org.code.Basics;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ParallelStreamExample {
    private static final Logger log = Logger.getLogger(ParallelStreamExample.class);

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10000);
        BasicConfigurator.configure();
        Random random = new Random();

        for(double i = 0; i < 10000; i++) {
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

        /**
         * Optinal Class
         */

        List<String> name = Arrays.asList("John", "Jane", "Jack", "Bob");
        List<String> capsName = name.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        List<String> capsName2 = name.stream().map(String::toUpperCase).collect(Collectors.toList());

       String test = name.stream().filter(str -> str.contains("x")).findFirst().orElse("Not found");
       log.info("hello world!");



        /**
         * :: --> is called Method reference
         * String::toUpperCase
         */
        capsName.forEach(System.out::println);

    }
}
