class ThreadOne extends Thread
{
	void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("Thread "+i+" Extending Thread class");
		}
	}
}
public class ThreadTwo implements Runnable
{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("Thread "+i+" Implementing Runnable");
		}
	}
}
class NewThreadDemo
{
	public static void main(String args[])
	{
		ThreadOne t1=new ThreadOne();
		Thread n1=new Thread(t1);
		ThreadTwo t2=new ThreadTwo();
		Thread n2=new Thread(t2);
		n1.start();
		n2.start();
		for(int i=0;i<3;i++)
		{
			System.out.println("Thread "+i+" from main()");
		}
		
	}
}