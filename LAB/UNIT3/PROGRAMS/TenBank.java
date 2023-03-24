import java.util.Scanner;

public class TenBank {
    static int Balance;
    static int exceptionCached = 0;

    // Deposit
    static void deposit(int amountDeposited){
        Balance += amountDeposited;
    }

    // Withdraw
    static void withdraw(int amountWithdrawed){
        try{
            if (amountWithdrawed > Balance){
                exceptionCached = 1;
                throw new Exception("NotSufficientFundException");
            }
            else{
                Balance -= amountWithdrawed;
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 1;
        int amountWithdraw;
        int amountDeposited;

        try{
            System.out.print("Enter amount to be deposited: ");
            amountDeposited = sc.nextInt();
            deposit(amountDeposited);

            while (answer==1 && exceptionCached==0){
                System.out.print("Enter amount to withdraw: ");
                amountWithdraw = sc.nextInt();
                withdraw(amountWithdraw);
                if (exceptionCached==0){
                    System.out.print("Do you want to withdraw more money???\n1-Yes\n0-No\nEnter: ");
                    answer = sc.nextInt();
                }
            }
            System.out.println("Balance: " + Balance);

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
