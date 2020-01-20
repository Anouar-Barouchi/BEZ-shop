import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.text.StyledEditorKit.UnderlineAction;
import javax.swing.border.BevelBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

import javax.swing.border.CompoundBorder;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JDesktopPane;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;

public class App {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}
	
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setLocationRelativeTo(null);
		
       
		
		
		frame.setBounds(240, 120, 1300, 680);
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(SystemColor.menu);
		desktopPane.setBounds(171, 37, 1129, 643);
		frame.getContentPane().add(desktopPane);
         
       
		JPanel panel = new JPanel();
		panel.setBounds(0, 37, 172, 643);
		panel.setBackground(new Color(66, 66, 66));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.BLACK);
		JPanel panel_3 = new JPanel();
		JPanel panel_4 = new JPanel();
		JLabel lblStock = new JLabel("   Stock      >");
		Image img10=new ImageIcon(this.getClass().getResource("/inventory.png")).getImage();
		lblStock.setIcon(new ImageIcon(img10));
		lblStock.setForeground(SystemColor.scrollbar);
		
		panel_2.setBackground(new Color(66, 66, 66));
		
		
		
panel_2.addMouseListener(new MouseAdapter() {
			
			
			@Override

			public void mouseClicked(MouseEvent e) {
				desktopPane.removeAll();
		         Invent fac=new Invent();
		          desktopPane.add(fac).setVisible(true);
		          
				panel_2.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED, null, null , null, null));
				panel_3.setBorder(null);
				panel_4.setBorder(null);
				lblStock.setForeground(Color.white);
			}
			

			@Override
			public void mouseEntered(MouseEvent e) {
				lblStock.setForeground(new Color(115, 156, 139));
			}
			@Override
			
			public void mouseExited(MouseEvent e) {
				lblStock.setForeground(SystemColor.scrollbar);
			}
		
			
			
		});
		panel_2.setBounds(0, 210, 171, 41);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		
		
		lblStock.setLabelFor(panel_2);
		lblStock.setBounds(0, 0, 172, 41);
		panel_2.add(lblStock);
		lblStock.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblStock.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		panel_3.setBackground(new Color(66, 66, 66));

		panel_3.setBounds(0, 280, 171, 41);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblFacture = new JLabel("   Facture  >");
		Image img11=new ImageIcon(this.getClass().getResource("/billl.png")).getImage();
		lblFacture.setIcon(new ImageIcon(img11));
		lblFacture.setForeground(SystemColor.scrollbar);
	
		panel_3.addMouseListener(new MouseAdapter() {
			
			
			@Override

			public void mouseClicked(MouseEvent e) {
				desktopPane.removeAll();
		         facture fac=new facture();
		          desktopPane.add(fac).setVisible(true);
		          
				panel_3.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED, null, null , null, null));
				panel_2.setBorder(null);
				panel_4.setBorder(null);
				
			}
			

			@Override
			public void mouseEntered(MouseEvent e) {
				lblFacture.setForeground(new Color(115, 156, 139));
			}
			@Override
			
			public void mouseExited(MouseEvent e) {
				lblFacture.setForeground(SystemColor.scrollbar);
			}
			
			
			
			
		});
		lblFacture.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblFacture.setHorizontalAlignment(SwingConstants.CENTER);
		lblFacture.setBounds(0, 0, 172, 41);
		panel_3.add(lblFacture);
		JLabel lblOperateur = new JLabel(" Operateur  >");
		Image img12=new ImageIcon(this.getClass().getResource("/user.png")).getImage();
		lblOperateur.setIcon(new ImageIcon(img12));
		
		panel_4.setBackground(new Color(66, 66, 66));
panel_4.addMouseListener(new MouseAdapter() {
			
			
			
@Override
			
			public void mouseClicked(MouseEvent e) {
	                 desktopPane.removeAll();
                      operateur ope=new operateur();
                         desktopPane.add(ope).setVisible(true);
				panel_4.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED, null, null , null, null));
				panel_2.setBorder(null);
				panel_3.setBorder(null);
				
			}


@Override
public void mouseEntered(MouseEvent e) {
	lblOperateur.setForeground(new Color(115, 156, 139));
}
@Override

