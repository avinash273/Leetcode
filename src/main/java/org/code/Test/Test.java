package org.code.Test;

public class Test {
    public void foo(){
        try{
            throw new RuntimeException();
        }
        finally {
            System.out.println("In Finally Block");
        }
    }

    public static void main(String[] args) {
        try{
            int i = 0;
            Test t = new Test();
            t.foo();
            System.out.println("Finished running");
        }catch (Exception e){}
    }
}
