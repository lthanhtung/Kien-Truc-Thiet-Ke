package BaiTap_Java.BT_4;

import java.util.ArrayList;
import java.util.List;

public class QLChuyenXe {
    List<ChuyenXe> chuyenXeList = new ArrayList<>();

    public void them(ChuyenXe chuyenXe)
    {

        chuyenXeList.add(chuyenXe);
    }

    public int TongDoanThuNgoaiThanh()
    {
       int tongNgoithanh = 0;
       for(ChuyenXe cx : chuyenXeList )
       {
           if(cx instanceof ChuyenXeNgoaiThanh)     // lọc các đối tượng theo điều kiện bài toán
               tongNgoithanh+=cx.DoanhThu;

       }
        return tongNgoithanh;
    }
    public int TongDoanThuNoiThanh()
    {
        int TongNoiThanh = 0;
        for (ChuyenXe cx : chuyenXeList)
        {
            if(cx instanceof  ChuyenXeNoiThanh)
            {
                TongNoiThanh+= cx.DoanhThu;
            }
        }
        return TongNoiThanh;
    }



    public void inds()
    {
        int Tongdoanhthu = TongDoanThuNoiThanh() + TongDoanThuNgoaiThanh();
        for (var i : chuyenXeList) {
            System.out.print(chuyenXeList);
        }
        System.out.println("\nTổng doanh thu ngoại thành:" + TongDoanThuNgoaiThanh());
        System.out.println("Tổng doanh thu nội thành" + TongDoanThuNoiThanh());
        System.out.print("Tổng doanh thu:" + Tongdoanhthu);
    }

}
