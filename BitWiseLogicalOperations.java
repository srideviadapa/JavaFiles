package OperatorsPackage;
public class BitWiseLogicalOperations
{
	public BitWiseLogicalOperations()
	{
		System.out.println("BITWISELOGICAL_OPERATIONS");
		System.out.println("======================");
	}
	public void bwand(int x,int y)
	{
		System.out.println("The Value of "+x+" & "+y+" is "+(x&y));
	}
	public void bwxor(int x,int y)
	{
		System.out.println("The Value of "+x+" ^ "+y+" is "+(x^y));
	}
	public void bwor(int x,int y)
	{
		System.out.println("The Value of "+x+" | "+y+" is "+(x|y));
	}
}