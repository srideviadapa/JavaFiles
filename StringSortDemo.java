import java.util.*;
import java.lang.String;
class StringSortDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of strings");
		int n=sc.nextInt();
		System.out.println();
		String temp;
		String []arr =new String[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the string "+i);
			arr[i]=sc.next();
		}
		System.out.println();
		System.out.print("Before Sorting the array is ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.print("After Sorting the array is ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}