package BaiTap_Java.BT_1;
public class NhanVien {
    String Ten;
    String DiaChi;
    double TienLuong;
    int TongGio;
    int Tuoi;

    public NhanVien(String ten, String diaChi, double tienLuong, int tongGio, int tuoi) {
        Ten = ten;
        DiaChi = diaChi;
        TienLuong = tienLuong;
        TongGio = tongGio;
        Tuoi = tuoi;
    }


    public double TinhThuong()
    {
//        if (TongGio >200)   return   TienLuong  *0.2;
//        if(TongGio >=100)   return   TienLuong * 0.1;
//        return 0;

        if (TongGio >= 200)   return TienLuong *0.2;
        else if (TongGio >= 100 && TongGio < 200) return TienLuong *0.1;
        else return 0;


    }

    @Override
    public String toString()
    {
        return  "Tên:" +  Ten +  "\n" +
                "Tuổi:"+ Tuoi + "\n" +
                "Địa Chỉ:" + DiaChi + "\n" +
                "Tổng giờ:" + TongGio + "\n" +
                "Tiền Lương:" + TienLuong + "\n" +
                "Tiền Thưởng:" + TinhThuong();
    }

    public String getTen() {
        return Ten;

    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public double getTienLuong() {
        return TienLuong;
    }

    public void setTienLuong(double tienLuong) {
        TienLuong = tienLuong;
    }

    public int getTongGio() {
        return TongGio;
    }

    public void setTongGio(int tongGio) {
        TongGio = tongGio;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }


}
