package BaiTap_Java.BT_2;

import BaiTap_Java.BT_1.NhanVien;

public class Bt2Main {
    public static void main(String[] args) {
        IQuanLy quanLy = new QuanLyNhanVien();
        quanLy.them(new NhanVien("Tùng","Nha Trang",1000000,100,20));
        quanLy.them(new NhanVien("Minh","Nha Trang",1000000,100,20));
        quanLy.them(new NhanVien("Luân","Nha Trang",1000000,100,20));
        quanLy.them(new NhanVien("Trọng","Nha Trang",1000000,100,20));
        quanLy.them(new NhanVien("Phong","Nha Trang",1000000,100,20));
        quanLy.InDS();

    }
}
