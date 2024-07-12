package CA5;

public class Main {
    public static void main(String[] args) {
        ATM a = new ATM(20000);
        TaiKhoang tk1 = new TaiKhoang("Đàm Viết Trọng",2000000,100000,a);
        TaiKhoang tk2 = new TaiKhoang("Nguyễn Hoàng Minh",2000,1000,a);
        tk1.DutThe();
        tk2.DutThe();
        a.rutTien();
    }
}
