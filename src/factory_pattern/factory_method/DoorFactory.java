package factory_pattern.factory_method;

public class DoorFactory implements Factory {
    @Override
    public Product produce() {
        return new Door();
    }
}
