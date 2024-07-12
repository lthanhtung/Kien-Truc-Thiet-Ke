package behavioral_pattern.Chain_of_Responsibility.Vidu;

public class ChuTich extends NhanVienF88{
    public ChuTich(String ten, String chucVu, int hanMucDuyetVay) {
        super(ten, chucVu, hanMucDuyetVay);
    }

    @Override
    public void DuyetKhoangVay(int SoTienVay) {
        if (SoTienVay <= HanMucDuyetVay)
        {
            System.out.println(ChucVu+ " Đã duyệt khoảng vay");
        }
        else System.out.println("đây không đủ tiền ra vcb vay");
    }

    @Override
    public NhanVienF88 CapTren(NhanVienF88 nv) {
        return null;
    }
}
