package ObserverPattern.Notifiers;

import ObserverPattern.Observables.StockObservable;

public interface Notifier {
    void update(StockObservable observable);
}
