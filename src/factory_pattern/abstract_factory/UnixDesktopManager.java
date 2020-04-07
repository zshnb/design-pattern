package factory_pattern.abstract_factory;

public class UnixDesktopManager implements DesktopManager {
    @Override
    public Button createButton() {
        return new UnixButton();
    }

    @Override
    public Dialog createDialog() {
        return new UnixDialog();
    }
}
