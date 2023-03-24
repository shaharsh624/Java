class newThread extends Thread{
    public void run(int n) {
        if (n%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}

public class Four{
    public static void main(String[] args) {
            newThread t1 = new newThread();
            newThread t2 = new newThread();
            newThread t3 = new newThread();

            t1.run(3);
            t2.run(4);
            t3.run(9);

            t1.start();
            t2.start();
            t3.start();
    }
}