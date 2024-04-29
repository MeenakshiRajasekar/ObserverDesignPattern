package observer;

public class InvoiceGenerator implements OrderPlacedSubscribers{
	
	public InvoiceGenerator(Flipkart flipkart) {
		flipkart.addSubscriber(this);
	}

	public void onOrderPlaced(Order order) {
		generateInvoice(order.orderId);
		
	}

	private void generateInvoice(String orderId) {
		System.out.println("Order placed for the item with orderId : " + orderId);
		
	}
	

}
