package jdbcdemo1;
import java.sql.*;
import java.util.Scanner;

import com.mysql.jdbc.ResultSetMetaData;

public class Scroller {
static ResultSet rset;
static String header;
static int coloumncount;
public static void main(String args[])
{
	try{
		Connection con=ConnectionProvider.getConnection();
		Statement stmt=con.createStatement(
				ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY
				);
		Scanner in=new Scanner(System.in);
		System.out.println("Enter table name:");
		String tab=in.nextLine();
		String query="select from" +tab;
		rset=stmt.executeQuery(query);
		ResultSetMetaData rmd=rset.getMetaData();
		coloumncount=rmd.getColumnCount();
		StringBuilder str=new StringBuilder();
		for(int i=1;i<=coloumncount;i++)
			str.append(rmd.getColumnName(i)+ "\t");
		header=str.toString();
		boolean flag=true;
		while(flag)
		{
			System.out.println("---------------------Menu-----------------------");
			System.out.println("1:first record");
			System.out.println("2:second record");
			System.out.println("3:third record");
			System.out.println("4:last reccord");
			System.out.println("5:EXIT");
			System.out.println("Enter your choice:");
			int choice=in.nextInt();
			switch(choice)
			{
			case 1:
				display first();
				break;
			case 2:
				display next();
				break;
			case 3:
				displayPrevious();
				break;
			case 4:
				displayLast();
				break;
			case 5:
				flag=false;
				break;
				default:
					System.out.println("invalid choice");
					
				
			}
		}
		in.close();
		con.close();
		
	}catch(Exception e){System.out.println(e);}
public static void displayRecord() throws Exception
{
	
}


}

}
