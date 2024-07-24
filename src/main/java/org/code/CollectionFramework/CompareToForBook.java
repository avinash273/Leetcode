package org.code.CollectionFramework;

/**
 * primary purpose is to sort
 * collections.sort() wont work on user defined objects like book, student
 * for those we need a compareTo() implementation
 */

public class CompareToForBook {
    class Student implements Comparable<Student>{
        int rollNo;
        String name;
        int age;

        Student(int rollNo, String name, int age){
            this.rollNo = rollNo;
            this.name = name;
            this.age = age;
        }

        public int compareTo(Student s){
            if(age == s.age)
                return 0;
            else if(age < s.age)
                return 1;
            else
                return -1;
        }
    }

    void implementStudent(){
        Student s1 = new Student(101,"avi", 25);
        Student s2 = new Student(101,"avi", 25);
        Student s3 = new Student(101,"avi", 25);

    }

    public static void main(String[] args) {
        CompareToForBook compareToForBook = new CompareToForBook();
        compareToForBook.implementStudent();
    }

}
