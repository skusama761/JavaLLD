package Factory;

import Factory.components.Factory.AndroidFactory;
import Factory.components.Factory.IOSFactory;
import Factory.components.Factory.WindowsFactory;
import Factory.constants.Platform;

public class Flutter {
    //Non factory Methods

    void refreshUI(){
        System.out.println("Flutter refreshUI");
    }

    void setTheme(){
        System.out.println("Flutter setTheme");
    }

    UIFactory getUIFactory(Platform platform){
    return UIFactoryFactory.getUIFactoryForPlatform(platform);
    }
}
