import java.sql.*;
import java.util.Scanner;
class DeleteData
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Are you sure in deleting the records ??");
		System.out.print("If Yes enter Y else N ");
		String s=sc.next();
		System.out.println();
		
		if(s.equals("Y"))
		{
			DBConn dbc = new DBConn();
			
			System.out.print("Which username you want to delete : ");
			String username = sc.next();
			System.out.println();
			
			String query="delete from students where USER_NAME='"+username+"'";
			
			int res=dbc.delData(query);
			
			System.out.println(res);
			
			if(res==1)
				System.out.println("1 Row Deleted");
			else
				System.out.println("0 Row Deleted");
		}
	}
}