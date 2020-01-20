import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JEditorPane;
import javax.swing.JSplitPane;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Component;

import javax.swing.ScrollPaneConstants;
import javax.swing.ListSelectionModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class operateur extends JInternalFrame {
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					operateur frame = new operateur();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public operateur() {
		this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi =(BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);

		setBounds(0, 0, 1129, 671);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1129, 643);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255,250,250));
		panel_2.setBounds(10, 41, 1109, 591);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(533, 117, 378, 392);
		panel_2.add(scrollPane);
		
		table = new JTable() {
			public Component prepareRenderer(TableCellRenderer renderer, int row, int column){
		        Component returnComp = super.prepareRenderer(renderer, row, column);
		        Color alternateColor = new Color(234, 234, 225);
		        Color whiteColor = Color.WHITE;
		        if (!returnComp.getBackground().equals(getSelectionBackground())){
		            Color bg = (row % 2 == 0 ? alternateColor : whiteColor);
		            returnComp .setBackground(bg);
		            bg = null;
		        }
		        return returnComp;	
			}
		};
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("a");
		model.addColumn("a");
		model.addColumn("a");
		model.addColumn("a");
		model.addRow(new Object[] {"yaakoub" });
		model.addRow(new Object[] {"anwar" });
		model.addRow(new Object[] {"wahid" });
		table.setModel(model);
		textField = new JTextField();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int selec=table.getSelectedRow();
				textField_1.setText(model.getValueAt(selec, 0).toString());
			}
		});
		table.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setRowHeight(25);
		table.setShowHorizontalLines(false);
		
		
		
	
		table.getColumnModel().getColumn(0).setResizable(false);
		scrollPane.setViewportView(table);
		
		textField.setBounds(533, 93, 378, 25);
		panel_2.add(textField);
		textField.setColumns(10);
		
		
		JLabel lblType = new JLabel("Informations professionnelles :");
		lblType.setForeground(new Color(0, 0, 0));
		lblType.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblType.setBounds(10, 11, 199, 16);
		panel_2.add(lblType);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		panel_6.setBackground(new Color(255, 250, 250));
		panel_6.setBounds(10, 36, 445, 120);
		panel_2.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblRegion = new JLabel("Region :");
		lblRegion.setForeground(new Color(0, 139, 139));
		lblRegion.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblRegion.setBounds(10, 11, 46, 14);
		panel_6.add(lblRegion);
		
		JLabel lblType_1 = new JLabel("Type :");
		lblType_1.setForeground(new Color(0, 139, 139));
		lblType_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblType_1.setBounds(10, 36, 46, 14);
		panel_6.add(lblType_1);
		
		JLabel lblCredit = new JLabel("Credit :");
		lblCredit.setForeground(new Color(0, 139, 139));
		lblCredit.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblCredit.setBounds(271, 95, 46, 14);
		panel_6.add(lblCredit);
		
		textField_1 = new JTextField();
		textField_1.setBorder(null);
		textField_1.setBackground(Color.WHITE);
		textField_1.setEditable(false);
		textField_1.setBounds(66, 8, 86, 20);
		panel_6.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCoordonnes = new JLabel("Coordonn\u00E9es :");
		lblCoordonnes.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblCoordonnes.setBounds(10, 214, 94, 14);
		panel_2.add(lblCoordonnes);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		panel_7.setBackground(new Color(255, 250, 250));
		panel_7.setBounds(10, 239, 445, 120);
		panel_2.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(496, 624, 108, 14);
		panel_2.add(lblNewLabel);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_8.setBackground(new Color(134, 0, 179));
		panel_8.setBounds(24, 452, 120, 31);
		panel_2.add(panel_8);
		
		JLabel label_3 = new JLabel("  Ajouter ");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		label_3.setBounds(0, 0, 120, 31);
		panel_8.add(label_3);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBackground(new Color(134, 0, 179));
		panel_9.setBounds(154, 452, 120, 31);
		panel_2.add(panel_9);
		
		JLabel label_4 = new JLabel("Supprimer");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		label_4.setBounds(0, 0, 120, 31);
		panel_9.add(label_4);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBackground(new Color(134, 0, 179));
		panel_10.setBounds(284, 452, 120, 31);
		panel_2.add(panel_10);
		
		JLabel label_5 = new JLabel("  Modifier");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		label_5.setBounds(0, 0, 120, 31);
		panel_10.add(label_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(SystemColor.text);
		panel_1.setBounds(0, 0, 1129, 31);
		panel.add(panel_1);
		
		JLabel lblOperateur = new JLabel("Operateur");
		lblOperateur.setHorizontalAlignment(SwingConstants.CENTER);
		lblOperateur.setForeground(SystemColor.controlDkShadow);
		lblOperateur.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblOperateur.setBounds(10, 0, 119, 31);
		panel_1.add(lblOperateur);

	}
}
