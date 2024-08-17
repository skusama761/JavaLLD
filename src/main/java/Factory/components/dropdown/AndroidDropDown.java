package Factory.components.dropdown;

public class AndroidDropDown implements DropDown{
    @Override
    public void showDropDown() {
        System.out.println("show android dropdown");
    }

    @Override
    public void hideDropDown() {
        System.out.println("hide android dropdown");
    }
}
