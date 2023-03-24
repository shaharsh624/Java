// Taking in TestThread
class testThread implements Runnable{
    public void run() {
        System.out.println("Running the Thread from different class");
    }
}

public class ThreePart2{
    public static void main(String[] args) {
        testThread t1 = new testThread();
        Thread t2 = new Thread(t1);
        t2.start();
    }
}