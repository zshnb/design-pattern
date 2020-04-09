package singleton.lazy;

public class ResourceManager {
    private static ResourceManager instance = null;

    private ResourceManager() {}

    public void manage() {
        System.out.println("manage resource");
    }

    public synchronized static ResourceManager getInstance() {
        if (instance == null) {
            instance = new ResourceManager();
        }
        return instance;
    }
}
