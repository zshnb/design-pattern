package proxy;

public class Main {
    public static void main(String[] args) {
        Mapper old = new OldMapper();
        Mapper proxy = new ProxyMapper(old);
        proxy.query();
    }
}
