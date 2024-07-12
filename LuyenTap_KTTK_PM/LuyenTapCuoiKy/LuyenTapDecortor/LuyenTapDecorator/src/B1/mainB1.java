package B1;

public class mainB1 {
    public static void main(String[] args) {
        BieuThuc a = new BieuThucDonGian(5);
        a = new Cong(a,5);
        System.out.println(a.GiaTri());
        System.out.println(a.bieuThuc());
//        a = new Tru(a,4);
        System.out.println("-----------------");
//        System.out.println(a.GiaTri());
//        System.out.println(a.bieuThuc());
//        System.out.println("-----------------");
//        System.out.println(a.toString());
        a = new Cong(a,5);
        System.out.println(a.GiaTri());
        System.out.println(a.bieuThuc());
        System.out.println(a.toString());
    }
}
