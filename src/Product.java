
public class Product {

	private int id;
	private String code ;
	private String title;
	
	private String brand;
	private String details;
	private int quantity;
	private double salePrice;
	private double buyPrice;
	private int catId;
	private int provId;

	

	

	public Product(int id, String code, String title, String brand, String details, int quantity, double salePrice,
			double buyPrice, int catId, int provId) {
		super();
		this.id = id;
		this.code = code;
		this.title = title;
		this.brand = brand;
		this.details = details;
		this.quantity = quantity;
		this.salePrice = salePrice;
		this.buyPrice = buyPrice;
		this.catId = catId;
		this.provId = provId;
	}

	public static String insertProduct(int id,String code, String title, String brand,String details, int quantity, double salePrice,
			double buyPrice, int catId, int provId) {
		return "INSERT INTO products values(" + id + ",'" +code+"','" + title + "','" + brand +"','" + details +"'," + quantity + "," + salePrice
				+ "," + buyPrice + "," + catId + "," + provId + ")";
	}

	public static String removeProduct(int id) {
		return "DELETE FROM products where cust_id=" + id;
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

	public static String selectAllProducts() {
		return "SELECT * FROM products";
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

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
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

	public int getProvId() {
		return provId;
	}

	public void setProvId(int provId) {
		this.provId = provId;
	}

}
