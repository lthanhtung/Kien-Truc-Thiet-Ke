package BaiA3;

public class Main {
    public static void main(String[] args) {
        TaoHinh taoHinh = new TaoHinh() {
            @Override
            Hinh CreateHinh(LoaiHinh loaiHinh) {
                return new Rectangle();
            }
        };
        Hinh HinhChuNhat = taoHinh.OrderHinh(LoaiHinh.Rectangle);
        System.out.println(HinhChuNhat.toString());


    }
}
