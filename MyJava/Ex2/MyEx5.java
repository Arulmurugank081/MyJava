// Geting input from Keyboard

import java.lang.*;
import java.util.*; // import util package for scanner

class MyEx5
{
   public static void main(String args[])
   {
	   //error: variable a might not have been initialized
	   String name = "";
	  // System.out.println(a ,b ,c); //no suitable method found for println(int,int,int)
	  System.out.println("Enter Value");
	  
	  Scanner sc = new Scanner(System.in);
	   sc.useRadix(2);
	   int a = sc.nextInt();
	  System.out.println(a);
	  
	 

   }
}

/*
F:\Working\Java\Ex2>java MyEx5
Enter Value
1010    //Provice binary format by useing useRadix() method
10
*/