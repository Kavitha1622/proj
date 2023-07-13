import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connection {
public static void main(String args[]) throws ClassNotFoundException, SQLException
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("importation successfully");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/con","root","root");
	System.out.println("connection done");
	Statement pr=con.createStatement();
	ResultSet rs=pr.executeQuery("select * from emp");
	while(rs.next())
	{
		System.out.println(rs.getString(1)+"    "+rs.getInt(2)+"     "+rs.getFloat(3));
	}
	
	
}
}
