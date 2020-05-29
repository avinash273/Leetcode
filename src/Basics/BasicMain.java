package Basics;

public class BasicMain {
    public static void main(String[] args) {
        //Simple switch example
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

    }
}
