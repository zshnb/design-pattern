package factory_pattern.factory_method;

public class Main {
    public static void main(String[] args) {
        Factory doorFactory = new DoorFactory();
        Factory windowFactory = new WindowFactory();
        Product door = doorFactory.produce();
        Product window = windowFactory.produce();
        door.produced();
        window.produced();
    }
}
