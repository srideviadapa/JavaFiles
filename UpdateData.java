import java.sql.*;
import java.util.Scanner;
class UpdateData
{
	public static void main(String[] args) throws SQLException
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Are you sure in updating your password ??");
		System.out.print("If Yes enter Y else N ");
		String s=sc.next();
		System.out.println();
		
		if(s.equals("Y"))
		{
		DBConn dbc = new DBConn();
		
		System.out.print("Username : ");
		String username = sc.next();
		System.out.println();
		System.out.print("Password : ");
		String pswd = sc.next();
		System.out.println();
		
		String query = "update students set PASSWORD='"+pswd+"' where USER_NAME ='"+username+"'";

		int res = dbc.updData(query);	

		System.out.println(res);
		
		if(res == 1)
			System.out.println("1 Row Updated");
		else
			System.out.println("Row NOT Updated");
		}
	}
}