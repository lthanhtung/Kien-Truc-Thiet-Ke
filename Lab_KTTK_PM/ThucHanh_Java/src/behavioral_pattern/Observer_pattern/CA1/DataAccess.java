package behavioral_pattern.Observer_pattern.CA1;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    List<MonHoc> listMonHoc = new ArrayList<>();
    MyStream<List<MonHoc>> stream;

    public DataAccess( MyStream<List<MonHoc>> stream) {
        this.stream = stream;
    }
    public void  add(MonHoc monHoc)
    {
        listMonHoc.add(monHoc);
        stream.addEvent(listMonHoc);
    }
}
