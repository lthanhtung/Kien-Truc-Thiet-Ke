package behavioral_pattern.Observer_pattern.CA4;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    List<TinTuc> tinTucList = new ArrayList<TinTuc>();
    List<TopicListener> topicListeners = new ArrayList<TopicListener>();
   public void DangKy(TopicListener listener){
        topicListeners.add(listener);
    }
   public void HuyDangKy(TopicListener listener){
        topicListeners.remove(topicListeners);
    }
   public void ThemMoi(TinTuc t)
    {
        tinTucList.add(t);
        for (TopicListener listener :topicListeners) {
            listener.listen(t);
        }
    }
   public void CapNhap(TinTuc t)
    {
        for (int i = 0; i < tinTucList.size(); i++) {
            if (tinTucList.get(i).getId() == t.getId()) {
                tinTucList.set(i, t);
                for (TopicListener listener : topicListeners) {
                    listener.listen(t);
                }
                return;
            }
        }
    }
}
