package BaiTap_Java.BT_4;

public class Bt4Main {
    public static void main(String[] args) {
        QLChuyenXe chuyenXe = new QLChuyenXe();
        chuyenXe.them(new ChuyenXeNoiThanh("1","14","35",1200,1,26));
        chuyenXe.them(new ChuyenXeNoiThanh("1","14","37",1200,1,26));
        chuyenXe.them(new ChuyenXeNoiThanh("1","14","33",1200,1,26));
        chuyenXe.them(new ChuyenXeNgoaiThanh("1","14","1",1700,"1",26));
        chuyenXe.them(new ChuyenXeNgoaiThanh("1","14","1",1500,"1",26));
        chuyenXe.them(new ChuyenXeNgoaiThanh("1","14","1",1000,"1",26));
        chuyenXe.inds();

    }
}
