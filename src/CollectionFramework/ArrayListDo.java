package CollectionFramework;

import java.util.*;

public class ArrayListDo {
    ArrayList implementArrayList() {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        list.add("avi");
        list.add("anki");
        list.add(0, "bob");
        list2.add("akash");
        list2.add("akash");

        //Few more, but implemented
        list.addAll(list2);
        list.removeIf(str -> str.contains("bob"));
//        list.clear();

        //Traversing using while
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println("while:" + itr.next());
        }

        //Traversing using for
        for (String obj : list) {
            System.out.println("for:" + obj);
        }

        //Most imp one, listIterator
        for (int i = 0; i < list.size(); i++) {
            //get operation
            System.out.println(list.get(i));
            if (list.get(i) == "anki")
                //set operation
                list.set(i, "anu");
        }
        System.out.println("after set: " + list);


        //Now, with user defined class objects
        class Student {
            int rollNo;
            int age;

            Student(int rollNo, int age) {
                this.rollNo = rollNo;
                this.age = age;
            }
        }

        Student s1 = new Student(101, 23);
        Student s2 = new Student(102, 21);
        Student s3 = new Student(103, 25);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        //to remove
        students.remove(0);
        students.remove(s3);
        students.add(s3);

        Iterator itr2 = students.iterator();

        //Now iterating it using while loop
        while (itr2.hasNext()) {
            Student st = (Student) itr2.next();
            System.out.println(st.rollNo + " " + st.age);
        }

        //Most imp one, listIterator
        for (int i = 0; i < students.size(); i++) {
            Student st = students.get(i);
            System.out.println(st.rollNo + " " + st.age);
        }
        return list;
    }
}

