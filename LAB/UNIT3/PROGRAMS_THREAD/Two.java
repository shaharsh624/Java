// Extending Thread class
public class Two extends Thread{
    public void run(){
        System.out.println("Running the thread");
    }

    public static void main(String[] args) {
        Two t1 = new Two();
        t1.start();
    }
}
