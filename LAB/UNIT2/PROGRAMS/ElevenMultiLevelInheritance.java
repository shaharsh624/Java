class Animal{
    void sound(){System.out.println("Animals hae different sounds");}
}
class Cat extends Animal{
    void sound(){System.out.println("Meow");}
}
class Kitten extends Cat{
    void sound(){System.out.println("Meowww");}
}
public class ElevenMultiLevelInheritance {
    public static void main(String args[]) {
        // Creating Reference of Animal
        Animal a1;
        Cat c1 = new Cat();
        Kitten k1 = new Kitten();

        a1 = c1;
        a1.sound();
        a1 = k1;
        a1.sound();
    }
}