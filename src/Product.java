import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class Product {

	private int id;
	private String code;
	private String title;

	private String brand;
	//private String details;
	private int quantity;
	private double salePrice;
	private double buyPrice;
	private int catId;

	public Product(int id, String code, String title, String brand, int quantity, double salePrice,
			double buyPrice, int catId) {

		this.id = id;
		this.code = code;
		this.title = title;
		this.brand = brand;
		//this.details = details;
		this.quantity = quantity;
		this.salePrice = salePrice;
		this.buyPrice = buyPrice;
		this.catId = catId;

	}

	public void insertProduct(Connection con) {
		String message = "";
		try {
			Statement stmnt = con.createStatement();
			ResultSet res = stmnt.executeQuery("select max(id_product) as maxid from products");
			res.next();
			this.id = res.getInt("maxid") + 1;
			String sql = "INSERT INTO products values(" + this.id + ",'" + this.code + "','" + this.title + "','"
					+ this.brand + "'," + this.quantity + "," + this.salePrice + ","
					+ this.buyPrice + "," + this.catId + ")";

			stmnt.executeUpdate(sql);
			message = "produit ajouté";

			System.out.println(message);

		} catch (SQLException e) {
			message = "erreur ";
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
		}
		//return message;
	}
	public static void removeProduct(Connection con, int id) {
		String message = "";
		 try {
			Statement stmnt = con.createStatement();
			
			String sql = "DELETE FROM products where id_product=" + id;

			stmnt.executeUpdate(sql);
			message = "produit deleted";

			System.out.println(message);

		} catch (SQLException e) {
			message = "erreur ";
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void removeProduct(Connection con) {
		 String message = "";
		 try {
			Statement stmnt = con.createStatement();
			
			String sql = "DELETE FROM products where id_product=" + this.id;

			stmnt.executeUpdate(sql);
			message = "produit deleted";

			System.out.println(message);

		} catch (SQLException e) {
			message = "erreur ";
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static String updateProduct(int id, String title, String brand, int quantity, double salePrice,
			double buyPrice, int catId, int provId) {
		return "UPDATE products SET   WHERE prod_id=" + id;
	}

	public static String selectProduct(int productId) {
		return "SELECT * FROM products WHERE prod_id=" + productId;
	}

	public static String selectProductsOf(int providerId) {
		return "select * from products where id_prov=" + providerId;
	}

	public static String selectProductsCat(int categoryId) {
		return "select * from products where id_cat=" + categoryId;
	}

	public static Vector<Object> resToVect(ResultSet res) {
		// hna dart method li ndakhalalha ResultSet nroutourni vecteur ndakhlo f model
		// ta3 table direct
		Vector<Object> v = new Vector<>();
		try {
			// System.out.println(res.getInt("id_product"));
			v.add(res.getInt("id_product"));
			v.add(res.getString("code_product"));
			v.add(res.getString("title"));
			v.add(res.getString("brand"));
			v.add(res.getInt("quantity"));
			v.add(res.getInt("buy_price"));
			v.add(res.getInt("sell_price"));
			// hna nroh najbad ism l category b id ta3o
			ResultSet r = Database.getConnection().createStatement()
					.executeQuery("select * from category where id_category=" + res.getInt("id_cat"));
			r.next();
			v.add(r.getString("title"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return v;
	}

	public static void selectAllProducts(Connection con, DefaultTableModel model) {
		// n7oto les produit f model

		try {
			Statement stmnt = con.createStatement();

			ResultSet res = stmnt.executeQuery("select * from products");
			while (res.next()) {
				// hna n7ot kol produit f model w khlass
				model.addRow(resToVect(res));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void selectProductsOf(int catId, Connection con, DefaultTableModel model) {
		// n7oto les produit f model

		try {
			Statement stmnt = con.createStatement();

			ResultSet res = stmnt.executeQuery("select * from products where cat_id=" + catId);
			while (res.next()) {
				// hna n7ot kol produit f model w khlass
				model.addRow(resToVect(res));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void selectProduct(int productId, Connection con, DefaultTableModel model) {
		// n7oto les produit f model

		try {
			Statement stmnt = con.createStatement();

			ResultSet res = stmnt.executeQuery("select * from products where id_product=" + productId);
			while (res.next()) {
				// hna n7ot kol produit f model w khlass
				model.addRow(resToVect(res));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	public double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

}
