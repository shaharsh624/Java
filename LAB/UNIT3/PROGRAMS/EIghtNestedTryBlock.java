public class EIghtNestedTryBlock {
    public static void main(String[] args) {
        try{
            try{
                int n = 62/0;
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }

            try{
                int a[] = new int[5];
                a[5]=62;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
        catch (Exception e){
            System.out.println("Handled the Exception");
        }
    }
}
