package Factory.components.dropdown;

public class iOSDropDown implements DropDown{
    @Override
    public void showDropDown() {
        System.out.println("show iOS dropdown");
    }

    @Override
    public void hideDropDown() {
        System.out.println("hide iOS dropdown");
    }
}
