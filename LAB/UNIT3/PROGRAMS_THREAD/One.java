public class One extends Thread{
    public static void main(String[] args) {
        One t1 = new One();
        t1.start();
        Thread t2 = currentThread();

        System.out.println("Id: "+currentThread().getId());
        System.out.println("Name: "+currentThread().getName());
        System.out.println("Priority: "+currentThread().getPriority());
        t2.setName("Current Thread");
        System.out.println("Name: "+currentThread().getName());
    }
}
