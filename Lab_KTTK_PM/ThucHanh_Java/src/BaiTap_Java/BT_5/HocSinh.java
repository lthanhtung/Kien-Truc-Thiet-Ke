package BaiTap_Java.BT_5;

public class HocSinh extends CaNhan {
    String Lop;
    String NangKhieu;

    @Override
    public String HieuThiTT(){
        String tt = super.HieuThiTT();
        return tt + "Học Sinh";
    }

    public HocSinh(String hoTen, String sdt, String diaChi, int tuoi, String lop, String nangKhieu) {
        super(hoTen, sdt, diaChi, tuoi);
        Lop = lop;
        NangKhieu = nangKhieu;
    }
}
