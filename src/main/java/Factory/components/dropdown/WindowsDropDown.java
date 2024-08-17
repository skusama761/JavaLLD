package Factory.components.dropdown;

public class WindowsDropDown implements DropDown{
    @Override
    public void showDropDown() {
        System.out.println("show Windows Drop Down");
    }

    @Override
    public void hideDropDown() {
        System.out.println("hide Windows Drop Down");
    }
}
