package Basics;

public class ExceptionHandling {
    public void implementError() {
        try {
            int data = 50 / 0;
        } catch (Exception e) {
            System.out.println("Custom error");
        }
    }
}

