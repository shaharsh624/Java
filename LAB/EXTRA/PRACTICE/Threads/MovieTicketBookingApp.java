package PRACTICE.Threads;
class BookTheatreSeat{
    int totalSeats = 10;
    void bookSeat(int seats){
        synchronized(this){
            if (seats <= totalSeats) {
                System.out.println("Seats booked succesfully");
                totalSeats -= seats;
                System.out.println("Seats available: " + totalSeats);
            }
            else {
                System.out.println("Sorry! " + seats + " seats cannot be booked");
                System.out.println("Seats available: " + totalSeats);
            }
        }
    }
}

class BookMovie extends Thread {
    static BookTheatreSeat bts;
    int seats;

    public void run() {
        bts.bookSeat(seats);
    }

    public static void main(String[] args) {
        bts = new BookTheatreSeat();

        BookMovie m1 = new BookMovie();
        m1.seats = 7;
        m1.start();

        BookMovie m2 = new BookMovie();
        m2.seats = 6;
        m2.start();
    }
}

class TotalEarnings extends Thread{
    int totalEarned = 0;
    public void run(){
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                totalEarned += 100; // prize of ticket is set to 100
            }
            this.notify();
        }
    }
}

class BookMovie {
    public static void main(String[] args) throws InterruptedException {
        TotalEarnings te = new TotalEarnings();
        te.start();
        synchronized (te){
            te.wait();
            System.out.println("Total Earnings : " + te.totalEarned);
        }
    }
}