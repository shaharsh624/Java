// Thread extending Thread class
public class TwelveThread extends Thread{
    public void run(){
        System.out.println("Running the thread");
    }

    public static void main(String[] args) {
        TwelveThread t1 = new TwelveThread();
        t1.start();
    }
}
