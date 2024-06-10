import java.util.*;
class MultiCatchDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.print("Enter x value ");
		int x=sc.nextInt();
		System.out.println();
		System.out.print("Enter y value ");
		int y=sc.nextInt();
		System.out.println();
		int div=x/y;
		String s= "Preethi";
		System.out.println("The Division of "+x+" and "+y+" is "+(x+y));
		System.out.println(s.length());
		}
		catch(InputMismatchException e)
		{
			System.out.println("Cannot enter "+e.getMessage());
		}
		catch(ArithmeticException a)
		{
			System.out.println("Cannot perform "+a.getMessage());
		}
		catch(NullPointerException n)
		{
			System.out.println("Cannot print the length");
		}
		catch(Exception e)
		{
			System.out.println("Unknown Exception");
		}
	}
}