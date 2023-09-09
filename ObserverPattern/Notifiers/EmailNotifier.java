package ObserverPattern.Notifiers;

import ObserverPattern.Observables.IPhoneStockObservable;
import ObserverPattern.Observables.PlayStationStockObservable;
import ObserverPattern.Observables.StockObservable;

public class EmailNotifier implements Notifier {

    @Override
    public void update(StockObservable observable) {
        if (observable instanceof IPhoneStockObservable)
            System.out.println("New Iphone Stock Added email");
        else if (observable instanceof PlayStationStockObservable)
            System.out.println("New Play Station Stock Added email");
        else 
            System.out.println("New Stock Added email");

    }

}