package factory;

import factory.components.buttons.Button;
import factory.components.dropdowns.DropDown;
import factory.components.menus.Menu;

public interface UIFactory {
	public void createButton();
	public void createDropDown();
	public void createMenu();
	
}
