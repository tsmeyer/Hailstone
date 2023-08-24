package mypackage;

import java.util.*;

public class Hailstone {

   /**
    * This program generates sequences of numbers produced by the "3N + 1" game.
    * These sequences are called Hailstone Numbers.
    */
   public static void main(String[] args) {

	  Scanner console = new Scanner(System.in);
	  int count;
	  System.out.print("Enter an odd integer (or zero to quit): ");
	  int n = console.nextInt();
	  int a = 210, b = 63;
	  System.out.println(a + " " + b + " " + gcf(a, b));

	  while (n != 0) {

		 System.out.println("You entered: " + n);
		 count = 0;

		 while (n != 1) {

			n = 3 * n + 1;

			while (n % 2 == 0) {
			   n = n / 2;
			}

			count++;
			System.out.print("\t" + n + ", ");
		 }

		 System.out.println("\n\t" + count + " iterations.  ");
		 System.out.print("Enter another odd integer (or zero to quit): ");
		 n = console.nextInt();
	  }

	  System.out.println("Thank you for playing.");
   }

   public static int gcf(int a, int b) {
	  if (b == 0)
		 return a;
	  else {
		 int c = a % b;
		 return gcf(b, c);
	  }
   }
}
