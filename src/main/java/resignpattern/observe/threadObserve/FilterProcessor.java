package resignpattern.observe.threadObserve;

import java.util.concurrent.Flow;
import java.util.function.Predicate;

public class FilterProcessor<T> implements Flow.Processor<T, T>, Flow.Subscription {
 
    private final Predicate<T> predicate;
    private Flow.Subscriber<? super T> subscriber;
    private Flow.Subscription subscription;
    private long requestCount;
    private long leftCount;
 
    public FilterProcessor( Predicate<T> predicate) {
        this.predicate = predicate;
    }
 
    @Override
    public void subscribe(Flow.Subscriber<? super T> subscriber) {
        this.subscriber = subscriber;
        this.subscriber.onSubscribe(this);
    }
 
    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
    }
 
    @Override
    public void onNext(T item) {
        requestCount--;
        if(predicate.test(item)) {
            subscriber.onNext(item);
        } else {
            leftCount++;
        }
        if(requestCount == 0 && leftCount > 0) {
            request(leftCount);
        }
    }
 
    @Override
    public void onError(Throwable throwable) {
        subscriber.onError(throwable);
    }
 
    @Override
    public void onComplete() {
        subscriber.onComplete();
    }
 
    @Override
    public void request(long n) {
        leftCount = 0;
        requestCount = n;
        subscription.request(n);
    }
 
    @Override
    public void cancel() {
        subscription.cancel();
    }
}