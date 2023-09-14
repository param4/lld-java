package SingletonPattern.Implementations;

public class EagerImplementation {
    private EagerImplementation() {
        System.out.println("EagerImplementation Called");
    }
    private static EagerImplementation instance = new EagerImplementation();

    public static EagerImplementation getInstance() {
        return instance;
    }
}
