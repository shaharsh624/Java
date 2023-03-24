public class newThread extends Thread{
    public static void main(String[] args) {
        newThread t1 = new newThread();
        t1.start();
        Thread t2 = currentThread();

        System.out.println(currentThread().getName());
        t2.setName("This is current thread");
        System.out.println(currentThread().getName());
    }
}
