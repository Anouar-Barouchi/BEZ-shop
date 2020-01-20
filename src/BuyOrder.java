
public class BuyOrder {
	private int id;
	private int prodId;
	private int quantity;
	private int buyId;

	public BuyOrder(int id, int prodId, int quantity, int buyId) {
		super();
		this.id = id;
		this.prodId = prodId;
		this.quantity = quantity;
		this.buyId = buyId;
	}

	public static String selectBuy(int buyId) {
		return "select * from order ";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getBuyId() {
		return buyId;
	}

	public void setBuyId(int buyId) {
		this.buyId = buyId;
	}

}
