import java.util.*;
interface InternalMarks
{
	int total[]=new int[5];
	abstract public void get_Details(String a[]);
}
interface ExternalMarks extends InternalMarks
{
	abstract public void get_Marks(String sub[]);
	abstract public void show_Marks(String sub[],int[] x,int[] y);
}
class Parent implements InternalMarks,ExternalMarks
{
	Scanner sc=new Scanner(System.in);
	public void get_Details(String[] sub)
	{
		int m1[]=new int[sub.length];
		int m2[]=new int[sub.length];
		for(int i=0;i<sub.length;i++)
		{
			System.out.print("Enter mid-1 Marks of "+sub[i]);
			m1[i]=sc.nextInt();
			System.out.println();
			System.out.print("Enter mid-2 Marks of "+sub[i]);
			m2[i]=sc.nextInt();
			System.out.println();
			total[i]=((m1[i]/2)+(m2[i]/2)/2);
		}
	}
	public void get_Marks(String sub[])
	{
		int externals[]=new int[sub.length];
		for(int i=0;i<sub.length;i++)
		{
			System.out.print("Enter External Marks of "+sub[i]);
			externals[i]=sc.nextInt();
		}
		this.show_Marks(sub,externals,total);
	}
	public void show_Marks(String[] sub,int[] total,int[] externals)
	{
		System.out.println("Subject"+"		"+"Internal_Marks"+"	"+"External_Marks"+"	"+"Total");
		for(int i=0;i<sub.length;i++)
		{
			System.out.println(sub[i]+"		"+externals[i]+"		"+total[i]+"		"+(externals[i]+total[i]));
		}
	}
}
class Child extends Parent
{
	Child(String[] sub)
	{
		super.get_Details(sub);
		super.get_Marks(sub);
	}
}
class InterfacesDemo
{
	public static void main(String args[])
	{
		String[] sub={"OS","JAVA","DM","MEFA","IAIML"};
		//System.out.println(sub.length);
		Child c1=new Child(sub);
	}
}