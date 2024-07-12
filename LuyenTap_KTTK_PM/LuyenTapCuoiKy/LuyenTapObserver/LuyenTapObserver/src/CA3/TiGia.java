package CA3;

import java.util.ArrayList;
import java.util.List;

public class TiGia {
    List<NhaDauTuObserver> list = new ArrayList<>();
    public void Attach(NhaDauTuObserver a){
        list.add(a);
    }
    public void Detach(NhaDauTuObserver a){
        list.remove(a);
    }
    public void Notyfi(float delta){
        for (NhaDauTuObserver observer : list)
        {
            observer.Update(delta);
        }
    }

}
