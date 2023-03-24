public class Twelve{

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
    }
}