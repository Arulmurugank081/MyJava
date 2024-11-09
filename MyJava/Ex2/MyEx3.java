// Geting input from Keyboard

import java.lang.*;
import java.util.*; // import util package for scanner

class MyEx3
{
   public static void main(String args[])
   {
	   //error: variable a might not have been initialized
	   int a = 0, b = 0,  c = 0;
	  // System.out.println(a ,b ,c); //no suitable method found for println(int,int,int)
	  System.out.println("Enter two values from keyboard");
	  
	  Scanner sc = new Scanner(System.in);
	  
	  a = sc.nextInt();
	  b = sc.nextInt();
	  c = a + b;
	  
	  System.out.println(" The Sum of values is " + c);
   }
}

///Note: Should be initialized variables

//To know package method - > c:> javap java.util.Scanner;

/*Enter two values from keyboard
10.1
Exception in thread "main" java.util.InputMismatchException
        at java.util.Scanner.throwFor(Scanner.java:864)
        at java.util.Scanner.next(Scanner.java:1485)
        at java.util.Scanner.nextInt(Scanner.java:2117)
        at java.util.Scanner.nextInt(Scanner.java:2076)
        at MyEx3.main(MyEx3.java:17)
		
		*/