package factory_pattern.abstract_factory;

public class UnixButton implements Button {
    @Override
    public void click() {
        System.out.println("click unix button");
    }
}
