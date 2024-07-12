package Builder_pattern.A1;

public class HoaDonHeader {
    String MaHoaDon,NgayBan,TenKhachHang;

    public HoaDonHeader(String maHD, String ngayban, String khachHang) {
        this.MaHoaDon = maHD;
        this.NgayBan = ngayban;
        this.TenKhachHang = ngayban;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" +
                "MaHoaDon='" + MaHoaDon + '\'' +
                ", NgayBan='" + NgayBan + '\'' +
                ", TenKhachHang='" + TenKhachHang + '\'' +
                '}';
    }
}
