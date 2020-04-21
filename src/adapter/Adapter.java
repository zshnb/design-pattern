package adapter;

public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void exists() {
        adaptee.exists();
    }

    @Override
    public void newMethod() {
        System.out.println("This is a new method in adapter");
    }
}
