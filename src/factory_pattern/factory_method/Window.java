package factory_pattern.factory_method;

public class Window implements Product {
    @Override
    public void produced() {
        System.out.println("window is be produced");
    }
}
