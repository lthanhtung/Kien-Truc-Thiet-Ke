package behavioral_pattern.Observer_pattern.vidu;

public class NhaDauTuA implements TiGiaObserver {//Observer
    TiGia t;

    public NhaDauTuA(TiGia t) {
        this.t = t;
    }

    public void register()
    {
        t.Attach(this);
    }
    public void unregister()
    {
        t.detach(this);
    }


    @Override
    public void update(float delta) {
        if (delta > 0){
            System.out.println("Nhà đầu tư A: Bán ra");
        }
        else
            System.out.println("Nhà đầu tư A : Mua vào");
    }

}
