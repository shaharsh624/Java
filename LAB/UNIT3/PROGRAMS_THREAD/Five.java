class PrimeThread implements Runnable{
    void prime(int num) {
        // Prime number
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

    public void run() {
        prime(29);
    }
}

class ArmstrongThread implements Runnable{
    void arms(int number) {
        // Armstrong number
        int originalNumber, remainder, result = 0;
        originalNumber = number;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }

    public void run() {
        arms(371);

    }
}

class PalindromeThread implements Runnable{
    void palin(String str) {
        // Palindrome number
        String reverseStr = "";
        int strLength = str.length();
        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }

    public void run() {
        palin("Radar");
    }
}

public class Five{
    public static void main(String[] args) {
        PrimeThread prime = new PrimeThread();
        Thread t1 = new Thread(prime);

        ArmstrongThread armst = new ArmstrongThread();
        Thread t2 = new Thread(armst);

        PalindromeThread palin = new PalindromeThread();
        Thread t3 = new Thread(palin);

        t1.start();
        t2.start();
        t3.start();
    }
}