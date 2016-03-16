package jdbcdemo1;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
public class ConnectionProvider {
	static Properties prop;
	static{
		prop=new Properties();
		//loading properties
		try{
			//obtaining inputStream for db.properties using 
			//get ResourceAsStream() method of 
			//java.lang.class .this method searches the given resource in the 
			//folders listed in the class
			InputStream in=ConnectionProvider.class.getResourceAsStream("/db.properties");
			prop.load(in);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	//method to create and return connection
	public static Connection getConnection()throws Exception
	{
		Connection con=null;
		Class.forName(prop.getProperty("driverClass"));
		con=DriverManager.getConnection(
				prop.getProperty("url"),
				prop.getProperty("user"),
				prop.getProperty("password"));
		return con;
		
	}

}
