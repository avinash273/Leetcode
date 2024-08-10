package org.code.CollectionFramework;

import java.util.*;

class Employee {
    private int employeeId; //uniq
    private String name;
    private String title;
    private long salary;
    private Date updated_date;

    public Employee(int employeeId, String name, String title, long salary, Date updated_date) {
        this.employeeId = employeeId;
        this.name = name;
        this.title = title;
        this.salary = salary;
        this.updated_date = updated_date;
    }

    public Employee() {
    }

    public Employee(String john, int i, int i1) {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Date getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(Date updated_date) {
        this.updated_date = updated_date;
    }

}

class Filter{
    public Collection<Employee> filterEmployees (Collection<Employee> employeelist) {
        // todo - filter the input and find all unique employees,
        //if we encounter a duplicate, comparision should be done on updated_date and get more recent one

        if (employeelist == null || employeelist.isEmpty()) {
            return employeelist;
        }

        HashMap<Integer, Employee> map = new HashMap<>();
        for (Employee employee : employeelist) {

            if(!map.containsKey(employee.getEmployeeId())){
                map.put(employee.getEmployeeId(), employee);
            }
            else{
                if(employee.getUpdated_date().after(map.get(employee.getEmployeeId()).getUpdated_date())){
                    map.put(employee.getEmployeeId(), employee);
                }
            }
        }

        return new ArrayList<>(map.values());
    }
}


public class Stream {

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Avinash", "Technology Lead", 100000, new Date(2022,03,23));
        Employee employee2 = new Employee(2, "Ram", "Software Engineer", 200000, new Date());
        Employee employee3 = new Employee(3, "Sham", "Technology Architect", 300000, new Date());
        Employee employee4 = new Employee(4, "Ganesh", "Technology Analyst", 80000, new Date());
        Employee employee5 = new Employee(1, "Shanker", "Technology Lead", 120000, new Date());
        Employee employee6 = new Employee(6, "Ramesha", "Software Engineer", 150000, new Date());
        Employee employee7 = new Employee(2, "Raghu", "Technology Lead", 800000, new Date(2026,03,23));
        Employee employee8 = new Employee(8, "Prabu", "Technology Analyst", 700000, new Date());
        Employee employee9 = new Employee(9, "George", "Technology Lead", 900000, new Date());

        Collection<Employee> employeelist = new ArrayList<>(Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8, employee9));

        System.out.println("Before Filtering");

        employeelist.stream().forEach(employee -> {
            System.out.println(employee.getEmployeeId() + " " + employee.getName() + " " + employee.getTitle() + " " + employee.getSalary() + " " + employee.getUpdated_date());
        });

        Filter filter = new Filter();
        Collection<Employee> result1 = filter.filterEmployees(employeelist);

        System.out.println("After Filtering");

        result1.stream().forEach(employee -> {
            System.out.println(employee.getEmployeeId() + " " + employee.getName() + " " + employee.getTitle() + " " + employee.getSalary() + " " + employee.getUpdated_date());
        });

    }
}
