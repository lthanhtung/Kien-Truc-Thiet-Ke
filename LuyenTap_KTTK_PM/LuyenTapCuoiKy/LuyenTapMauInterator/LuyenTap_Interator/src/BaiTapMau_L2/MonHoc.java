package BaiTapMau_L2;

public class MonHoc {
    String TenMonHoc;
    int SoTc;

    public MonHoc(String tenMonHoc, int soTc) {
        TenMonHoc = tenMonHoc;
        SoTc = soTc;
    }

    public String getTenMonHoc() {
        return TenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        TenMonHoc = tenMonHoc;
    }

    public int getSoTc() {
        return SoTc;
    }

    public void setSoTc(int soTc) {
        SoTc = soTc;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "TenMonHoc='" + TenMonHoc + '\'' +
                ", SoTc=" + SoTc +
                '}';
    }
}
