import java.util.*;
class Buffer
{
   String data;
   boolean avail=false;
   public synchronized void put(String data)
   {
	   while(avail==true)
	   {
		   try
		   {
			   wait();
		   }
		   catch(InterruptedException ie)
		   {
			   System.out.println(ie.getMessage());
		   }
	   }
	   this.data=data;
	   System.out.println("Produced= "+data);
	   avail=true;
	   notify();
   }
   public synchronized String get()
   {
	   while(avail==false)
	   {
		   try
		   {
			   wait();
		   }
		   catch(InterruptedException ie)
		   {
			   System.out.println(ie.getMessage());
		   }
	   }
	   avail=false;
	   notify();
	   return data;
   }
}  //end of Buffer Class

class Producer extends Thread
{
	String data;
	Scanner sc=new Scanner(System.in);
	Buffer b;
	public Producer(Buffer b)
	{
		super("Producer");
		this.b=b;
	}
	public void run()
	{
		try
		{
			while(true)
			{
				System.out.println("Enter Data : ");
				data=sc.nextLine();
				b.put(data);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
	}
}  //end of Producer class

class Consumer extends Thread{
	Buffer b;
	public Consumer(Buffer b)
	{
		super("Consumer");
		this.b=b;
	}
	public void run()
	{
		try
		{
			while(true)
			{
				System.out.println("Consumed : "+b.get());
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
	}
} // end of consumer class

public class ProcessSynchronizationDemo
{
	public static void main(String args[])
	{
		Buffer b=new Buffer();
		Producer p=new Producer(b);
		Consumer c=new Consumer(b);
		p.start();
		c.start();
	}
}