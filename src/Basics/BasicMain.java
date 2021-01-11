package Basics;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BasicMain {
    public static void main(String[] args) {
//        //Simple switch example
        SwitchDo SwitchDo = new SwitchDo();
        SwitchDo.implementSwitch();

        //simple class example for rectangle
        classDo classDo = new classDo();
        classDo.implementRectangle();

        //Simple inheritance
        //Its is-a and Has-a
        inheritanceTry inheritanceTry = new inheritanceTry();
        inheritanceTry.implementAnimals();

        //Abstract class implementation
        abstractClassDo abstractClassDo = new abstractClassDo();
        abstractClassDo.implementAbstractClass();

        //implementing interface
        interfaceDo interfaceDo = new interfaceDo();
        interfaceDo.implementCircle();

        //string operations
        stringOperations stringOperations = new stringOperations();
        stringOperations.implementStringOperations();

        //error handling
        ExceptionHandling ExceptionHandling = new ExceptionHandling();
        ExceptionHandling.implementError();

        System.out.println(String.format("id = %08.2f", 423.147));
        final Set<String> set = new HashSet<>(Arrays.asList("avi", "akash"));
        System.out.println(set.contains("avi"));
    }
}
