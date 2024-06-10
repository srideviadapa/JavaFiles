class Thread1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				Thread.sleep(1000);
				System.out.println("Good Morning");
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie.getMessage());
		}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				Thread.sleep(2000);
				System.out.println("Hello");
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie.getMessage());
		}
	}
}
class Thread3 implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				Thread.sleep(3000);
				System.out.println("Welcome!!");
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie.getMessage());
		}
	}
}
class ThreadDemo
{
	public static void main(String args[])
	{
		Thread1 t1=new Thread1();
		t1.start();
		Thread2 t2=new Thread2();
		t2.start();
		Thread3 t3=new Thread3();
		Thread m1=new Thread(t3);
		m1.start();
	}
}class Thread1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				Thread.sleep(1000);
				System.out.println("Good Morning");
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie.getMessage());
		}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				Thread.sleep(2000);
				System.out.println("Hello");
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie.getMessage());
		}
	}
}
class Thread3 implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				Thread.sleep(3000);
				System.out.println("Welcome!!");
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie.getMessage());
		}
	}
}
class ThreadDemo
{
	public static void main(String args[])
	{
		Thread1 t1=new Thread1();
		t1.start();
		Thread2 t2=new Thread2();
		t2.start();
		Thread3 t3=new Thread3();
		Thread m1=new Thread(t3);
		m1.start();
	}
}