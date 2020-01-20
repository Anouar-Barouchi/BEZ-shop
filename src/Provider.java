
public class Provider {
	private int Id;
	private String fullName;
	private String phoneNum;
	private String address;
	private String email;
	private double credit;
	private String moreInfo;

	public Provider(int id, String fullName, String phoneNum, String address, String email, double credit,
			String moreInfo) {
		super();
		Id = id;
		this.fullName = fullName;
		this.phoneNum = phoneNum;
		this.address = address;
		this.email = email;
		this.credit = credit;
		this.moreInfo = moreInfo;
	}

	

	public static String insertProvider(int id, String fullName, String phoneNum, String address, String email,
			double credit, String moreInfo) {
		return "INSERT INTO provider values(" + id + " ,'" + fullName + "','" + phoneNum + "','" + address + "','"
				+ email + "','" + credit + "','" + moreInfo + "')";
	}

	public static String removeProvider(int id) {
		return "DELETE FROM provider where prov_id=" + id;
	}

	public static String updateProvider(int id, String fullName, String phoneNum, String address, double credit,
			String moreInfo) {
		return "UPDATE provider SET   WHERE prov_id=" + id;
	}

	public static String selectProvider(int id) {
		return "SELECT * FROM provider WHERE prov_id=" + id;
	}

	public static String selectAllProviders() {
		return "SELECT * FROM provider";
	}



	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
	}



	public String getFullName() {
		return fullName;
	}



	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	public String getPhoneNum() {
		return phoneNum;
	}



	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public double getCredit() {
		return credit;
	}



	public void setCredit(double credit) {
		this.credit = credit;
	}



	public String getMoreInfo() {
		return moreInfo;
	}



	public void setMoreInfo(String moreInfo) {
		this.moreInfo = moreInfo;
	}

	
}





