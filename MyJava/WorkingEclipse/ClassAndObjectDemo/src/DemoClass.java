

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		
		s.name = "Arul";
		s.rollno =1;
		s.course ="CSE";
		s.m1 = 40;
		s.m2 = 20;
		s.m3 = 50;
		s.m4 = 60;
		s.m5 = 90;
		
		System.out.println("Student details:");
		System.out.println("Roll No" + s.rollno);
		System.out.println("Name"+ s.name);
		System.out.println("Total" +s.TotalMarks());
		

	}

}
