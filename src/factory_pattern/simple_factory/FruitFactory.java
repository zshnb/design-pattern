package factory_pattern.simple_factory;

public class FruitFactory {
    public Fruit harvest(String name) {
        switch (name) {
            case "apple": return new Apple();
            case "melon": return new Melon();
        }
        throw new RuntimeException(String.format("%s is not a valid fruit type", name));
    }
}
