import java.lang.*;
import java.util.*;
public class ArrayDemo {
	
	public static void main(String [] arg)
	{
	
		//Finding Sum off all elements in Array
	    int a[] = {1,2,3,4,5,6,7,8,9};
	    int sum = 0;
	    
	    for(int i = 0; i < a.length;i++)
	    {
	    	sum += a[i];
	    	
	    }
	    System.out.println("Sum:" + sum);
	    
	    //Searching an elemnts
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number to search in the array");
	    
	    int n = sc.nextInt();
	    boolean f = false;
	    
	    for(int i = 0; i <a.length; i++)
	    {
	    	if(n == a[i])
	    	{
	    		System.out.println("Index of searched No");	
	    		break;
	    	}
	    	else
	    		f= true;	    	
	     }
	    
	    if(!f)
	    	System.out.println("The Given number is not in the List");
	    
	    //Find Max
	    int max = a[0];
	    for(int i =0; i < a.length; i++)
	    {
	    	if(max < a[i])
	    		max = a[i];	    				
	    }
	    
	    System.out.println("Max" + max);
	    
	}
	
	//Finding Maximum num in the array
	
}
