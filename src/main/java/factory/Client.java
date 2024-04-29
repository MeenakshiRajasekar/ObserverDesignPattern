package factory;

import factory.components.buttons.Button;
import factory.components.menus.Menu;

public class Client {
	
	public static void main(String[] args) {
		Flutter flutter = new Flutter(SupportingPlatforms.Android);
		UIFactory uiFactory = flutter.createUIFactory();
		
		uiFactory.createButton();
		
	}

}
