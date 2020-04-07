package factory_pattern.abstract_factory;

public class UnixDialog implements Dialog {
    @Override
    public void show() {
        System.out.println("show unix dialog");
    }
}
