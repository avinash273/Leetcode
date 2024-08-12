package org.refresher.coupling.students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class StudentMain {
    public static void main(String[] args) {
        Human human1 = new Student(1, "Avinash", 30, "M", Subjects.BIOLOGY);
        Human human2 = new Student(1, "Akash", 27, "M", Subjects.CHEMISTRY);
        Human human3 = new Teacher(1, "Shanker", 55, "M", Subjects.CHEMISTRY, "Professor");
        Human human4 = new Teacher(1, "Mullai", 50, "F", Subjects.MATHS, "Head of Dept");

        Collection<Human> entireSchool = Arrays.asList(human1, human2, human3, human4);

    }
}
