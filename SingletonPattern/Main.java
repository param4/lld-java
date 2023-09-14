package SingletonPattern;

import SingletonPattern.Implementations.DoubleLockingImplementation;
import SingletonPattern.Implementations.LazyImplementation;
import SingletonPattern.Implementations.SynchronizedImplementation;

// import SingletonPattern.Implementations.EagerImplementation;


public class Main {
    public static void main(String args[]) throws ClassNotFoundException {
        Class.forName("SingletonPattern.Implementations.EagerImplementation");
    }
}
