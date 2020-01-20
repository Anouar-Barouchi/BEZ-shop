import java.sql.Date;

public class Buy {

	private int id;
	private String code;
	private double totalAmount;
	private double paidAmount;
	private double leftAmount;
	private boolean paid ;
	private Date date;
	private int provId;

	

	public Buy(int id, String code, double totalAmount, double paidAmount, double leftAmount, boolean paid, Date date,
			int provId) {
		super();
		this.id = id;
		this.code = code;
		this.totalAmount = totalAmount;
		this.paidAmount = paidAmount;
		this.leftAmount = leftAmount;
		this.paid = paid;
		this.date = date;
		this.provId = provId;
	}

	public static String selectBuy(int buyId) {
		return "select * from buy where ";
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

	public int getProvId() {
		return provId;
	}

	public void setProvId(int provId) {
		this.provId = provId;
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

	public int getId() {
		return id;
	}

}
