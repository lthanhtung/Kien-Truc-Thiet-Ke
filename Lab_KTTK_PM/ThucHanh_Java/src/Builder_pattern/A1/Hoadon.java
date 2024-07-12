package Builder_pattern.A1;

import Builder_pattern.Vidu.Computer;

import java.util.ArrayList;
import java.util.List;

public class Hoadon {

    HoaDonHeader hoadonHeader;
    List<CTHD> cthdList;


    private Hoadon(Buider b) {
        hoadonHeader = b.hoadonHeader;
        cthdList = b.cthdList;
    }

    @Override
    public String toString() {
        return "Hoadon{" +
                "hoadonHeader=" + hoadonHeader +
                ", cthdList=" + cthdList +
                '}';
    }

    public static class Buider
    {
        HoaDonHeader hoadonHeader;
        List<CTHD> cthdList = new ArrayList<>();
        public Buider setHeader(String maHD,String ngayban, String khachHang){
            hoadonHeader = new HoaDonHeader(maHD,ngayban,khachHang);
            return this;
        }
        public Buider setCTHD(String sanPham, int sl, int donGia, float chiecKhau)
        {
            cthdList.add(new CTHD(sanPham,sl,donGia,chiecKhau));
            return this;
        }
        public Hoadon build() {
            return new Hoadon(this);
        }



        //        public void in()
//        {
//            System.out.println("Hoa don:" + header.toString());
//            for (var i:cthdList)
//            {
//                System.out.println("CTHD:" + cthdList.toString());
//            }
//        }

    }
}
