package factory;

import factory.components.buttons.Button;
import factory.components.buttons.IOSButton;
import factory.components.dropdowns.DropDown;
import factory.components.dropdowns.IOSDropdown;
import factory.components.menus.IOSMenu;
import factory.components.menus.Menu;

public class IOSFactory implements UIFactory{

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
