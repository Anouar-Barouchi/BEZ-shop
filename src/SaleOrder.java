
public class SaleOrder {
	private int id;
	private int prodId;
	private int quantity;
	private int saleId;

	public SaleOrder(int id, int prodId, int quantity, int saleId) {
		super();
		this.id = id;
		this.prodId = prodId;
		this.quantity = quantity;
		this.saleId = saleId;
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

	public int getSaleId() {
		return saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

}
