import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
//import org.h2.Driver;
import javax.print.attribute.standard.PrinterLocation;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

//import com.sun.tools.javac.util.Name.Table;

public class Maiouna {

	public static void main(String[] args) {
		
		Connection con = Database.getConnection();
		System.out.println("Connected successfully");
		Product p = new Product(12,"dqsdq","kchhwayaj","apple",23,1222,13333,1);
		java.sql.Statement stmnt = null ;
		ResultSet res = null;
		try
		{
			stmnt = con.createStatement();
			res = stmnt.executeQuery("select * from products");
			while(res.next())
			{
				System.out.println("sss");
				System.out.println(res.getInt("id_product"));
			}

		}catch(SQLException e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
		}
		//p.removeProduct(con);
		
		
	}

}
