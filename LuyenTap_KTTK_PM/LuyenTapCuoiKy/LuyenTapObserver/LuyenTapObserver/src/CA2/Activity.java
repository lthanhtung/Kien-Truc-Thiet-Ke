package CA2;

import java.util.ArrayList;
import java.util.List;

public class Activity {
    int soLanBam = 0;
    List<ButtonObservre> observres = new ArrayList<>();
    public void Attach(ButtonObservre a){
        observres.add(a);
    }
    public void Detach(ButtonObservre a){
        observres.remove(a);
    }
    public void onClick(){
        soLanBam++;
        System.out.println("“bạn click lần thứ:"+ soLanBam);
    }
}
