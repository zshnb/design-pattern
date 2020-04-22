package proxy;

public class OldMapper implements Mapper {
    @Override
    public void query() {
        System.out.println("query from old mapper");
    }
}
