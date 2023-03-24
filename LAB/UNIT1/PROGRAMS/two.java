import java.util.Scanner;

public class two{
  public static void main (String[]args){
  
    Scanner sc = new Scanner(System.in);
    int count = 0, n = 0, i = 1, j = 1;
    System.out.print("Enter number of prime numbers to be printed: ");
    int a = sc.nextInt();
    while (n < a)
      {
	j = 1;
	count = 0;
	while (j <= i)
	  {
	    if (i % j == 0)
	      count++;
	    j++;
	  }
	if (count == 2)
	  {
	    System.out.printf ("%d ", i);
	    n++;
	  }
	i++;
      }
  }
}
