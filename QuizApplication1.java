import java.util.Scanner;
class Quiz extends Thread
{
	int marks=0;
	int ch=0;
	Scanner scn=new Scanner(System.in);
	public void run(int x)
	{
		for(int i=0;i<x;i++)
		{
			if(i==0)
			{
				System.out.println("Who is the father of Java ??");
				System.out.print("\n1.Dennis Ritchie\n2.Bjarne Stroustrup\n3.James Gosling\n4.Guido Van Rossum\n");
				System.out.print("Enter Your Option - ");
				if(ch==0)
				{
					Thread.wait(5000);
				}
				else if(ch!=0)
				{
					if(ch==3)
						marks+=1;
					else
						marks+=0;
				}
				else
					System.out.println("Time is Up!!!");
			}
			if(i==1)
			{
				System.out.println("Who is the father of Java ??");
				System.out.print("\n1.Dennis Ritchie\n2.Bjarne Stroustrup\n3.James Gosling\n4.Guido Van Rossum\n");
				System.out.print("Enter Your Option - ");
				if(ch==0)
				{
					Thread.wait(5000);
				}
				else if(ch!=0)
				{
					if(ch==3)
						marks+=1;
					else
						marks+=0;
				}
				else
					System.out.println("Time is Up!!!");
			}
		}
	}
}
class QuizApplication1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Quiz");
		System.out.print("You are supposed to answer 5 Questions ");
		System .out.println("Press 1 to Start the Quiz ");
		int choice = sc.nextInt();
		if(choice==1)
		{
			Quiz q1=new Quiz();
			Thread t1=new Thread(q1);
			t1.start(5);
		}
	}
}