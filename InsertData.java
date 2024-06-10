import java.sql.*;
import java.util.Scanner;
class InsertData
{
	public static void main(String[] args) throws SQLException
	{
		Scanner sc=new Scanner(System.in);
		DBConn dbc = new DBConn();
		
		System.out.print("Username : ");
		String username = sc.next();
		System.out.println();
		System.out.print("Password : ");
		String pswd = sc.next();
		System.out.println();
		
		String query = "insert into students (USER_NAME, PASSWORD) values ('"+username+"', '"+pswd+"')";

		int res = dbc.insData(query);	

		if(res == 1)
			System.out.println("1 Row Inserted");
		else
			System.out.println("Row NOT Inserted");
	}
}