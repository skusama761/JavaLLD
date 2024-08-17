package Factory.components.Factory;

import Factory.UIFactory;
import Factory.components.Button.Button;
import Factory.components.Button.WindowsButton;
import Factory.components.dropdown.AndroidDropDown;
import Factory.components.dropdown.DropDown;
import Factory.components.menu.Menu;
import Factory.components.menu.WindowsMenu;

public class WindowsFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
