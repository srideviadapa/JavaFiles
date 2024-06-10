import java.util.*;
class BubbleSort
{
	public static void main(String args[])
	{
		int n,i,j,temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in an array ");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements in array");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The Array Elements before Sorting");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<(n-1);j++)
			{
				if(a[j-1]>a[j])
				{
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("The Array Elements after Sorting are");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}