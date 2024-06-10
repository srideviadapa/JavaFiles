class Parent
{
	void assets()
	{
		System.out.println("My Assets are inherited to my Child");
	}
	void properties()
	{
		System.out.println("My Properties are inherited to my Child");
	}
	void marriage()
	{
		System.out.println("Marriage proposal is choosen by Parent");
	}
}
class Child extends Parent
{
	void marriage()
	{
		System.out.println("Marriage Proposal is choosen by Child");
	}
}
class MethodOverridingDemo
{
	public static void main(String args[])
	{
		Parent p1=new Parent();
		p1.assets();
		p1.properties();
		p1.marriage();
		Child c1=new Child();
		c1.marriage();
		Parent p2=new Child();
		p2.marriage();
		//Child c2=new Parent();
		//c1.marriage();
	}
}