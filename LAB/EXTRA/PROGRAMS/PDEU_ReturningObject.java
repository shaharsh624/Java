package src;// Returning Object
import java.util.Scanner;

class Test{
    int a;
    Test(int i){
        a = i;
    }
    Test incr(){
        Test t = new Test(a + 10);
        return t;
    }
}


class PDEU_ReturningObject
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
	    Test t1 = new Test(n);
	    Test t2;
	    t2 = t1.incr();
	    System.out.println(t1.a);
	    System.out.println(t2.a);
	}
}
