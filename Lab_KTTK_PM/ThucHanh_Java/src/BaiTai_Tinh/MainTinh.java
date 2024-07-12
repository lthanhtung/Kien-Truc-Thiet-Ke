package BaiTai_Tinh;

public class MainTinh {
    public static void main(String[] args) {
        Context c = new Context();
        float kq1 = c.setTinh(new Cong()).tinh(3,5);
        System.out.println(kq1);

        float kq2 = c.setTinh(new nhan()).tinh(4,6);
        System.out.println(kq2);

    }
}
