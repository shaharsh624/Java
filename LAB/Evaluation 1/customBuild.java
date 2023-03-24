package Evaluation1;

interface Laptop {
    String color(String color);
    int storage();
    String processor = null;
    final int ramSize = 16; //final
}

class HP implements Laptop{
    String graphicCard (String graphicCard) {
        return graphicCard;
    }
    public String color(String color) {
        return color;
    }
    public int storage() {
        return 512;
    }
    String processor = "Intel i5";
}

class pavilionSeries extends HP{
    String backlitColor = "Red";
}


class Dell implements Laptop{
    public Dell(int maxChargingCapacity) { //constructor
        this.maxChargingCapacity = maxChargingCapacity; //this
    }

    int maxChargingCapacity = 150;
    public String color(String color) {
        return "Black";
    }
    public int storage() {
        return 1024;
    }
    String processor = "Intel i7";
}

class inspironSeries extends Dell{
    public inspironSeries(int maxChargingCapacity) {
        super(maxChargingCapacity);
    }
    String displayPanel(){
        return "Amoled";
    }
}

public class customBuild {
    public static void main(String[] args) {
        Dell d = new Dell(200);
        System.out.println("");
        HP hp = new HP();
        hp.storage();
        hp.color("Grey");
        hp.graphicCard("intel Iris Xe");
    }
}
