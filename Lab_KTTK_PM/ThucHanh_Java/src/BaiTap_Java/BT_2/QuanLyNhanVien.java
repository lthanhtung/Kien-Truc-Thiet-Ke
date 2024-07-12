package BaiTap_Java.BT_2;

import BaiTap_Java.BT_1.NhanVien;
import BaiTap_Java.BT_2.IQuanLy;

import java.util.ArrayList;
import java.util.List;

public class QuanLyNhanVien implements IQuanLy {
    List<NhanVien> list = new ArrayList<>();
    @Override
    public void them(NhanVien nv) {
        list.add(nv);

    }



    @Override
    public void InDS() {
//        for (var nv : list)
//            System.out.println(nv.toString());

        list.forEach(nhanVien -> {
            System.out.println(nhanVien.toString());
        });
    }
}
