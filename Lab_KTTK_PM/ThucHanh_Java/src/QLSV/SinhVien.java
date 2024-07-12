package QLSV;

import java.util.Date;

public class SinhVien {
    String hoTen;
    String NgaySinh;
    float diemTb;

    public SinhVien(String hoTen, String ngaySinh, float diemTb) {
        this.hoTen = hoTen;
        NgaySinh = ngaySinh;
        this.diemTb = diemTb;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(String ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public void setDiemTb(float diemTb) {
        this.diemTb = diemTb;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public float getDiemTb() {
        return diemTb;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", NgaySinh='" + NgaySinh + '\'' +
                ", diemTb=" + diemTb;

    }
}
