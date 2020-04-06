package factory_pattern.factory_method;

public class Door implements Product {
    @Override
    public void produced() {
        System.out.println("door is be produced");
    }
}
