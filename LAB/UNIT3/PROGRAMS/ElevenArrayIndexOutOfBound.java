public class ElevenArrayIndexOutOfBound {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        try{
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bound Exception");
        }
    }
}