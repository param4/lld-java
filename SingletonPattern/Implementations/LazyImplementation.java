package SingletonPattern.Implementations;

public class LazyImplementation {
    private LazyImplementation() {
        System.out.println("LazyImplementation called");
    }

    private static LazyImplementation instance;

    public static LazyImplementation getInstance() {
        if (instance == null) {
            instance = new LazyImplementation();
        }
        return instance;
    }
}
