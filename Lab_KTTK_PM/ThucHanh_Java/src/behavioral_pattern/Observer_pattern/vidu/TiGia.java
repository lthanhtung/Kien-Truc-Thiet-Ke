package behavioral_pattern.Observer_pattern.vidu;

import java.util.ArrayList;
import java.util.List;

public class TiGia {
    //Obsever chứa subject
    //Những tác nhân có sự thay đổi về sự kiện hoặc số lượng chính là obsever
    //Subject sẽ nhận thông báo hoặc tuy trường hợp sẽ đưa ra quyết định về sự thay đổi đó.
    //Subject sẽ đảm nhận việc đăng ký các obsever để có thể nhận được thông báo khi Obsever có sự thay đổi.
    List<TiGiaObserver> observers = new ArrayList<TiGiaObserver>();
    public void Attach(TiGiaObserver observer)
    {
        observers.add(observer);
    }
    public void detach(TiGiaObserver observer)
    {
        observers.remove(observer);
    }
    public void notify(float delta)
    {
        for (TiGiaObserver observer : observers)
        {
            observer.update(delta);
        }
    }
}
