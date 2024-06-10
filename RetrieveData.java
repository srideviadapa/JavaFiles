import java.sql.*;

class RetrieveData
{
	public static void main(String[] args) throws SQLException
	{
		DBConn dbc = new DBConn();

		String query = "select * from students";

		ResultSet rs = dbc.retData(query);

		while(rs.next())
		{
			System.out.println(rs.getString("USER_NAME") + "\t" + rs.getString("PASSWORD"));
		}
	}
}