import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Swing {
	
	public static String getValueFrom(JTextField text) {
		return text.getText();
	}
	
	public static void setValueOf(JTextField text,String value) {
		text.setText(value);
	}
	
	public static void setValueOf(JTextField text,int value) {
		text.setText(""+value);
	}
	
	public static int getIntegerFrom(JTextField text) {
		return Integer.parseInt(text.getText());
	}
	
	public static double getDoubleFrom(JTextField text) {
		return Double.parseDouble(text.getText());
	}
	
	public static void kchhaja(Connection con , DefaultTableModel model) {
		Statement stmnt = con.createStatement():
		ResultSet res = stmnt.executeQuery(Product.)
	}
	
	
	
	

}
