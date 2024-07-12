package Builder_pattern.A1;

public class MainHoadon {
    public static void main(String[] args) {
        Hoadon hoadon = new Hoadon.Buider()
                .setHeader("12","2/3/24","Thanh")
                .setCTHD("Iphone 16",8,300000000,0.12F).build();
        System.out.println(hoadon.toString());

    }
}
