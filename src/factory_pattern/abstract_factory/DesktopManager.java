package factory_pattern.abstract_factory;

public interface DesktopManager {
    Button createButton();

    Dialog createDialog();
}
