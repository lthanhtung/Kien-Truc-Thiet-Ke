package BaiTap_Java.BT_4;

public class ChuyenXeNoiThanh extends ChuyenXe {
    int SoTuyen,Sokm;

    public ChuyenXeNoiThanh(String masoChuyen, String taiXe, String soxe, int doanhThu, int sotuyen, int sokm) {
        super(masoChuyen, taiXe, soxe, doanhThu);
        SoTuyen = sotuyen;
        Sokm = sokm;
    }

    public int getSoTuyen() {
        return SoTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        SoTuyen = soTuyen;
    }

    public int getSokm() {
        return Sokm;
    }

    public void setSokm(int sokm) {
        Sokm = sokm;
    }

    @Override
    public String toString() {
        return  "\n" + "Mã số Chuyến:" + MasoChuyen + "\n" +
                "Tài Xế:" + TaiXe + "\n" +
                "Số xe:" + Soxe + "\n" +
                "Số Tuyến:" + SoTuyen + "\n" +
                "Số km:" + Sokm + "\n" +
                "Doanh Thu=" + DoanhThu;
    }

}

