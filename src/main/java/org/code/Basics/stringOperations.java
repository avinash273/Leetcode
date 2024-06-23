package org.code.Basics;

import java.util.regex.Pattern;

public class stringOperations {
    void implementStringOperations() {
        //char to string
        char[] ch = {'a', 'v', 'i'};
        String name = new String(ch);
        name = new String("Avinash Shanker");
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(1));
        System.out.println(name.substring(2, 4));
        System.out.println(name.equals(name));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        //Split operation
        String s1 = "java str!@#!#%ing split@#$ method by java point,.)(&#";
        String[] words = s1.split(" ");
        for (String eachWord : words) {
            System.out.println(eachWord.replaceAll("[^A-Za-z0-9]", ""));
        }

        //replace
        String fetchAlphanumeric = s1.replaceAll("[^A-Za-z0-9]", "");
        System.out.println(fetchAlphanumeric);

        //regex expression, pattern matching, problem removes space
        boolean b = Pattern.matches(".s", "as");//true 2nd char is s
        System.out.println(b);

        boolean b1 = Pattern.matches("[a-zA-Z]", "abcd");
        System.out.println(b1);

    }
}
