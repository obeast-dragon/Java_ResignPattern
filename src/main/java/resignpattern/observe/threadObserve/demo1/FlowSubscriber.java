package resignpattern.observe.threadObserve.demo1;

import java.util.concurrent.Flow;

/**
 * @author wxl
 * Date 2022/11/24 11:35
 * @version 1.0
 * Description: 订阅者
 */
public class FlowSubscriber implements Flow.Subscriber<String> {

    private Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
    	System.out.println("Subscriber 建立订阅关系");
        //发布订阅关系
        this.subscription = subscription;
        //请求一个数据
        this.subscription.request(1);
    }

    @Override
    public void onNext(String item) {

        System.out.println("订阅者接收消息: " + item);
        //接收数据后 再请求一个数据
        this.subscription.request(1);
        //不再接收数据，调用cancel
        // this.subscription.cancel();
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("订阅者数据接收出现异常，error :" + throwable.getMessage());
        this.subscription.cancel();
    }

    @Override
    public void onComplete() {
        System.out.println("订阅者数据处理完成");
    }
}

