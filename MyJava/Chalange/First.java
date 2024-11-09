import java.lang.*;
import java.util.*;

class First
{
 public static void main(String args[])
 {
    String name;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("May I know your name");
	name = sc.nextLine();
	
	System.out.println("Welcome to Java " + name);
	}
}
	