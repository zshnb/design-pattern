package factory_pattern.simple_factory;

public class Apple implements Fruit {
    @Override
    public void grow() {
        System.out.println("Apple is growing");
    }

    @Override
    public void harvest() {
        System.out.println("Apple is harvested");
    }
}
