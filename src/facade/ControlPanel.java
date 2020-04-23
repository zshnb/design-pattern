package facade;

public class ControlPanel {
    private Door door;
    private Window window;

    public ControlPanel() {
        door = new Door();
        window = new Window();
    }

    public void open() {
        door.open();
        window.open();
    }
}
