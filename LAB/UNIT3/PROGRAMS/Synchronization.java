import com.sun.source.tree.SynchronizedTree;

class account{
    int balance;
    account(){
        balance=5000;
    }
    void credit(int n) throws InterruptedException{
        System.out.println("Balance before credit is: "+balance);
        int b=balance;
        Thread.sleep(500);
        balance=b+n;
        System.out.println("Balance after credit is: "+balance);
    }
    void disBal(){
        System.out.println("Final balance is: "+balance);
    }
}

class Thread1 implements Runnable{
    Thread t;
    account a;
    int c;
    String thName;
    Thread1(String thName,account a,int c){
        this.thName=thName;
        this.a=a;
        this.c=c;
        t=new Thread(this);
    }
    public void run(){

        System.out.println("In Thread: "+thName);
        synchronized (a){
            try{
                a.credit(c);
            }
            catch(InterruptedException e){
                System.out.println("Main thread interrupted");
            }
        }

    }
}

class Synchronization{
    public static void main(String [] args){
        account ob=new account();
        Thread1 ob1=new Thread1("One", ob, 2000);
        Thread1 ob2=new Thread1("Two",ob, 5000);
        ob1.t.start();
        ob2.t.start();
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        ob.disBal();
    }
}
