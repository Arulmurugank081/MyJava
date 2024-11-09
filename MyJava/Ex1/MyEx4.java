import java.lang.*;

  class MyEx4
{
	/*
	Hello World
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
        at MyEx4.main(MyEx4.java:8)
		*/// -- run time error, jvm throw the run time error.
		
	public static void main(String[] args)
	{
		System.out.println("Hello World");
        System.out.println(args[0]);	// should be expected comment arugment 	
	}
}