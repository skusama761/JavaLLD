package Factory.components.Button;

public class iOSButton implements Button{
    @Override
    public void showButton() {
        System.out.println("showing iOS button");
    }

    @Override
    public void clickButton() {
        System.out.println("clicking iOS button");
    }
}
