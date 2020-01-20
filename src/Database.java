import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.print.attribute.standard.PrinterLocation;

public class Database {

	private static String url ;    
    private static String driverName = "org.h2.Driver" ;   
    private static String username = "sa" ;   
    private static String password = "" ;
    private static Connection con;
    private static String urlstring = "jdbc:h2:./database/test";

    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(urlstring, username, password);
                System.out.println("connected successfully");
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found."); 
        }
        return con;
    }
	
	
	
	public static void main(String[] args) {
		/*Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:h2:./database/test", "sa", "");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Statement stmnt = null;
		System.out.println("ff   ");
		try {
			stmnt = con.createStatement();
			ResultSet res = stmnt.executeQuery(Product.selectAllProducts());
			System.out.println("ff   "+res);
			while (res.next()) {
				System.out.println("  "+res.getString("title"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		

	}

}
