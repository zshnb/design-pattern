package factory_pattern.abstract_factory;

public class WindowsDialog implements Dialog {
    @Override
    public void show() {
        System.out.println("show windows dialog");
    }
}
