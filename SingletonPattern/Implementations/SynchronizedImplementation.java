package SingletonPattern.Implementations;

public class SynchronizedImplementation {
    private SynchronizedImplementation() {
        System.out.println("SynchronizedImplementation called");
    }

    private static SynchronizedImplementation instance;

    public synchronized static SynchronizedImplementation getInstance() {
        if (instance == null) {
            instance = new SynchronizedImplementation();
        }
        return instance;
    }
}
