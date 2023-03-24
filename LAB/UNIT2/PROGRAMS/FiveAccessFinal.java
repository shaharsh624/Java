class Distance{
    public int feet, inch;
    private int meter, centimeter;
    final int kilometer = 1500;

    Distance(int f, int i){
        this.feet = f;
        this.inch = i;
        meter = 10;
        centimeter = 100;
    }

    void display(){
        System.out.println("Feet: " + feet);
        System.out.println("Inch: " + inch);
        System.out.println("Meter: " +meter);
        System.out.println("Centimeter: " + centimeter);
        // kilometer = 2000; // kilometer can't bechanged as it is final
    }
}

public class FiveAccessFinal {
    public static void main(String[] args) {
        Distance d1 = new Distance(23, 12);
        Distance d2 = new Distance(20, 30);
        d1.display();
        d2.display();
        // System.out.println(meter); // As it's Private, can't be called
        // System.out.println(centimeter); // As it's Private, can't be called
    }
}
