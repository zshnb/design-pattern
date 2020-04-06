package factory_pattern.factory_method;

public class WindowFactory implements Factory {
    @Override
    public Product produce() {
        return new Window();
    }
}
