package BaiA3;

public abstract class TaoHinh {
    abstract Hinh CreateHinh(LoaiHinh loaiHinh);
    public Hinh OrderHinh(LoaiHinh loaiHinh)
    {
        Hinh Hcn = CreateHinh(loaiHinh);
        Hcn.draw();
        return Hcn;
    }


}
