package ObserverPattern;

import ObserverPattern.Notifiers.SmsNotifier;
import ObserverPattern.Notifiers.EmailNotifier;
import ObserverPattern.Observables.IPhoneStockObservable;
import ObserverPattern.Observables.PlayStationStockObservable;

public class Main {
    public static void main(String[] args) {
        EmailNotifier emailNotifier = new EmailNotifier();
        SmsNotifier smsNotifier = new SmsNotifier();


        IPhoneStockObservable iPhoneStockObservable = new IPhoneStockObservable();
        iPhoneStockObservable.add(emailNotifier);
        iPhoneStockObservable.add(smsNotifier);
        
        PlayStationStockObservable playStationStockObservable = new PlayStationStockObservable();
        playStationStockObservable.add(emailNotifier);
        playStationStockObservable.add(smsNotifier);

        iPhoneStockObservable.addStock(10);
        playStationStockObservable.addStock(10);
        
    }
}
