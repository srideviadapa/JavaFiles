import java.util.*;
class Parent
{
	String initial;
	String caste;
}
class Child extends Parent
{
	void display(String initial,String caste)
	{
		System.out.println("I have inherited my Parent Initial "+initial);
		System.out.println("I have inherited my Parent Caste "+caste);
	}
}
class SingleInheritance
{
	public static void main(String args[])
	{
		Child c1=new Child();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Initial ");
		c1.initial=sc.next();
		System.out.println();
		System.out.print("Enter Your Caste ");
		c1.caste=sc.next();
		System.out.println();
		c1.display(c1.initial,c1.caste);
	}
}