// Taking obj of thread in main
/*
public class ThirteenThread implements Runnable{
    public void run(){
        System.out.println("Running the Thread");
    }

    public static void main(String[] args) {
        ThirteenThread t1 = new ThirteenThread();
        Thread t2 = new Thread(t1);
        t2.start();
    }
}
*/

// Taking in TestThread
/*
class testThread implements Runnable{
    public void run() {
        System.out.println("Running the Thread from different class");
    }
}

public class ThirteenThread{
    public static void main(String[] args) {
        testThread t1 = new testThread();
        Thread t2 = new Thread(t1);
        t2.start();
    }
}
*/
