package Factory.components.Button;

public class WindowsButton implements Button {
    @Override
    public void showButton() {
        System.out.println(" showing Windows Button");
    }

    @Override
    public void clickButton() {
        System.out.println(" clicking Windows Button");
    }
}
