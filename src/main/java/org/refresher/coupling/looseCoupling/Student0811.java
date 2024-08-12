package org.refresher.coupling.looseCoupling;

public class Student0811 {
    public static void main(String[] args) {
        System.out.println("Student0811 World");

        Job job = new Job();
        Internship internship = new Internship();

        Money money = new Job();
        System.out.println( internship.getSalary() + job.getSalary());

    }
}
