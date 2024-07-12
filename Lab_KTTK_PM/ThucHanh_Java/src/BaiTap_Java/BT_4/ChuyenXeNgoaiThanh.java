package BaiTap_Java.BT_4;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
    String Noiden;
    int Ngaydi;

    public ChuyenXeNgoaiThanh(String masoChuyen, String taiXe, String soxe, int doanhThu, String noiden, int ngaydi) {
        super(masoChuyen, taiXe, soxe, doanhThu);
        Noiden = noiden;
        Ngaydi = ngaydi;
    }

    public String getNoiden() {
        return Noiden;
    }

    public void setNoiden(String noiden) {
        Noiden = noiden;
    }

    public int getNgaydi() {
        return Ngaydi;
    }

    public void setNgaydi(int ngaydi) {
        Ngaydi = ngaydi;
    }

    @Override
    public String toString() {
        return
                "Mã số Chuyến:" + MasoChuyen + "\n" +
                "Tài Xế:" + TaiXe + "\n" +
                "Ngày đi:" + Ngaydi + "\n" +
                "Nơi đến:" + Noiden + "\n"+
                "Số xe:" + Soxe + "\n" +
                "Doanh Thu:" + DoanhThu;

    }
}
