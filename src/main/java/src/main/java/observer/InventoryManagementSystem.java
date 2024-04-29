package observer;

public class InventoryManagementSystem implements OrderPlacedSubscribers{
	
	public InventoryManagementSystem(Flipkart flipkart) {
		flipkart.addSubscriber(this);
	}
	
	
	public void onOrderPlaced(Order order) {
	 	
		updateInventory(order.productId);
	}


	private void updateInventory(String productId) {
		System.out.println("Order placed on item : "+productId);
		
	}

}
