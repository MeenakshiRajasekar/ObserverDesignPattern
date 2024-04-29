package observer;

public class Client {
	public static void main(String[] args) {
		Flipkart flipkart = new Flipkart();
		EmailService emailService = new EmailService(flipkart);
		SMSsender smsSender = new SMSsender(flipkart);
		InventoryManagementSystem inventoryManagement = new InventoryManagementSystem(flipkart);
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator(flipkart);
		
		Order order = new Order();
		order.setEmailId("meenakshi@gmail.com");
		order.setMobileNumber(96777);
		order.setOrderId("oo124");
		order.setProductId("Prod124");
		
		emailService.onOrderPlaced(order);
		smsSender.onOrderPlaced(order);
		inventoryManagement.onOrderPlaced(order);
		invoiceGenerator.onOrderPlaced(order);
		}

}
