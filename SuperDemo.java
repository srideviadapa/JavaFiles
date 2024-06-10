import java.util.*;
class SquareValue
{
	int value;
	SquareValue(int value)
	{
		this.value=value;
		System.out.println("The Value you entered is "+value);
	}
}
class Area extends SquareValue
{
	Area(int value)
	{
		super(value);
		int val=super.value;
		System.out.println("The Area of the Square with Side "+val+" is "+(val*val));
	}
}
class Perimeter extends Area
{
	Perimeter(int value)
	{
		super(value);
		System.out.println("The Perimeter of the Square with Side "+value+" is "+(4*value));
	}
}
class SuperDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a value ");
		int x=sc.nextInt();
		System.out.println();
		Perimeter p1=new Perimeter(x);
	}
}