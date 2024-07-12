package behavioral_pattern.Chain_of_Responsibility.Vidu;

public class Main {
    public static void main(String[] args) {
        NhanVien ThuKi = new NhanVien("Ái vy", "Thư ký",1000);
        NhanVien QuanLy = new NhanVien("Thanh Quang","Quản Lý",2500);
        ChuTich ChuTich = new ChuTich("Hoang","Chủ tịch",5000);
        ThuKi.CapTren(QuanLy).CapTren(ChuTich);
        ThuKi.DuyetKhoangVay(50000);

    }
}
