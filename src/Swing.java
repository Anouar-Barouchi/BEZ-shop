import javax.swing.JList;
import javax.swing.JTextField;

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
	
	
	
	

}
