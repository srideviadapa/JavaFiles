import java.util.*;
class Values
{
	int r;
	int h;
	double pi=3.14;
	Values(int r,int h)
	{
		this.r=r;
		this.h=h;
		System.out.println("The Values you entered are "+r+" and "+h);
	}
}
class VolumeOfCylinder extends Values
{
	VolumeOfCylinder(int r,int h)
	{
		super(r,h);
		int a=super.r;
		int b=super.h;
		double v=(super.pi*a*a*b);
		System.out.println("The Volume Of Rectangle is "+v);
	}
}
class VolumeOfCone extends VolumeOfCylinder
{
	VolumeOfCone(int r,int h)
	{
		super(r,h);
		double vol=(super.pi*r*r*h)/3;
		System.out.println("The Volume Of Cone is "+vol);
	}
}
class MultilevelInheritance
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius ");
		int x=sc.nextInt();
		System.out.println();
		System.out.print("Enter the height ");
		int y=sc.nextInt();
		System.out.println();
		VolumeOfCone v1=new VolumeOfCone(x,y);
	}
}