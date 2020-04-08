package singleton.eager;

public class ResourceManager {
    private static final ResourceManager instance = new ResourceManager();

    private ResourceManager() {}

    public void manage() {
        System.out.println("manage resource");
    }

    public static ResourceManager getInstance() {
        return instance;
    }
}
