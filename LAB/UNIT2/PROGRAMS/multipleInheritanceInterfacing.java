interface BankA{
    float rateOfInterest();
}
interface BankB{
    float securities(long amount);
}
class SBI implements BankA, BankB{
    public float rateOfInterest() {
        return 9.75f;
    }
    public float securities(long amount){
        return (float)0.1f*amount;
    }
}
class ICICI implements BankA, BankB{
    public float rateOfInterest() {
        return 8f;
    }
    public float securities(long amount){
        return (float)0.2f*amount;
    }
}
class Axis implements BankA, BankB{
    public float rateOfInterest() {
        return 9f;
    }
    public float securities(long amount){
        return (float)0.3f*amount;
    }
}
public class multipleInheritanceInterfacing {
    public static void main(String[] args) {
        SBI s = new SBI();
        BankA i = new ICICI();
        BankB a = new Axis();

        System.out.println(s.rateOfInterest());
        System.out.println(s.securities(5000863));
        System.out.println(i.rateOfInterest());
        System.out.println(a.securities(8645167));
    }
}
