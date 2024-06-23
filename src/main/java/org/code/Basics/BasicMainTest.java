package org.code.Basics;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


class BasicMainTest {
    @Test
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
        assertEquals(1, 1);

    }
}
