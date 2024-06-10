package OperatorsPackage;
public class ArithmeticOperations
{
	public ArithmeticOperations()
	{
		System.out.println("ARITHEMETIC_OPERATIONS");
		System.out.println("======================");
	}
	public void add(int x,int y)
	{
		System.out.println("The Addition of "+x+" and "+y+" is "+(x+y));
	}
	public void sub(int x,int y)
	{
		System.out.println("The Subtraction of "+x+" and "+y+" is "+(x-y));
	}
	public void mul(int x,int y)
	{
		System.out.println("The Multiplication of "+x+" and "+y+" is "+(x*y));
	}
	public void div(int x,int y)
	{
		System.out.println("The Division of "+x+" and "+y+" is "+(x/y));
	}
	public void mod(int x,int y)
	{
		System.out.println("The Modulus of "+x+" and "+y+" is "+(x%y));
	}
}