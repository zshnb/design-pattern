package singleton.eager;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnsafeMain {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<ResourceManager> clazz = (Class<ResourceManager>) Class.forName("singleton.eager.ResourceManager");
        Constructor<ResourceManager> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        ResourceManager reflectManager = constructor.newInstance();
        ResourceManager resourceManager = ResourceManager.getInstance();
        System.out.println(reflectManager == resourceManager);
    }
}
