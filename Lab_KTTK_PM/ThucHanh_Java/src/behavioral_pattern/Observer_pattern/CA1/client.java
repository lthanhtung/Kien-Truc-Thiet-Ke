package behavioral_pattern.Observer_pattern.CA1;

import java.util.List;

public class client implements MyStreamListenner<List<MonHoc>> {
    MyStream<List<MonHoc>> stream;

    public client(MyStream<List<MonHoc>> stream) {
        this.stream = stream;
        this.stream.addListener(this);
    }

    @Override
    public void listen(List<MonHoc> monHocs) {
        for (MonHoc monHoc: monHocs)
        {
            System.out.println(monHoc.toString());
        }
    }
}
