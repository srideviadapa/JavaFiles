class Bank
{
	int amount=10000;
	public void withdraw(int amount)
	{
		System.out.println("Going to withdraw......"); 
		if(this.amount<amount)
		{
			System.out.println("Less balance; waiting for deposit...");
			try
			{
				wait();
			}
			catch(Exception e)
			{			}
			this.amount-=amount;    
            System.out.println("withdraw completed..."); 
		}
	}
	public void deposit(int amount)
	{
		System.out.println("Going to Deposit...");
		this.amount+=amount;
		System.out.println("Successfully Deposited"+amount);
		notify();
	}
}
class MyThread extends Thread
{
	public void run()
	{
	   Bank b=new Bank();
	   b.withdraw(15000);	
	}
	
}
class MyRunnable implements Runnable
{
	public void run()
	{
	  Bank b1=new Bank();
	  b1.deposit(10000);
	}
}
class InterThreadCommunicationDemo
{
	public static void main(String args[])
	{
		MyThread m1=new MyThread();
		Thread t1=new Thread(m1);
		t1.start();
		MyRunnable m2=new MyRunnable();
		Thread t2=new Thread(m2);
		t2.start();
	}
}