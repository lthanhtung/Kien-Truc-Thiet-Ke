package behavioral_pattern.Observer_pattern.vidu;

public class NhaDauTuB implements TiGiaObserver{
    //Subject chứa đối tuợng đại diện observer
    TiGia t;

    public NhaDauTuB(TiGia t) {
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
            System.out.println("Nhà đầu tư B: Mua Vào");
        }
        else
            System.out.println("Nhà đầu tư B : Bán ra");
    }
}
