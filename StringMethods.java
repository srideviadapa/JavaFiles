import java.util.*;
class StringMethods 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String x=sc.next();
		System.out.println(x.charAt(3));
		System.out.println(x.toUpperCase());
		System.out.println(x.toLowerCase());
		System.out.println(x.toCharArray());
		System.out.println(x.length());
		System.out.println(x.isEmpty());
		System.out.println(x.trim());
	}
}