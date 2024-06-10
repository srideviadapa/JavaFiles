import java.util.*;
abstract class ValueOfShape
{
	int Side;
	int height;
	int length;
	int breadth;
	int base;
	int radius;
	public void getDetails(int s,int l,int h,int b,int base,int r)
	{
		this.Side=s;
		this.length=l;
		this.height=h;
		this.breadth=b;
		this.base=base;
		this.radius=r;
	}
	public abstract void areaOfSquare(int s);
	public abstract void areaOfRectangle(int l,int b);
	public abstract void areaOfTriangle(int base,int h);
	public abstract void areaOfCircle(double pi,int r);
}
class Areas extends ValueOfShape
{
	public void areaOfSquare(int s)
	{
		System.out.println("The Area of the square is "+(s*s));
	}
	public void areaOfRectangle(int l,int b)
	{
		System.out.println("The Area of the Rectangle is "+(l*b));
	}
	public void areaOfTriangle(int base,int h)
	{
		System.out.println("The Area of the Triangle is "+(0.5*base*h));
	}
	public void areaOfCircle(double pi,int r)
	{
		System.out.println("The Area of the Circle is "+(pi*r*r));
	}
}
public class AbstractClass
{
	public static void main(String args[])
	{
		Areas a1=new Areas();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Side ");
		int s=sc.nextInt();
		System.out.println();
		System.out.print("Enter the length ");
		int l=sc.nextInt();
		System.out.println();
		System.out.print("Enter the breadth ");
		int b=sc.nextInt();
		System.out.println();
		System.out.print("Enter the height ");
		int h=sc.nextInt();
		System.out.println();
		System.out.print("Enter the value of base ");
		int base=sc.nextInt();
		System.out.println();
		System.out.print("Enter the radius ");
		int radius=sc.nextInt();
		System.out.println();
		double pi = 3.14;
		a1.getDetails(s,l,h,b,base,radius);
		a1.areaOfSquare(s);
		a1.areaOfRectangle(l,b);
		a1.areaOfTriangle(base,h);
		a1.areaOfCircle(pi,radius);
	}
}