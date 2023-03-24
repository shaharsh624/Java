package src;

public class Shape {
    public void display(){
        System.out.println("Inside Display");
    }
}
class Rectangle extends Shape{
    public void Area(){
        System.out.println("Inside Area");
    }
}
class Cube extends Rectangle{
    public void volume(){
        System.out.println("Inside Volume");
    }
}
