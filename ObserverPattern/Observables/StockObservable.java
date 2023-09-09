package ObserverPattern.Observables;

import ObserverPattern.Notifiers.Notifier;

public interface StockObservable {
    void add(Notifier observer);
    void remove(Notifier observer);
    void notifySubscribers();
    
    int getStock();
    void addStock(int stock);
}
