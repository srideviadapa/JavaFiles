import java.util.*;
class Number
{
	int x,y;
	float a,b;
	String n1;
	String n2;
	void Value(int x,int y)
	{
		this.x=x;
		System.out.println("The Addition of "+x+" and "+y+" is "+(x+y));
	}
	void Value(float a,float b)
	{
		this.a=a;
		this.b=b;
		System.out.println("The Addition of "+a+" and "+b+" is "+(a+b));
	}
	void Value(String n1,String n2)
	{
		this.n1=n1;
		this.n2=n2;
		System.out.println("The Addition of "+n1+" and "+n2+" is "+(n1+n2));
	}
}
class MethodOverloadingDemo
{
	public static void main(String args[])
	{
	Number n=new Number();
	n.Value(10,20);
	n.Value(2.5f,6.3f);
	n.Value("Sri","Satya");
	}
}