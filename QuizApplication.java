import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class QuizApplication
{
	public static void main(String args[])
	{
		int marks=0;
		Timer timer = new Timer();
		TimerTask task = new TimerTask(){
			int counter=10;
			Scanner sc = new Scanner(System.in);
			public void run()
			{
			if(counter>0)
			{
				System.out.print("\n"+counter+"\t");
			counter=counter-1;}
			else{
				System.out.println("Time is Up!!");
				timer.wait();
				}
			}
		};
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Quiz");
		System.out.print("You are supposed to answer 5 Questions ");
		System .out.println("Press 1 to Start the Quiz ");
		int choice = sc.nextInt();
		if(choice==1)
		{
			for(int i=0;i<2;i++)
			{
			if(i==0)
			{
				System.out.println("Who is the father of Java ??");
				System.out.print("\n1.Dennis Ritchie\n2.Bjarne Stroustrup\n3.James Gosling\n4.Guido Van Rossum\n");
				System.out.print("Enter Your Option - ");
				timer.scheduleAtFixedRate(task,0,1000);
				int ch=sc.nextInt();
				if(ch==1)
					marks+=1;
			}
			if(i==1)
			{
				System.out.println("Who is the father of Java ??");
				System.out.print("\n1.Dennis Ritchie\n2.Bjarne Stroustrup\n3.James Gosling\n4.Guido Van Rossum\n");
				timer.scheduleAtFixedRate(task,0,1000);
			}
			}
		}
	}
}