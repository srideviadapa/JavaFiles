import java.util.*;
import OperatorsPackage.ArithmeticOperations;
class PackageDemo
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
		ArithmeticOperations a1=new ArithmeticOperations();
		a1.add(x,y);
		a1.sub(x,y);
		a1.mul(x,y);
		a1.div(x,y);
		a1.mod(x,y);
		System.out.println();
		OperatorsPackage.BitWiseLogicalOperations b1=new OperatorsPackage.BitWiseLogicalOperations();
		b1.bwand(x,y);
		b1.bwor(x,y);
		b1.bwxor(x,y);
	}
}