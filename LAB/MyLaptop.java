import Evaluation1.Laptop;

public class MyLaptop {
    String processor;
    int ramSize; // In GB
    int storage; // In GB
}

class HP extends MyLaptop{
    String backlitColor = "Pantone";
    String processor = "Intel i7";
    ramSize = 8;

    String backlitColor;
    processor = "Intel i9";
    ramSize = 12;
}

class Dell extends MyLaptop{
    int maxchargeCapacity;
    processor = "Intel i5";
    ramSize = 6;

    String graphicCard;
    processor = "Intel i9";
    ramSize = 16;
}

class Acer extends MyLaptop {
    String graphicCard;
    processor = "AMD Ryzen 7";
    ramSize = 10;
}


public class customBuild {
    HP hp = new HP();
    hp.backlit;
}
