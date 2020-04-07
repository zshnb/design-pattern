package factory_pattern.abstract_factory;

public class Main {
    public static void main(String[] args) {
        WindowsDesktopManager desktopManager = new WindowsDesktopManager();
        UnixDesktopManager unixDesktopManager = new UnixDesktopManager();
        Button windowsButton = desktopManager.createButton();
        windowsButton.click();
        Dialog unixDialog = unixDesktopManager.createDialog();
        unixDialog.show();
    }
}
