package OperatorsPackage;
public class RelationalOperations
{
	protected RelationalOperations()
	{
		System.out.println("RELATIONAL_OPERATIONS");
		System.out.println("======================");
	}
	protected void lt(int x,int y)
	{
		System.out.println("The Value of "+x+" < "+y+" is "+(x<y));
	}
	protected void gt(int x,int y)
	{
		System.out.println("The Value of "+x+" > "+y+" is "+(x>y));
	}
	protected void ltet(int x,int y)
	{
		System.out.println("The Value of "+x+" <= "+y+" is "+(x<=y));
	}
	protected void gtet(int x,int y)
	{
		System.out.println("The Value of "+x+" >= "+y+" is "+(x>=y));
	}
	protected void etet(int x,int y)
	{
		System.out.println("The Value of "+x+" == "+y+" is "+(x==y));
	}
	protected void net(int x,int y)
	{
		System.out.println("The Value of "+x+" != "+y+" is "+(x!=y));
	}
}