package src;

public class PDEU_MethodOverloading{
    /* Method Overloading:
    - Done by changing the arguments passed.
    - Cannot be done by changing return-type of method.
    */
    public static void findArea(int l){
        System.out.println("Area of Square is :"+ (l*l));
    }
    public static void findArea(int l, int b){
        System.out.println("Area of Rectangle is :"+ (l*b));
    }
    public static void findArea(int l, int b, int h){
        System.out.println("Area of Trapezoid is :"+ (0.5*(l+b)*h));
    }
    public static void main(String[] args) {
        findArea(5);
        findArea(5,6);
        findArea(5,6,7);
        PDEU_MethodOverloading.main(5);
        PDEU_MethodOverloading.main(89.56);
    }
    public static void main(int args){
        System.out.println("This is integer main");
        System.out.println(args);
    }
    public static void main(Double args) {
        System.out.println("These is double main");
        System.out.println(args);
    }
}