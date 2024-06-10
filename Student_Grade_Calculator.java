import java.util.Scanner;
class StudentGradeCalculator
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of subjects "+"\t");
		int sub = sc.nextInt();
		System.out.println();
		System.out.println("Enter Your Marks");
		int marks[]=new int[sub];
		int sum=0;
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
			sum+=marks[i];
		}
		float avg_per = (sum/sub)*100;
		if(avg_per>=90)
			System.out.println("Marks - "+sum+"\t"+"Average -"+avg_per+"\t"+"with grade A");
		else if(avg_per>=80)
			System.out.println("Marks - "+sum+"\t"+"Average -"+avg_per+"\t"+"with grade B");
		else if(avg_per>=70)
			System.out.println("Marks - "+sum+"\t"+"Average -"+avg_per+"\t"+"with grade C");
		else if(avg_per>=60)
			System.out.println("Marks - "+sum+"\t"+"Average -"+avg_per+"\t"+"with grade D");
		else if(avg_per>=50)
			System.out.println("Marks - "+sum+"\t"+"Average -"+avg_per+"\t"+"with grade E");
		else
			System.out.println("Marks - "+sum+"\t"+"Average -"+avg_per+"\t"+"with grade F");


	}
}