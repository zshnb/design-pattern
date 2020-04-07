package factory_pattern.abstract_factory;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("click windows button");
    }
}
