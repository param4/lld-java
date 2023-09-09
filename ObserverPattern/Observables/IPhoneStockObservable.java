package ObserverPattern.Observables;

import java.util.ArrayList;

import ObserverPattern.Notifiers.Notifier;

public class IPhoneStockObservable implements StockObservable {
    int stock= 0;
    ArrayList<Notifier> observers = new ArrayList<Notifier>();

    @Override
    public void add(Notifier observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Notifier observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (Notifier observer:observers) {
            observer.update(this);
        }
    }

    @Override
    public int getStock() {
        return this.stock;
    }

    @Override
    public void addStock(int stock) {
        if (this.stock == 0)
            this.notifySubscribers();
        
        this.stock += stock;
    }
}

