package behavioral_pattern.Chain_of_Responsibility.Vidu;

public class NhanVien extends NhanVienF88 {
    public NhanVien(String ten, String chucVu, int hanMucDuyetVay) {
        super(ten, chucVu, hanMucDuyetVay);
    }

    NhanVienF88 captren;

    @Override
    public void DuyetKhoangVay(int SoTienVay) {
        if (SoTienVay <= this.HanMucDuyetVay){
            System.out.println(ChucVu + " đã duyệt khoảng vay");
        }
        else
        {
            this.captren.DuyetKhoangVay(SoTienVay);
        }
    }

    @Override
    public NhanVienF88 CapTren(NhanVienF88 nv) {
        captren = nv;
        return captren;
    }
}
