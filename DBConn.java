import java.sql.*;

class DBConn
{
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	int res = 0;

	public DBConn()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aiml_a", "root", "");
		} catch(SQLException se) {
			se.printStackTrace();
		}
	}

	public ResultSet retData(String query)
	{
		try {
			stmt = con.createStatement();

			rs = stmt.executeQuery(query);

		} catch(SQLException se) {
			se.printStackTrace();
		}

		return rs;
	}

	public int insData(String query)
	{
		try {
			stmt = con.createStatement();
			res = stmt.executeUpdate(query);
			
		} catch(SQLException se) {
			se.printStackTrace();
		}

		return res;
	}

	public int updData(String query)
	{
		try {
			stmt = con.createStatement();
			res = stmt.executeUpdate(query);
			
		} catch(SQLException se) {
			se.printStackTrace();
		}

		return res;
	}
	
	public int delData(String query)
	{
		try {
			stmt = con.createStatement();
			res = stmt.executeUpdate(query);
			
		} catch(SQLException se) {
			se.printStackTrace();
		}

		return res;
	}
	public void conClose() throws Exception
	{
		con.close();
	}
}