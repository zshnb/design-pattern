package factory_pattern.simple_factory;

public class Main {
    public static void main(String[] args) {
        FruitFactory factory = new FruitFactory();
        Fruit fruit = factory.harvest("apple");
        fruit.grow();
        fruit.harvest();
    }
}
