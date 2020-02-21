import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import java.awt.Rectangle;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTable;
import javax.swing.JList;
import java.awt.List;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.ScrollPane;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.border.MatteBorder;
import java.awt.Component;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.EmptyBorder;
import java.awt.Choice;
import java.awt.ComponentOrientation;
import javax.swing.JSeparator;

public class Invent extends JInternalFrame {
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Invent frame = new Invent();
					frame.setVisible(true);
					frame.setLocation(20, 40);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Invent() {
		Connection con = Database.getConnection();

		setBounds(0, 0, 1129, 671);
		this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
		getContentPane().setLayout(null);

		Panel panel = new Panel();
		panel.setBackground(SystemColor.controlHighlight);
		panel.setBounds(0, 0, 1129, 643);
		getContentPane().add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);

		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 1129, 31);
		panel.add(panel_1);

		JLabel lblStock = new JLabel("Stock");
		lblStock.setHorizontalAlignment(SwingConstants.CENTER);
		lblStock.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblStock.setForeground(SystemColor.controlDkShadow);
		lblStock.setBounds(22, 0, 79, 31);
		panel_1.add(lblStock);

		Panel panel_5 = new Panel();
		panel_5.setBackground(SystemColor.text);
		panel_5.setBounds(10, 47, 1109, 586);
		panel.add(panel_5);
		panel_5.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(23, 79, 772, 496);
		panel_5.add(scrollPane);

		table = new JTable() {
			public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
				Component returnComp = super.prepareRenderer(renderer, row, column);
				Color alternateColor = new Color(252, 242, 206);
				Color whiteColor = Color.WHITE;
				if (!returnComp.getBackground().equals(getSelectionBackground())) {
					Color bg = (row % 2 == 0 ? alternateColor : whiteColor);
					returnComp.setBackground(bg);
					bg = null;
				}
				return returnComp;
			}
		};

		DefaultTableModel productModel = new DefaultTableModel();
		Product.selectAllProducts(con, productModel);
		System.out.println(productModel.getRowCount());
		//productModel.addRow(new Object[] {"za"});
		table.setModel(productModel);

		table.setGridColor(new Color(0, 139, 139));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(JLabel.CENTER);
		table.setDefaultRenderer(Integer.class, centerRenderer);
		table.setShowHorizontalLines(false);
		table.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		table.setForeground(new Color(0, 0, 0));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.getTableHeader().setReorderingAllowed(false);
		JTableHeader th = table.getTableHeader();
		th.setVisible(false);

		table.setRowHeight(25);

		DefaultTableModel model = new DefaultTableModel();

		model.addColumn("a");
		model.addColumn("b");
		model.addColumn("c");
		model.addColumn("d");

		table.setModel(model);

		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(15);
		table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
		;
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(15);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(70);
		scrollPane.setViewportView(table);
		JPanel panel_4 = new JPanel();
		textField = new JTextField();
		JPanel panel_7 = new JPanel();
		panel_7.setToolTipText("Valider");
		JPanel panel_6 = new JPanel();
		panel_6.setToolTipText("Annuler");
		JLabel lbl = new JLabel("Tapez les informations du produit ");
		panel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_4.setVisible(true);
				panel_6.setVisible(false);
				panel_7.setVisible(false);
				lbl.setVisible(false);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				panel_7.setBackground(new Color(133, 133, 224));
			}

			public void mouseExited(MouseEvent e) {
				panel_7.setBackground(SystemColor.controlHighlight);
			}
		});
		panel_7.setVisible(false);

		panel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_4.setVisible(true);
				panel_6.setVisible(false);
				panel_7.setVisible(false);
				lbl.setVisible(false);

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				panel_6.setBackground(new Color(133, 133, 224));
			}

			public void mouseExited(MouseEvent e) {
				panel_6.setBackground(SystemColor.controlHighlight);
			}
		});

		panel_4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				panel_6.setVisible(true);
				panel_7.setVisible(true);
				lbl.setVisible(true);
				panel_4.setVisible(false);

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				panel_4.setBackground(new Color(198, 26, 255));
			}

			public void mouseExited(MouseEvent e) {
				panel_4.setBackground(new Color(115, 0, 153));
			}
		});
		panel_4.setBorder(new EmptyBorder(0, 0, 0, 0));
		JPanel panel_3 = new JPanel();
		JPanel panel_2 = new JPanel();
		panel_4.setBounds(956, 85, 120, 31);
		panel_5.add(panel_4);

		panel_4.setBackground(new Color(115, 0, 153));
		JLabel lblAjouterArticle = new JLabel("  Ajouter ");
		Image img1 = new ImageIcon(this.getClass().getResource("/add.png")).getImage();
		lblAjouterArticle.setIcon(new ImageIcon(img1));

		lblAjouterArticle.setForeground(SystemColor.text);
		panel_4.setLayout(null);

		lblAjouterArticle.setHorizontalAlignment(SwingConstants.CENTER);
		lblAjouterArticle.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblAjouterArticle.setBounds(0, 0, 120, 31);
		panel_4.add(lblAjouterArticle);

		panel_3.setBounds(956, 143, 120, 31);
		panel_5.add(panel_3);
		JLabel lblSupprimer = new JLabel("Supprimer");
		Image img2 = new ImageIcon(this.getClass().getResource("/delete.png")).getImage();
		lblSupprimer.setIcon(new ImageIcon(img2));
		panel_3.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_3.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 102, 255)));
				panel_4.setBorder(null);
				panel_2.setBorder(null);
			}

			public void mouseEntered(MouseEvent e) {
				panel_3.setBackground(new Color(198, 26, 255));
			}

			public void mouseExited(MouseEvent e) {
				panel_3.setBackground(new Color(115, 0, 153));
			}
		});
		panel_3.setBackground(new Color(115, 0, 153));
		panel_3.setLayout(null);

		lblSupprimer.setForeground(SystemColor.text);
		lblSupprimer.setHorizontalAlignment(SwingConstants.CENTER);
		lblSupprimer.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblSupprimer.setBounds(0, 0, 120, 31);
		panel_3.add(lblSupprimer);

		panel_2.setBounds(956, 197, 120, 31);
		panel_5.add(panel_2);
		JLabel lblModifier = new JLabel("  Modifier");
		Image img4 = new ImageIcon(this.getClass().getResource("/editt.png")).getImage();
		lblModifier.setIcon(new ImageIcon(img4));
		lblModifier.setHorizontalAlignment(SwingConstants.CENTER);

		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_2.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 102, 255)));
				panel_4.setBorder(null);
				panel_3.setBorder(null);
			}

			public void mouseEntered(MouseEvent e) {
				panel_2.setBackground(new Color(198, 26, 255));
			}

			public void mouseExited(MouseEvent e) {
				panel_2.setBackground(new Color(115, 0, 153));
			}
		});
		panel_2.setBackground(new Color(115, 0, 153));
		panel_2.setLayout(null);

		lblModifier.setForeground(SystemColor.text);
		lblModifier.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblModifier.setBounds(0, 0, 120, 31);
		panel_2.add(lblModifier);

		textField_1 = new JTextField();
		textField_2 = new JTextField();
		textField_3 = new JTextField();

		textField.setBounds(23, 58, 202, 20);
		panel_5.add(textField);
		textField.setColumns(10);

		textField_1.setBounds(225, 58, 85, 20);
		panel_5.add(textField_1);
		textField_1.setColumns(10);

		textField_2.setBounds(495, 58, 150, 20);
		panel_5.add(textField_2);
		textField_2.setColumns(10);

		textField_3.setBounds(645, 58, 150, 20);
		panel_5.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblDesginationArticle = new JLabel("Desgination Article");
		lblDesginationArticle.setForeground(new Color(0, 139, 139));
		lblDesginationArticle.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDesginationArticle.setBounds(23, 35, 188, 20);
		panel_5.add(lblDesginationArticle);

		JLabel lblQty = new JLabel("Qty");
		lblQty.setForeground(new Color(0, 139, 139));
		lblQty.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblQty.setBounds(225, 39, 46, 14);
		panel_5.add(lblQty);

		JLabel lblPrixAchat = new JLabel("Prix Achat");
		lblPrixAchat.setForeground(new Color(0, 139, 139));
		lblPrixAchat.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblPrixAchat.setBounds(495, 38, 96, 14);
		panel_5.add(lblPrixAchat);

		JLabel lblPrixVente = new JLabel("Prix Vente");
		lblPrixVente.setForeground(new Color(0, 139, 139));
		lblPrixVente.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblPrixVente.setBounds(645, 38, 83, 14);
		panel_5.add(lblPrixVente);

		textField_4 = new JTextField();
		textField_4.setBounds(310, 58, 85, 20);
		panel_5.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblUnit = new JLabel("Unit\u00E9");
		lblUnit.setForeground(new Color(0, 139, 139));
		lblUnit.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblUnit.setBounds(310, 39, 46, 14);
		panel_5.add(lblUnit);

		JLabel lblGattogrie = new JLabel("Cat\u00E9togrie");
		lblGattogrie.setForeground(new Color(0, 139, 139));
		lblGattogrie.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblGattogrie.setBounds(395, 39, 61, 14);
		panel_5.add(lblGattogrie);

		Choice choice = new Choice();
		choice.setBounds(395, 58, 100, 19);
		panel_5.add(choice);

		panel_6.setVisible(false);
		panel_6.setLayout(null);
		panel_6.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_6.setBackground(SystemColor.controlHighlight);
		panel_6.setBounds(861, 58, 46, 31);
		panel_5.add(panel_6);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(15, 0, 16, 31);
		panel_6.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		Image img6 = new ImageIcon(this.getClass().getResource("/closee.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img6));

		panel_7.setLayout(null);
		panel_7.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_7.setBackground(SystemColor.controlHighlight);
		panel_7.setBounds(805, 58, 46, 31);
		panel_5.add(panel_7);

		JLabel lblValider = new JLabel("");
		Image img8 = new ImageIcon(this.getClass().getResource("/check (1).png")).getImage();
		lblValider.setIcon(new ImageIcon(img8));

		lblValider.setHorizontalAlignment(SwingConstants.CENTER);
		lblValider.setForeground(Color.WHITE);
		lblValider.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblValider.setBounds(10, 0, 26, 31);
		panel_7.add(lblValider);

		lbl.setVisible(false);
		lbl.setForeground(new Color(112, 128, 144));
		lbl.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lbl.setBounds(39, 11, 218, 14);
		panel_5.add(lbl);
		choice.add("bouteille");
		choice.add("Lait");
		choice.add("Yogurt");

		BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
		bi.setNorthPane(null);
	}
}
