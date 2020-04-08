package singleton.eager;

public class Main {
    public static void main(String[] args) {
        ResourceManager resourceManager = ResourceManager.getInstance();
        resourceManager.manage();

        ResourceManager another = ResourceManager.getInstance();
        System.out.println(resourceManager == another);
    }
}
