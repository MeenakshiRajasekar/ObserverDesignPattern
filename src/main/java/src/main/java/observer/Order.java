package observer;

public class Order {
	
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int i) {
		this.mobileNumber = i;
	}
	String emailId;
	String productId;
	String orderId;
	int mobileNumber;

}
