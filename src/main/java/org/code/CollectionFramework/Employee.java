import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;
    private int id;

    // Constructor
    public Employee(String name, int age, int id) {
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
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 30, 101));
        employees.add(new Employee("Alice", 25, 102));
        employees.add(new Employee("John", 30, 103));
        employees.add(new Employee("Bob", 35, 104));
        employees.add(new Employee("Alice", 25, 105));

        System.out.println("Before sorting and removing duplicates:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Sort by name and age, then remove duplicates
        List<Employee> sortedAndUniqueEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getAge))
                .distinct()
                .toList();

        System.out.println("\nAfter sorting and removing duplicates:");
        for (Employee e : sortedAndUniqueEmployees) {
            System.out.println(e);
        }
    }
}
