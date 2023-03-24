// Taking obj of thread in main
public class ThreePart1 implements Runnable{
    public void run(){
        System.out.println("Running the Thread");
    }

    public static void main(String[] args) {
        ThreePart1 t1 = new ThreePart1();
        Thread t2 = new Thread(t1);
        t2.start();
    }
}
