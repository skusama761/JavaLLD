package Factory;

import Factory.components.Button.Button;
import Factory.components.dropdown.DropDown;
import Factory.components.menu.Menu;

public interface UIFactory {
//    Factory Methods

     Button createButton();
     Menu createMenu();
     DropDown createDropDown();
}
