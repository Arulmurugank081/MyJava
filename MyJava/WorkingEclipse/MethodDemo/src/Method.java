
public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a[]= {1,2,3,4,5}; Method m = new Method(); Modify(a);
		 * 
		 * for(int x: a) { System.out.println(x); }
		 */
		
		Method m = new Method();
		int f = m.FindMaxValueOfVar(1,2,3,4);
		System.out.println("f" + f);
		System.out.println("");
		
		int f1 = m.FindMaxValueOfVar(87,54,34,56,78,90);
		System.out.println("f" + f1);
		
		
		f = m.SumOfVar(1,2,3,4);
		System.out.println("Sum of f" + f);
		System.out.println("");
		
		f1 = m.SumOfVar(87,54,34,56,78,90);
		System.out.println("Sum of f1" + f1);
		
	}
	
	static void Modify(int[] str)
	{
		str[0] = 50;
	}
	
	int FindMaxValueOfVar(int ...arg)
	{
		if(arg.length == 0) 
			return Integer.MIN_VALUE;
		
		int m = arg[0];
		for(int i = 0; i < arg.length; i++)
		{
			if(m < arg[i])
				m = arg[i];
		}
		
		return m;
	}
	
	int SumOfVar(int ...arg)
	{
		if(arg.length == 0) 
			return Integer.MIN_VALUE;
		
		int sum = 0;
		for(int i = 0; i < arg.length; i++)
		{
			sum += arg[i];				
		}
		
		return sum;
	}

}
