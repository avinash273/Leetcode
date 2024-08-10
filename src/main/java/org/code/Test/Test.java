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

    public class TestException extends Exception {
        private static final long serialVersionUID = 1L;
        public TestException() {
            System.out.println("TestException");
        }
    }

    public static void main(String[] args) {
        try{
            int i = 0;
            Test t = new Test();
            t.foo();
            System.out.println("Finished running");
        }catch (Exception e){
            if(e instanceof TestException){
                TestException te = (TestException) e;
                System.out.println(te.getMessage());
            }
        }

    }
}
