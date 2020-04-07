package factory_pattern.abstract_factory;

public class WindowsDesktopManager implements DesktopManager {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Dialog createDialog() {
        return new WindowsDialog();
    }
}
