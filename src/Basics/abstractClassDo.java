package Basics;

/**
 * abstraction in java
 */
abstract class Shape{
    abstract void draw();
}

class rectangles extends Shape{
    void draw(){
        System.out.println("Drawing Rectangle..");
        System.out.println("Drawing Rectangle Again!");
    }
}

public class abstractClassDo {
    void implementAbstractClass(){
        rectangles rectangles = new rectangles();
        rectangles.draw();
        rectangles.draw();
    }
}
