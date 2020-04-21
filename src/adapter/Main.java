package adapter;

public class Main {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);
        adapter.exists();
        adapter.newMethod();
    }
}
