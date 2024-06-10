import java.util.*;
class EmployeeDetails
{
	Scanner sc=new Scanner(System.in);
	String name;
	int age;
	String gender;
	long phno;
	String qual;
	int experience;
	void personalDetails()
	{
		System.out.print("Enter the Employee Name ");
		name=sc.next();
		System.out.println();
		System.out.print("Enter the Employee age ");
		age=sc.nextInt();
		System.out.println();
		System.out.print("Enter the Employee gender ");
		gender=sc.next();
		System.out.println();
		System.out.print("Enter the Employee Phno ");
		phno=sc.nextLong();
		System.out.println();
	}
	void qualification()
	{
		System.out.print("Enter the employee Qualification ");
		qual=sc.next();
		System.out.println();
		System.out.print("Enter the Employee Experience ");
		experience=sc.nextInt();
		System.out.println();
	}
	void display()
	{
		System.out.println("Employee Details ");
		System.out.println("=================");
		System.out.println("Employee Name is "+name);
		System.out.println("Employee Age is "+age);
		System.out.println("Employee Gender is "+gender);
		System.out.println("Employee Phno is "+phno);
		System.out.println("Employee Qualification is "+qual);
		System.out.println("Employee has Experience of "+experience);
	}
}
public class EmployeeDetailsDemo
{
	public static void main(String args[])
	{
		EmployeeDetails e1=new EmployeeDetails();
		e1.personalDetails();
		e1.qualification();
		e1.display();
	}
}