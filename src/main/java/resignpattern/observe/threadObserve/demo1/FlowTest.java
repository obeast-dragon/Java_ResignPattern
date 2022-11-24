package resignpattern.observe.threadObserve.demo1;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.TimeUnit;

public class FlowTest {
    public static void main(String[] args) {
        //数据发布者
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
        //中间处理者
        FlowProcessor processor = new FlowProcessor();
        //数据订阅者
        Flow.Subscriber<String> subscriber = new FlowSubscriber();

//        //发布者与中间处理者建立关系
////        publisher.subscribe(processor);
////        //中间处理者与订阅者建立关系
////        processor.subscribe(subscriber);
        publisher.subscribe(subscriber);

        //发布者开始发布数据
        for (int i = 0; i < 10; i++) {
            String msg = "hello flow: " + i;
            System.out.println("发布者发送数据" + i);
            publisher.submit(msg);
        }

        //关闭发布者
        publisher.close();

        //休眠等待，防止主线程退出
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
