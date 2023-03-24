import java.lang.*;
public class FourteenPriorityThread extends Thread {
    public void run(){
        System.out.println("Inside the run method");
    }

    public static void main(String[] args) {
        FourteenPriorityThread t1 = new FourteenPriorityThread();
        FourteenPriorityThread t2 = new FourteenPriorityThread();
        FourteenPriorityThread t3 = new FourteenPriorityThread();

        System.out.println("Priority of Thread t1: " + t1.getPriority());
        System.out.println("Priority of Thread t2: " + t2.getPriority());
        System.out.println("Priority of Thread t2: " + t3.getPriority());

        t1.setPriority(8);
        t2.setPriority(5);
        t3.setPriority(2);

        System.out.println("Priority of Thread t1: " + t1.getPriority());
        System.out.println("Priority of Thread t2: " + t2.getPriority());
        System.out.println("Priority of Thread t2: " + t3.getPriority());

        // System.out.println("Executing The Thread: " + Thread.currentThread().getName());
        // System.out.println("Priority of the main thread: " + Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);

        System.out.println("\nPriority of the main thread: " + Thread.currentThread().getPriority());
    }
}
