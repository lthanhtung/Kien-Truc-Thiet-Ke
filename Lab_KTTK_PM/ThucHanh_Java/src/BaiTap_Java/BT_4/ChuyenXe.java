package BaiTap_Java.BT_4;
public class ChuyenXe {
    String MasoChuyen, TaiXe,Soxe;
    int DoanhThu;

    protected ChuyenXe(String masoChuyen, String taiXe, String soxe, int doanhThu) {
        MasoChuyen = masoChuyen;
        TaiXe = taiXe;
        Soxe = soxe;
        DoanhThu = doanhThu;
    }

    public String getMasoChuyen() {
        return MasoChuyen;
    }

    public void setMasoChuyen(String masoChuyen) {
        MasoChuyen = masoChuyen;
    }

    public String getTaiXe() {
        return TaiXe;
    }

    public void setTaiXe(String taiXe) {
        TaiXe = taiXe;
    }

    public String getSoxe() {
        return Soxe;
    }

    public void setSoxe(String soxe) {
        Soxe = soxe;
    }

    public int getDoanhThu() {
        return DoanhThu;
    }

    public void setDoanhThu(int doanhThu) {
        DoanhThu = doanhThu;
    }


}
