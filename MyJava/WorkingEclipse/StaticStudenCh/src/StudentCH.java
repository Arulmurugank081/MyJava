class Student
{
	static private int rollno = 0;
	
	Student()
	{
		rollno ++;
	}
	
	public int GetRollNO()
	{
		return rollno;
	}
}

class Account
{
	static private long accountno = 0;
	Account()
	{
		accountno++;
	}
}

class Customer 
{
	static private long custid = 0;
	public Customer() {
		// TODO Auto-generated constructor stub
		custid++;
	}
}

public class StudentCH {
	
	public static void main(String s[])
	{
		Student ss = new Student();
		System.out.println("Roll No is" + ss.GetRollNO());
		
		Student ss1 = new Student();
		System.out.println("Roll No is" + ss1.GetRollNO());
	}

}
