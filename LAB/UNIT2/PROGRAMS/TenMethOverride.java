// SuperClass
class Bank {
   void loanInterest() {
       System.out.println("Interest Rate is 8%");
   }
}

// SubClass-1
class SBI extends Bank {
   void loanInterest() {
       System.out.println("SBI Bank Rate of Interest: 8.2%");
   }
}

// SubClass-2
class Axis extends Bank {
void loanInterest() {
       System.out.println("Axis Bank Rate of Interest: 9.8%");
   } 
}

// SubClass-3
class ICICI extends Bank {
   void loanInterest() {
          System.out.println("ICICI Bank Rate of Interest: 9%");
      }
   }

 // Main Class
public class TenMethOverride
{
  public static void main(String[] args) {
      SBI s = new SBI();
      ICICI i = new ICICI();
      Axis a = new Axis();
      s.loanInterest();
      i.loanInterest();
      a.loanInterest();
   }
}