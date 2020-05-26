package Basics;

abstract class Shape{
    abstract void draw();
}

class rectangles extends Shape{
    void draw(){
        System.out.println("Drawing Rectangle..");
    }
}

public class abstractClassDo {
    void implementAbstractClass(){
        rectangles rectangles = new rectangles();
        rectangles.draw();
    }
}
