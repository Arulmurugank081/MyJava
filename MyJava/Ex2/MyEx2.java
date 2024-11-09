// Geting input from Keyboard

import java.lang.*;
import java.util.*; // import util package for scanner

class MyEx2
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