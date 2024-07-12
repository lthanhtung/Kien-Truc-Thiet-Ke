package behavioral_pattern.Observer_pattern.CA1;

import java.util.ArrayList;
import java.util.List;

public class MyStream<T> {
    List<MyStreamListenner> listenners = new ArrayList<MyStreamListenner>();
    public void addListener(MyStreamListenner listenner)
    {
        listenners.add(listenner);
    }
    public void addEvent(T t)
    {
        for (MyStreamListenner l : listenners){
            l.listen(t);
        }

    }
}
