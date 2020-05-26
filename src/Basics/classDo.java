package Basics;

/**
 * this is simple class and object manipulation code
 */
class Rectangle {
    int length;
    int width;

    void insert(int len, int wid) {
        this.length = len;
        this.width = wid;
    }

    void calculateArea() {
        System.out.println("Area: " + this.length * this.width);
    }

    //constructor
    Rectangle() {
        this.length = 0;
        this.width = 0;
    }
}

public class classDo {
    void implementRectangle() {
        Rectangle Rectangle1 = new Rectangle();
        Rectangle Rectangle2 = new Rectangle();
        Rectangle1.insert(10, 5);
        Rectangle2.insert(20, 5);

        System.out.println("\nArea Calculations for objects");
        Rectangle1.calculateArea();
        Rectangle2.calculateArea();
    }

}
