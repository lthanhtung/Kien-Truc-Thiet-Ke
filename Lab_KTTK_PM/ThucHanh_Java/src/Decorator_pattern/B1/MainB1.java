package Decorator_pattern.B1;

public class MainB1 {
    public static void main(String[] args) {
        BieuThuc b = new BieuThucDonGian(6);
        b = new BieuThucDecorator(b);
        b = new Cong(b,1);
        System.out.println(b.toString());

        b = new Tru(b,5);
        System.out.println(b.toString());
        b = new Nhan(b,5);
        System.out.println(b.toString());
        b = new Chia(b,5);
        System.out.println(b.toString());

        BieuThuc c = new BieuThucDonGian(5);
        c = new GiaTriTuyetDoi(c);
        System.out.println("Giá trị tuyệt đối là: "+ c.GiaTri());


    }
}
