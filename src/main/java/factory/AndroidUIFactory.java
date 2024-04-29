package factory;

import factory.components.buttons.AndroidButton;
import factory.components.buttons.Button;
import factory.components.dropdowns.AndroidDropdown;
import factory.components.dropdowns.DropDown;
import factory.components.menus.AndroidMenu;
import factory.components.menus.Menu;

public class AndroidUIFactory implements UIFactory {

	public void  createButton() {
		// TODO Auto-generated method stub
		System.out.println("AndroidButton");
	}

	public void createDropDown() {
		// TODO Auto-generated method stub
		System.out.println("AndroidDropdown");
	}

	public void createMenu() {
		// TODO Auto-generated method stub
		System.out.println("AndroidMenu");
	}

}
