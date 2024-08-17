package Factory;

import Factory.components.Button.Button;
import Factory.constants.Platform;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactory(Platform.ANDROID);

        Button button  = uiFactory.createButton();
        button.clickButton();
        button.showButton();

    }
}
