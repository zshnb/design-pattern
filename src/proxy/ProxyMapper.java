package proxy;

public class ProxyMapper implements Mapper {
    private Mapper mapper;

    public ProxyMapper(Mapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public void query() {
        mapper.query();
        newQuery();
    }

    private void newQuery() {
        System.out.println("new query from proxy mapper");
    }
}
