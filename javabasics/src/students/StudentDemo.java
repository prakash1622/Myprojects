package students;

public class StudentDemo {
	public static void main (String[]args) {
		
		int m1=100;
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		s1.Sid=122;
		s1.Sname="prakash";
		s1.Depatment="ece";
		s1.Section='A';
		s1.G_year=2025;
		s1.number=1234567890;
		
		s2.Sid=123;
		s2.Sname="prasanna";
		s2.Depatment="ece";
		s2.Section='B';
		s2.G_year=2024;
		s2.number=1234565678;
		
		s3.Sid=124;
		s3.Sname="pravin";
		s3.Depatment="ece";
		s3.Section='C';
		s3.G_year=2026;
		s3.number=1234765490;
	
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
		
