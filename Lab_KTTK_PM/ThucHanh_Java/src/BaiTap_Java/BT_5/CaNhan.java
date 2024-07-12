package BaiTap_Java.BT_5;

public abstract class CaNhan {
    String hoTen,sdt,DiaChi;
    int tuoi;

    public CaNhan(String hoTen, String sdt, String diaChi, int tuoi) {
        this.hoTen = hoTen;
        this.sdt = sdt;
        DiaChi = diaChi;
        this.tuoi = tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String HieuThiTT(){
        return "Cá Nhân";
    }
}
