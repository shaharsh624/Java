// 9-Use of Finally
public class NineUserDefinedException2 {
    public static void main(String[] args) {
        try {
            System.out.println("Try Block");
            int data = 65/0;
            System.out.println(data);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally gets executed");
        }
    }
}
