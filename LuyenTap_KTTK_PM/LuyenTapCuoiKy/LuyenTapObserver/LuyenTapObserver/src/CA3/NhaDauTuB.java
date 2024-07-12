package CA3;

public class NhaDauTuB extends NhaDauTuObserver{
    TiGia tiGia;

    public NhaDauTuB(TiGia tiGia) {
        this.tiGia = tiGia;
    }

    public void DangKy(){
        tiGia.Attach(this);
    }
    public void Remove()
    {
        tiGia.Detach(this);
    }
    @Override
    public void Update(float a) {
        if (a > 0)
        {
            System.out.println("USD tăng"+ "Nhà đầu tư B mua");
        }
        else {
            System.out.println("USD giảm"+ "Nhà đầu tư B bán");
        }
    }
}
