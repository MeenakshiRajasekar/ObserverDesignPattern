package observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
	
	//only Flipkart access this list
	private List<OrderPlacedSubscribers> orderPlacedSubscribers = new ArrayList<OrderPlacedSubscribers>();
	public void addSubscriber(OrderPlacedSubscribers orderPlacedSubscribers) {
		this.orderPlacedSubscribers.add(orderPlacedSubscribers);
	}
	
	public void removeSubscriber(OrderPlacedSubscribers orderPlacedSubscribers) {
		this.orderPlacedSubscribers.add(orderPlacedSubscribers);
	}
	
	public void orderPlacedNotify(Order order) {
		for(OrderPlacedSubscribers orderPlacedSubscriber: orderPlacedSubscribers) {
			orderPlacedSubscriber.onOrderPlaced(order);
		}
	}
}
