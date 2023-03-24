// Using this pointer
class Point{
    int x,y,z;
    Point(){
        this.x=0;
        this.y=0;
        this.z=0;
        System.out.println("Invoked 1st constructor");
    }
    
    Point(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("Invoked 2nd constructor");
    }
}

class EightThisPointer {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(5,10,15);
        System.out.println(p1.x+", "+p1.y+", "+p1.z);
        System.out.println(p2.x+", "+p2.y+", "+p2.z);
    }
}