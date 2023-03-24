class BankBranch {
    static int noOfAcc = 0;
    static double netWorth = 50000;
    int customerNo;
    String customerName;
    double accBal;
    double loanSanctioned = 0;
    int noOfInstallments = 0;

    BankBranch(int custNo, String custName, double accBal) {
        this.customerNo = custNo;
        this.customerName = custName;
        this.accBal = accBal;

        netWorth = netWorth + accBal;
        noOfAcc++;
    }

    void getLoan(double amount) {
        if ((amount < 2*this.accBal) && (this.loanSanctioned < netWorth)){
            System.out.println("\nCongrats!! Your loan is approved");
            netWorth = netWorth - amount;
            this.loanSanctioned += amount;
        }
        else{
            System.out.println("\nSorry!! Loan can't be sanctioned");
        }
    }

    void repayLoan(double amountRepay){
        netWorth += amountRepay;
        this.noOfInstallments++;

        if (amountRepay > loanSanctioned){
            double difference = amountRepay - loanSanctioned;
            this.accBal += difference;
            this.loanSanctioned = 0;
        }
        else {
            this.loanSanctioned -= amountRepay;
        }
    }

    void viewAcc(){
        System.out.println("\nCustomer Number: " + this.customerNo);
        System.out.println("Customer Name: " + this.customerName);
        System.out.println("Acc Balance: " + this.accBal);
        if (loanSanctioned != 0){
            System.out.println("No. of Installments made: " + this.noOfInstallments);
        }
    }

    void bankInspection(){
        System.out.println("\nNet Worth of Bank: " + netWorth);
        System.out.println("No. of Accounts in the Branch: " + noOfAcc);
        System.out.println("Total Loan amount sanctioned: " + this.loanSanctioned);
    }
}

public class Main {
    public static void main(String[] args) {
        BankBranch b1 = new BankBranch(21,"Harsh", 12000);
        b1.viewAcc();
        b1.bankInspection();

        System.out.println(BankBranch.netWorth); //Networth before loan sanctioned
        b1.getLoan(6000);
        System.out.println(BankBranch.netWorth); //Networth after loan sanctioned

        b1.repayLoan(7000);
        b1.viewAcc();
        b1.bankInspection();
    }
}