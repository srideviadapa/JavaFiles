import java.io.*;
import java.util.*;
class IOStreamsDemo
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee Details");
		System.out.println("--------------------------");
		System.out.println("Enter the Employee Id"	);
		int empid=sc.nextInt();	
		System.out.println("Enter the Employee Name"	);
		String empname=sc.next();
		System.out.println("Enter Employee Salary"	);
		double empsal=sc.nextDouble();
		System.out.println("Enter Employee Gender");
		String gender=sc.next();
		File f1=new File("Dataiostream.txt");
		if(!f1.exists())
		{
			System.out.println(f1.createNewFile());
		}
		FileOutputStream fos=new FileOutputStream("Dataiostream.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeInt(empid);
		dos.writeUTF(empname);
		dos.writeDouble(empsal);
		dos.writeUTF(gender);
		FileInputStream fis=new FileInputStream("Dataiostream.txt");
		DataInputStream dis=new DataInputStream(fis);
		System.out.println("Employee Id "+dis.readInt());
		System.out.println("Employee Name "+dis.readUTF());
		System.out.println("Employee Salary "+dis.readDouble());
		System.out.println("Employee Gender "+dis.readUTF());
	}
}
