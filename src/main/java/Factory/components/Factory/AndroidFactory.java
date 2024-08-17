package Factory.components.Factory;

import Factory.UIFactory;
import Factory.components.Button.AndroidButton;
import Factory.components.Button.Button;
import Factory.components.dropdown.AndroidDropDown;
import Factory.components.dropdown.DropDown;
import Factory.components.menu.AndroidMenu;
import Factory.components.menu.Menu;

public class AndroidFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
