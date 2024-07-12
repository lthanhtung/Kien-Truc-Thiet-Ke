package behavioral_pattern.Observer_pattern.CA4;

import behavioral_pattern.Observer_pattern.CA4.TinTuc;
import behavioral_pattern.Observer_pattern.CA4.Topic;
import behavioral_pattern.Observer_pattern.CA4.TopicListener;

import java.util.ArrayList;
import java.util.List;

public class ThanhVienA implements TopicListener {
    Topic t;

    public ThanhVienA(Topic t) {
        t.DangKy(this);
    }

    @Override
    public void listen(TinTuc t) {
        System.out.println(t.getId()+":"+ t.getTopic());
    }
}

