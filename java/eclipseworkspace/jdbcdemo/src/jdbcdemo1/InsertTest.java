package jdbcdemo1;

import java.io.*;
import java.sql.*;

public class InsertTest {
public static void main(String args[])
{
	try{
		Connection con=ConnectionProvider.getConnection();
		PreparedStatement stmt=con.prepareStatement("insert into emp1(name,job,salary ) values(?,?,?)");
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Enter name");
			String n=b.readLine();
			System.out.println("Enter job");
			String j=b.readLine();
			System.out.println("Enter Salary");
			int s=Integer.parseInt(b.readLine());
			//setting the value of query parameters
			stmt.setString(1, n);
			stmt.setString(2, j);
			stmt.setInt(3, s);
			//query is submitted for execution
			stmt.executeUpdate();
			System.out.println("want to insert more records,yes/no?");
			String ans=b.readLine();
			if(ans.equalsIgnoreCase("no"))
				break;
			
		}
		con.close();
	System.out.println("Sucessfully saved");
	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
