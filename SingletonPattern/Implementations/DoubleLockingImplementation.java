package SingletonPattern.Implementations;

public class DoubleLockingImplementation {
    private DoubleLockingImplementation() {
        System.out.println("DoubleLockingImplementation called");
    }

    private volatile static DoubleLockingImplementation instance;

    public static DoubleLockingImplementation getInstance() {
        if (instance == null) {
            synchronized(DoubleLockingImplementation.class) {
                if (instance == null) {
                    instance = new DoubleLockingImplementation();
                }
            }
        }
        return instance;
    }
}