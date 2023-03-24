// Taking obj of thread in TestThread using for loop

class testThread implements Runnable{
    Thread th;
    testThread(){
        th = new Thread("New Demo Thread");
        System.out.println("Child thread created" + th);
    }
    public void run() {
        for (int i=5 ; i>0 ; i--){
            System.out.println("In Child Thread " + i);
        }
    }
}

public class threadForloop{
    public static void main(String[] args) throws InterruptedException {
        testThread t1 = new testThread();
        Thread t2 = new Thread(t1);
        t2.start();
        for (int j=5 ; j>0 ; j--){
            t2.sleep(2000);
        }
    }
}
