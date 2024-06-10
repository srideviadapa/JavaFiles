import java.util.Scanner;
import java.lang.Math;
class NumberGame
{
	public static void main(String args[])
	{
		int min=1;
		int max=100;
		int score=0;
		int echo=3;
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\tThe Number_Game\n");
		System.out.println("\tYou have 3 chances to play the game\n");
		System.out.print("\tPress 0 to Start the Game - ");
		int start = sc.nextInt();
		if(start==0)
		{
			while(echo>0)
			{
				for(int i=0;i<3;i++)
				{
					System.out.print("Guess Number - \t");
					int guess=sc.nextInt();
					System.out.print("\nThe Generated Random Number is -");
					int x=(int)(Math.random()*(max-min+1)+min);
					if(x>guess)
						{
							System.out.println("High than Your Guess\n");
						}
					else if(x==guess)
						{
							System.out.println("Correct Guess\n");
							score+=1;
						}
					else if(x<guess)
						{
							System.out.println("Less than Your Guess\n");
						}
					else{}
				}
				System.out.println("Do You Want to Play Again ??");
				System.out.print("\nIf So Press 1 - ");
				int replay = sc.nextInt();
				System.out.println();
				if(replay==1)
				{
					echo--;
				}
				else
				{
					System.out.println("Thank You!!");
					break;
				}
			}
			System.out.println("Your Score - "+score);
		}
	}
}