import java.lang.*;
import java.lang.Integer;

class Literal
{
   public static void main(String args[])
   {
     byte b1 = 10; // decimal
	 byte b2 = 0b1010; // binary
	 byte b3 = 012; //oct
	 byte b4 = 0xA;
	 
	 System.out.println(b1);
	 System.out.println(b2);
	 System.out.println(b3);
	 System.out.println(b3);//, b2 , b3 , b4);
	 
	 int x = -5;
	 String s = Integer.toBinaryString(x);
	 System.out.println(s);
	 
	 char y = 0x0BC;
	 System.out.println(y);
	 
	 long l = 99999999L;

	 }
 }