public void mouseExited(MouseEvent e) {
	lblOperateur.setForeground(SystemColor.scrollbar);
}
		});
		panel_4.setBounds(0, 350, 171, 41);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		
		lblOperateur.setForeground(SystemColor.scrollbar);
		lblOperateur.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblOperateur.setHorizontalAlignment(SwingConstants.CENTER);
		lblOperateur.setBounds(0, 0, 172, 41);
		panel_4.add(lblOperateur);
		
		JLabel label = new JLabel("2020-01-15");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 11, 171, 20);
		panel.add(label);
		label.setBackground(SystemColor.inactiveCaptionBorder);
		label.setForeground(SystemColor.menu);
		label.setFont(new Font("Ravie", Font.PLAIN, 17));
		
		JLabel time = new JLabel("time");
		time.setHorizontalAlignment(SwingConstants.CENTER);
		time.setBounds(0, 46, 171, 20);
		panel.add(time);
		time.setBackground(SystemColor.inactiveCaptionBorder);
		time.setForeground(SystemColor.menu);
		time.setFont(new Font("Ravie", Font.PLAIN, 16));
		
		JLabel lblToutDroitRserv = new JLabel("tout droit r\u00E9serv\u00E9 ");
		lblToutDroitRserv.setForeground(SystemColor.controlShadow);
		lblToutDroitRserv.setHorizontalAlignment(SwingConstants.CENTER);
		lblToutDroitRserv.setBounds(23, 582, 119, 27);
		panel.add(lblToutDroitRserv);
		
		JLabel label_5 = new JLabel("2020");
		label_5.setForeground(SystemColor.controlShadow);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(58, 620, 46, 14);
		panel.add(label_5);
		
		JLabel label_2 = new JLabel("");
		Image imgg=new ImageIcon(this.getClass().getResource("/database.png")).getImage();
		label_2.setIcon(new ImageIcon(imgg));
		label_2.setBounds(52, 96, 64, 67);
		panel.add(label_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1300, 36);
		panel_1.setBackground(new Color(115, 0, 153));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblYaSoft = new JLabel("YA Soft");
		lblYaSoft.setFont(new Font("Berlin Sans FB", Font.BOLD, 15));
		lblYaSoft.setForeground(UIManager.getColor("Button.light"));
		lblYaSoft.setBounds(50, 3, 63, 14);
		panel_1.add(lblYaSoft);
		
		JLabel lblInventorySystem = new JLabel("Inventory System");
		lblInventorySystem.setForeground(SystemColor.controlShadow);
		lblInventorySystem.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 11));
		lblInventorySystem.setBounds(52, 14, 99, 14);
		panel_1.add(lblInventorySystem);
		
		JLabel label_1 = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/atom.png")).getImage();
		label_1.setIcon(new ImageIcon(img));

		label_1.setBounds(20, 0, 32, 34);
		panel_1.add(label_1);
		
		JLabel label_3 = new JLabel("");
		label_3.setToolTipText("Quitter");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		label_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Image img2=new ImageIcon(this.getClass().getResource("/switch.png")).getImage();
		label_3.setIcon(new ImageIcon(img2));
		label_3.setBounds(1252, 3, 24, 31);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setToolTipText("Minimizer");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setState(frame.ICONIFIED);
			}
		});
		label_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Image img3=new ImageIcon(this.getClass().getResource("/button.png")).getImage();
		label_4.setIcon(new ImageIcon(img3));
		label_4.setBounds(1218, 3, 24, 31);
		panel_1.add(label_4);
		
		
		
		Image img9=new ImageIcon(this.getClass().getResource("/menu.png")).getImage();
		Image img8=new ImageIcon(this.getClass().getResource("/yog.jpg")).getImage();
		Image img7=new ImageIcon(this.getClass().getResource("/logout.png")).getImage();
		Date d =new Date();
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
             new javax.swing.Timer(0,new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Date d =new Date();
					SimpleDateFormat s = new SimpleDateFormat("hh-mm-ss a");
					time.setText(s.format(d));
					// TODO Auto-generated method stub
					
				}
			}).start();
		
	
		
		
		
		
	}
}
