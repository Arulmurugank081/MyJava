// Geting input from Keyboard

import java.lang.*;
import java.util.*; // import util package for scanner

class MyEx4
{
   public static void main(String args[])
   {
	   //error: variable a might not have been initialized
	   String name = "";
	  // System.out.println(a ,b ,c); //no suitable method found for println(int,int,int)
	  System.out.println("Enter your Name");
	  
	  Scanner sc = new Scanner(System.in);
	 // name = sc.next(); // if Arul murugan means out will be - Arul
	  name = sc.nextLine();// if Arul murugan means out will be Arul murugan
	  System.out.println(name);
	  
	 

   }
}
