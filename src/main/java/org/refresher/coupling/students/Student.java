package org.refresher.coupling.students;

public class Student implements Human {
    private int id;
    private String name;
    private int age;
    private String gender;
    private Subjects subject;

    public Student(int id, String name, int age, String gender, Subjects subject) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Subjects getSubject() {
        return subject;
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }

    @Override
    public String getAddress(String address) {
        return "Student address: " + address + ", " + name + ", " + age + ", " + gender;
    }
}
