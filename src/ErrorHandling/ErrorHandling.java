package ErrorHandling;

/**
 * https://www.linkedin.com/learning/java-11-plus-essential-training/declare-and-use-custom-classes?u=56687537
 * from this series n
 */
public class ErrorHandling {
    public static void main(String[] args) {

        String s = "";
        try {
            var sub = s.substring(1);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Null pointer: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Out of bounds: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("I don't know what happened: " + e.getMessage());
        }
        System.out.println("I'm not dead yet!");
    }
}
