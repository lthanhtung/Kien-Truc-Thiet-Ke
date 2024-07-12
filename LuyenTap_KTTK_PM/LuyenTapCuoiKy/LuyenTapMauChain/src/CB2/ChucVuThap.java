package CB2;

public class ChucVuThap extends ChucVu{
    String TenChucVu;
    int HanMucDuyetVay;
    ChucVu Captren;

    public ChucVuThap(String tenChucVu, int hanMucDuyetVay) {
        TenChucVu = tenChucVu;
        HanMucDuyetVay = hanMucDuyetVay;
    }

    @Override
    public void ChoVay(int SotienVay) {
        if (SotienVay <= HanMucDuyetVay)
        {
            System.out.println(this.TenChucVu + "đã duyệt khoảng vay"+ SotienVay);
        }
        else{
            Captren.ChoVay(SotienVay);
        }
    }

    @Override
    public ChucVu ketiep(ChucVu cv) {
        Captren = cv;
        return Captren;
    }
}
