package factory_pattern.simple_factory;

public class Melon implements Fruit {
    @Override
    public void grow() {
        System.out.println("Melon is growing");
    }

    @Override
    public void harvest() {
        System.out.println("Melon is harvested");
    }
}
