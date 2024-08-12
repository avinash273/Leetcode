package org.refresher.coupling.students;

public class Teacher extends Student implements Human  {
    private String designation;

    public Teacher(int id, String name, int age, String gender, Subjects subject, String designation) {
        super(id, name, age, gender, subject);
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String getAddress(String address) {
        return "Teacher Address: " + address;
    }
}
