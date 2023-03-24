class Apparel {
    String itemId;
    String itemType;
    int price;
    static int count = 100;

    Apparel(int price, String itemType) {
        this.price = price;
        this.itemType = itemType;
    }

    void calculatePrice() {
        this.price = (int) (this.price * 1.05);
    }

    void setPrice(int price) {
        this.price = price;
    }

    void getItemId() {
        count++;
        this.itemId = itemType.charAt(0) + String.valueOf(count);
        System.out.println("\nItem Id of Apparel: " + itemId);
    }
}

class Cotton extends Apparel {
    int discount;
    Cotton(int price, int discount) {
        super(price, "Cotton");
        this.discount = discount;
    }

    public void calculatePrice() {
        super.calculatePrice();
        this.price = this.price - ((this.price * discount) / 100);
        this.price = (int) (this.price * 1.05);
        System.out.println("Final price of Cotton Apparel: " + this.price);
    }
    
}

class Silk extends Apparel {
    int points = 0;
    int discount;
    
    Silk(int price, int discount) {
        super(price, "Silk");
    }

    void calculatePrice() {
        super.calculatePrice();
        this.price = (int) (this.price * 1.1);
        System.out.println("Final price of Silk Apparel: " + this.price);
    }

    void earnPoints() {
        if(price > 10000) {
            points += 10;
            System.out.println("\nPoints earned: " + points);
        }
        else {
            points += 3;
            System.out.println("\nPoints earned: " + points);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Cotton cotApp = new Cotton(4320,8);
        cotApp.getItemId();
        cotApp.calculatePrice();

        Silk silkApp = new Silk(8300,4);
        silkApp.getItemId();
        silkApp.calculatePrice();
        silkApp.earnPoints();
    }
}
