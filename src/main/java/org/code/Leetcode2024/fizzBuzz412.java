package org.code.Leetcode2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class fizzBuzz412 {
    public ArrayList<String> fizzBuzz(int n) {
        return IntStream.range(1, n + 1).mapToObj(value -> {
            if(value % 3 == 0 && value % 5 == 0)return "FizzBuzz";
            else if(value % 3 == 0)return "Fizz";
            else if(value % 5 == 0)return "Buzz";
            else return String.valueOf(value);
        }).collect(Collectors.toCollection(ArrayList::new));
    }
}
