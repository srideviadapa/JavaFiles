import java.util.*;
class Student
{
	String name;
	int age;
	String language;
	Student(String name,int age)
	{	
		this("SriSatya",18,"Hindi");
		this.name=name;
		this.age=age;
		System.out.println("Student name is "+name+" and of age "+age);
	}
	Student(String name,int age,String language)
	{
		this.name=name;
		this.age=age;
		this.language=language;
		System.out.println("Student name is "+name+" and of age "+age+" and she likes "+language);
	}
}
class Constructor 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Student Name ");
		String name=sc.next();
		System.out.println();
		System.out.print("Enter the Student age ");
		int age = sc.nextInt();
		Student s1=new Student(name,age);
	}
}