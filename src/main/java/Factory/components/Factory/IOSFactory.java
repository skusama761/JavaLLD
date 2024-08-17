package Factory.components.Factory;

import Factory.UIFactory;
import Factory.components.Button.Button;
import Factory.components.Button.iOSButton;
import Factory.components.dropdown.DropDown;
import Factory.components.dropdown.iOSDropDown;
import Factory.components.menu.IOSMenu;
import Factory.components.menu.Menu;

public class IOSFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new iOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new iOSDropDown();
    }
}
