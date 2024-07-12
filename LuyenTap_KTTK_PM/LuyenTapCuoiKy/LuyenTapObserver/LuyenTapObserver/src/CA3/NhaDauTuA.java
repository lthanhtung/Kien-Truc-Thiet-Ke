package CA3;

public class NhaDauTuA extends NhaDauTuObserver{
    TiGia tiGia;

    public NhaDauTuA(TiGia tiGia) {
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
            System.out.println("USD tăng"+ "Nhà đầu tư A bán");
        }
        else {
            System.out.println("USD giảm"+ "Nhà đầu tư A giữ");
        }
    }
}
