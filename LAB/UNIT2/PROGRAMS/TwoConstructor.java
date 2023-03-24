import java.util.Scanner;

class distance1 {
    double feet, inch;

    distance1() {
        double feet, inch;
        System.out.println("In default constructor");
    }

    void printData() {
        System.out.println("The distance is: " + feet + "ft.");
        System.out.println("The distance is: " + inch + "in.");
    }

    void setData(double f, double i) {
        feet = f;
        inch = i;
    }
}

class TwoConstructor {
        public static void main(String[] args) {
            distance1 D1 = new distance1();
            distance1 D2 = new distance1();

            distance1 D3 = D1;
            
            //taking input of values...
            Scanner ob = new Scanner(System.in);

            System.out.print("Enter the distance in feet: ");
            double f = ob.nextDouble();

            System.out.print("Enter the distance in inch: ");
            double i = ob.nextDouble();

            //setting and printing data for D1 
            D1.setData(f,i);
            D1.printData();

            D2.setData(f,i);
            D2.printData();

            //setting data of D3 as 50 feet..
            D3.feet = 50;

            System.out.println("The feet of D1: " + D1.feet);
        }
}