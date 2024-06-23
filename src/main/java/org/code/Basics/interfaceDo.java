package org.code.Basics;

class circle implements Drawable{
    public void draw(){
        System.out.println("drawing circle..");
    }
}

public class interfaceDo {
    void implementCircle(){
        circle circle = new circle();
        circle.draw();
    }
}
