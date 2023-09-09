package ObserverPattern.Observables;

import java.util.ArrayList;

import ObserverPattern.Notifiers.Notifier;

public class PlayStationStockObservable implements StockObservable {
    private int stock= 0;
    ArrayList<Notifier> notifiers = new ArrayList<Notifier>();

    @Override
    public void add(Notifier observer) {
        this.notifiers.add(observer);
    }

    @Override
    public void remove(Notifier observer) {
        this.notifiers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (Notifier notifier:this.notifiers) {
            notifier.update(this);
        }
    }

    @Override
    public int getStock() {
        return this.stock;
    }

    @Override
    public void addStock(int stock) {
        if (this.stock == 0) {
            this.notifySubscribers();
        }
        this.stock += stock;
    }
    
}
