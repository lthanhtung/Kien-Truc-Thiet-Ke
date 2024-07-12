package behavioral_pattern.Chain_of_Responsibility.Vidu;

public abstract class NhanVienF88 {
    String Ten, ChucVu;
    int HanMucDuyetVay;

    public NhanVienF88(String ten, String chucVu, int hanMucDuyetVay) {
        Ten = ten;
        ChucVu = chucVu;
        HanMucDuyetVay = hanMucDuyetVay;
    }

    public abstract void DuyetKhoangVay(int SoTienVay);
    public abstract NhanVienF88 CapTren(NhanVienF88 nv);


}
