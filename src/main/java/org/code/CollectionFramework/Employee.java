package org.code.CollectionFramework;

import java.util.*;
import java.util.stream.Collectors;

class Employees {
    private String name;
    private int age;
    private int id;

    // Constructor
    public Employees(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return STR."Employee{name='\{name}\{'\''}, age=\{age}, id=\{id}\{'}'}";
    }
}

class Main {
    public static void main(String[] args) {
        List<Employees> employees = new ArrayList<>();
        employees.add(new Employees("John", 30, 101));
        employees.add(new Employees("Alice", 25, 102));
        employees.add(new Employees("John", 30, 103));
        employees.add(new Employees("Bob", 35, 104));
        employees.add(new Employees("Alice", 25, 105));

        System.out.println("Before sorting and removing duplicates:");
        for (Employees e : employees) {
            System.out.println(e);
        }

        // Sort by name and age, then remove duplicates
        List<Employees> sortedAndUniqueEmployees = employees.stream()
                .sorted(Comparator.comparing(Employees::getName).thenComparing(Employees::getAge))
                .distinct()
                .toList();

        System.out.println("\nAfter sorting and removing duplicates:");
        for (Employees e : sortedAndUniqueEmployees) {
            System.out.println(e);
        }
    }
}
