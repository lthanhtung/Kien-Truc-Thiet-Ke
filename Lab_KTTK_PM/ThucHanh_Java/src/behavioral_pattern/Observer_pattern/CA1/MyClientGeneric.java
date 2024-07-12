package behavioral_pattern.Observer_pattern.CA1;

import java.util.function.Consumer;

public class MyClientGeneric<T> implements MyStreamListenner<T>{
    MyStream<T> stream;
    Consumer<T> consumer;

    public MyClientGeneric(MyStream<T> stream, Consumer<T> consumer) {
        this.stream = stream;
        this.consumer = consumer;
        this.stream.addListener(this);
    }

    @Override
    public void listen(T t) {
        consumer.accept(t);
    }
}
