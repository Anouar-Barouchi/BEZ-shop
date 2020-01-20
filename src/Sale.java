import java.sql.Date;

public class Sale {

	private int id;
	private String code;
	private double totalAmount;
	private double paidAmount;
	private double leftAmount;
	private boolean paid;
	private Date date;
	private int custId;

	

	public double getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}

	public double getLeftAmount() {
		return leftAmount;
	}

	public void setLeftAmount(double leftAmount) {
		this.leftAmount = leftAmount;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public Sale(int id, String code, double totalAmount, double paidAmount, double leftAmount, boolean paid, Date date,
			int custId) {
		super();
		this.id = id;
		this.code = code;
		this.totalAmount = totalAmount;
		this.paidAmount = paidAmount;
		this.leftAmount = leftAmount;
		this.paid = paid;
		this.date = date;
		this.custId = custId;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public double getPaid() {
		return paid;
	}

	public void setPaid(double paid) {
		this.paid = paid;
	}

	public double getLeft() {
		return left;
	}

	public void setLeft(double left) {
		this.left = left;
	}

}
