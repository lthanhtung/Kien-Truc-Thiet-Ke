package Builder_pattern.A1;

import java.util.List;

public class CTHD {
    String SanPham;
    int  Sl, DonGia;
    float ChiecKhau;

    public CTHD(String sanPham, int sl, int donGia, float chiecKhau) {
        this.SanPham = sanPham;
        this.Sl = sl;
        this.DonGia = donGia;
        this.ChiecKhau = chiecKhau;
    }

    @Override
    public String toString() {
        return "CTHD{" +
                "SanPham='" + SanPham + '\'' +
                ", Sl=" + Sl +
                ", DonGia=" + DonGia +
                ", ChiecKhau=" + ChiecKhau +
                '}';
    }
}
