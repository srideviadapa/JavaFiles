import java.util.*;
import OperatorsPackage.RelationalOperations;
class AccessSpecifierDemo extends RelationalOperations
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter x value");
		int x=sc.nextInt();
		System.out.println();
		System.out.print("Enter y value");
		int y=sc.nextInt();
		System.out.println();
		AccessSpecifierDemo r1=new AccessSpecifierDemo();
		r1.ltet(x,y);
		r1.gtet(x,y);
		r1.lt(x,y);
		r1.gt(x,y);
		r1.etet(x,y);
		r1.net(x,y);
	}
}