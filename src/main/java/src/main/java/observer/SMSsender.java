package observer;

public class SMSsender implements OrderPlacedSubscribers {

	public SMSsender(Flipkart flipkart) {
		flipkart.addSubscriber(this);
	}
	
	public void onOrderPlaced(Order order) {
		sendSMS(order.mobileNumber);

	}

	private void sendSMS(int mobileNumber) {
		System.out.println("sending order confirmation sms to : "+mobileNumber);
		
	}

}
