package jdbcdemo1;

import java.sql.*;




public class SelectTest {
	public static void main(String args[])
	{
		try{
			Connection con=ConnectionProvider.getConnection();
			Statement stmt=con.createStatement();
			ResultSet rset=stmt.executeQuery("select * from emp");
			System.out.println("following records are selected");
			while(rset.next())
			{
				System.out.println(rset.getInt(1)+"\t"+rset.getString(2)+"\t"+rset.getString(3)+"\t"+rset.getString(4));
				
			}
			con.close();
		}
			catch(Exception e)
			{
				System.out.println(e);
				
			}
		
		}
	}


