package CA5;

import java.util.ArrayList;
import java.util.List;

public class ATM {
    List<TaiKhoangObserver> observers = new ArrayList<>();
    int SotienToiThieu;

    public ATM(int sotienToiThieu) {
        SotienToiThieu = sotienToiThieu;
    }

    public void NhanThe(TaiKhoangObserver a){
        observers.add(a);
    }
    public void TraThe(TaiKhoangObserver a){
        observers.remove(a);
    }
    public void rutTien(){
        for (TaiKhoangObserver o: observers ){
            o.nhanThongBao();
        }
    }
}
