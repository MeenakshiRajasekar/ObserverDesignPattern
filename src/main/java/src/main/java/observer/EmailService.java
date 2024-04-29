package observer;

public class EmailService implements OrderPlacedSubscribers {

	public EmailService (Flipkart flipkart) {
		flipkart.addSubscriber(this);
	}
	public void onOrderPlaced(Order order) {	
		sendEmail(order.emailId , "order placed successfully");
	}
	private void sendEmail(String emailId, String mail) {
	   System.out.println("sending order confirmation " +mail+  " to : "+ emailId);
		
	}

}
