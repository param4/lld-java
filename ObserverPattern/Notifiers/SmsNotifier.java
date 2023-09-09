package ObserverPattern.Notifiers;

import ObserverPattern.Observables.IPhoneStockObservable;
import ObserverPattern.Observables.PlayStationStockObservable;
import ObserverPattern.Observables.StockObservable;

public class SmsNotifier implements Notifier {
    @Override
    public void update(StockObservable observable) {
        if (observable instanceof IPhoneStockObservable)
            System.out.println("New Iphone Stock added SMS");
        else if (observable instanceof PlayStationStockObservable)
            System.out.println("New Play Station Stock added SMS");
        else
            System.out.println("New Stock added SMS");
    }
}
