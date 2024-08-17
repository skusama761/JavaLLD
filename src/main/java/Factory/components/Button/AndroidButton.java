package Factory.components.Button;

public class AndroidButton implements Button{
    @Override
    public void showButton() {
        System.out.println("Showing AndroidButton");
    }

    @Override
    public void clickButton() {
        System.out.println("Clicking AndroidButton");
    }
}
