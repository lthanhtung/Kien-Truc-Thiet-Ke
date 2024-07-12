package CB2;

public class ChucVuCaoNhat extends ChucVu{
    String TenChucVu;
    int HanMucDuyetVay;

    public ChucVuCaoNhat(String tenChucVu, int hanMucDuyetVay) {
        TenChucVu = tenChucVu;
        HanMucDuyetVay = hanMucDuyetVay;
    }

    @Override
    public void ChoVay(int SotienVay) {
        if (SotienVay <= HanMucDuyetVay)
        {
            System.out.println(TenChucVu +"đã duyệt khoảng vay" + SotienVay);
        }
        else System.out.println("Xin mời quý khách tìm chỗ khách vay");
    }

    @Override
    public ChucVu ketiep(ChucVu cv) {
        return null;
    }
}
